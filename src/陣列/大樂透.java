package 陣列;

import java.util.Random;
import java.util.Scanner;

public class 大樂透 {
    public static void main(String[] args) {
        // --- 第一階段：系統開獎 ---

        // 呼叫 createLotteryNumber() 函式，由系統隨機產生 7 個不重複的號碼
        // 這些號碼會被存放在名為 lotteryNumber 的陣列中，作為「開獎答案」
        int[] lotteryNumber = createLotteryNumber();

        System.out.print("本期中獎號碼為：");
        // 將產生的中獎陣列傳給 printLotteryNumber 進行格式化輸出 (印出 [x, x, ...])
        printLotteryNumber(lotteryNumber);

        // 單純印出空行，確保後續的使用者輸入介面不會跟中獎號碼擠在一起
        System.out.println();


        // --- 第二階段：玩家選號 ---

        // 呼叫 buyLotteryNumber()，程式會暫停並等待使用者在鍵盤輸入 7 個號碼
        // 使用者輸入完畢後，這 7 個號碼會被回傳並存入 mylotteryNumber 陣列
        int[] mylotteryNumber = buyLotteryNumber();

        System.out.print("您購買的號碼為：");
        // 同樣呼叫美化輸出函式，確認剛才使用者自己選了哪些號碼
        printLotteryNumber(mylotteryNumber);


        // --- 第三階段：核對與結算 ---

        // 呼叫 getWinnerNumber 函式，並同時把「開獎答案」和「玩家選號」兩個陣列丟進去
        // 這個函式內部會去比對兩組陣列的內容，計算中獎數量並印出最終結果
        getWinnerNumber(lotteryNumber, mylotteryNumber);
    }

    /**
     * 比對中獎號碼與自選號碼
     *
     * @param arr1 系統開出的中獎號碼 (答案)
     * @param arr2 使用者購買的號碼
     */
    public static void getWinnerNumber(int[] arr1, int[] arr2) {
        // 分別計算「前區」與「後區」的中獎個數
        int count1 = getCount(arr1, arr2, 0, 4); // 比對索引 0~4 (前 5 碼)
        int count2 = getCount(arr1, arr2, 5, 6); // 比對索引 5~6 (後 2 碼)
        int totalCount = count1 + count2;

        System.out.println();
        System.out.println("對獎結果：");
        System.out.println("前區中獎：" + count1 + " 個");
        System.out.println("後區中獎：" + count2 + " 個");
        System.out.println("總共中了 " + totalCount + " 個號碼");
        if (count1 == 5 && count2 == 2) {

            System.out.println("妳中了一等獎");

        } else if (count1 == 5 && count2 == 1) {

            System.out.println("妳中了二等獎");

        } else if (count1 == 5 && count2 == 0 || count1 == 4 && count2 == 2) {

            System.out.println("妳中了三等獎");

        } else if (count1 == 4 && count2 == 1 || count1 == 3 && count2 == 2) {

            System.out.println("妳中了四等獎");

        } else if (count1 == 4 && count2 == 0 || count1 == 3 && count2 == 1 || count1 == 2 && count2 == 2) {

            System.out.println("妳中了五等獎");

        } else if (count1 == 3 && count2 == 0 || count1 == 1 && count2 == 2 || count1 == 2 && count2 == 1 || count1 == 0 && count2 == 2) {

            System.out.println("妳中了六等獎");

        } else {

            System.out.println("恭喜 沒中獎");

        }

    }

    /**
     * 在指定區間內，計算 arr2 有多少號碼出現在 arr1 中
     */
    public static int getCount(int[] arr1, int[] arr2, int start, int end) {
        int count = 0;
        // 拿著自己買的每一顆球 (arr2[i])，去中獎名單 (arr1) 裡面找
        for (int i = start; i <= end; i++) {
            // 使用 contains 檢查該號碼是否在答案陣列的對應區間內
            boolean flag = contains(arr2[i], arr1, start, end);
            if (flag) {
                count++;
            }
        }
        return count;
    }

    /**
     * 使用者人工購買選號
     */
    public static int[] buyLotteryNumber() {
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);

        // 前區選號：1~35 選 5 個
        for (int i = 0; i < 5; ) {
            System.out.println("請輸入前區號碼（第" + (i + 1) + "個，範圍 1-35）:");
            int number = scanner.nextInt();
            // 檢查範圍
            if (number < 1 || number > 35) {
                System.out.println("號碼超出範圍，請重新輸入！");
                continue;
            }
            // 檢查前區是否重複 (索引 0~4)
            if (contains(number, arr, 0, 4)) {
                System.out.println("號碼重複，請選別的數字！");
                continue;
            }
            arr[i] = number;
            i++;
        }

        // 後區選號：1~12 選 2 個
        for (int i = 0; i < 2; ) {
            System.out.println("請輸入後區號碼（第" + (i + 1) + "個，範圍 1-12）:");
            int number = scanner.nextInt();
            // 檢查範圍
            if (number < 1 || number > 12) {
                System.out.println("號碼超出範圍，請重新輸入！");
                continue;
            }
            // 檢查後區是否重複 (索引 5~6)
            if (contains(number, arr, 5, 6)) {
                System.out.println("號碼重複，請選別的數字！");
                continue;
            }
            arr[i + 5] = number;
            i++;
        }
        return arr;
    }

    /**
     * 系統自動產生隨機中獎號碼
     */
    public static int[] createLotteryNumber() {
        int[] arr = new int[7];
        Random random = new Random();

        // 隨機產生前區 5 碼 (1-35)
        for (int i = 0; i < 5; ) {
            int number = random.nextInt(1, 36); // 產生 1~35
            if (!contains(number, arr, 0, 4)) {
                arr[i] = number;
                i++;
            }
        }

        // 隨機產生後區 2 碼 (1-12)
        for (int i = 0; i < 2; ) {
            int number = random.nextInt(1, 13); // 產生 1~12
            if (!contains(number, arr, 5, 6)) {
                arr[i + 5] = number;
                i++;
            }
        }
        return arr;
    }

    /**
     * 萬用檢查工具：檢查某個數字是否出現在陣列的指定區間 [start, end]
     */
    public static boolean contains(int number, int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return true; // 找到了，代表重複或中獎
            }
        }
        return false; // 沒找到
    }


      //美化格式印出陣列內容，例如 [1, 2, 3, 4, 5, 6, 7]

    public static void printLotteryNumber(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]); // 最後一個號碼不加逗號
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
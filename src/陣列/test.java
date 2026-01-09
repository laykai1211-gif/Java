package 陣列;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main() {
        //先定義一個變量 產生本期中獎號碼
        //在用涵式美化號碼
        //定義一個變量 我買的號碼
        //print 中獎號碼
        //再print我買的號碼
        //拿著中獎號碼跟我買的號碼 在getWinnerNumber對獎
        int[] lotteryNumber = createLotteryNumber();
        System.out.print("本期中獎號碼為：");
        printLotteryNumber(lotteryNumber);
        System.out.println();
        int[] myLotteryNumber = buyLotteryNumber();
        System.out.print("本期中獎號碼為：");
        System.out.println();
        printLotteryNumber(lotteryNumber);//顯示本期中獎號碼
        System.out.println();
        System.out.print("您購買的號碼為：");
        System.out.println();
        printLotteryNumber(myLotteryNumber);
        getWinnerNumber(lotteryNumber, myLotteryNumber);

    }

    public static void getWinnerNumber(int[] arr1, int[] arr2) {
        int count1 = getCount(arr1, arr2, 0, 4);
        int count2 = getCount(arr1, arr2, 5, 6);
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


    public static int getCount(int[] arr1, int[] arr2, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean flag = contains(arr2[i], arr1, start, end);
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static int[] buyLotteryNumber() {
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ) {
            System.out.println("請輸入前區號碼（第" + (i + 1) + "個，範圍 1-35）:");
            int number = scanner.nextInt();
            if (number < 1 || number > 35) {
                System.out.println("號碼超出範圍，請重新輸入！");
                continue;
            }
            if (contains(number, arr, 0, 4)) {
                System.out.println("號碼重複，請選別的數字！");
                continue;
            }
            arr[i] = number;
            i++;
        }

        for (int i = 0; i < 2; ) {
            System.out.println("請輸入前區號碼（第" + (i + 1) + "個，範圍 1-12）:");
            int number = scanner.nextInt();
            if (number < 1 || number > 12) {
                System.out.println("號碼超出範圍，請重新輸入！");
                continue;
            }
            if (contains(number, arr, 5, 6)) {
                System.out.println("號碼重複，請選別的數字！");
                continue;
            }
            arr[i + 5] = number;
            i++;
        }
        return arr;
    }

    public static int[] createLotteryNumber() {
        int[] arr = new int[7];
        Random random = new Random();

        for (int i = 0; i < 5; ) {
            int number = random.nextInt(1, 36);
            if (!contains(number, arr, 0, 4)) {
                arr[i] = number;
                i++;
            }
        }
        for (int i = 0; i < 2; ) {
            int number = random.nextInt(1, 13);
            if (!contains(number, arr, 5, 6)) {
                arr[i + 5] = number;
                i++;
            }
        }

        return arr;
    }

    public static boolean contains(int number, int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void printLotteryNumber(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}

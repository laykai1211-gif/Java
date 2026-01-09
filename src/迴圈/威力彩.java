package 迴圈;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 威力彩 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int Lottery = scanner.nextInt();
        System.out.println("本期威力彩號碼");
        int[] lotteryNumber = createLotteryNumber();
        int[] lotteryspNumber = createSpLotteryNumber();
        System.out.println("威力彩號碼: " + Arrays.toString(lotteryNumber) + "特別號" + Arrays.toString(lotteryspNumber));
        System.out.println("-------------------------");


        System.out.println("要買幾組威力彩");
        int count = scanner.nextInt();


        int[][] myTickets = new int[count][7];
        for (int i = 0; i < count; i++) {
            System.out.println("\n--- 開始輸入第 " + (i + 1) + " 組號碼 ---");
            int[] tempSix = buyLotteryNumber();
            int[] tempSp = buyLotterySpNumber();
            for (int j = 0; j < 6; j++) {
                myTickets[i][j] = tempSix[j];
            }
            myTickets[i][6] = tempSp[0];
        }
        System.out.println("\n========= 您購買的所有號碼 =========");
        for (int i = 0; i < myTickets.length; i++) {
            int[] onlySix = Arrays.copyOfRange(myTickets[i], 0, 6);
            int spNum = myTickets[i][6];
            System.out.println("第 " + (i + 1) + " 組: " + Arrays.toString(onlySix) + " 特別號: [" + spNum + "]");
        }
        getWinnerNumber(myTickets, lotteryNumber, lotteryspNumber);
    }

    public static void getWinnerNumber(int[][] myTickets, int[] winNumbers, int[] winSp) {
        System.out.println("----對獎結果----");
        for (int i = 0; i < myTickets.length; i++) {
            int normalCount = getCount(myTickets[i], winNumbers);
            boolean spMatch = (myTickets[i][6] == winSp[0]);
            System.out.print("第 " + (i + 1) + " 組：中了 " + normalCount + " 碼");
            if (spMatch) {
                System.out.println(" + 特別號也中了！");
            } else {
                System.out.println(" (特別號沒中)");
            }

        }
    }

    public static int getCount(int[] myTicket, int[] winNumbers) {
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            if (contains(myTicket[i], winNumbers, 0, 5)) {
                count++;
            }
        }
        return count;
    }

    public static int[] buyLotteryNumber() {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("請輸入6個前區號碼（第" + (i + 1) + "個，範圍 1-38）:");
            int number = scanner.nextInt();
            if (number < 1 || number > 38) {
                System.out.println("號碼超出範圍 重新選擇");
                continue;
            }
            if (contains(number, arr, 0, 5)) {
                System.out.println("號碼重複 重新選擇");
                continue;
            }
            arr[i] = number;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] buyLotterySpNumber() {


        int[] sparr = new int[1];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入特別碼（1個，範圍 1-8）:");
            int number = scanner.nextInt();
            if (number < 1 || number > 8) {
                System.out.println("號碼超出範圍 重新選擇");
            } else {
                sparr[0] = number;
                break;
            }
        }
        return sparr;
    }


    public static int[] createSpLotteryNumber() {
        int[] arr = new int[1];
        Random random = new Random();
        arr[0] = random.nextInt(1, 9);
        return arr;
    }

    public static int[] createLotteryNumber() {
        int[] arr = new int[6];
        Random random = new Random();

        //產生前6碼
        for (int i = 0; i < 6; ) {
            int number = random.nextInt(1, 39);
            if (!contains(number, arr, 0, 5)) {
                arr[i] = number;
                i++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    //接收數字,陣列,頭,尾
    //回傳布林值
    public static boolean contains(int number, int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}


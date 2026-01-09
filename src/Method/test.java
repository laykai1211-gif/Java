package Method;

import java.util.Random;

public class test {
    // 1. 修改為標準的 main 方法
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; ) {
            int num = random.nextInt(101) ;

            boolean flag = number(num, arr);

            // 2. 修正邏輯：如果 flag 是 false (代表陣列裡還沒有這個數)，才存入
            if (!flag) {
                arr[i] = num;
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } // test 方法 (main) 在這裡結束

    // 3. 把 number 方法搬到外面，與 main 平行
    public static boolean number(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true; // 代表重複了
            }
        }
        return false; // 代表沒重複
    }
}
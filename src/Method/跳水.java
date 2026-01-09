package Method;

import java.util.Arrays;
import java.util.Scanner;


public class 跳水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 5) {
                System.out.println("請輸入5個0~100的數字");
                int scIn = sc.nextInt();
                if (scIn > 0 && scIn < 100) {
                    arr[i] = scIn;
                    break;
                } else {
                    System.out.println("請輸入0~100的數字");
                }
            }
        }
        int sum =0;
        for (int j = 0; j < 5; j++) {
            System.out.println("分數="+arr[j]);
            sum+=arr[j];
        }
        System.out.println("總和="+sum);

        int [] res = maxmin(arr);
        System.out.println("最高分="+res[0]+",最小分="+res[1]);

    }

    public static int[] maxmin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];

            }
        }

        return new int[]{max,min};

    }
}










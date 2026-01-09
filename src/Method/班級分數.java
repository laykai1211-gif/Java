package Method;

import java.util.Scanner;

public class 班級分數 {
    public static void main(String[] args) {
        Scanner scIn = new Scanner(System.in);
        System.out.println("輸入10個0~100分");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 10) {
                int score = scIn.nextInt();
                if (score >= 0 && score <= 100) {
                    arr[i] = score;
                    break;
                } else {
                    System.out.println("成績無效 重新輸入");
                }
            }
        }
//        for (int i1 = 0; i1 < arr.length; i1++) {
//            System.out.println(arr[i1]);
//        }
        int[] res = num(arr);
        System.out.println("及格人數"+res[0]+"人");
        System.out.println("及格率"+res[1]+"%");
        System.out.println("最高分"+res[2]+"分");
        System.out.println("總分"+res[3]+"分");

    }

    public static int[] num(int[] arr) {
        int sum = 0;
        int max = 0;
        int total = 0;

        //及格人數
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 60) {
                sum++;
            }
            // 最大值
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }

//sum是及格人數 sumpa及格率 max最大值 total總分
            //總分
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        //要先*100 再除長度 = 百分比
        int sumpa = sum * 100 / arr.length;
            return new int[]{sum, sumpa, max, total};
    }
    }




package Method;

import java.util.Scanner;

public class 快遞費 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入重量公斤");
            double kg = sc.nextDouble();
            if (kg <= 0) {
                System.out.println("請重新輸入");
                continue;
                //跳過後面的計算，直接回到 while 開頭重新輸入
            }
        //正確輸入才進行計算
        double result = money(kg);
            System.out.println("總共" + +result + "元");
            break;
        }
    }

    //第一個double回傳給上面 要回傳小數上去 ,從上面接收一個double 的a參數
    public static double money(double a) {
        //money也要改double
        double money = 0;
        //接收的數字 小數無條件進位
        int kg = (int) Math.ceil(a);

        if (kg <= 1) {
            money = 10;
        } else if (kg <= 5) {
            money = (10 + (kg - 1) * 2);
        } else {
            money = 18 + (kg - 5) * 1.5;
        }

        return money;
    }
    //4.5= 5    4*2=8 +10 = 18
    // 5.2 = 6     1 10  2 12  3 14 4 16 5 18 6 19.5
}











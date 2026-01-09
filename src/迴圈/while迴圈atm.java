package 迴圈;

import java.util.Scanner;

public class while迴圈atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- 歡迎使用 Java ATM ---");
        int atm = 1000;
        while (true) {
            System.out.println("1. 查詢 | 2. 提款 | 3. 存款 | 0. 離開");
            int choice = scanner.nextInt();
            if (choice == 0) {
                // 寫下你的結束邏輯
                break;
            } else if (choice == 1) {
                System.out.println(atm);
            } else if (choice == 2) {
                while (true) {
                    System.out.println("要提多少錢,輸入0返回主選單");
                    int money = scanner.nextInt();
                    if (money < 0) {
                        System.out.println("金額無效 重新輸入");
                    } else if (money == 0) {
                        System.out.println("已取消提款");
                        break; // 跳出內層迴圈，回到選單
                    } else if (money > atm) {
                        System.out.println("餘而不足 重新輸入");

                    } else {
                        atm -= money;
                        System.out.println("提款成功 剩餘:" + atm + "元");
                        break;
                    }
                }
            } else if (choice == 3) {
                while (true) {
                    System.out.println("要存多少錢");
                    System.out.println("輸入0回到主選單");
                    int saveMoney = scanner.nextInt();
                    if (saveMoney < 0) {
                        System.out.println("輸入正確的數字");
                    } else if(saveMoney>0){
                        atm += saveMoney;
                        System.out.println("現在的存款"+atm+"元");
                        break;
                    }else{
                        break;
                    }
                }
            }
            else{
                System.out.println("無效指令重新輸入");
            }
        }
    }
}

// 寫下其他的 if-else 邏輯


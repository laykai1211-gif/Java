package 迴圈;

import java.util.Random;

public class 紅包分錢 {
//20000給五個人分 ，第一個最多抽到19996 每個人最少1 第五個最少1
    public static void main(String[] args) {
        Random random = new Random();
        int money = 20000;
        int n = 5;
        //money小於5不給抽
        if (money < n) {
            System.out.println("錢不夠");
        } else {

            for (int i = 1; i < n; i++) { //1 2 3 4
                //                        4 3 2 1
                //紅包random範圍 (20000-總人數-第i個人)+1 ,+1表示最少1元 不能0元
                int myMoney = random.nextInt(money - (n - i)) + 1;
                //money剩餘數=money-被拿走的金額,表示下一次隨機數不能超過剩餘金額
                money -= myMoney;
                //第一個人 20000-(5-1)+1
                System.out.println("第" + i + "個人搶到" + myMoney);
            }
            System.out.println("第" + n + "個人搶到" + money);
        }
    }
}



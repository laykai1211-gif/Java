package 練習;

import java.util.Scanner; //掃描器
public class bmi計算機 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你的身高公分");
        double height = scanner.nextDouble();
        height /= 100;

        System.out.println("請輸入你的體重公斤");
        double weight = scanner.nextDouble();

        double bmi = weight / (Math.pow(height, 2));
        bmi = Math.round(bmi * 10) / 10.0;
        System.out.println("你的bmi:" + bmi);

        if (bmi < 18.5) {
            System.out.println("過輕");
        } else if (bmi>=18.5 && bmi < 24) {
            System.out.println("正常");
        } else if (bmi >= 24 && bmi<27) {
            System.out.println("過重");
        } else if (bmi >= 27 && bmi<30) {
            System.out.println("輕度肥胖");
        } else if (bmi >= 30 && bmi<35) {
            System.out.println("中度肥胖");
        } else {
            System.out.println("重度肥胖");
        }
    }
}
//字串 "" , 字元'' 整數int直接打 小數點=double


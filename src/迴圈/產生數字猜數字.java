import java.util.Random;
import java.util.Scanner;
// 產生隨機數字
//0~2 =3 從0開始，後面要加1
void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100)+1;
    System.out.println("輸入1~100");
    int sum=0;
    int suma=0;
    while(true) {
        int n = scanner.nextInt();

        if (n > number) {
            sum++;
            System.out.println("小一點");
            if (sum%3==0){
                System.out.println("答案是" + (number-5)+ "~" +(number+5));

            }
        } else if (n == number){
            System.out.println("猜對了");
            break;
        }else{
            suma++;
            System.out.println("大一點");
            if (suma%5==0){
                System.out.println("答對了");
                break;
            }
        }
    }
}

//    boolean x=random.nextBoolean();
//    int x=random.nextInt();
//    System.out.println(x);


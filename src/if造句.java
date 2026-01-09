import java.util.Scanner;
void main() {
Scanner scanner = new Scanner(System.in);
int hp = 200;
int hurt =scanner.nextInt();
hp -=hurt;
    if (hp<=1){
        hp=1;
    }
    System.out.println(hp);
    System.out.println("回復");
    int heal =scanner.nextInt();
    hp+=heal;
    if (hp>200){hp=200;

    }
    System.out.println(hp);
}
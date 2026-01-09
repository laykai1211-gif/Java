import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int hp=200;
    int hurt=0;
    while (true) {
        System.out.println("請輸入扣的血");
        hurt = scanner.nextInt();
        if (hurt > 0) {
            break;
        } else {
            System.out.println("當前傷害不能負數");
        }
    }

    hp-=hurt;
    int add=0;
    if(hp<=0){
        hp=1;
    }
    while (true){
        System.out.println("現在的血量是" +hp);
        System.out.println("請輸入治癒的血");
        add = scanner.nextInt();
        if(add>0){
            break;
        }else {
            System.out.println("治癒血量不能負數");
        }
    }
    hp+=add;
    System.out.println("現在的血量是" + hp);
    {
}}
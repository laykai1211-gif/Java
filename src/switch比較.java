import java.util.Scanner;
//如果要做很多值的比較 可以考慮switch語句
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入1~7");
    int num = scanner.nextInt();
    switch (num){
        case 1:
            System.out.println("星期日");
            break;
        case 2:
            System.out.println("星期一");
            break;
        case 3:
            System.out.println("星期二");
            break;
        case 4:
            System.out.println("星期三");
            break;
        case 5:
            System.out.println("星期四");
            break;
        case 6:
            System.out.println("星期五");
            break;
        case 7:
            System.out.println("星期六");
            break;
        default:
            System.out.println("請輸入1~7");
    }

}

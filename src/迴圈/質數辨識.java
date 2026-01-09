import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);

    int num = 0;
    while (true) {
        System.out.println("輸入一個整數");
        num = scanner.nextInt();
        if (num >= 2) {
            break;
        } else {
            System.out.println("輸入一個>2的整數");
        }
    }
    int sum = 0;
    for (int i = 2; i <= num - 1; i++) {
        if (num % i == 0) {
            sum++;
            //遇到能被二除的直接break掉
            break;
        }
        }
    if (sum==0){
        System.out.println("這是質數");
    }else {
        System.out.println("這不是質數");
    }
    }

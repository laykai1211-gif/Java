import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("輸入第一個數字");
    int num1 = scanner.nextInt();
    System.out.println("輸入第二個數字");
    int num2 = scanner.nextInt();

    int max = Math.max(num1, num2);
    int min = Math.min(num1, num2);

    int count = 0;
    for (int i = min; i <= max; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            count++;
        }
    }

    if (count == 0) {
        System.out.println("在" + min + "~" + max + "間沒有能被3和5整除的數字");
    } else {
        System.out.println("在" + min + "~" + max + "間能被3和5整除的數字共有" + count + "個");
    }
}
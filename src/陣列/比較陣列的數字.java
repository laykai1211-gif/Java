import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int[] arr = {33, 5, 22, 44, 55, 33};
    boolean flag = false;

    System.out.println("輸入一個數字");
    int num = scanner.nextInt();
    for (int i = 0; i < arr.length; i++) {

        if (num == arr[i]) {
            flag=true;
            System.out.println(i);
            break;
        }
    }
    if (!flag){
        System.out.println("數字錯誤");
    }

}
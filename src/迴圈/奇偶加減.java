import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("輸入數字");
    int num = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
        if (i % 2 == 0) {
            sum -= i;
        } else {
            sum += i;
        }
    }
    System.out.println(sum);
    //100之前的偶數總和
//    int sum=0;
//    for(int i=1;i<=100;i++){
//
//        if (i%2 ==0){
//            sum+=i;
//        }
//    }
//    System.out.println(sum);

}



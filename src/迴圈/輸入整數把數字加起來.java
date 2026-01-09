import java.util.Scanner;
void main() {
    Scanner scanner =new Scanner(System.in);
    System.out.println("輸入整數");
    int num= scanner.nextInt();
    if (num<0){
        num= -num ;
    }
    int sum = 0;
   while (num !=0){
       sum=sum+num%10;
       num = num /10;


   }
    System.out.println(sum);
   }

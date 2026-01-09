package Method;

public class 九九乘法表 {
    public static void main(String[] args) {


        printMultable();
    }
//定義沒有返回值,也沒有參數 上方直接調用
    public static void printMultable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(+j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}









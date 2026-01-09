package Method;

public class 基礎2 { // 類別名稱建議大寫

    // 這是程式的入口，所有的執行動作要寫在這裡面
    public static void main(String[] args) {
        // 呼叫 getSum 並取得結果
        int result = getSum(10, 20);

        // 印出結果，不然你看不到運算後的 30
        System.out.println("總和是: " + result);
//        System.out.println(result (30,40));

    }

    // 這是你定義的求和方法，放在類別內、main 方法外
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
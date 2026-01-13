package Exception;

public class test {
    public static void main(String[] args) {
        try {
            // 嘗試將 10 除以 0 (ArithmeticException)
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // 捕獲並處理 ArithmeticException
            System.out.println("發生算術錯誤：" + e.getMessage());
        } catch (Exception e) {
            // 捕獲其他所有 Exception
            System.out.println("發生其他例外：" + e.getMessage());
        } finally {
            System.out.println("這個區塊總是會執行");
        }
    }

}

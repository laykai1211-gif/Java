package 練習4;

public class Linepay implements payment{
    @Override
    public void pay(int amount) {
        System.out.println("使用 LinePay 支付"+amount+ " 元");
    }
}

package 練習4;

public class  CreditCard implements payment{
    @Override
    public void pay(int amount) {
        System.out.println("信用卡"+amount+"元");
    }
}

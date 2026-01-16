package 練習4;

public class ShoppingCart {
private payment pay;
    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.setPayment(new CreditCard());
        s.checkout(1);
        s.setPayment(new Linepay());
        s.checkout(500);
    }
public void setPayment(payment pay){
        this.pay=pay;
}
public void checkout(int total){
        if(pay==null){
            System.out.println("1");
        }else {
            pay.pay(total);
        }
}
}

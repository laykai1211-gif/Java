package super應用;

public class Phonetest {
    public static void main(String[] args) {
        Phonee p = new Phonee();
        p.name="小米";
        p.price=4999;

        double payment = p.payment();
        System.out.println(payment);

        laptop l = new laptop();
        l.name="asus";
        l.price=10000;
        double payment2 = l.payment();
        System.out.println(payment2);

    }
}

package super應用;

public class laptop extends smartDevice{
    @Override
    public double payment() {
        double payment=super.payment();
        payment=payment*0.95;
        return payment;
    }
}

package super應用;

public class Phonee extends smartDevice{
    @Override
    public double payment() {
        double payment = super.payment();
        payment = payment*0.9;
        return payment;

    }

}

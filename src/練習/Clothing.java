package 練習;

public class Clothing extends product{
    @Override
    public double calFinalPrice() {
        if (getPrice()>=1000){
            return getPrice()-200;
        }else {
            return getPrice();
        }
    }

    public Clothing(String name, double price) {
        super(name, price);
    }

    public Clothing() {
    }
}

package 練習;

import 多態練2.Taxable;

public class Electronices extends product implements Taxable {
    public Electronices(String name, double price) {
        super(name, price);
    }

    public Electronices() {
    }

    @Override
    public double applyTax(double price) {
       return  price*1.05;
    }
    //把拿到的price先*1.05
    //再把applyTax拿去*0.9
    @Override
    public double calFinalPrice() {
        double discount=getPrice()*0.9;
        return applyTax(discount);
    }



}

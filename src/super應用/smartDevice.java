package super應用;

public class smartDevice {
    String name;
    double price ;
    public double payment(){
        if(price>=0 &&price<1000){
            return price;
        } else if (price<5000) {
            return price*0.9;
        } else if (price<10000) {
            return price*0.8;
        }else if(price>=10000){
            return price*0.7;
        }else {
            return 0;
        }
    }
}

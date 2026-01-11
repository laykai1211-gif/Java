package 多態練1;

public class car extends trafic{
    public car(String brand, double speed) {
        super(brand, speed);
    }

    public car() {
    }

    @Override
    public void move() {
        System.out.println("汽車:品牌"+getBrand()+"移動速度:"+getSpeed());
    }
    public void honk(){
        System.out.println("喇叭888");
    }
}

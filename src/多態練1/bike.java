package 多態練1;

public class bike extends trafic{
    public bike(String brand, double speed) {
        super(brand, speed);
    }

    public bike() {
    }

    @Override
    public void move() {
        System.out.println("腳踏車:品牌"+getBrand()+"移動速度:"+getSpeed());
    }
    public void ring(){
        System.out.println("響鈴");
    }
}

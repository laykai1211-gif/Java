package 多態練1;

public class trafic {
    private String brand;
    private double speed;

    public void move(){
        System.out.println("品牌"+brand+"移動速度:"+speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public trafic(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public trafic() {
    }

}

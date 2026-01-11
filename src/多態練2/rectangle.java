package 多態練2;

public class rectangle extends shape{
    double width;
    double high;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public rectangle() {
    }

    @Override
    public void perimeter() {
        System.out.println("長方形周長:"+getHigh()*getWidth()*2);
    }

    @Override
    public void manji() {
        System.out.println("長方形面積:"+getHigh()*getWidth());
    }
}

package 多態練2;

public class circle extends shape{
    double pi;
    double banJin;

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getBanJin() {
        return banJin;
    }

    public void setBanJin(double banJin) {
        this.banJin = banJin;
    }

    public circle(double pi, double banJin) {
        this.pi = pi;
        this.banJin = banJin;
    }

    public circle() {
    }

    @Override
    public void perimeter() {
        System.out.println("圓形周長:"+getPi()*getBanJin()*2);
    }

    @Override
    public void manji() {
        System.out.println("圓形面積:"+getPi()*getBanJin()*getBanJin());
    }


}

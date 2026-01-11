package 大練5;

public class sameSpeed extends tax{
    public sameSpeed(int code, int weight, String name) {
        super(code, weight, name);
    }

    public sameSpeed() {
    }

    @Override
    public int taxPrice() {


        return weight*20;
    }
}

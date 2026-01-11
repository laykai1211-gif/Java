package 大練5;

public class air extends tax{
    public air(int code, int weight, String name) {
        super(code, weight, name);
    }

    public air() {
    }

    @Override
    public int taxPrice() {
        return weight*25;
    }
}

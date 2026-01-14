package 練習2;

public class Slime extends enemy{
    @Override
    public void attack() {
        System.out.println("史萊姆跳起來撞你");
    }

    public Slime(String name) {
        super(name);
    }

    public Slime() {
    }
}

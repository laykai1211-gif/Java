package 練習2;

public class Boss extends enemy{
    @Override
    public void attack() {
        System.out.println("Boss 怒吼");
        System.out.println("Boss 揮舞巨劍");
    }

    public Boss(String name) {
        super(name);
    }

    public Boss() {
    }
}

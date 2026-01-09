package 大練2;

public class manager extends staff{
    @Override
    public void eat() {
        System.out.println("吃米飯");
    }

    public manager(String name, int workCode, int price) {
        super(name, workCode, price);
    }

    public manager() {
    }

    @Override
    public void work() {
        System.out.println("管人");
    }
}

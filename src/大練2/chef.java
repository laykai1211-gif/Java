package 大練2;

public class chef extends staff{
    @Override
    public void work() {
        System.out.println("炒菜");
    }

    @Override
    public void eat() {
        System.out.println("吃米飯");
    }

    public chef(String name, int workCode, int price) {
        super(name, workCode, price);
    }

    public chef() {
    }
}

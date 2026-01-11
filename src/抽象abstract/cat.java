package 抽象abstract;

public class cat extends animal{
    @Override
    public void eat() {
        System.out.println(getName()+"再吃魚");
    }

    public cat(String name, String color) {
        super(name, color);
    }

    public cat() {
    }

    public void mouse(){
        System.out.println(getName()+"抓老鼠");
    }
}

package 抽象abstract;

public class dog extends animal{
    public dog(String name, String color) {
        super(name, color);
    }

    public dog() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃骨頭");
    }

    public void look(){
        System.out.println(getName()+"看家");
    }
}

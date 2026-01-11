package 抽象abstract;

public abstract class animal {
    String name;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public animal() {
    }

    //abstract
    public abstract void eat();


public void drink() {
    System.out.println(getName()+"再喝水");

}
}



package 練習2;

public abstract class enemy{
    String name;
    public abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enemy(String name) {
        this.name = name;
    }

    public enemy() {
    }
}

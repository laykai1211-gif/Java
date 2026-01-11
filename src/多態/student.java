package 多態;

public class student extends person{
    @Override
    public void work() {
        System.out.println("學習");
    }

    public student(String name, String username, String password) {
        super(name, username, password);
    }

    public student() {
    }
}

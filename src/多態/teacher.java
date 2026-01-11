package 多態;

public class teacher extends person{
    public teacher() {
    }

    public teacher(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("教書");
    }
}

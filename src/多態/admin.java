package 多態;

public class admin extends person{
    public admin(String name, String username, String password) {
        super(name, username, password);
    }

    public admin() {
    }

    @Override
    public void work() {
        System.out.println("管理網站");
    }
}

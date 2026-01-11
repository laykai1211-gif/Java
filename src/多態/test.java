package 多態;

public class test {
    public static void main(String[] args) {
        student s = new student("小鬼","a123","a567");
        registerSystem rs=new registerSystem();
        rs.register(s);

        teacher t = new teacher("曉華","123","456");
        rs.register(t);

        admin ad = new admin("小廣","789","555");
        rs.register(ad);


    }
}

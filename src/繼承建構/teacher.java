package 繼承建構;

public class teacher extends person{
    String subject;

    public teacher() {
        System.out.println("子類teacher空參建構");
    }

    public teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子類teacher帶參建構");
    }
}

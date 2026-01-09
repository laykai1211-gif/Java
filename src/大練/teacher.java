package 大練;

public class teacher extends person {
    String subject;

    public void teach() {
        System.out.println("教書");
    }

    public teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public teacher() {
    }
}

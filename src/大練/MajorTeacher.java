package 大練;

public class MajorTeacher extends teacher{
    @Override
    public void teach() {
        System.out.println("專業課");
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public MajorTeacher() {
    }
}

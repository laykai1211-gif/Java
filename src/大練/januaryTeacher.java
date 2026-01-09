package 大練;

public class januaryTeacher extends teacher{
    @Override
    public void teach() {
        System.out.println("通識課");
    }

    public januaryTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public januaryTeacher() {
    }
}

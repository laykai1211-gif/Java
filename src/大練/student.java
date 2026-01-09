package 大練;

public class student extends person {
    String grade;

    public student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public student() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("學習");
    }
}

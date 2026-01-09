package 繼承建構;

public class test {
    public static void main(String[] args) {
    student s = new student("張三",23,"一年級");
        System.out.println(s.name+s.age+s.grade);

        student stu = new student();
    }
}

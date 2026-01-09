package 大練;

public class BacherloStudent extends student{
    @Override
    public void study() {
        System.out.println("攻讀學士學位");
    }

    public BacherloStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public BacherloStudent() {
    }

}

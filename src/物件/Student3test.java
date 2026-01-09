package 物件;

public class Student3test {
    public static void main(String[] args) {
        Student3 stu3 = new Student3();
        stu3.setName("張一");
        stu3.setAge(25);
        System.out.println(stu3.getName());
        System.out.println(stu3.getAge());
        stu3.study();
        stu3.eat();
        stu3.sleep();

        Student3 stu2 =new Student3("123",25);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.study();
        stu2.eat();
        stu2.sleep();
    }
}

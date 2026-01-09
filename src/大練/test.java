package 大練;

public class test {
    public static void main(String[] args) {
        BacherloStudent bs = new BacherloStudent("小雪",15,"三年級");
        System.out.println(bs.name+bs.age+bs.grade);
        bs.study();
        bs.sleep();
        bs.eat();
    }
}

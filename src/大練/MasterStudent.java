package 大練;

public class MasterStudent extends student{
    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public MasterStudent() {
    }

    @Override
    public void sleep() {
        System.out.println("在總統套房睡覺");
    }

    @Override
    public void study() {
        System.out.println("攻讀碩士學位");
    }
}

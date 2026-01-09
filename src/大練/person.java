package 大練;

public class person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public void eat() {
        System.out.println("吃飯");
    }

    public void sleep() {
        System.out.println("睡覺");
    }

}

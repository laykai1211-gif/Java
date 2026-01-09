package 物件;

public class Student2 {
    private String name;
    private int age;
    private String gender;
    private int height;

    public Student2() {
        System.out.println("空參結構被調用了");
    }

    public Student2(String name, int age, String gender, int height) {
        System.out.println("帶全部參數的建構被調用了");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

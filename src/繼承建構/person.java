package 繼承建構;

public class person {
    String name;
    int age;

    public person() {
        System.out.println("父類的空參建構");
    }

    public person(String name, int age) {
        System.out.println("父類的帶參建構");
        this.name = name;
        this.age = age;
    }
}

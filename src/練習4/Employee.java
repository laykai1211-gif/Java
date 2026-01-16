package 練習4;

public abstract class Employee {
    private String name;
    private String id;

    public abstract int calMoney();

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void adjustSalary(int amount) {
    }
}

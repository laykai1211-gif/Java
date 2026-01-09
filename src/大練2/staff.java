package 大練2;

public class staff {
    String name;
    int workCode;
    int price;
public void work(){
    System.out.println("工作");
}
public void eat(){
    System.out.println("吃飯");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkCode() {
        return workCode;
    }

    public void setWorkCode(int workCode) {
        this.workCode = workCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public staff(String name, int workCode, int price) {
        this.name = name;
        this.workCode = workCode;
        this.price = price;
    }

    public staff() {
    }
}

package 大練5;

public class tax {
    int code;
    int weight;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public tax(int code, int weight, String name) {
        this.code = code;
        this.weight = weight;
        this.name = name;
    }

    public tax() {
    }

    String name;

    public int taxPrice(){
        return weight*10;
    }
}

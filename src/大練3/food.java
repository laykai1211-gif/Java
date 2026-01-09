package 大練3;

public class food {
    String name;
    int price;
    String teste;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public food(String name, int price, String teste) {
        this.name = name;
        this.price = price;
        this.teste = teste;
    }

    public food() {
    }

    public void introduce(){
        System.out.println("介紹");
    }
}

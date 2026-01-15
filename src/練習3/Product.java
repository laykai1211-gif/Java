package 練習3;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("錯誤");
        }else {
        this.price = price;

        }
    }

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public Product() {
    }
}

package 大練4;

public class product {
    String name;
    int price ;

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

    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public product() {
    }

    public void showInfo(){
        System.out.println("名稱: " + name + ", 價格: " + price);
    }

}

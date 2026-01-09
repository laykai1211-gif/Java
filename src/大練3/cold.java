package 大練3;

public class cold extends food{
    int shelfLife;

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public cold(String name, int price, String teste, int shelfLife) {
        super(name, price, teste);
        this.shelfLife = shelfLife;
    }

    public cold(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void introduce() {
        System.out.println("好冰");
    }
}

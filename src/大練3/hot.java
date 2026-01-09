package 大練3;

public class hot extends food{
    int cookTime;

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public hot(String name, int price, String teste, int cookTime) {
        super(name, price, teste);
        this.cookTime = cookTime;
    }

    public hot(int cookTime) {
        this.cookTime = cookTime;
    }

    @Override
    public void introduce() {
        System.out.println("好熱喔");
    }
}

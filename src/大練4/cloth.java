package 大練4;

public class cloth extends product{
    int size;
    String color;

    public cloth(String name, int price, int size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public cloth(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public cloth() {
    }

    public void size(){
        System.out.println("尺寸");
    }
    public void color(){
        System.out.println("顏色");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("尺寸:"+size+"顏色:"+color);
    }
}

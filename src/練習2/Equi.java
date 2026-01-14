package 練習2;
public class Equi {
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Equi(String itemName, int power, String type) {
        this.itemName = itemName;
        this.power = power;
        this.type = type;
    }

    public Equi() {
    }

    String itemName;
    int power;
    String type;

    @Override
    public String toString() {
        return "裝備名稱: " + itemName + " | 攻擊力: " + power + " | 類型: " + type;
    }
}

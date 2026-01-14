package 練習2;

public class Character {
    private int hp;
    private int level;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp<0){
            this.hp=0;
        }else if (hp>1000){
            this.hp=1000;
        }else {this.hp=hp;}

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
       if (level>this.level){
            this.level=level;
       }else if(level==this.level){
            this.level=level;
       }else {
           System.out.println("警告：等級不可倒退！當前等級為: " + this.level);
       }
    }

    public Character(int hp, int level) {
        this.hp = hp;
        this.level = level;
    }

    public Character() {
    }
}

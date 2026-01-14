package 練習2;

public class Hero extends Character{
    private String name;
    private Skill skill1; // 這裡用介面當型別
    private Skill skill2;

    public Hero(String name) { this.name = name; }

    public void setSkill1(FireBall s) { this.skill1 = s; }
    public void setSkill2(WaterSplash s) { this.skill2 = s; }

    public void castSkill1() {
        if (skill1 != null) skill1.perform();
    }
    public void castSkill2() {
        if (skill2 != null) skill2.perform();
    }
}
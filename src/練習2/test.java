package 練習2;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Hero brad = new Hero("布萊德");

        brad.setHp(1001);
        System.out.println(brad.getHp());
        List<Equi> list=new ArrayList<>();
        list.add(new Equi("新手劍", 10, "武器"));
        list.add(new Equi("龍之大劍", 150, "武器"));
        list.add(new Equi("木盾", 5, "防具"));
        list.add(new Equi("雷神之鎚", 200, "武器"));
        list.add(new Equi("鐵甲", 0, "防具"));
        for (Equi e : list){
            if(e.getType().equals("武器")&& e.getPower()>50){
                System.out.println(e);
            }
        }


       enemy [] monster = new enemy[4];
        monster[0]= new Slime("王");
        monster[1]= new Slime("王2");
        monster[2]= new Slime("王3");
        monster[3]= new Boss("王4");
        //把陣列print出來 並都使用attack
       for(enemy e :monster){
           e.attack();
       }



        System.out.println(brad.getHp());
        // 給英雄裝備技能
        brad.setSkill1(new FireBall());
        brad.setSkill2(new WaterSplash());

        // 施放技能
        System.out.println("第一招：");
        brad.castSkill1();

        System.out.println("第二招：");
        brad.castSkill2();
    }
}

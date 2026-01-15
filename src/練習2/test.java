package 練習2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        List<Equi> powerfulWeapons = list.stream()
                .filter(e -> e.getType().equals("武器") && e.getPower() > 50)
                .collect(java.util.stream.Collectors.toList());

ObjectMapper mapper =new ObjectMapper();
        try {
            // 建立檔案物件
            File outputFile = new File("powerful_weapons.json");

            // writeValue 會直接把物件轉成 JSON 並寫入該檔案
            // writerWithDefaultPrettyPrinter 是為了讓生成的 JSON 格式整齊好讀
            mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, powerfulWeapons);

            System.out.println("✅ 成功！強力武器已過濾並存至: " + outputFile.getAbsolutePath());

            // 順便在控制台印出來確認一下
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(powerfulWeapons);
            System.out.println("JSON 內容如下：\n" + jsonString);

        } catch (IOException e) {
            System.err.println("❌ 存檔失敗：" + e.getMessage());
            e.printStackTrace();
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

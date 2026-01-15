package 練習3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

    Product p = new Product("123",-1);
        System.out.println(p.getPrice());
//        p.setPrice(1);
        Developer d = new Developer();
        d.work();
        d.debug();
        //建立list 執行方法
        ArrayList<Playable> list =new ArrayList<>();
        list.add(new MusicPlayer());
        list.add(new VideoPlayer());
        for(Playable P :list){
            P.play();
        }

    }

}

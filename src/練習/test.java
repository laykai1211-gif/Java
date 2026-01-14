package 練習;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //用共同的父類別 就可以把東西放在list裡 多形的展示
        List<product> list = new ArrayList<>();
        list.add(new Electronices("手機",25000));
        list.add(new Clothing("衣服",999));
        //把list print出來 p.
        for(product p :list){
            System.out.println("商品名稱"+p.getName());
            System.out.println("商品價格"+p.getPrice());
            System.out.println(p.calFinalPrice());

        }
    }
}

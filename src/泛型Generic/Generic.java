package 泛型Generic;

import java.util.ArrayList;

public class Generic {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String> ();
        //<>自己約束數據類型 避免強制類型轉換 及可能出現的異常
        list.add("java");
        list.add("ava");


//        list.add(23);
//        list.add(true);
//        list.add(new Object());

        for (int i = 0; i < list.size() ; i++) {
            Object re = list.get(i);
        }
    }
}

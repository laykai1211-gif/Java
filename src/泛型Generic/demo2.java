package 泛型Generic;

public class demo2 {
    static void main(String[] args) {
        demo1<String> list = new demo1<>();
        list.add("asd");
        list.add("sd");
        list.add("bd");
        list.add("cd");
        list.add("as");
        list.add("ad");
//        System.out.println(list.remove("as"));
        System.out.println(list);
    }
}

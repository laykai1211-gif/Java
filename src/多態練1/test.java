package 多態練1;

public class test {
    static void main(String[] args) {
        person p = new person("小黑",80,"人妖");
        System.out.println(p.getName()+p.getAge()+p.getGender());
        car c = new car("benz",250);
        p.driver(c);
        bike b = new bike("luxgen",10);
//        p.driver(b);
    }
}

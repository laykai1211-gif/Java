package 大練5;

public class test {
    public static void main(String[] args) {
        sameSpeed s = new sameSpeed(87,10,"小黑");

        System.out.println(s.code+"+"+s.weight+"+"+s.name+"+"+s.taxPrice());

        air a = new air(23,20,"酒");
        System.out.println(a.code+"+"+a.weight+"+"+a.name+"+"+a.taxPrice());
    }
}

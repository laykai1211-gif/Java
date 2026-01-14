package 介面interface;

public class test {
    public static void main(String[] args) {
        System.out.println(a.name);
    c c = new c();
    c.hey();
        System.out.println(c.no());
    c.se();



    }
}
class c implements a,b{
//實現類 可以有多個接口 必須重寫接口的全部抽象方法，否則這個類得定義成抽象類
    //彌補了類單繼承的不足，讓類擁有更多角色
    @Override
    public void se() {
        System.out.println("se");

    }

    @Override
    public void hey() {
        System.out.println("hey");
    }

    @Override
    public String no() {

        return "no";
    }
}

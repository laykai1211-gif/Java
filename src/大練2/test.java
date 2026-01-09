package 大練2;

public class test {
    public static void main(String[] args) {
        chef c = new chef("小王",9527,250);
        System.out.println(c.name+c.workCode+c.price);
        c.work();
        c.eat();

        manager m = new manager("老謝",886,3000);
        System.out.println(m.name+m.workCode+m.price);
        m.work();
        m.eat();
    }
}

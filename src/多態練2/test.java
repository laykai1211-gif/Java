package 多態練2;

public class test {
    static void main(String[] args) {
        student s = new student("小修",26);
        circle c = new circle(3.14,5);

        rectangle r = new rectangle(4,6);
        System.out.println(s.getName()+s.getAge());
        System.out.println("圓周率"+c.getPi()+"半徑"+c.getBanJin());
        s.jiSuan(c);
        System.out.println("長方形長"+r.getHigh()+"寬"+r.width);
        s.jiSuan(r);

    }
}

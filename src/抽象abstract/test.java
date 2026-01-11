package 抽象abstract;

public class test {
    static void main(String[] args) {
        cat c = new cat("cat","white");
        System.out.println(c.getName()+","+c.color);
        c.eat();
        c.drink();
        c.mouse();
        dog d = new dog("dog","black");
        System.out.println(d.getName()+","+d.color);
        d.eat();
        d.drink();
        d.look();
    }
}

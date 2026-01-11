package 大練4;

public class test {
    public static void main(String[] args) {
        cloth c = new cloth("內衣",250,36,"黑色");
        System.out.println(c.name+c.price+c.size+c.color);
        c.showInfo();

        electronic e =new electronic("電腦",28000,"asus",2000);
        System.out.println(e.name+e.price+e.logo+e.model);
        e.showInfo();
    }
}

package 大練3;

public class test {
    public static void main(String[] args) {
        hot h = new hot("熱狗",10,"很讚",50);
        System.out.println(h.name+h.price+h.teste+h.cookTime);
        h.introduce();

        cold c = new cold("冰棒",25,"很冰",100);
        System.out.println(c.name+c.price+c.teste+c.shelfLife);
        c.introduce();

    }
}

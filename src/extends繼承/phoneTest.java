package extends繼承;

public class phoneTest {
    public static void main() {
        android p = new android();
        p.logo="安卓";
        p.price=20000;
        System.out.println(p.logo+p.price);
        p.call();
        p.send();
        p.nfc();
        System.out.println("----------");
        apple a = new apple();
        a.logo="apple";
        a.price=35000;
        System.out.println(a.logo+a.price);
        a.call();
        a.send();
        System.out.println("----------");
        notebook n = new notebook();
        n.logo="asus";
        n.price=17000;
        System.out.println(n.logo+n.price);
        n.code();

    }
}

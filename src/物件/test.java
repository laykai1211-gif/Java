package 物件;

public class test {
    //帶有main 叫做 測試類
    public static void main(String[]args) {
        dog d = new dog();
        d.setName("大黑");
        d.setAge(1);
//        System.out.print(d.getAge()+"歲的"+d.getName());
        d.eat();

        d.weight=4.5;
        d.color="黑色";
        dog d1 = new dog();
//        d1.name="大黑";
//        d1.age =9;
        d1.weight=4.5;
        d1.color="黑色";
//        System.out.println(d1.weight);

//        teacher t=new teacher();
//        t.name="阿偉";
//        t.age=18;
        //調用t.
//        t.teach();
//        t.sleep();
//        t.eat();
    }
}

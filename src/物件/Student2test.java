package 物件;

public class Student2test {
    //空參結構是由虛擬機自動調用的
   public static void main(String[] args) {
        Student2 s =new Student2();
       System.out.println(s.getName());
       System.out.println(s.getAge());
       System.out.println(s.getGender());
       System.out.println(s.getHeight());

        Student2 ss=new Student2("張三",23,"男",176);
       System.out.println(ss.getName());
       System.out.println(ss.getAge());
       System.out.println(ss.getGender());
       System.out.println(ss.getHeight());
    }
}

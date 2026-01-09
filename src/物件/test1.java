package 物件;

public class test1 {
    //靜態變數:被當前類有的物件共享
    //共享:只要賦值一次
    //只要有一個物件修改了靜態變數，所有的物件再次訪問就是修改之後的
    //調用方式
    //類名
    //物件名
   public static void main(String[] args) {
       test11.teacherName="小勘老師";
        test11 s=new test11();
        s.name="小雪";
        s.age=23;
//        s.teacherName="小寒老師"; 直接用物件名 不推薦
       test11.teacherName ="小寒老師";

       test11 s2=new test11();
       s2.name="小王";
       s2.age=26;
       s2.teacherName ="小由老師";

       System.out.println(s.name + s.age + s.teacherName);
       System.out.println(s2.name + s2.age + s2.teacherName);
    }

}

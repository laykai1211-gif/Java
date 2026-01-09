package 物件;

public class PersonTest {
    public static void main() {
        PersonStudent s =new PersonStudent();
        s.name="小雪";
        s.age= 16;
        s.grade="一年級";
        System.out.println(s.name+s.age+s.grade);
        s.ear();
        s.study();

        System.out.println("-----------");

        PersonTeacher t =new PersonTeacher();
        t.name="曉薇";
        t.age=3;
        t.subject="中文";
        System.out.println(t.name+t.age+t.subject);
        t.teach();
        t.ear();


    }
}

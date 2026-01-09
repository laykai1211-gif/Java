package 繼承建構;

public class student extends  person{
    String grade;
    public student(){
        System.out.println("子類空參建構");
    }

    public student(String name,int age, String grade){
        super(name,age);
        this.grade=grade;
        System.out.println("子類的帶參建構");
    }
}

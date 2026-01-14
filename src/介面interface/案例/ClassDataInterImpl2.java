package 介面interface.案例;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;

    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班學生訊息如下");
        for (int i = 0; i < students.length; i++) {
            Student s =students[i];
            System.out.println(s.getName()+s.getSex()+s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum=0;
        for (int i = 0; i < students.length; i++) {
            Student s =students[i];
            sum+=s.getScore();
        }
        System.out.println("平均分"+sum/students.length);
    }
}
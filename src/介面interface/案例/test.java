package 介面interface.案例;

public class test {
    public static void main(String[] args) {
Student[] allStudents = new Student[10];
        allStudents[0] = new Student("張三", '男', 100);
        allStudents[1] = new Student("李四", '女', 85.5);
        allStudents[2] = new Student("王五", '男', 72.0);
        allStudents[3] = new Student("趙六", '女', 92.0);
        allStudents[4] = new Student("孫七", '男', 65.5);
        allStudents[5] = new Student("周八", '女', 48.0); // 剛好沒及格
        allStudents[6] = new Student("吳九", '男', 88.0);
        allStudents[7] = new Student("鄭十", '女', 79.5);
        allStudents[8] = new Student("郭小明", '男', 55.0);
        allStudents[9] = new Student("林志玲", '女', 98.0);

        ClassDataInter cdi = new ClassDataInterImpl1(allStudents);
        cdi.printAverageScore();
        cdi.printAllStudentInfos();
    }
}

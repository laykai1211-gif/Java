package 泛型2;

public class demo3 {
    public static void main(String[] args) {
    studentData studentData = new studentData();
    studentData.add(new student());
    studentData.delete(new student());
    student s = studentData.query(1);
    }
}

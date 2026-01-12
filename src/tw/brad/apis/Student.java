package tw.brad.apis;

import java.io.Serializable;

//implements 實作
//Serializable 可序列化
//把序列化解開 解序列化
public class Student implements Serializable{
    private String name;
    private int ch, eng, math;
    private Bike bike;

    public Student(String name, int ch, int eng, int math) {
        this.name = name; this.ch = ch;
        this.eng = eng; this.math = math;
        bike = new Bike();
    }
    public int score() {return ch+eng+math;}
    public double avg() {return score() / 3.0;}
    public String getName() {return name;}
    public Bike getBike() {return bike;}
}

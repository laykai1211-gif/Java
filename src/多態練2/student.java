package 多態練2;

import 多態練1.bike;
import 多態練1.car;

public class student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student() {
    }

    public void jiSuan(shape shape){
//        shape.manji();
//        shape.perimeter();
        if(shape instanceof circle){
            circle b =(circle) shape;

            b.perimeter();
            b.manji();
        }else if(shape instanceof rectangle){
            rectangle c = (rectangle) shape;
            c.perimeter();
            c.manji();
        }else {
            System.out.println("沒有這個類別");
        }


    }
}

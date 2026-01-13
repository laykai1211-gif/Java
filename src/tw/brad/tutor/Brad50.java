package tw.brad.tutor;

import java.io.*;

public class Brad50 {
    public static void main(String[] args) {
        Brad503 obj= new Brad503();
        try(ObjectOutputStream oout =new ObjectOutputStream(
                new FileOutputStream("dir1/xx.xx"))) {
        oout.writeObject(obj);
            System.out.println("ok");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("----");
        try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/xx.xx"))){
            Object obj1 = oin.readObject();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Brad501 implements Serializable{
    Brad501(){
        System.out.println("Brad501()");
    }
}
class Brad502 extends  Brad501{
    Brad502(){
        System.out.println("Brad502()");
    }
}
class Brad503 extends Brad502  {
    Brad503(){
        System.out.println("Brad503()");
    }
}

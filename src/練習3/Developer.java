package 練習3;

public class Developer extends Employee{
    @Override
    void work() {
        System.out.println("工程師在工作");
    }
    public void debug(){
        System.out.println("工程師在debug");
    }
}

package 練習4;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee("小王","1",12500,3000));
        list.add(new PartTimeEmployee("小強","1",200,168));
        for (Employee e:list){
            e.adjustSalary(100);
            System.out.println(e.getName()+e.calMoney());
            if (e instanceof FullTimeEmployee){
                FullTimeEmployee ft = (FullTimeEmployee) e;
                System.out.println("ft的獎金:"+ft.getBonus());
            }
            if (e instanceof PartTimeEmployee){
                PartTimeEmployee pt = (PartTimeEmployee) e;
                System.out.println("pt的時薪:"+pt.getHourlyMoney());
            }
        }

    }
}

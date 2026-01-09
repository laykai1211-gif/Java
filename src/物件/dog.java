package 物件;
//java bean類 不加static
public class dog {
    private int age;
    private String name;

    public void setName(String value) {
        name=value;
    }
    public String getName() {
        return name;
    }
    public void setAge(int num) {
        if(num>0 && num<15){
            age=num;
        }else {
            System.out.println("當前的"+num+"不在合理範圍內");
        }
    }
    public int getAge() {
        return age;
    }
    public void eat(){
        System.out.print(age +"歲的"+name+",正在吃骨頭");
    }

//    String name;

    double weight;
    String color;
}


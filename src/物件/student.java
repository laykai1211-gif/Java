package 物件;

public class student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age > 0 && age < 99){
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int height){
        if (height > 0 && height < 250){
            this.height=height;
        }
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int weight){
        if(weight > 0 && weight < 250){
            this.weight=weight;
        }
    }
    public int getWeight(){
        return weight;
    }
    public void study(){
//        System.out.println("大一新生"+name+age+"歲"+height+"公分"+weight+"公斤,剛進大學努力學習");
        System.out.println("剛進大學努力學習");
    }
    public void add(){
//        System.out.println("大二期間"+name+"增加了"+weight+"公斤");
    }
    public void less(){
//        System.out.println("大三期間"+name+"減肥成功,身高增加"+height+"cm"+"體重減少"+weight+"公斤");
    }
}

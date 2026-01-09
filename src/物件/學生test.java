package 物件;

public class 學生test {
    public static void main(String[] args) {

        student s = new student();
        s.setName("張三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
//    s.study();
//       s.add();
//        s.less();
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        s.study();
        int newWeight = s.getWeight() + 10;//增加的要先定義一個新的變數 在+物件+變的數字
        s.setWeight(newWeight); //再用set物件去包新的變數
//        int newAge = s.getAge()+1;
//        s.setAge(newAge);
        s.setAge(s.getAge()+1); //也可以不定變數直接加上去
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        int newHeight = s.getHeight() + 2;
        s.setHeight(newHeight);
        int newWeight2 = s.getWeight() - 3;
        s.setWeight(newWeight2);
        s.setAge(s.getAge()+1);
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());

        s.setAge(s.getAge()+1);
        s.setAge(s.getAge()+1);
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
    }

}

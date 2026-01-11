package 多態練1;

public class person {
    private String name;
    private int age;
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public person() {
    }

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void driver(trafic trafic){
        trafic.move();

                if(trafic instanceof bike){
                    bike b =(bike) trafic;
                    b.ring();
                }else if(trafic instanceof car){
                    car c = (car)trafic;
                    c.honk();

                }    }
}

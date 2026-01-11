package 多態;

public class registerSystem {
    public void register(person person){
        System.out.println(" 姓名為:"+person.getName()+",的帳戶註冊成功,帳號:"+person.getUsername()+",密碼:"+person.getPassword());
        person.work();
    }
}

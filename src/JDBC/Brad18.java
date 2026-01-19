package JDBC;

import java.util.List;

public class Brad18 {
    public static void main(String[] args) {
        MemberDAO dao=new MemberDAOImpl();

        Member member = new Member();
        member.setEmail("tom@gmail.com");
        member.setPasswd("12345");
        member.setName("tom");

        try {
            if (dao.addMember(member)) {
                ;
                System.out.printf("ok11%s  ",member.getName());
            } else {
                System.out.println("xx");
            }
        }catch (Exception e){
            System.out.println(e);
        }

//        try {
//            member = dao.findById(5);
//            System.out.println(member.getEmail()+": "+member.getName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//          if  (dao.deleteMember(3)){
//                System.out.println("delete success");
//            }else{
//                System.out.println("failure");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//           Member member = dao.findById(5);
//            System.out.println("信箱:"+member.getEmail()+" 名子:"+member.getName());
//            member.setEmail("tony@gmail.com");
//            member.setName("tony");
//            member.setPasswd("123456");
//            if (dao.updateMember(member)){
//                System.out.println("ok3");
//            }else {
//                System.out.println("xx3");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            List<Member> members=dao.findAll();
//            for(Member member:members){
//                System.out.printf("%d:%s:%s\n",member.getId(),member.getEmail(),member.getName());
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}

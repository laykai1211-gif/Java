package JDBC;

import java.util.Scanner;

public class Brad19 {
    public static void main(String[] args) {
        System.out.println("Member Login");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email:");
        String email=scanner.nextLine();
        System.out.println("Password:");
        String passwd=scanner.nextLine();

        MemberDAO dao =new MemberDAOImpl();
        try {
            Member member =dao.login(email,passwd);
            if(member!=null){
                System.out.printf("good,%s\n",member.getName());
            }else {
                System.out.println("not good");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

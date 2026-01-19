package JDBC;

import java.util.List;

public class Brad13 {
    public static void main(String[] args) {
        JdbcTool tool = new JdbcTool();
        String sql= """
                select email, name
                from member
               
                
                
                """;

     List<Member> gifts= tool.query(sql, rs ->  {
            Member member= new Member();
         member.setName(rs.getString("name"));
         member.setEmail(rs.getString("email"));
            return member;
        });
//     for (Gift gift:gifts){
//         System.out.println(gift);
//     }
//
//        System.out.println("-----");


     gifts.forEach(System.out::println);
    }


}

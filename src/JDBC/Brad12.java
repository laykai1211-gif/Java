package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Brad12 {
    public static void main(String[] args) {
        JdbcTool tool = new JdbcTool();
        String sql= """
                select name,addr,tel
                from gift
                where name like ? or addr like ?
                
                
                """;

     List<Gift> gifts= tool.query(sql, rs ->  {
            Gift gift = new Gift();
            gift.setName(rs.getString("name"));
            gift.setAdd(rs.getString("addr"));
            gift.setTel(rs.getString("tel"));
            return gift;
        },"%禮盒%","%禮盒%");

        //		List<Gift> gifts = tool.query(sql, new RowMapper<Gift>() {
//			@Override
//			public Gift mapRow(ResultSet rs) throws SQLException {
//				Gift gift = new Gift();
//				gift.setName(rs.getString("name"));
//				gift.setAdd(rs.getString("addr"));
//				gift.setTel(rs.getString("tel"));
//				return gift;
//			}
//		}, "%禮盒%", "%禮盒%");


//     for (Gift gift:gifts){
//         System.out.println(gift);
//     }
//
//        System.out.println("-----");
     gifts.forEach(System.out::println);
    }


}

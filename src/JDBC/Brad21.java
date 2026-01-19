package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;

public class Brad21 {

        private static final String URL = "jdbc:mysql://localhost:3306/iii";
        private static final String USER = "root";
        private static final String PASSWD = "root";
        private static final String SQL_QUERY = """
            SELECT id,name,addr,tel,feature,lat,lng,picurl
            FROM gift
           
            """;
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY,
            ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = pstmt.executeQuery();){

            rs.next();
            System.out.println(rs.getString("name"));
            rs.next();
            System.out.println(rs.getString("name"));
            rs.next();
            System.out.println(rs.getString("name"));

            rs.absolute(10);

            System.out.println(rs.getString("name"));
            rs.updateString("feature","超硬fish");
//            rs.updateString("addr","南投看守所");

            rs.updateRow();

//            rs.deleteRow();
            rs.moveToInsertRow();
            rs.updateString("name","拜來超值禮盒");
            rs.updateString("feature","快買");
            rs.updateString("addr","林森北");
            rs.updateString("tel","0204");
            rs.updateString("picurl","https://greateimg");
            rs.updateDouble("lat",82);
            rs.updateDouble("lng",67);
            rs.insertRow();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Brad02 {
   public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
        String user="root";
        String passwd="root";
       Properties prop = new Properties();
       prop.put("user",user);
       prop.put("password",passwd);
        try {
       Connection conn = DriverManager.getConnection(url,prop);
       conn.close();
            System.out.println("OK");
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}


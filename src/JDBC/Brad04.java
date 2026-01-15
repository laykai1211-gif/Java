package JDBC;

import java.sql.*;
import java.util.Properties;

public class Brad04 {
    private static final String url = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
    private static final String user = "root";
    private static final String passwd = "root";
    private static final String SQL_QUERY = """
           select cname name,birthday from cust
           
            """;
    private static final String SQL_UPDATE = """
            update  cust
            set tel='333',birthday='2000-01-01'
            where
                id>1
            """;
    private static final String SQL_DELETE = """
            delete from cust
            where
            id>1
            """;


    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("user", user);
        prop.put("password", passwd);
        try (Connection conn = DriverManager.getConnection(url, prop);
             Statement stmt = conn.createStatement();
      ResultSet rs= stmt.executeQuery(SQL_QUERY)) {

           while (rs.next()){
              String f1= rs.getString("name");
               System.out.println(f1);
           }


        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


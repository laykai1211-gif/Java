package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad03 {
    private static final String url = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
    private static final String user = "root";
    private static final String passwd = "root";
    private static final String SQL_INSERT = """
            INSERT INTO cust
                (cname,tel,birthday)
                values
                ('Amy','11122344','1999-10-10')
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
             Statement stmt = conn.createStatement()) {
            int n = stmt.executeUpdate(SQL_INSERT);
            System.out.println(n);
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


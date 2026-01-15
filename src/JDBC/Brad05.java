package JDBC;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Brad05 {
    private static final String url = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
    private static final String user = "root";
    private static final String passwd = "root";
    private static final String SQL_INSERT = """
            INSERT INTO cust
            (cname,tel,birthday)
            values
             (?,?,?)
            """;
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("user", user);
        prop.put("password", passwd);
        try (Connection conn = DriverManager.getConnection(url, prop);
             PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT);
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("name:");
            String cname = scanner.next();
            System.out.println("Tel:");
            String Tel = scanner.next();
            System.out.println("Birthday:");
            String Birthday = scanner.next();
            pstmt.setString(1,cname);
            pstmt.setString(2,Tel);
            pstmt.setString(3,Birthday);

            int n =pstmt.executeUpdate();
            System.out.println(n);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


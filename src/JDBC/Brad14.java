package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Brad14 {
    private static final String URL = "jdbc:mysql://localhost:3306/iii";
    private static final Properties prop = new Properties(); // 用於存入連線設定
    private static final String USER = "root";
    private static final String PASSWD = "root";
    private static final String SQL_UPDATE = """
            update member
            set icon = ?
            where id = ?
            """;

    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("dir3/ball2.png");
             Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)) {

            pstmt.setBinaryStream(1, fin);
            pstmt.setInt(2, 4);

            int n = pstmt.executeUpdate();
            System.out.println(n);
        } catch (IOException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

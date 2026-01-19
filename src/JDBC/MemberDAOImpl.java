package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/iii";
    private static final String USER = "root";
    private static final String PASSWD = "root";

    // SQL 定義保持不變
    private static final String SQL_ADD = "INSERT INTO member (email, passwd, name) VALUES (?,?,?)";
    private static final String SQL_UPDATE = "UPDATE member SET email = ?, passwd = ?, name = ? WHERE id = ?";
    private static final String SQL_DEL = "DELETE FROM member WHERE id = ?";
    private static final String SQL_FIND_ID = "SELECT id, email, passwd, name FROM member WHERE id = ?";
    private static final String SQL_FIND_ALL = "SELECT id, email, passwd, name FROM member";
    private static final String SQL_FIND_EMAIL = "SELECT id, email, passwd, name FROM member WHERE email = ?";

    @Override
    public boolean addMember(Member member) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_ADD)) {
            pstmt.setString(1, member.getEmail());
            // 這裡使用了 BCrypt 加密密碼，非常正確！
            pstmt.setString(2, BCrypt.hashpw(member.getPasswd(), BCrypt.gensalt()));
            pstmt.setString(3, member.getName());
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean updateMember(Member member) throws Exception {
        // 修正：將 SQL_ADD 改為 SQL_UPDATE
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)) {
            pstmt.setString(1, member.getEmail());
            pstmt.setString(2, BCrypt.hashpw(member.getPasswd(), BCrypt.gensalt()));
            pstmt.setString(3, member.getName());
            pstmt.setLong(4, member.getId()); // 注意：這裡多了一個 id 參數
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean deleteMember(long id) throws Exception {
        // 修正：將 SQL_ADD 改為 SQL_DEL
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_DEL)) {
            pstmt.setLong(1, id);
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    public Member findById(long id) throws Exception {
        // 修正：將 SQL_ADD 改為 SQL_FIND_ID
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_ID)) {
            pstmt.setLong(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Member(
                            rs.getLong("id"),
                            rs.getString("email"),
                            rs.getString("passwd"),
                            rs.getString("name")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<Member> findAll() throws Exception {
        // 修正：將 SQL_ADD 改為 SQL_FIND_ALL
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_ALL);
             ResultSet rs = pstmt.executeQuery()) {

            List<Member> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Member(
                        rs.getLong("id"),
                        rs.getString("email"),
                        rs.getString("passwd"),
                        rs.getString("name")
                ));
            }
            return list;
        }
    }

    // 這個方法在 login 裡面會用到
    private Member findByEmail(String email) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_FIND_EMAIL)) {
            pstmt.setString(1, email);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Member(
                            rs.getLong("id"),
                            rs.getString("email"),
                            rs.getString("passwd"),
                            rs.getString("name")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public Member login(String email, String passwd) throws Exception {
        // 邏輯正確：先找 Email，再比對加密後的密碼
        Member member = findByEmail(email);
        if (member != null && BCrypt.checkpw(passwd, member.getPasswd())) {
            return member;
        }
        return null;
    }
}
package JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

//T FOR TYPE
@FunctionalInterface
public interface RowMapper <T>{
   T mapRow(ResultSet rs)throws SQLException;
}

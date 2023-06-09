package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	
	static String driverClass = "oracle.jdbc.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String uname = "c##mydb";
	static String passWd = "mydb";
	
	//DB 연결 메서드
	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url, uname, passWd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//DB 연결 종료 매서드
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {
			
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				pstmt= null;
			}
			
		}
		if(conn != null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn= null;
			}
			
		}
		
	}
	
	//DB 연결 종료 매서드
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				rs= null;
			}
			
		}
		if(pstmt != null) {
			
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				pstmt= null;
			}
			
		}
		if(conn != null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn= null;
			}
			
		}
		
	}	
}

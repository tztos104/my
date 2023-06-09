package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	static String driverClass = "oracle.jdbc.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String uname = "c##mydb";
	static String passWd = "mydb";
	
	public static void main(String[] args) {
		//연결객체 선언
		Connection conn = null;
		
		
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, uname, passWd);
			System.out.println("연결객체 생성"+ conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

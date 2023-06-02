package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import banking.banking_db.JDBCUtil;

// DAO - 데이터베이스 연결 및 연동(입력, 검색, 수정, 삭제)
public class PersonDAO {
	// field
	private Connection conn = null;			// 연결 처리 클래스
	private PreparedStatement pstmt = null;	// sql 처리 클래스
	private ResultSet rs = null; 
		
	

	// 자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) "
				+ "VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			
			pstmt.executeUpdate();	// 실행 처리(DB에 저장)
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	// 자료 검색(목록)
	public ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		
		try {
			conn = JDBCUtil.getConnection();		// conn - 연결 객체 생성
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);		// sql -처리 객체 생성
			ResultSet rs = pstmt.executeQuery();	// 검색할 때 쓰는 executeQuery
			while(rs.next()) {
				Person person = new Person();
				// person 테이블에서 userid를 가져와서 person 객체에 저장
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				personList.add(person);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
		
		return personList;	// 호출하는 곳으로 반환
		
	}
	public Person getPerson(String userId) {
		Person person = new Person();
		conn=JDBCUtil.getConnection();
		String sql ="SELECT * FROM person WHERE userid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				person.setUserId(rs.getString("userid"));
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
		
	}
	//자료삭제
	public void deletePerson(String userid) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM person WHERE userid= ?";
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//자료 수정
	
	public void updatePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE person SET userpw=?, name=?, age=? WHERE userid= ?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
}

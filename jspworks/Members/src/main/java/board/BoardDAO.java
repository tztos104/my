package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import common.JDBCUtil;
import member.Member;

public class BoardDAO {
	//필드
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//게시글 목록
	public ArrayList<Board> getBoardList(int page){
		ArrayList<Board> boardList = new ArrayList<>();
		int pageSize = 10;
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM\r\n"
				+ "(select ROWNUM RN, t_board.* "
				+ "from t_board ORDER BY bnum DESC) "
				+ "where RN >=? And RN <=?; "
				+ "order by bnum desc";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (page-1)*pageSize+1);
			pstmt.setInt(2, pageSize);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBnum(rs.getInt("bnum"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("regdate"));
				board.setModifyDate(rs.getTimestamp("modifydate"));
				board.setHit(rs.getInt("hit"));
				board.setMemberId(rs.getString("memberid"));
				
				boardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}return boardList;
		
		
}
	//게시글 목록
	/*
	 * public ArrayList<Board> getBoardList(){ ArrayList<Board> boardList = new
	 * ArrayList<>(); conn = JDBCUtil.getConnection(); String sql =
	 * "SELECT * FROM t_board ORDER BY bnum DESC"; try { pstmt =
	 * conn.prepareStatement(sql); rs =pstmt.executeQuery(); while(rs.next()) {
	 * Board board = new Board(); board.setBnum(rs.getInt("bnum"));
	 * board.setTitle(rs.getString("title"));
	 * board.setContent(rs.getString("content"));
	 * board.setRegDate(rs.getTimestamp("regdate"));
	 * board.setModifyDate(rs.getTimestamp("modifydate"));
	 * board.setHit(rs.getInt("hit")); board.setMemberId(rs.getString("memberid"));
	 * 
	 * boardList.add(board); } } catch (SQLException e) { e.printStackTrace();
	 * }finally { JDBCUtil.close(conn, pstmt, rs); }return boardList;}
	 */
		
		
//
	
	
    public int getBoardCount() {
        int total = 0;
        conn = JDBCUtil.getConnection();
        String sql = "SELECT COUNT(*) AS total FROM t_board";
        try {
           pstmt = conn.prepareStatement(sql);
           rs = pstmt.executeQuery();
           if(rs.next())
              total = rs.getInt("total"); // db에서 총 개수를 가져옴
        } catch (SQLException e) {
           e.printStackTrace();
        } finally {
           JDBCUtil.close(conn, pstmt, rs);
        }
		return total;
	}
	
	
	//게시글 쓰기
	public void addBoard(Board board) {
		conn = JDBCUtil.getConnection();
		String sql = "insert into t_board(bnum, title, content, memberid, fileupload)" 
				+ "VALUES (b_seq.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getMemberId());
			pstmt.setString(4, board.getFileUpload());
			pstmt.executeUpdate(); //디비에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	
	}
	//게시글 상세 보기
	public Board getBoard(int bnum) {
		Board board = new Board();
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM t_board WHERE bnum = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				
				board.setBnum(rs.getInt("bnum"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("regdate"));
				board.setModifyDate(rs.getTimestamp("modifydate"));
				board.setHit(rs.getInt("hit"));
				board.setMemberId(rs.getString("memberid"));
				
				int hit = rs.getInt("hit")+1 ;
				sql = "UPDATE t_board SET hit = ? WHERE bnum = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, hit);
				pstmt.setInt(2, bnum);
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return board;
}
	
	//게시글 삭제
	public void deleteBoard(int bnum) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM t_board WHERE bnum=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bnum);
			pstmt.executeUpdate(); //디비에 삭제
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		
	}
	
	//게시글 수정
	public void updateBoard(Board board) {
		//현재 시간 객체 생성
		Timestamp now = new Timestamp(System.currentTimeMillis());
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE t_board SET title=?, content=?, modifydate=?  WHERE bnum=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setTimestamp(3, now);
			pstmt.setInt(4,board.getBnum());
			pstmt.executeUpdate(); //디비에 업데이트
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	

}

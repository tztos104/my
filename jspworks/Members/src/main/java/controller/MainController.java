package controller;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.Board;
import board.BoardDAO;
import member.Member;
import member.MemberDAO;

@WebServlet("*.do")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 4L;
	
	MemberDAO memberDAO; //MemberDAO 객체 선언
	BoardDAO boardDAO;
	
	public void init(ServletConfig config) throws ServletException {
	memberDAO = new MemberDAO();
	boardDAO = new BoardDAO();//객체 생성
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;  charset=utf-8"); 
		
		//conmand 패턴으로 url 설정하기
		String uri = request.getRequestURI();
		System.out.println(uri);
		String command = uri.substring(uri.lastIndexOf('/'));
		System.out.println(uri.lastIndexOf('/'));
		System.out.println("command:"+ command);
		
		String nextPage =null;
		
		//출략 스트림 객체 생성
		PrintWriter out = response.getWriter();
		
		//세션객체 발급//세션 객체 생성(로그인 처리)
		HttpSession session = request.getSession();
		
		
		//회원 목록 조회
		if(command.equals("/memberList.do")) {
			
			ArrayList<Member> memberList = memberDAO.getMemberList();
			
			//모델 생성 보내기
			request.setAttribute("memberList", memberList);
			nextPage= "/member/memberList.jsp";
		}else if(command.equals("/memberForm.do")) {
			
			nextPage= "member/memberForm.jsp";
		}else if(command.equals("/addMember.do")) {
			//폼에 입력된 데이터 받기
			String memberId = request.getParameter("memberId");
			String passwd = request.getParameter("passwd1");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			Member newMember = new Member();
			newMember.setMemberId(memberId);
			newMember.setPasswd(passwd);
			newMember.setName(name);
			newMember.setGender(gender);
			session.setAttribute("sessionId", memberId);
			
			memberDAO.addMember(newMember);
			nextPage = "index.jsp";
		}else if(command.equals("/memberView.do")) {
			
			String memberId = request.getParameter("memberId");
			Member member =  memberDAO.getMember(memberId);
			request.setAttribute("member", member); //member 모델생성
			nextPage = "member/memberView.jsp";
		}else if(command.equals("/loginForm.do")) {
			nextPage = "member/loginForm.jsp";
		}else if (command.equals("/loginProcess.do")) {
	         //로그인 폼에 입력된 데이터 받아오기
	         String memberId = request.getParameter("memberId");
	         String passwd = request.getParameter("passwd");
	         
	         Member loginMember = new Member();
	         loginMember.setMemberId(memberId);
	         loginMember.setPasswd(passwd);
	         
	         boolean result = memberDAO.checkLogin(loginMember);
	         
	         if(result) {
	            session.setAttribute("sessionId", memberId);
	            nextPage = "/index.jsp";
	         }else {
	            // 2가지 방법, alert, errorMsg
	            out.println("<script>");
	            out.println("alert('아이디와 비밀번호를 확인해 주세요')");
	            out.println("history.go(-1)"); // 이전 페이지로 이동
	            out.println("</script>");
	         }
	      }else if(command.equals("/logout.do")) {
	         //세션 모두 삭제(해제)
	         session.invalidate();
	         nextPage = "/index.jsp";
	      }else if(command.equals("/deleteMember.do")){
	    	  String memberId =request.getParameter("memberId");
	    	  memberDAO.deleteMember(memberId);
	    	  nextPage ="/memberList.do";
	      }
		
			//게시판 관리
		if(command.equals("/boardList.do")) {
			
			
			//페이지 처리
			String pageNum = request.getParameter("pageNum");
			if(pageNum == null) { //기본 1페이지
				pageNum = "1";
			}
			//각 페이지의 첫행 : 1page -> 1 2page->11 3->21
			int currentPage = Integer.parseInt(pageNum);
			int pageSize = 10;
			int startRaw = (currentPage-1)*10 + 1;
			
			//시작 페이지
			int startpage = startRaw /pageSize + 1;
			
			//종료 페이지
			int total= boardDAO.getBoardCount(); //총행수가 나누어 떨어지지 않으면페이지 수 에 1을 더함
			int endPage=total/pageSize;
			endPage = (endPage%pageSize == 0)? endPage : endPage+1;
			//게시글 목록 함수
			ArrayList<Board> boardList=boardDAO.getBoardList(currentPage);
				
			
			//모델 생성
			request.setAttribute("boardList", boardList);
			request.setAttribute("currentPage", currentPage);
			nextPage = "/board/boardList.jsp";
		}else if(command.equals("/boardForm.do")) {
			nextPage = "board/boardForm.jsp";
		}else if(command.equals("/addBoard.do")) {
			
			String realFolder = "C:/my!/jspworks/Members/src/main/webapp/upload";
			MultipartRequest multi = new MultipartRequest(request, realFolder, 5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
			//글씨기 폼에 입력된 데이터 받아오기
			String title = multi.getParameter("title");
			String content = multi.getParameter("content");
			//memberId 세션을 가져오기
			String memberId = (String)session.getAttribute("sessionId");
			
			//fileName 속성 가져오기
			Enumeration<String> files = multi.getFileNames();
			String name = "";
			String fileName = "";
			if(files.hasMoreElements()) {
				name = (String)files.nextElement();
				fileName = multi.getFilesystemName(name); //서버에 저장될 파일 이름
			}
			
			Board newboard = new Board();
			newboard.setTitle(title);
			newboard.setContent(content);
			newboard.setMemberId(memberId);
			newboard.setFileUpload(fileName);
			
			//글쓰기 처리 메서드 호출
			boardDAO.addBoard(newboard);
			
			nextPage = "board/boardList.jsp";
			
		}else if(command.equals("/boardView.do")) {
			int bnum=Integer.parseInt(request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum);
			
			request.setAttribute("board", board);
			nextPage = "/board/boardView.jsp";
		}else if(command.equals("/deleteBoard.do")) {
			int bnum=Integer.parseInt(request.getParameter("bnum"));
			boardDAO.deleteBoard(bnum);
			nextPage = "/boardList.do";
		}else if(command.equals("/updateBoard.do")) {
			int bnum = Integer.parseInt( request.getParameter("bnum"));
			Board board = boardDAO.getBoard(bnum);
			
			request.setAttribute("board", board);
			
			nextPage = "/board/updateBoard.jsp";
		}else if(command.equals("/updateProcess.do")) {
			//수정 폼에서 입력 내용 받기
			
			int bnum = Integer.parseInt( request.getParameter("bnum"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Board updateboard = new Board();
			updateboard.setTitle(title);
			updateboard.setContent(content);
			updateboard.setBnum(bnum);
			
			boardDAO.updateBoard(updateboard);
			nextPage = "/boardView.do";
		}else if(command.equals("/memberEvent.do")) {
			nextPage = "/member/memberEvent.jsp";
		}
			
		
		//포워딩
		if(command.equals("/addBoard.do")){
			response.sendRedirect("/boardList.do");
		}else {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(nextPage);
		
		dispatcher.forward(request, response);
		}
		
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			nextPage= "member/memberList.jsp";
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
	      }
		
			//게시판 관리
		if(command.equals("/boardList.do")) {
			ArrayList<Board> boardList = boardDAO.getBoardList();
			
			//모델 생성
			request.setAttribute("boardList", boardList);
			
			nextPage = "/board/boardList.jsp";
		
		}
			
		
		//포워딩
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(nextPage);
		
		dispatcher.forward(request, response);
		
		
	}

}

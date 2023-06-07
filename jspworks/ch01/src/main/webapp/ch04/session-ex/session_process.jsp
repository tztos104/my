<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//아이디와 비밀번호를 전달 받아와서 인증 처리 및 세션 발급
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
	
	if(id.equals("admin") && pw.equals("admin1234")){
		//세션 발급 후 welcom.jsp로 이동(포워딩)
		session.setAttribute("userID", id); //(새션이름, 세션값)
		
		response.sendRedirect("welcome.jsp");
		
	}else{
			out.print("아이디와 비밀번호가 일치하니 안씁니다.");
	}
	
%>
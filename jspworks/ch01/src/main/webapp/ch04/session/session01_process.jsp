<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userid");
	String userPw = request.getParameter("passwd");
	
	if(userId.equals("tztos")&& userPw.equals("2390")){
		session.setAttribute("userId", userId); //세션 발급(아이디)
		session.setAttribute("userPw", userPw); //세션 발급(패스워드)
		out.println("로그인을 성공했습니다.");
	}else{
		
		out.println("<script>");
		out.println("alert('로그인을 실패했습니다. 아이디나 비밀번호를 확인해주세요.')");
		out.println("history.go(-1)");//이전 페이지로 이동
		out.println("</script>");
	}

%>
<p><%= session.getAttribute("userId") %>님이 로그인했습니다.</p>
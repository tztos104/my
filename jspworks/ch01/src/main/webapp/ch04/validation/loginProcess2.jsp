<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
request.setCharacterEncoding("utf-8");
//폼에 입력된 데이터 가져오기
String uid = request.getParameter("userid");
String pwd = request.getParameter("passwd");


%>


<p>아이디:<%= uid %> </p>
<p>비밀번호:<%=pwd %> </p>


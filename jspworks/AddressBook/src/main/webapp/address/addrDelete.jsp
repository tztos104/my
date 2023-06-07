<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="adDAO" class="address.AddrBookDAO" scope="application"/>
<%

	String username = request.getParameter("username");
	adDAO.deleteAddrBook(username);
	
	//페이지 이동
	response.sendRedirect("addrList.jsp");
	

%>
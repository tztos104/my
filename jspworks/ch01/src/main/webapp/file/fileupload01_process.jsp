<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//한글 인코딩
	request.setCharacterEncoding("utf-8");

	//폴더 경로
	String realFolder ="C:/my!/jspworks/ch01/src/main/webapp/upload";

	// MultipardRequest
	MultipartRequest multi = new MultipartRequest(request, 
			realFolder, 5*1024*1024, "utf-8" , new DefaultFileRenamePolicy());

	//name 속성 처리
	Enumeration<String> params= multi.getParameterNames();
	while(params.hasMoreElements()){
		String name = params.nextElement();
		String value = multi.getParameter(name);
		out.print(name +", "+ value + "<br>");
	}
	
	Enumeration<String> files= multi.getFileNames();
	while(files.hasMoreElements()){
		String name = files.nextElement();
		String fileName = multi.getFilesystemName(name);//서버에 업로드할 파일
		String originFile = multi.getOriginalFileName(name); //원본파일이름
		out.println("요청 파라미터 이름: " + name + "<br>");
		out.println("저장(업로드) 파일 이름: " + fileName + "<br>");
		out.println("실제 원본 이름: " + originFile + "<br>");
	
%>

<p>이미지 보기</p>
<img src="../upload/<%=fileName %>">
<% }%>
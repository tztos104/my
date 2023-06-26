package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

/**
 * Servlet implementation class CheckID
 */
@WebServlet("/checkid")
public class CheckID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		int duplicatedID = dao.duplicatedID(id);
		System.out.println(duplicatedID);
		
		if(duplicatedID==1) {
			out.println("not_usable");
		}else{
			out.println("usable");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

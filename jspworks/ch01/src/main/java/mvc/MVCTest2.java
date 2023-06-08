package mvc;

import java.io.IOException;import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MVCTest2 extends HttpServlet {

	private static final long serialVersionUID = 20L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//짝수홀수 판정 - 결과를 jsp 송출
		int num =0;
		if(req.getParameter("num") != null) {
			num = Integer.parseInt(req.getParameter("num"));
		}
		String result = "";
		if(num % 2 == 0) {
			result ="짝수입니다.";
			
		}else {
			result = "홀수 입니다.";
		}
		req.setAttribute("result", result);
		
		//포워딩
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("/mvc/mvc02.jsp");
		
		dispatcher.forward(req, resp);
		
	}
	
	
}

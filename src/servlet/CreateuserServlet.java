package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CreateuserServlet extends HttpServlet{
	
	public CreateuserServlet(){
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String userName = request.getParameter("UserEmail");
		String password = request.getParameter("passWord");
		System.out.println(userName+password);
		getServletContext().getRequestDispatcher("/Asyouwish.html").forward(
				request, response);
	}
}

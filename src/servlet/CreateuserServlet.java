package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.EntityNotFoundException;

import Database.DBmanager;;

@SuppressWarnings("serial")
public class CreateuserServlet extends HttpServlet{
	
	public CreateuserServlet(){
		super();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String userName = request.getParameter("userEmail");
		String password = request.getParameter("passWord");
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add(userName);
		attributes.add(password);
		DBmanager db = new DBmanager();
		try {
			if (!db.checkAvailability("User", userName)) db.Action("User", attributes);
			
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(userName+password);
		getServletContext().getRequestDispatcher("/Asyouwish.html").forward(
				request, response);
	}
}

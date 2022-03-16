

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
//		Get the writer
		PrintWriter out = response.getWriter();
		
//		Get the userName from the request
		String userName = request.getParameter("userName");
		String Password = request.getParameter("Password");
		
//		Get a reference to the HttpSession object
		HttpSession session = request.getSession();
		
//		Validate the username
		if(userName.trim().equals("admin") && Password.trim().equals("password")) {
//			Save the username in the session
			session.setAttribute("userName", userName);
			session.setAttribute("userPassword", Password);
			
//			Redirect to the Dashboard
			response.sendRedirect("dashboard");
			
		}
		else {
			out.println("<font color='red'>Invalid username (or) password !!!</font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
		
		
		
		
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

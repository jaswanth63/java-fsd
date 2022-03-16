

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String dburl = "jdbc:mysql://localhost:3306/simplilearn";
		String userid = "root";
		String pwd ="Simplilearn";
		String s=request.getParameter("ID");  
		int a=Integer.valueOf(s);  
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		try {
			Dbconnection dconnection = new Dbconnection(dburl,userid,pwd);
			PreparedStatement stmt =dconnection.getconnection().prepareStatement("select * from Products where ID =?");
			stmt.setInt(1, a);
			ResultSet rs=stmt.executeQuery(); 
			while(rs.next())  
			{  
			out.print(rs.getInt("ID")+" , "+rs.getString("Pname")+" , "+rs.getInt("Price"));  
			out.println("<br/>");
			                  
			}  
			stmt.close();
			dconnection.closeconnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

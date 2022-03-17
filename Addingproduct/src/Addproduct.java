import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add-product")
public class Addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Addproduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("add-product.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		
		pw.println("<html><body>");
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");

		// STEP 1: Gets SessionFactory Object
		SessionFactory sf = Hibernateutil.buildSessionFactory();
		
		// STEP 2: Open Sesson
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
			Product ep = new Product();
			ep.setName(name);
			ep.setPrice(Double.valueOf(price));
			
			session.save(ep);
		
		tx.commit();
		
		pw.println("<h3 style=color:green'> Product is created successfully ! </h3>");
		
		session.close();
		
	}

}
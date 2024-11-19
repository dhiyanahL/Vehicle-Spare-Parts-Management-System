//LIYAUDEEN D.H - Seller CRUD 
package com.Seller;

import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SellerRegistrationServlet
 */
@WebServlet("/SellerRegistrationServlet")
public class SellerRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		
		boolean isTrue;
		//Calls the insert method from the CustomerDBUtil
		isTrue = SellerDB.insertSeller(username, password, name, email, phone);
		//We assign a boolean variable to the method because insertCustomer() returns a boolean value
		
		//Checking if the query was successful
		if (isTrue == true) {
			//added this now
			List<Seller>selDetails = SellerDB.getSeller(username);
			request.setAttribute("selDetails",selDetails);
			
			//We use request dispatcher to navigate from a servlet to a view page
			RequestDispatcher dis = request.getRequestDispatcher("SellerDashboard.jsp");
			dis.forward(request, response);			
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Registration is unsuccessful!');");
			out.println("location='SellerRegistration.jsp'");
			out.println("</script>");
			
		}
		
		
		
	}

}

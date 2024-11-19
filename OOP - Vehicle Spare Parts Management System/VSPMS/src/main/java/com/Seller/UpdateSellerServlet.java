// LIYAUDEEN D.H - Seller CRUD 
package com.Seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Seller.Seller;
import com.Seller.DatabaseConnection;

/**
 * Servlet implementation class UpdateSellerServlet
 */
@WebServlet("/UpdateSellerServlet")
public class UpdateSellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("selid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		
		boolean isTrue;
		isTrue = SellerDB.updateSeller(id, username, password, name, email, number);
		
		if (isTrue == true) {
			
			List<Seller> selDetails = SellerDB.getSellerDetails(id);
			request.setAttribute("selDetails", selDetails);
			//The name you give to request.setAttribute is always the same name as your c for each loop items's name in the useraccount page.
			
			//We use request dispatcher to navigate from a servlet to a view page
			RequestDispatcher dis = request.getRequestDispatcher("SellerDashboard.jsp");
			dis.forward(request, response);			
		}
		else {
			List<Seller> selDetails = SellerDB.getSellerDetails(id);
			request.setAttribute("selDetails", selDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("SellerDashboard.jsp");
			dis.forward(request, response);			
			
			
		}
		
		
	}

}

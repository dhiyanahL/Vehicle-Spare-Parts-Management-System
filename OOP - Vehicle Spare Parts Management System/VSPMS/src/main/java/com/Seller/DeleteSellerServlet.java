//IT22055262 - LIYAUDEEN D.H - Seller CRUD 
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
import com.Seller.SellerDB;



@WebServlet("/DeleteSellerServlet")
public class DeleteSellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("selid");
		
		boolean isTrue;
		isTrue = SellerDB.deleteSeller(id);
		
		if (isTrue == true) {
			
			//We use request dispatcher to navigate from a servlet to a view page
			RequestDispatcher dis = request.getRequestDispatcher("SellerRegistration.jsp");
			dis.forward(request, response);		
		}
		else
		{
			List<Seller> selDetails = SellerDB.getSellerDetails(id);
			request.setAttribute("selDetails", selDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("SellerDashboard.jsp");
			dis.forward(request, response);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

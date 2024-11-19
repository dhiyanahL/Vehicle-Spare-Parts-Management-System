// LIYAUDEEN D.H - Seller CRUD 
package com.Seller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/SellerLoginServlet")
public class SellerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Collecting UN and PW
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		boolean isTrue;
		
		isTrue = SellerDB.validate(username, password);
		
		if (isTrue == true) {
			List<Seller>selDetails = SellerDB.getSeller(username);
			request.setAttribute("selDetails",selDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("SellerDashboard.jsp");
			dis.forward(request, response);
			
			
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='SellerLogin.jsp'");
			out.println("</script>");
		}
		
	}

}

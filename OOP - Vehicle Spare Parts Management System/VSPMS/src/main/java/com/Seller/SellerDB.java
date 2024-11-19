package com.Seller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Seller.DatabaseConnection;
import com.Seller.Seller;



//LIYAUDEEN D.H - Seller CRUD 
public class SellerDB {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	//Validating login details	
	public static boolean validate(String username, String password) {
			
			try {
				con = DatabaseConnection.getConnection();
				stmt = con.createStatement();
				String sql = "select * from seller where username='"+username+"'and password='"+password+"'";
				
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
	}
	
	public static List<Seller> getSeller(String username) {
		
		ArrayList<Seller> sel = new ArrayList<>();
		
		try {
			
			con = DatabaseConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from seller where username='"+username+"'";
			rs = stmt.executeQuery(sql);
			//returns the result set
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String userU = rs.getString(2);
				String pwdU = rs.getString(3);
				String name = rs.getString(4);
				String email = rs.getString(5);
				String phone = rs.getString(6);
				
				
				Seller s = new Seller(id,userU,pwdU,name,email,phone);
				sel.add(s);
			}
			
		} catch (Exception e) {
			
		}
		
		return sel;
	}
	
	
	//Inserting
	
		public static boolean insertSeller(String username, String password, String name, String email, String phone) {
			
			boolean isSuccess = false;
			
			try {
				con = DatabaseConnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "insert into seller values (0,'"+username+"','"+password+"','"+name+"','"+email+"','"+phone+"')";

				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0) {
					isSuccess = true;
				} else {
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return isSuccess;
		}
	

		//Updating
		
		public static boolean updateSeller(String id,String username, String password, String name, String email, String phone) {
			
			try {
				con = DatabaseConnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "update seller set username = '"+username+"', password ='"+password+"', name ='"+name+"',email ='"+email+"', phone_no ='"+phone+"'"+" where sellerID = '"+id+"'";
				
				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			return isSuccess;
		}
		
		//Retrieving & displaying data
		
		public static List<Seller> getSellerDetails(String ID){
			
		int convertedID = Integer.parseInt(ID);
			
			
		ArrayList<Seller> sel = new ArrayList<>();
			
			try {
				con = DatabaseConnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "select * from seller where sellerID = '"+convertedID+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) { 
					int id = rs.getInt(1);
					String username = rs.getString(2);
					String password = rs.getString(3);
					String name = rs.getString(4);
					String email = rs.getString(5);
					String phone = rs.getString(6);
					
					Seller s = new Seller(id, username, password, name, email, phone);
					sel.add(s);

				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return sel;
			
		}
		
		//Deleting
		public static boolean deleteSeller(String ID) {
			
			int convertedID = Integer.parseInt(ID);
			
			try {
				con = DatabaseConnection.getConnection();
				stmt = con.createStatement();
				
				String sql = "delete from seller where sellerID = '"+convertedID+"'";
				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return isSuccess;
		}


}

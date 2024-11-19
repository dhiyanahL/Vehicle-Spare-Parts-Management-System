// LIYAUDEEN D.H - Seller CRUD 
package com.Seller;

public class Seller {
	
	//Information Hiding + Encapsulation
	
	private int id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String phone;
	
	//Overloading
	
	public Seller() {};
	
	public Seller(int id, String username, String password, String name,String email, String phone) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	
	
	
	
}

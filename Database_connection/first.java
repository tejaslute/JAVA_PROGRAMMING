package com;

import java.sql.*;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		try
		{
		     Class.forName("com.mysql.jdbc.Driver");
		
		      con=DriverManager.getConnection("jdbc:mysql://localhost/company","root","Coding@123");
		
		      if(con==null)
		    	  System.out.println("Connection not established");
		      else
		    	  System.out.println("Connection  established");
		    	  
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	}



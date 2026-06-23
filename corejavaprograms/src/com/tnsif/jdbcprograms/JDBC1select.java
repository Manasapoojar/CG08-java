package com.tnsif.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import packages
public class JDBC1select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step2:  load and register 
		Class.forName("org.postgresql.Driver");
		System.out.println("Step 2 completed loaded and registerd the driver...");

		// Step3 : establish the connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Peenya","postgres" ,"Manasa@09");
		System.out.println("Connection completed....");
		
		
		//step 4: 
		
		Statement st = conn.createStatement();
		
		//step 5 run the query 
	     String strselect="select eid,ename,esalary from employee ";
	     
	     System.out.println("the sql statement is "+strselect);
	     
	     
	     //process the result
	     ResultSet rst=st.executeQuery(strselect);
	     
	     System.out.println("The records are:");
	     int rowcount=0;
	     while(rst.next()) {
	    	 int eid = rst.getInt("eid");
	    	 String ename = rst.getString("ename");
	    	 int esalary = rst.getInt("esalary");
	    	 
	    	 System.out.println(eid +" "+ ename +" " +esalary);
	    	 ++rowcount;
	     }
	}

}

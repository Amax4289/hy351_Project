/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy351_project;

/**
 *
 * @author USER
 */
public class MyConnection {
     public static java.sql.Connection getConnection() {
		
	java.sql.Connection con = null;
		
	try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hy351","root","");
	}
	catch(Exception e){
            System.out.println(e.getMessage());
	}
		
		
	return con;
    }
}

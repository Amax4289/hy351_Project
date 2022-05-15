/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy351_project;

import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class Connection {
    public static java.sql.Connection getConnection() {
		
		java.sql.Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb","root","");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		return con;
	}
}

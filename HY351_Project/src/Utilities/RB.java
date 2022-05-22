/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import hy351_project.Homepage;
import hy351_project.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RB {
    
    /*Function to delete Account of Citizen*/
    public static boolean check_delete(String amka, String password){
        
        int Dose = 0;
    
        try {
            Connection con = MyConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            rs = stmt.executeQuery("SELECT * FROM citizen WHERE Citizen_AMKA = '" + amka + "' AND password = '" + password + "' AND Num_Of_Dose = '" + Dose + "'");
            
            if(rs.next()){
                String deleteQuery = "DELETE FROM citizen WHERE Citizen_AMKA = '" + amka +"'";
                stmt.executeUpdate(deleteQuery);
                stmt.close();
                con.close(); 
                return true;
            }
            else{
                return false;
            }
        } 
        catch (Exception e) {
             System.err.println("Got an exception!");
             return false;
        }    
        
    }
    
    public static void get_certificate(String amka){
        
    }
    
    
    public static void confirm_vaccine(String amka, String No_Of_Dose){
        
        
    }
    
    
}

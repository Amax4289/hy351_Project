/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class RB {
    
    public void insertUpdateDeleteStudent(Integer id) {
    
        int YesorNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your account?", "Delete Account",JOptionPane.OK_CANCEL_OPTION,0);
            
            if (YesorNo == JOptionPane.OK_OPTION){
                try {
                    Connection con = DB_Connection.getConnection();
                    Statement stmt = con.createStatement();
                            
                    PreparedStatement ps1;
                    ps1 = con.prepareStatement("SELECT debts FROM trader WHERE trader_id ='" + id_label.getText() + "'");
                    ResultSet rs = ps1.executeQuery();

                    if (rs.next()) {
                        debt = rs.getDouble("debts");
                        System.out.println(debt);
                    }
                    if (dose == 0) { // CHECK IF PRIVATE USER HAS NO DEBT
                            
                        String deleteQuery = "DELETE FROM trader WHERE trader_id ='" + id_label.getText() + "'";
                        stmt.executeUpdate(deleteQuery);
                        JOptionPane.showMessageDialog(null, "Account Deleted!");
                            
                        this.setVisible(false);
                        Trader_LoginPage TH = new Trader_LoginPage();
                        TH.setVisible(true);
                        TH.pack();
                        TH.setTitle("Login As Trader");
                        TH.setLocationRelativeTo(null);
                    }
                    else{
                         JOptionPane.showMessageDialog(null, "Account cannot deleted ,trader have pay debt first!");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
            	} catch (ClassNotFoundException ex) {
                    Logger.getLogger(Trader_HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
}

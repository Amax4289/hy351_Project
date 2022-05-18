/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy351_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Medical_Staff_Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Medical_Staff_Homepage
     */
    public Medical_Staff_Homepage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        No_Of_Dose_textfield = new javax.swing.JTextField();
        clear_button = new javax.swing.JButton();
        confirm_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AMKA_textfield = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Log_Out_Item_Button = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Confirm an appointment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("No. Of Dose :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 40));

        No_Of_Dose_textfield.setBackground(new java.awt.Color(255, 255, 255));
        No_Of_Dose_textfield.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        No_Of_Dose_textfield.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(No_Of_Dose_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 210, 40));

        clear_button.setBackground(new java.awt.Color(153, 153, 153));
        clear_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clear_button.setForeground(new java.awt.Color(0, 0, 0));
        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(clear_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 130, 40));

        confirm_button.setBackground(new java.awt.Color(153, 204, 255));
        confirm_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirm_button.setForeground(new java.awt.Color(0, 0, 0));
        confirm_button.setText("Confirm");
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("AMKA :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 40));

        AMKA_textfield.setBackground(new java.awt.Color(255, 255, 255));
        AMKA_textfield.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        AMKA_textfield.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(AMKA_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 210, 40));

        jMenu1.setText("Account");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        Log_Out_Item_Button.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Log_Out_Item_Button.setText("Sign Out");
        Log_Out_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_Out_Item_ButtonActionPerformed(evt);
            }
        });
        jMenu1.add(Log_Out_Item_Button);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        AMKA_textfield.setText("");
        No_Of_Dose_textfield.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void Log_Out_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_Out_Item_ButtonActionPerformed
       
        this.setVisible(false);
        Homepage TH = new Homepage();
        TH.setVisible(true);
        TH.pack();
        TH.setTitle("HappyVax Homepage");
        TH.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_Log_Out_Item_ButtonActionPerformed

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttonActionPerformed
        
        String amka = AMKA_textfield.getText();
        String No_Of_Dose = No_Of_Dose_textfield.getText();
        
        System.out.println("amka is: "+ amka + " and No_of_Dose is: "+ No_Of_Dose);
        
        if(amka == null || No_Of_Dose == null){
            JOptionPane.showMessageDialog(null, "One Or More Empty Field!");
        }
        else{
            try {
                Connection con = MyConnection.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs;
            
                rs = stmt.executeQuery("SELECT * FROM appointment WHERE Citizen_AMKA = '" + amka + "' AND Dose = '" + No_Of_Dose + "'");
            
                if(rs.next()){
                    stmt.close();
                    con.close();
                    JOptionPane.showMessageDialog(null, "Τhe user's appointment with AMKA " + amka + "\nwas successfully confirmed!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "The user does not have any active appointment, or wrong details!");
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "The user does not have an active appointment, or wrong details!\n Try again!");
                System.err.println("Got an exception!");
            }    
        }
        
    }//GEN-LAST:event_confirm_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medical_Staff_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical_Staff_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical_Staff_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical_Staff_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical_Staff_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMKA_textfield;
    private javax.swing.JMenuItem Log_Out_Item_Button;
    private javax.swing.JTextField No_Of_Dose_textfield;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton confirm_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
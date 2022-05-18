/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy351_project;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Covid_Certificate_Apply extends javax.swing.JFrame {

    /**
     * Creates new form Covid_Certificate_Apply
     */
    public Covid_Certificate_Apply() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AMKA_for_certificate_textfield = new javax.swing.JTextField();
        vaccine_company_textbox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vaccine Company :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 190, 50));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("AMKA :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Application for Covid Certificate");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 430, 50));

        AMKA_for_certificate_textfield.setBackground(new java.awt.Color(255, 255, 255));
        AMKA_for_certificate_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AMKA_for_certificate_textfield.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(AMKA_for_certificate_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 220, 30));

        vaccine_company_textbox.setBackground(new java.awt.Color(255, 255, 255));
        vaccine_company_textbox.setEditable(true);
        vaccine_company_textbox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vaccine_company_textbox.setForeground(new java.awt.Color(0, 0, 0));
        vaccine_company_textbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer/BioNTech", "Oxford/AstraZeneca", "Moderna" }));
        vaccine_company_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccine_company_textboxActionPerformed(evt);
            }
        });
        jPanel4.add(vaccine_company_textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 220, 30));

        jButton1.setBackground(new java.awt.Color(0, 169, 168));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 140, 40));

        jButton2.setBackground(new java.awt.Color(0, 169, 168));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Clear");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaccine_company_textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccine_company_textboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccine_company_textboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String amka = AMKA_for_certificate_textfield.getText();
        System.out.println("amka is: "+ amka);
        int Dose = 2;

        int yes_no = JOptionPane.showConfirmDialog(null, "Are you sure you want to apply for Covid-19 Certificate?","Confirmation Message",JOptionPane.YES_NO_OPTION,2);

        if(yes_no == JOptionPane.YES_OPTION){

            if(amka == null){
                JOptionPane.showMessageDialog(null, "One Or More Empty Field!");
            }
            else{
                try {
                    Connection con = MyConnection.getConnection();
                    Statement stmt = con.createStatement();
                    ResultSet rs;

                    rs = stmt.executeQuery("SELECT * FROM appointment WHERE Citizen_AMKA = '" + amka + "' AND Dose = '" + Dose + "'");

                    if(rs.next()){
                        Covid_Certificate CC = new Covid_Certificate();
                        CC.setVisible(true);
                        CC.pack();
                        CC.setTitle("Covid-19 Certification");
                        CC.setLocationRelativeTo(null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Τhere is no active vaccination or has not completed 2 vaccination doses");
                    }
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Τhe certificate was not found try again later");
                    System.err.println("Got an exception!");
                }
            }
        } else{

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Covid_Certificate_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Covid_Certificate_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Covid_Certificate_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Covid_Certificate_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Covid_Certificate_Apply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AMKA_for_certificate_textfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> vaccine_company_textbox;
    // End of variables declaration//GEN-END:variables
}
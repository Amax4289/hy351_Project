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
public class Delete_Account extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Delete_Account() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        AMKA_textfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Confirm_DeleteAccount_Button = new javax.swing.JButton();
        Cancel_DeleteAccount_Button = new javax.swing.JButton();
        Password_textfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 179, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Delete Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 6, -1, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Confirm Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, 20));

        AMKA_textfield.setBackground(new java.awt.Color(255, 255, 255));
        AMKA_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AMKA_textfield.setForeground(new java.awt.Color(0, 0, 0));
        AMKA_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMKA_textfieldActionPerformed(evt);
            }
        });
        jPanel1.add(AMKA_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 219, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AMKA :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 29));

        Confirm_DeleteAccount_Button.setBackground(new java.awt.Color(204, 204, 204));
        Confirm_DeleteAccount_Button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Confirm_DeleteAccount_Button.setForeground(new java.awt.Color(255, 0, 0));
        Confirm_DeleteAccount_Button.setText("Confirm");
        Confirm_DeleteAccount_Button.setBorder(null);
        jPanel1.add(Confirm_DeleteAccount_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 120, 40));

        Cancel_DeleteAccount_Button.setBackground(new java.awt.Color(204, 204, 204));
        Cancel_DeleteAccount_Button.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Cancel_DeleteAccount_Button.setForeground(new java.awt.Color(0, 0, 0));
        Cancel_DeleteAccount_Button.setText("Cancel");
        Cancel_DeleteAccount_Button.setAlignmentY(0.0F);
        Cancel_DeleteAccount_Button.setBorder(null);
        Cancel_DeleteAccount_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_DeleteAccount_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel_DeleteAccount_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 40));

        Password_textfield.setBackground(new java.awt.Color(255, 255, 255));
        Password_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password_textfield.setForeground(new java.awt.Color(0, 0, 0));
        Password_textfield.setText("jPasswordField1");
        jPanel1.add(Password_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AMKA_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMKA_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMKA_textfieldActionPerformed

    private void Cancel_DeleteAccount_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_DeleteAccount_ButtonActionPerformed

        this.setVisible(false);
        
    }//GEN-LAST:event_Cancel_DeleteAccount_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMKA_textfield;
    private javax.swing.JButton Cancel_DeleteAccount_Button;
    private javax.swing.JButton Confirm_DeleteAccount_Button;
    private javax.swing.JPasswordField Password_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

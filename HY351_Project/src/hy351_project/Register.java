/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hy351_project;

import static Utilities.Amax.Register;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Amax
 */
public class Register extends javax.swing.JFrame {
    
    /**
     * Creates new form Register
     */
    public Register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        jButtonbackToHomepagefromRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelBirthdate = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jTextFieldBirthdate = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelephone = new javax.swing.JLabel();
        jLabelAMKA = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldAMKA = new javax.swing.JTextField();
        jTextFieldTelephone = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mask.png"))); // NOI18N

        jLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(0, 0, 102));
        jLabelRegister.setText("Registration Page");

        jButtonbackToHomepagefromRegister.setBackground(new java.awt.Color(255, 255, 255));
        jButtonbackToHomepagefromRegister.setForeground(new java.awt.Color(0, 0, 0));
        jButtonbackToHomepagefromRegister.setText("Back");
        jButtonbackToHomepagefromRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackToHomepagefromRegisterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("First Name:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Last Name:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sex:");

        jLabelBirthdate.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBirthdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelBirthdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBirthdate.setText("Date of Birth:");

        jTextFieldLastName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldFirstName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFirstName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(0, 0, 0));

        jRadioButtonMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButtonMale.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonMale.setText("Male");

        jRadioButtonFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButtonFemale.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonFemale.setText("Female");

        jTextFieldBirthdate.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBirthdate.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jTextFieldBirthdate.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBirthdateActionPerformed(evt);
            }
        });

        jLabelUsername.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsername.setText("Username:");

        jLabelPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setText("Password:");

        jLabelEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email:");

        jLabelTelephone.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTelephone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTelephone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelephone.setText("Telephone:");

        jLabelAMKA.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAMKA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelAMKA.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAMKA.setText("AMKA:");

        jTextFieldUsername.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldAMKA.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAMKA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldAMKA.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldTelephone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelephone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldTelephone.setForeground(new java.awt.Color(0, 0, 0));

        jButtonRegister.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegister.setText("Register Citizen");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(120, 32));

        jLabel5.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonbackToHomepagefromRegister)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRegister)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonMale)
                                            .addComponent(jRadioButtonFemale)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelBirthdate)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextFieldBirthdate))))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelUsername)
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelAMKA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsername)
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jTextFieldAMKA)
                                    .addComponent(jTextFieldTelephone)
                                    .addComponent(jButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelRegister)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelUsername)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButtonFemale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAMKA)
                            .addComponent(jTextFieldAMKA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelephone)
                    .addComponent(jTextFieldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBirthdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(jButtonRegister)
                .addGap(47, 47, 47)
                .addComponent(jButtonbackToHomepagefromRegister)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbackToHomepagefromRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackToHomepagefromRegisterActionPerformed

        this.setVisible(false);
        Homepage homepage = new Homepage();
        homepage.setVisible(true);
        homepage.setTitle("Home Page");
        homepage.pack();
        homepage.setLocationRelativeTo(null);
        homepage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonbackToHomepagefromRegisterActionPerformed

    /* REGISTER */
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed

        /* ----------- Get Information ----------- */
        String FirstName = jTextFieldFirstName.getText();
        String LastName = jTextFieldLastName.getText();

        String sex = "";

        Boolean male = jRadioButtonMale.isSelected();
        Boolean female = jRadioButtonFemale.isSelected();

        if (male) {
            sex = "Male";
        } else if (female) {
            sex = "Female";
        }

        String Username = jTextFieldUsername.getText();
        String Password = jPasswordField1.getText();

        String AMKA = jTextFieldAMKA.getText();
        String Telephone = jTextFieldTelephone.getText();

        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email = jTextFieldEmail.getText();
        Boolean flag = email.matches(EMAIL_REGEX);

        String Birthdate = jTextFieldBirthdate.getText();

        /* --------------------------------------- */
        if (FirstName != ""
                && LastName != ""
                && sex != ""
                && Username != ""
                && Password != ""
                && AMKA != ""
                && Telephone != ""
                && Birthdate != ""
                && email != "") {

            if (flag) { // IF email is in correct form

                try {
                    if (Register(Username, Password, FirstName, LastName, sex, Birthdate, email, Telephone, AMKA)) {
                        /* Success */
                        this.setVisible(false);
                        UserHomepage userhomepage = new UserHomepage();
                        userhomepage.setVisible(true);
                        userhomepage.setTitle("User Homepage");
                        userhomepage.pack();
                        userhomepage.setLocationRelativeTo(null);
                        userhomepage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    } else {

                        /* Failure */
                        JOptionPane.showMessageDialog(null, "Registration Failed.\nPlease try again.", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                /* Empty Input Fields */
                JOptionPane.showMessageDialog(null, "Email format is wrong.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            /* Empty Input Fields */
            JOptionPane.showMessageDialog(null, "Input Fields are empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextFieldBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBirthdateActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonbackToHomepagefromRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAMKA;
    private javax.swing.JLabel jLabelBirthdate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelTelephone;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JTextField jTextFieldAMKA;
    private javax.swing.JTextField jTextFieldBirthdate;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldTelephone;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

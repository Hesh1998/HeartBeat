// The LogIn interface of the application

package Interfaces;

import CodingInterfaces.LogInCode;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    // variables used to handle Staff-ID and Password fields
    private int k1, k2;

    public LogIn() {
        initComponents();
        
        // centers the GUI in the screen
        this.pack();
        this.setLocationRelativeTo(null);

        // sets default text related to Staff-ID and Password text fields
        k1 = 1;
        k2 = 1;
        txtStaffID.setText("Enter Staff - ID....");
        txtPassword.setEchoChar((char) 0); // makes password field characters visible
        txtPassword.setText("Enter Password....");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackGround = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        lblSName = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        lblTeamName = new javax.swing.JLabel();
        lblWelcomeBack = new javax.swing.JLabel();
        lblLogInToContinue = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblStaffID = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setLocation(new java.awt.Point(600, 225));
        setResizable(false);
        setSize(new java.awt.Dimension(1139, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackGround.setBackground(new java.awt.Color(204, 204, 255));
        pnlBackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(0, 0, 153));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLogIn/LogIn Logo GIF.gif"))); // NOI18N
        pnlLeft.add(lblSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 540));

        pnlBackGround.add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 520));

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTeamName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        lblTeamName.setText("Team Cyber Software");
        pnlRight.add(lblTeamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        lblWelcomeBack.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcomeBack.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblWelcomeBack.setForeground(new java.awt.Color(0, 51, 204));
        lblWelcomeBack.setText("WELCOME BACK, ");
        pnlRight.add(lblWelcomeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblLogInToContinue.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblLogInToContinue.setForeground(new java.awt.Color(102, 102, 102));
        lblLogInToContinue.setText("Log In to Continue");
        pnlRight.add(lblLogInToContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setText("Password : ");
        pnlRight.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lblStaffID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblStaffID.setText("Staff - ID : ");
        pnlRight.add(lblStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtStaffID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStaffID.setForeground(new java.awt.Color(153, 153, 153));
        txtStaffID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtStaffID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStaffIDMouseClicked(evt);
            }
        });
        txtStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffIDActionPerformed(evt);
            }
        });
        txtStaffID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStaffIDKeyPressed(evt);
            }
        });
        pnlRight.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 240, 40));

        btnLogIn.setBackground(new java.awt.Color(0, 0, 153));
        btnLogIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        pnlRight.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 240, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlRight.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 240, 40));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLogIn/Logo.PNG"))); // NOI18N
        pnlRight.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        chkShowPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        chkShowPassword.setText("Show Password");
        chkShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPasswordActionPerformed(evt);
            }
        });
        pnlRight.add(chkShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        pnlBackGround.add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 300, 520));

        getContentPane().add(pnlBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffIDActionPerformed

    }//GEN-LAST:event_txtStaffIDActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // Verifies the entered Staff-ID and Password 
        // If valid proceeds to next step
        // If invalid generated error message
        
        String staffID = txtStaffID.getText();
        char passwordChar[] = txtPassword.getPassword();
        String password=new String(passwordChar);
        
        LogInCode logInObj=new LogInCode();
        try{
            String status[]=logInObj.handleLogin(staffID, password);
         
            if(status[0].equals("valid")){
                if(status[1].equals("Receptionist")){
                    new Receptionist(status[2], status[3], status[4]).setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }else if(status[1].equals("Manager")){
                    new Manager(status[2], status[3], status[4]).setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }else if(status[1].equals("Consultant")){
                    new Consultant(status[2], status[3], status[4]).setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Invalid LogIn, Please try again !", "Error", JOptionPane.ERROR_MESSAGE);
                txtStaffID.setText("");
                txtPassword.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtStaffIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffIDMouseClicked
        // Clears the initial description in Staff-ID field when clicked for the first time
        if (k1 == 1) {
            txtStaffID.setText("");
        }
        k1++;
    }//GEN-LAST:event_txtStaffIDMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void chkShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPasswordActionPerformed
        // Makes the real characters of the password visible and invisible appropriately
        if (k2 > 1) {
            if (chkShowPassword.isSelected()) {
                txtPassword.setEchoChar((char) 0);
            } else {
                txtPassword.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_chkShowPasswordActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // Clears the initial description in password field when clicked for the first time
        // And makes real characters in the password invisible or visible according to the status of the check box
        if (k2 == 1) {
            txtPassword.setText("");
            if (chkShowPassword.isSelected()) {
                txtPassword.setEchoChar((char) 0);
            } else {
                txtPassword.setEchoChar('*');
            }
        }
        k2++;
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtStaffIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStaffIDKeyPressed
        // Clears the initial description in Staff-ID field when a key is pressed for the first time 
        // (since the cursor appears in this text field by default)
        if (k1 == 1) {
            txtStaffID.setText("");
        }
        k1++;
    }//GEN-LAST:event_txtStaffIDKeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel lblLogInToContinue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSName;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblTeamName;
    private javax.swing.JLabel lblWelcomeBack;
    private javax.swing.JPanel pnlBackGround;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}

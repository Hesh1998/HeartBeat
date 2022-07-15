// dialog box related to changing the existing password of a staff member(by themselves)

package DialogBoxes;

import CodingDialogBoxes.ChangePasswordCode;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ChangePassword extends javax.swing.JDialog {
    private String staffID=null;
    
    public ChangePassword(JDialog parent, boolean modal, String staffID, String password) {
        super(parent, modal);
        initComponents();

        txtCurrentPassword.setText(password);
        this.staffID=staffID;
        
        this.pack();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblCurrentPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        txtCurrentPassword = new javax.swing.JTextField();
        btnChangePassword = new javax.swing.JButton();
        lblConfirmNewPassword = new javax.swing.JLabel();
        txtConfirmNewPassword = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JTextField();
        pnlPasswordDetails = new javax.swing.JPanel();
        lblLine6 = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblLine2 = new javax.swing.JLabel();
        lblLine3 = new javax.swing.JLabel();
        lblLine4 = new javax.swing.JLabel();
        lblLine5 = new javax.swing.JLabel();
        lblLine1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCurrentPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCurrentPassword.setText("Your Current Password");
        pnlBackground.add(lblCurrentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblNewPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNewPassword.setText("Enter New Password");
        pnlBackground.add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtCurrentPassword.setEditable(false);
        txtCurrentPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCurrentPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCurrentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentPasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(txtCurrentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 340, 40));

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 153));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 320, 60));

        lblConfirmNewPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConfirmNewPassword.setText("Confirm New Password");
        pnlBackground.add(lblConfirmNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtConfirmNewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConfirmNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtConfirmNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmNewPasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(txtConfirmNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 340, 40));

        txtNewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 340, 40));

        pnlPasswordDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlPasswordDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        pnlPasswordDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLine6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine6.setForeground(new java.awt.Color(255, 0, 51));
        lblLine6.setText("* Doesn’t contain any white space.");
        pnlPasswordDetails.add(lblLine6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 0, 51));
        lblHeading.setText("Password Must,");
        lblHeading.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        pnlPasswordDetails.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblLine2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine2.setForeground(new java.awt.Color(255, 0, 51));
        lblLine2.setText("* Contain at least one digit.");
        pnlPasswordDetails.add(lblLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblLine3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine3.setForeground(new java.awt.Color(255, 0, 51));
        lblLine3.setText("* Contain at least one upper case alphabet.");
        pnlPasswordDetails.add(lblLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblLine4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine4.setForeground(new java.awt.Color(255, 0, 51));
        lblLine4.setText("* Contain at least one lower case alphabet.");
        pnlPasswordDetails.add(lblLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblLine5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine5.setForeground(new java.awt.Color(255, 0, 51));
        lblLine5.setText("* Contain at least one special character which includes !@#$%&*()-+=^.");
        pnlPasswordDetails.add(lblLine5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblLine1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLine1.setForeground(new java.awt.Color(255, 0, 51));
        lblLine1.setText("* Contain at least 8 characters and at most 20 characters.");
        pnlPasswordDetails.add(lblLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pnlBackground.add(pnlPasswordDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 670, 240));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurrentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentPasswordActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        ChangePasswordCode c=new ChangePasswordCode();
        if(c.isNewPasswordValid(txtNewPassword.getText())){
            if(c.confirmNewPasswrod(txtNewPassword.getText(), txtConfirmNewPassword.getText())){
                try{
                    c.changePassword(staffID, txtNewPassword.getText());
                    JOptionPane.showMessageDialog(this, "Password successfully changed");
                    this.setVisible(false);
                    this.dispose();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "New Password and New Password Confirmation do not match !", "Error", JOptionPane.ERROR_MESSAGE);
                txtConfirmNewPassword.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this, "New Password doesn't satisfy given conditions, try another password !", "Error", JOptionPane.ERROR_MESSAGE);
            txtNewPassword.setText("");
            txtConfirmNewPassword.setText("");
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void txtConfirmNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmNewPasswordActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed


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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangePassword dialog = new ChangePassword(new javax.swing.JDialog(), true, "No_ID", "No_Pass");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel lblConfirmNewPassword;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblLine2;
    private javax.swing.JLabel lblLine3;
    private javax.swing.JLabel lblLine4;
    private javax.swing.JLabel lblLine5;
    private javax.swing.JLabel lblLine6;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlPasswordDetails;
    private javax.swing.JTextField txtConfirmNewPassword;
    private javax.swing.JTextField txtCurrentPassword;
    private javax.swing.JTextField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}

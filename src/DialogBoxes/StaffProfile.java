// Displays the staff profile (a dialog box)

package DialogBoxes;

import CodingInterfaces.DBConnectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class StaffProfile extends javax.swing.JDialog {

    public StaffProfile(java.awt.Frame parent, boolean modal, String staff_ID) {
        super(parent, modal);
        initComponents();
        
        // centers the GUI in the screen
        this.pack();
        this.setLocationRelativeTo(null);
        
        // displays all the related staff details by extracting them from the database
        try{
            DBConnectivity db=new DBConnectivity();
            Connection c=db.getDBConnection();
            Statement stmt=c.createStatement();

            String query=("SELECT * FROM staff WHERE staff_id='"+staff_ID+"';");
            ResultSet rs=stmt.executeQuery(query); 
            
            rs.next();
            lblName.setText("  "+rs.getString("forename")+" "+rs.getString("surname"));
            txtStaffID.setText(rs.getString("staff_id"));
            txtStaffType.setText(rs.getString("staff_type"));
            txtDateOfBirth.setText(rs.getString("date_of_birth"));
            txtGender.setText(rs.getString("gender"));
            txtPassword.setText(rs.getString("password"));
            txtEmail.setText(rs.getString("email"));
            txtMobileNo.setText(rs.getString("mobile_no"));
            txtLANNo.setText(rs.getString("LAN_no"));
            txtAddressNumber.setText(rs.getString("address_number"));
            txtAddressStreet.setText(rs.getString("address_street"));
            txtAddressCity.setText(rs.getString("address_city"));
            
            c.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblStaffID = new javax.swing.JLabel();
        lblStaffType = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        lblLANNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddressCity = new javax.swing.JTextField();
        txtStaffType = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtLANNo = new javax.swing.JTextField();
        txtAddressNumber = new javax.swing.JTextField();
        txtAddressStreet = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Your Profile");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStaffID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStaffID.setText("Staff - ID");
        pnlBackground.add(lblStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lblStaffType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStaffType.setText("Staff Type");
        pnlBackground.add(lblStaffType, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateOfBirth.setText("Date of Birth");
        pnlBackground.add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGender.setText("Gender");
        pnlBackground.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtStaffID.setEditable(false);
        txtStaffID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStaffID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 370, 40));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPassword.setText("Password");
        pnlBackground.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmail.setText("Email");
        pnlBackground.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        lblMobileNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMobileNo.setText("Mobile No");
        pnlBackground.add(lblMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 130, -1));

        lblLANNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLANNo.setText("LAN No");
        pnlBackground.add(lblLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 110, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddress.setText("Address");
        pnlBackground.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 110, -1));

        txtAddressCity.setEditable(false);
        txtAddressCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCityActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 770, 370, 40));

        txtStaffType.setEditable(false);
        txtStaffType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStaffType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtStaffType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 370, 40));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDateOfBirth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 370, 40));

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        pnlBackground.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 370, 40));

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 370, 40));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 370, 40));

        txtMobileNo.setEditable(false);
        txtMobileNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMobileNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 370, 40));

        txtLANNo.setEditable(false);
        txtLANNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLANNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtLANNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLANNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 370, 40));

        txtAddressNumber.setEditable(false);
        txtAddressNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressNumberActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 370, 40));

        txtAddressStreet.setEditable(false);
        txtAddressStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressStreet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressStreetActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 730, 370, 40));

        lblName.setBackground(new java.awt.Color(204, 255, 255));
        lblName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 153, 153));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setOpaque(true);
        pnlBackground.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 550, 50));

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 153));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 840, 320, 60));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressCityActionPerformed

    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoActionPerformed

    private void txtLANNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLANNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLANNoActionPerformed

    private void txtAddressNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressNumberActionPerformed

    private void txtAddressStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressStreetActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        this.setVisible(false);
        new ChangePassword(this, true, txtStaffID.getText(), txtPassword.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChangePasswordActionPerformed


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
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StaffProfile dialog = new StaffProfile(new javax.swing.JFrame(), true, "No_ID");
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
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLANNo;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblStaffType;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtAddressCity;
    private javax.swing.JTextField txtAddressNumber;
    private javax.swing.JTextField txtAddressStreet;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLANNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffType;
    // End of variables declaration//GEN-END:variables
}

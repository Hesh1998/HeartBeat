package DialogBoxes;

import com.toedter.calendar.JDateChooser;


public class AddStaffMember extends javax.swing.JDialog {

    public AddStaffMember(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.pack();
        this.setLocationRelativeTo(null);
        
        dchDateOfBirth.getDateEditor().setEnabled(false);
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
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtLANNo = new javax.swing.JTextField();
        txtAddressNumber = new javax.swing.JTextField();
        txtAddressStreet = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        dchDateOfBirth = new com.toedter.calendar.JDateChooser();
        cmbStaffType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Staff Member");
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

        txtAddressCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCityActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 770, 370, 40));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 370, 40));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 370, 40));

        txtMobileNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMobileNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 370, 40));

        txtLANNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLANNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtLANNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLANNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 370, 40));

        txtAddressNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressNumberActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 370, 40));

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
        lblName.setText("Heshan Nanayakkara");
        lblName.setOpaque(true);
        pnlBackground.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 550, 50));

        btnAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 860, 250, 60));

        btnReset.setBackground(new java.awt.Color(0, 0, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlBackground.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 860, 250, 60));

        cmbGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        pnlBackground.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 370, 40));

        dchDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlBackground.add(dchDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 262, 370, 40));

        cmbStaffType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbStaffType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Nurse", "Pharmacist", "Receptionist", "Supporting Staff" }));
        pnlBackground.add(cmbStaffType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 370, 40));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 950));

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed


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
            java.util.logging.Logger.getLogger(AddStaffMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaffMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaffMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaffMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddStaffMember dialog = new AddStaffMember(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbStaffType;
    private com.toedter.calendar.JDateChooser dchDateOfBirth;
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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLANNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}

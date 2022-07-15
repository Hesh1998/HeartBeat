package DialogBoxes;


public class ViewConsultantDetails extends javax.swing.JDialog {

    public ViewConsultantDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblConsultantID = new javax.swing.JLabel();
        txtConsultantID = new javax.swing.JTextField();
        lblSpeciality = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblSLMC = new javax.swing.JLabel();
        txtSLMC = new javax.swing.JTextField();
        lblQualifications = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblMobileNo = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        lblLANNo = new javax.swing.JLabel();
        txtLANNo = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddressNumber = new javax.swing.JTextField();
        txtAddressStreet = new javax.swing.JTextField();
        txtAddressCity = new javax.swing.JTextField();
        scrlQualifications = new javax.swing.JScrollPane();
        txtQualifications = new javax.swing.JTextArea();
        lblChargePerPatient = new javax.swing.JLabel();
        txtChargePerPatient = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultant Details");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setBackground(new java.awt.Color(204, 255, 255));
        lblName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 153, 153));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Heshan Nanayakkara");
        lblName.setOpaque(true);
        pnlBackground.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1170, 50));

        lblConsultantID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultantID.setText("Consultant - ID");
        pnlBackground.add(lblConsultantID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txtConsultantID.setEditable(false);
        txtConsultantID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConsultantID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtConsultantID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 350, 40));

        lblSpeciality.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSpeciality.setText("Speciality");
        pnlBackground.add(lblSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtSpeciality.setEditable(false);
        txtSpeciality.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpeciality.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 350, 40));

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateOfBirth.setText("Date of Birth");
        pnlBackground.add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDateOfBirth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 350, 40));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGender.setText("Gender");
        pnlBackground.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        pnlBackground.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 350, 40));

        lblSLMC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSLMC.setText("SLMC Reg No");
        pnlBackground.add(lblSLMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        txtSLMC.setEditable(false);
        txtSLMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSLMC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtSLMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 350, 40));

        lblQualifications.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQualifications.setText("Qualifications");
        pnlBackground.add(lblQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmail.setText("Email");
        pnlBackground.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 350, 40));

        lblMobileNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMobileNo.setText("Mobile No");
        pnlBackground.add(lblMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 130, -1));

        txtMobileNo.setEditable(false);
        txtMobileNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMobileNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 350, 40));

        lblLANNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLANNo.setText("LAN No");
        pnlBackground.add(lblLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 110, -1));

        txtLANNo.setEditable(false);
        txtLANNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLANNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtLANNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLANNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 350, 40));

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddress.setText("Address");
        pnlBackground.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 110, -1));

        txtAddressNumber.setEditable(false);
        txtAddressNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressNumberActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 350, 40));

        txtAddressStreet.setEditable(false);
        txtAddressStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressStreet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressStreetActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 350, 40));

        txtAddressCity.setEditable(false);
        txtAddressCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCityActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 350, 40));

        txtQualifications.setEditable(false);
        txtQualifications.setColumns(20);
        txtQualifications.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQualifications.setRows(5);
        scrlQualifications.setViewportView(txtQualifications);

        pnlBackground.add(scrlQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 550, 250));

        lblChargePerPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblChargePerPatient.setText("Charge per Patient");
        pnlBackground.add(lblChargePerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 250, -1));

        txtChargePerPatient.setEditable(false);
        txtChargePerPatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtChargePerPatient.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtChargePerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChargePerPatientActionPerformed(evt);
            }
        });
        pnlBackground.add(txtChargePerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 290, 40));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

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

    private void txtAddressCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressCityActionPerformed

    private void txtChargePerPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChargePerPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChargePerPatientActionPerformed


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
            java.util.logging.Logger.getLogger(ViewConsultantDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConsultantDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConsultantDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsultantDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewConsultantDetails dialog = new ViewConsultantDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblChargePerPatient;
    private javax.swing.JLabel lblConsultantID;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLANNo;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQualifications;
    private javax.swing.JLabel lblSLMC;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrlQualifications;
    private javax.swing.JTextField txtAddressCity;
    private javax.swing.JTextField txtAddressNumber;
    private javax.swing.JTextField txtAddressStreet;
    private javax.swing.JTextField txtChargePerPatient;
    private javax.swing.JTextField txtConsultantID;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLANNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextArea txtQualifications;
    private javax.swing.JTextField txtSLMC;
    private javax.swing.JTextField txtSpeciality;
    // End of variables declaration//GEN-END:variables
}

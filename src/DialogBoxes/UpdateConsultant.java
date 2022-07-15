package DialogBoxes;


public class UpdateConsultant extends javax.swing.JDialog {

    public UpdateConsultant(java.awt.Frame parent, boolean modal) {
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
        lblName = new javax.swing.JLabel();
        lblConsultantID = new javax.swing.JLabel();
        txtConsultantID = new javax.swing.JTextField();
        lblSpeciality = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        lblPasswrod = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
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
        lblChargePerPatient = new javax.swing.JLabel();
        txtQualificationCount = new javax.swing.JTextField();
        txtChargePerPatient = new javax.swing.JTextField();
        btnUpdateConsultant = new javax.swing.JButton();
        btnAddQualification = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        chkQualifications = new javax.swing.JCheckBox();
        chkDateOfBirth = new javax.swing.JCheckBox();
        chkGender = new javax.swing.JCheckBox();
        chkSLMC = new javax.swing.JCheckBox();
        chkEmail = new javax.swing.JCheckBox();
        chkMobileNo = new javax.swing.JCheckBox();
        chkLANNo = new javax.swing.JCheckBox();
        chkSpeciality = new javax.swing.JCheckBox();
        chkPassword = new javax.swing.JCheckBox();
        chkAddress = new javax.swing.JCheckBox();
        chkChargePerPatient = new javax.swing.JCheckBox();
        dchDateOfBirth = new com.toedter.calendar.JDateChooser();
        cmbGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Consultant");
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
        pnlBackground.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1330, 50));

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

        lblPasswrod.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPasswrod.setText("Password");
        pnlBackground.add(lblPasswrod, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 350, 40));

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateOfBirth.setText("Date of Birth");
        pnlBackground.add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGender.setText("Gender");
        pnlBackground.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        lblSLMC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSLMC.setText("SLMC Reg No");
        pnlBackground.add(lblSLMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        txtSLMC.setEditable(false);
        txtSLMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSLMC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtSLMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 350, 40));

        lblQualifications.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQualifications.setText("Qualifications");
        pnlBackground.add(lblQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

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
        pnlBackground.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 110, -1));

        txtAddressNumber.setEditable(false);
        txtAddressNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressNumberActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 350, 40));

        txtAddressStreet.setEditable(false);
        txtAddressStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressStreet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressStreetActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 350, 40));

        txtAddressCity.setEditable(false);
        txtAddressCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCityActionPerformed(evt);
            }
        });
        pnlBackground.add(txtAddressCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 350, 40));

        lblChargePerPatient.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblChargePerPatient.setText("Charge per Patient (Rs.) ");
        pnlBackground.add(lblChargePerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 310, -1));

        txtQualificationCount.setEditable(false);
        txtQualificationCount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQualificationCount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtQualificationCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationCountActionPerformed(evt);
            }
        });
        pnlBackground.add(txtQualificationCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 420, 120, 40));

        txtChargePerPatient.setEditable(false);
        txtChargePerPatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtChargePerPatient.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtChargePerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChargePerPatientActionPerformed(evt);
            }
        });
        pnlBackground.add(txtChargePerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 240, 40));

        btnUpdateConsultant.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateConsultant.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateConsultant.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateConsultant.setText("Update Consultant");
        btnUpdateConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateConsultantActionPerformed(evt);
            }
        });
        pnlBackground.add(btnUpdateConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 250, 60));

        btnAddQualification.setBackground(new java.awt.Color(0, 0, 153));
        btnAddQualification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddQualification.setForeground(new java.awt.Color(255, 255, 255));
        btnAddQualification.setText("Add");
        btnAddQualification.setEnabled(false);
        btnAddQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQualificationActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAddQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 420, 200, 40));

        btnReset.setBackground(new java.awt.Color(0, 0, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlBackground.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 250, 60));

        chkQualifications.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkQualifications.setText("Edit");
        chkQualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkQualificationsActionPerformed(evt);
            }
        });
        pnlBackground.add(chkQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 430, -1, -1));

        chkDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDateOfBirth.setText("Edit");
        pnlBackground.add(chkDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, 30));

        chkGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkGender.setText("Edit");
        chkGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGenderActionPerformed(evt);
            }
        });
        pnlBackground.add(chkGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, 30));

        chkSLMC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSLMC.setText("Edit");
        pnlBackground.add(chkSLMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, 30));

        chkEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkEmail.setText("Edit");
        pnlBackground.add(chkEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, 30));

        chkMobileNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMobileNo.setText("Edit");
        pnlBackground.add(chkMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, 30));

        chkLANNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkLANNo.setText("Edit");
        pnlBackground.add(chkLANNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, -1, 30));

        chkSpeciality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSpeciality.setText("Edit");
        chkSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSpecialityActionPerformed(evt);
            }
        });
        pnlBackground.add(chkSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        chkPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPassword.setText("Edit");
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });
        pnlBackground.add(chkPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 140, -1, 30));

        chkAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAddress.setText("Edit");
        chkAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAddressActionPerformed(evt);
            }
        });
        pnlBackground.add(chkAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 210, -1, 30));

        chkChargePerPatient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkChargePerPatient.setText("Edit");
        chkChargePerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChargePerPatientActionPerformed(evt);
            }
        });
        pnlBackground.add(chkChargePerPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 360, -1, 30));

        dchDateOfBirth.setEnabled(false);
        dchDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlBackground.add(dchDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 350, 40));

        cmbGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbGender.setEnabled(false);
        pnlBackground.add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 350, 40));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtQualificationCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationCountActionPerformed

    private void btnUpdateConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateConsultantActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUpdateConsultantActionPerformed

    private void btnAddQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQualificationActionPerformed
        new AddQualification(this, true).setVisible(true);
    }//GEN-LAST:event_btnAddQualificationActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void chkQualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkQualificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkQualificationsActionPerformed

    private void chkGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGenderActionPerformed

    private void chkSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSpecialityActionPerformed

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPasswordActionPerformed

    private void chkAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAddressActionPerformed

    private void chkChargePerPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChargePerPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkChargePerPatientActionPerformed


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
            java.util.logging.Logger.getLogger(UpdateConsultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateConsultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateConsultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateConsultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateConsultant dialog = new UpdateConsultant(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddQualification;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdateConsultant;
    private javax.swing.JCheckBox chkAddress;
    private javax.swing.JCheckBox chkChargePerPatient;
    private javax.swing.JCheckBox chkDateOfBirth;
    private javax.swing.JCheckBox chkEmail;
    private javax.swing.JCheckBox chkGender;
    private javax.swing.JCheckBox chkLANNo;
    private javax.swing.JCheckBox chkMobileNo;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JCheckBox chkQualifications;
    private javax.swing.JCheckBox chkSLMC;
    private javax.swing.JCheckBox chkSpeciality;
    private javax.swing.JComboBox<String> cmbGender;
    private com.toedter.calendar.JDateChooser dchDateOfBirth;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblChargePerPatient;
    private javax.swing.JLabel lblConsultantID;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLANNo;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPasswrod;
    private javax.swing.JLabel lblQualifications;
    private javax.swing.JLabel lblSLMC;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtAddressCity;
    private javax.swing.JTextField txtAddressNumber;
    private javax.swing.JTextField txtAddressStreet;
    private javax.swing.JTextField txtChargePerPatient;
    private javax.swing.JTextField txtConsultantID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLANNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtQualificationCount;
    private javax.swing.JTextField txtSLMC;
    private javax.swing.JTextField txtSpeciality;
    // End of variables declaration//GEN-END:variables
}

package DialogBoxes;

import CodingDialogBoxes.AddAppointmentCode;
import CodingInterfaces.CommonOperations;
import CodingInterfaces.ReceptionistCode;
import Print.PrintSupport;
import Validation.ValidateData;
import javax.swing.JOptionPane;


public class AddAppointment extends javax.swing.JDialog {
    String consultantIDList[]=null;
    String yearStr, patientCode, forename, surname;
    int regTimeSlotID=0;
    boolean appointmentPrintStatus=false;
    
    public AddAppointment(java.awt.Frame parent, boolean modal, String patientCode, String yearStr, String forename, String surname) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.patientCode=patientCode;
        this.yearStr=yearStr;
        this.forename=forename;
        this.surname=surname;
        
        ResetData();
    }
    
    // method which handles setting the consultant name list in the combo box
    public void displayConsultantList(){
        ReceptionistCode rc=new ReceptionistCode();
        try{
            cmbConsultant.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetConsultantNameList(cmbConsultantSpeciality.getItemAt(cmbConsultantSpeciality.getSelectedIndex()))));
            consultantIDList=rc.RegisterPatientGetConsultantIDList(cmbConsultantSpeciality.getItemAt(cmbConsultantSpeciality.getSelectedIndex()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // method which handles setting the time slot details list in the combo box
    public void displayDateAndTimeList(){
        ReceptionistCode rc=new ReceptionistCode();
        try{
            cmbDateAndTime.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetDateAndTimeList(consultantIDList[cmbConsultant.getSelectedIndex()])));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ResetData(){
        ReceptionistCode rc=new ReceptionistCode();
        ValidateData v=new ValidateData();
        chkPaymentDone.setSelected(false);
        // sets newly generated patient code and appointment number in patient registration panel (for next patient registration)
        try{
            String codes[]=rc.RegisterPatientGetGeneratedCodes();
            if(v.isValidLength(codes[1], 5)){
                btnAdd.setEnabled(true);
                btnPrint.setEnabled(true);
                
                txtAppointmentNo.setText(codes[1]);
            }else{
                btnAdd.setEnabled(false);
                btnPrint.setEnabled(false);
                JOptionPane.showMessageDialog(this, "No more Appointments can be made !", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if(patientCode.equals("")){
               btnAdd.setEnabled(false);
               btnPrint.setEnabled(false); 
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // sets consultant speciality list in the combo box
        try{
            cmbConsultantSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetConsultantSpecialityList()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        displayConsultantList();
        displayDateAndTimeList();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblAppointmentNo = new javax.swing.JLabel();
        txtAppointmentNo = new javax.swing.JTextField();
        lblConsultantSpeciality = new javax.swing.JLabel();
        cmbConsultantSpeciality = new javax.swing.JComboBox<>();
        lblConsultant = new javax.swing.JLabel();
        cmbConsultant = new javax.swing.JComboBox<>();
        lblDateAndTime = new javax.swing.JLabel();
        cmbDateAndTime = new javax.swing.JComboBox<>();
        btnPrint = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblAppointmentDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArAppointmentReceiptR = new javax.swing.JTextArea();
        btnClear1 = new javax.swing.JButton();
        chkPaymentDone = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Appointment");
        setLocation(new java.awt.Point(550, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAppointmentNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAppointmentNo.setText("Generated Appointment No  ");
        pnlBackground.add(lblAppointmentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtAppointmentNo.setEditable(false);
        txtAppointmentNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAppointmentNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtAppointmentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 370, 40));

        lblConsultantSpeciality.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultantSpeciality.setText("Select Consultant Speciality");
        pnlBackground.add(lblConsultantSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        cmbConsultantSpeciality.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbConsultantSpeciality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultantSpecialityItemStateChanged(evt);
            }
        });
        pnlBackground.add(cmbConsultantSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 370, 40));

        lblConsultant.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultant.setText("Select Consultant");
        pnlBackground.add(lblConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        cmbConsultant.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbConsultant.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultantItemStateChanged(evt);
            }
        });
        pnlBackground.add(cmbConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 370, 40));

        lblDateAndTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateAndTime.setText("Select Date and Time");
        pnlBackground.add(lblDateAndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cmbDateAndTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbDateAndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDateAndTimeActionPerformed(evt);
            }
        });
        pnlBackground.add(cmbDateAndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 730, 40));

        btnPrint.setBackground(new java.awt.Color(0, 0, 153));
        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print Receipt");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        pnlBackground.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 420, 320, 60));

        btnAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 220, 60));

        lblAppointmentDetails.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblAppointmentDetails.setText("Appointment Details");
        lblAppointmentDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(lblAppointmentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, -1));

        txtArAppointmentReceiptR.setEditable(false);
        txtArAppointmentReceiptR.setColumns(20);
        txtArAppointmentReceiptR.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtArAppointmentReceiptR.setRows(5);
        jScrollPane1.setViewportView(txtArAppointmentReceiptR);

        pnlBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 750, 320));

        btnClear1.setBackground(new java.awt.Color(0, 0, 153));
        btnClear1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(255, 255, 255));
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        pnlBackground.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 220, 60));

        chkPaymentDone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkPaymentDone.setText("Payment Done");
        chkPaymentDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPaymentDoneActionPerformed(evt);
            }
        });
        pnlBackground.add(chkPaymentDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 210, 60));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDateAndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDateAndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDateAndTimeActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if(appointmentPrintStatus==true){
            PrintSupport.printComponent(txtArAppointmentReceiptR); //Prints the textArea
            txtArAppointmentReceiptR.setText("");
            appointmentPrintStatus=false;
        }else{
            JOptionPane.showMessageDialog(this, "Please Complete Appointment Details !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ValidateData v=new ValidateData();
        ReceptionistCode rc=new ReceptionistCode();
        CommonOperations co=new CommonOperations();
        
        String paymentDate="";
                
        if(chkPaymentDone.isSelected()){
            paymentDate=co.convertInterfaceDateToDatabase(yearStr);
        }
        
        try{
            String receipt=rc.RegisterPatientGetAppointmentReceipt(patientCode, (forename+" "+surname), txtAppointmentNo.getText(), cmbConsultantSpeciality.getSelectedItem().toString() , cmbConsultant.getSelectedItem().toString(), cmbDateAndTime.getSelectedItem().toString(), yearStr, paymentDate);
            txtArAppointmentReceiptR.setText(receipt);
            regTimeSlotID=rc.RegisterPatientGetTimeSlotID(cmbDateAndTime.getSelectedItem().toString());
            AddAppointmentCode aac=new AddAppointmentCode();
            aac.AddNewAppointment(patientCode, Integer.parseInt(txtAppointmentNo.getText()), regTimeSlotID, paymentDate);
            JOptionPane.showMessageDialog(this, "Appointment Added Successfully");
            regTimeSlotID=0;
            ResetData();
            appointmentPrintStatus=true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        ResetData();
        txtArAppointmentReceiptR.setText("");
        appointmentPrintStatus=false;
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void cmbConsultantSpecialityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultantSpecialityItemStateChanged
        displayConsultantList();
        displayDateAndTimeList();
    }//GEN-LAST:event_cmbConsultantSpecialityItemStateChanged

    private void cmbConsultantItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultantItemStateChanged
        displayDateAndTimeList();
    }//GEN-LAST:event_cmbConsultantItemStateChanged

    private void chkPaymentDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPaymentDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPaymentDoneActionPerformed

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
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddAppointment dialog = new AddAppointment(new javax.swing.JFrame(), true, "NULL", "NULL", "NULL", "NULL");
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
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnPrint;
    private javax.swing.JCheckBox chkPaymentDone;
    private javax.swing.JComboBox<String> cmbConsultant;
    private javax.swing.JComboBox<String> cmbConsultantSpeciality;
    private javax.swing.JComboBox<String> cmbDateAndTime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppointmentDetails;
    private javax.swing.JLabel lblAppointmentNo;
    private javax.swing.JLabel lblConsultant;
    private javax.swing.JLabel lblConsultantSpeciality;
    private javax.swing.JLabel lblDateAndTime;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtAppointmentNo;
    private javax.swing.JTextArea txtArAppointmentReceiptR;
    // End of variables declaration//GEN-END:variables
}

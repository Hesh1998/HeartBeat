package DialogBoxes;

import CodingInterfaces.CommonDBOperations;
import CodingInterfaces.ConsultantCode;
import Print.PrintSupport;
import java.awt.Component;
import javax.swing.JOptionPane;


public class Prescription extends javax.swing.JDialog {
    private String drugAndDose[][]=new String[10][2];
    private String consultantID=null, patientCode=null;
    private int countofDrugs=0, i=0;
    private boolean prescriptionPrintStatus=false;
    private int appointmentNo=0;
    
    public Prescription(java.awt.Frame parent, boolean modal, String consultantID, String patientCode, int appointmentNo) {
        super(parent, modal);
        initComponents();

        this.pack();
        this.setLocationRelativeTo(null);
        
        CommonDBOperations cd=new CommonDBOperations();
        
        this.patientCode=patientCode;
        this.consultantID=consultantID;
        try{
            txtPrescriptionNo.setText(cd.getNextPrimaryKey("", "SELECT prescription_no FROM prescription;", "prescription_no"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.appointmentNo=appointmentNo;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblPrescriptionNo = new javax.swing.JLabel();
        txtPrescriptionNo = new javax.swing.JTextField();
        lblNote = new javax.swing.JLabel();
        lblDiagnosedIllness = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        scrlPrescriptionReceipt = new javax.swing.JScrollPane();
        txtPrescriptionReceipt = new javax.swing.JTextArea();
        btnPrescribe = new javax.swing.JButton();
        scrlNote = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        txtDiagnosedIllness = new javax.swing.JTextField();
        txtDrug = new javax.swing.JTextField();
        lblNote1 = new javax.swing.JLabel();
        lblNote2 = new javax.swing.JLabel();
        btnAddT = new javax.swing.JButton();
        chkHistory = new javax.swing.JCheckBox();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prescription");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrescriptionNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPrescriptionNo.setText("Generated Prescription No ");
        pnlBackground.add(lblPrescriptionNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtPrescriptionNo.setEditable(false);
        txtPrescriptionNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrescriptionNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrescriptionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrescriptionNoActionPerformed(evt);
            }
        });
        pnlBackground.add(txtPrescriptionNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 340, 40));

        lblNote.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNote.setText("Drug");
        pnlBackground.add(lblNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        lblDiagnosedIllness.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDiagnosedIllness.setText("Diagnosed Illness");
        pnlBackground.add(lblDiagnosedIllness, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtDose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDose.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseActionPerformed(evt);
            }
        });
        pnlBackground.add(txtDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 450, 40));

        txtPrescriptionReceipt.setEditable(false);
        txtPrescriptionReceipt.setColumns(20);
        txtPrescriptionReceipt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPrescriptionReceipt.setRows(5);
        scrlPrescriptionReceipt.setViewportView(txtPrescriptionReceipt);

        pnlBackground.add(scrlPrescriptionReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 710, 370));

        btnPrescribe.setBackground(new java.awt.Color(0, 0, 153));
        btnPrescribe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPrescribe.setForeground(new java.awt.Color(255, 255, 255));
        btnPrescribe.setText("Prescribe");
        btnPrescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeActionPerformed(evt);
            }
        });
        pnlBackground.add(btnPrescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 200, 60));

        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtNote.setRows(5);
        scrlNote.setViewportView(txtNote);

        pnlBackground.add(scrlNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 620, 130));

        txtDiagnosedIllness.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiagnosedIllness.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDiagnosedIllness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosedIllnessActionPerformed(evt);
            }
        });
        pnlBackground.add(txtDiagnosedIllness, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 340, 40));

        txtDrug.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDrug.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugActionPerformed(evt);
            }
        });
        pnlBackground.add(txtDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 40));

        lblNote1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNote1.setText("Dose");
        pnlBackground.add(lblNote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        lblNote2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNote2.setText("Note");
        pnlBackground.add(lblNote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnAddT.setBackground(new java.awt.Color(0, 0, 153));
        btnAddT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddT.setForeground(new java.awt.Color(255, 255, 255));
        btnAddT.setText("Add");
        btnAddT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAddT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 180, 40));

        chkHistory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkHistory.setText("Keep Medical History");
        pnlBackground.add(chkHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, 60));

        btnPrint.setBackground(new java.awt.Color(0, 0, 153));
        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print Receipt");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        pnlBackground.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 430, 320, 60));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrescriptionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrescriptionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrescriptionNoActionPerformed

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoseActionPerformed

    private void btnPrescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeActionPerformed
        if(!txtDiagnosedIllness.equals("") && i!=0){
            String receipt1="Prescription No : "+txtPrescriptionNo.getText()+"\n"+"Diagnoed Illness : "+txtDiagnosedIllness.getText()+"\n";
            String receipt2="";
            for(int j=0; j<countofDrugs; j++){
                receipt2=receipt2+"Drug and Dose : "+drugAndDose[j][0]+" "+drugAndDose[j][1]+"\n";
            }
            String receipt3="\nNote\n"+"====\n"+txtNote.getText()+"\n";
            String receipt0="==================================================================================\n";
            txtPrescriptionReceipt.setText(receipt0+receipt1+receipt2+receipt3+receipt0);
            prescriptionPrintStatus=true;
            
            for(Component cp : pnlBackground.getComponents()){
                cp.setEnabled(false);
            }
            btnPrint.setEnabled(true);
            ConsultantCode cd=new ConsultantCode();
            try{
                if(chkHistory.isSelected()){
                    cd.Prescribe(patientCode, consultantID, txtPrescriptionNo.getText(), txtDiagnosedIllness.getText(), 
                            txtNote.getText(), drugAndDose, "Yes", countofDrugs, appointmentNo);    
                }else{
                    cd.Prescribe(patientCode, consultantID, txtPrescriptionNo.getText(), txtDiagnosedIllness.getText(), 
                            txtNote.getText(), drugAndDose, "No", countofDrugs, appointmentNo);
                }    
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Please Enter Diagnosed Ilness, Drug and Dose !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrescribeActionPerformed

    private void txtDiagnosedIllnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosedIllnessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosedIllnessActionPerformed

    private void txtDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugActionPerformed

    private void btnAddTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTActionPerformed
        if(!txtDose.getText().equals("") && !txtDrug.getText().equals("") && !txtDiagnosedIllness.getText().equals("")){
            drugAndDose[i][0]=txtDrug.getText();
            drugAndDose[i][1]=txtDose.getText();
            i++;
            countofDrugs++;
            txtDrug.setText("");
            txtDose.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Please Enter Required Details !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddTActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if(prescriptionPrintStatus==true){
            PrintSupport.printComponent(txtPrescriptionReceipt); //Prints the textArea
            txtPrescriptionReceipt.setText("");
            prescriptionPrintStatus=false;
        }else{
            JOptionPane.showMessageDialog(this, "Please Complete Prescription Details !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed


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
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Prescription dialog = new Prescription(new javax.swing.JFrame(), true, "NULL", "NULL", 0);
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
    private javax.swing.JButton btnAddT;
    private javax.swing.JButton btnPrescribe;
    private javax.swing.JButton btnPrint;
    private javax.swing.JCheckBox chkHistory;
    private javax.swing.JLabel lblDiagnosedIllness;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblNote1;
    private javax.swing.JLabel lblNote2;
    private javax.swing.JLabel lblPrescriptionNo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrlNote;
    private javax.swing.JScrollPane scrlPrescriptionReceipt;
    private javax.swing.JTextField txtDiagnosedIllness;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtDrug;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPrescriptionNo;
    private javax.swing.JTextArea txtPrescriptionReceipt;
    // End of variables declaration//GEN-END:variables
}

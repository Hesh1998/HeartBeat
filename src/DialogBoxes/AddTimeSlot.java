package DialogBoxes;

import CodingDialogBoxes.AddTimeSlotCode;
import Validation.ValidateData;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.text.DateFormatter;

public class AddTimeSlot extends javax.swing.JDialog {
    private String consultantID=null;
    private String consultantName=null;
    
    public AddTimeSlot(java.awt.Frame parent, boolean modal, String consultantID, String consultantName) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);

        this.consultantID=consultantID;
        this.consultantName=consultantName;
        txtConsultant.setText(consultantName);
        
        Reset();
    }
    
    public void Reset(){
        Date date=new Date();
        
        SpinnerDateModel sm=new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spnStartingTime.setModel(sm);
        JSpinner.DateEditor de=new JSpinner.DateEditor(spnStartingTime, "HH:mm");
        spnStartingTime.setEditor(de);
        ((JSpinner.DefaultEditor) spnStartingTime.getEditor()).getTextField().setEditable(false);
        
        SpinnerDateModel sm1=new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spnEndingTime.setModel(sm1);
        JSpinner.DateEditor de1=new JSpinner.DateEditor(spnEndingTime, "HH:mm");
        spnEndingTime.setEditor(de1);
        ((JSpinner.DefaultEditor) spnEndingTime.getEditor()).getTextField().setEditable(false);
        
        AddTimeSlotCode ac=new AddTimeSlotCode();
        try{
            cmbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(ac.getRoomNoList()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        cmbDay.setSelectedIndex(0);
        txtMaxAppointments.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTimeSlotDetails = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        lblStartingTime = new javax.swing.JLabel();
        spnStartingTime = new javax.swing.JSpinner();
        lblEndingTime = new javax.swing.JLabel();
        spnEndingTime = new javax.swing.JSpinner();
        lblConsultant = new javax.swing.JLabel();
        lblRoomNo = new javax.swing.JLabel();
        cmbRoom = new javax.swing.JComboBox<>();
        lblMaxAppointments = new javax.swing.JLabel();
        txtConsultant = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtMaxAppointments = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Time Slot");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTimeSlotDetails.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblTimeSlotDetails.setText("Time Slot Details");
        lblTimeSlotDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(lblTimeSlotDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        lblDay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDay.setText("Day");
        pnlBackground.add(lblDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cmbDay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        pnlBackground.add(cmbDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 370, 40));

        lblStartingTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStartingTime.setText("Starting Time");
        pnlBackground.add(lblStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        spnStartingTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spnStartingTime.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnStartingTime.setAutoscrolls(true);
        spnStartingTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnStartingTimeStateChanged(evt);
            }
        });
        pnlBackground.add(spnStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 180, 40));

        lblEndingTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEndingTime.setText("Ending Time");
        pnlBackground.add(lblEndingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        spnEndingTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spnEndingTime.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnEndingTime.setAutoscrolls(true);
        pnlBackground.add(spnEndingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 180, 40));

        lblConsultant.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultant.setText("Consultant");
        pnlBackground.add(lblConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblRoomNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRoomNo.setText("Room No");
        pnlBackground.add(lblRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        cmbRoom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomActionPerformed(evt);
            }
        });
        pnlBackground.add(cmbRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 370, 40));

        lblMaxAppointments.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMaxAppointments.setText("Max Appointments");
        pnlBackground.add(lblMaxAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        txtConsultant.setEditable(false);
        txtConsultant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConsultant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 370, 40));

        btnClear.setBackground(new java.awt.Color(0, 0, 153));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlBackground.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 270, 60));

        btnAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 270, 60));

        txtMaxAppointments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaxAppointments.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtMaxAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 370, 40));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String startTimeTemp[]=spnStartingTime.getValue().toString().split(" ");
        String startTimeTemp1[]=startTimeTemp[3].split(":");
        String startTime=startTimeTemp1[0]+":"+startTimeTemp1[1]+":00";
        
        String endTimeTemp[]=spnEndingTime.getValue().toString().split(" ");
        String endTimeTemp1[]=endTimeTemp[3].split(":");
        String endTime=endTimeTemp1[0]+":"+endTimeTemp1[1]+":00";
        
        ValidateData v=new ValidateData();
        AddTimeSlotCode ac=new AddTimeSlotCode();
        if(v.isValidPositiveInteger(txtMaxAppointments.getText())){
            try{
                if(ac.isTimeSlotPossible(consultantID, cmbDay.getSelectedItem().toString(), startTime, endTime, cmbRoom.getSelectedItem().toString())){
                    ac.addNewTimeSlot(consultantID, cmbDay.getSelectedItem().toString(), startTime, endTime, txtMaxAppointments.getText(), cmbRoom.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "New TimeSlot Added successfully");
                    Reset();
                }else{
                    JOptionPane.showMessageDialog(this, "Time slot not availabe, Please select another Room No or Time Setting !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Invalid data entered for Maximum Appointments, Please enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void spnStartingTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnStartingTimeStateChanged

    }//GEN-LAST:event_spnStartingTimeStateChanged


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
            java.util.logging.Logger.getLogger(AddTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddTimeSlot dialog = new AddTimeSlot(new javax.swing.JFrame(), true, "NULL", "NULL");
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
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbRoom;
    private javax.swing.JLabel lblConsultant;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblEndingTime;
    private javax.swing.JLabel lblMaxAppointments;
    private javax.swing.JLabel lblRoomNo;
    private javax.swing.JLabel lblStartingTime;
    private javax.swing.JLabel lblTimeSlotDetails;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JSpinner spnEndingTime;
    private javax.swing.JSpinner spnStartingTime;
    private javax.swing.JTextField txtConsultant;
    private javax.swing.JTextField txtMaxAppointments;
    // End of variables declaration//GEN-END:variables
}

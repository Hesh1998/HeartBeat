package DialogBoxes;

import CodingDialogBoxes.AddTimeSlotCode;
import CodingDialogBoxes.UpdateTimeSlotCode;
import Validation.ValidateData;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.text.DateFormatter;

public class UpdateTimeSlot extends javax.swing.JDialog {
    private int timeSlotID=0;
    private String consultantID=null;
    private String consultantName=null;
    private String day=null;
    private String startingTime=null;
    private String endingTime=null;
    private String roomNo=null;
    private String maxAppointments=null;
    private String currentAppointments=null;
    
    public UpdateTimeSlot(java.awt.Frame parent, boolean modal, int timeSlotID, String ConsultantID, String ConsultantName, String day, String startingTime, String endingTime, String roomNo, String maxAppointments, String currentAppointments) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);

        this.timeSlotID=timeSlotID;
        this.consultantID=ConsultantID;
        this.consultantName=ConsultantName;
        this.day=day;
        this.startingTime=startingTime;
        this.endingTime=endingTime;
        this.roomNo=roomNo;
        this.maxAppointments=maxAppointments;
        this.currentAppointments=currentAppointments;
        
        Reset();
    }
    
    public void Reset(){
        AddTimeSlotCode ac=new AddTimeSlotCode();
        try{
            cmbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(ac.getRoomNoList()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        txtConsultant.setText(consultantName);
        cmbDay.setSelectedItem(day);
        txtStartingTime.setText(startingTime);
        txtEndingTime.setText(endingTime);
        cmbRoom.setSelectedItem(roomNo);
        txtMaxAppointments.setText(this.maxAppointments);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTimeSlotDetails = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        lblStartingTime = new javax.swing.JLabel();
        lblEndingTime = new javax.swing.JLabel();
        lblConsultant = new javax.swing.JLabel();
        lblRoomNo = new javax.swing.JLabel();
        cmbRoom = new javax.swing.JComboBox<>();
        lblMaxAppointments = new javax.swing.JLabel();
        txtConsultant = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtEndingTime = new javax.swing.JTextField();
        txtMaxAppointments = new javax.swing.JTextField();
        txtStartingTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Time Slot");
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

        lblEndingTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEndingTime.setText("Ending Time");
        pnlBackground.add(lblEndingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

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

        btnReset.setBackground(new java.awt.Color(0, 0, 153));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlBackground.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 270, 60));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlBackground.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 270, 60));

        txtEndingTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEndingTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtEndingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 370, 40));

        txtMaxAppointments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaxAppointments.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtMaxAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 370, 40));

        txtStartingTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStartingTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlBackground.add(txtStartingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 370, 40));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        ValidateData v=new ValidateData();
        AddTimeSlotCode ac=new AddTimeSlotCode();
        UpdateTimeSlotCode upd=new UpdateTimeSlotCode();
        
        if(v.isValidPositiveInteger(txtMaxAppointments.getText()) && !txtStartingTime.getText().equals("") && !txtEndingTime.getText().equals("")){
            try{
                if(ac.isTimeSlotPossible(consultantID, cmbDay.getSelectedItem().toString(), txtStartingTime.getText(), txtEndingTime.getText(), cmbRoom.getSelectedItem().toString())){
                    upd.updateTimeSlot(consultantID, timeSlotID, currentAppointments, cmbDay.getSelectedItem().toString(), txtStartingTime.getText(), txtEndingTime.getText(), txtMaxAppointments.getText(), cmbRoom.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(this, "TimeSlot Updated successfully");
                    btnReset.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Time slot not availabe, Please select another Room No or Time Setting !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Invalid data entered, Please recheck !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
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
            java.util.logging.Logger.getLogger(UpdateTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTimeSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateTimeSlot dialog = new UpdateTimeSlot(new javax.swing.JFrame(), true, 0, "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
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
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JTextField txtConsultant;
    private javax.swing.JTextField txtEndingTime;
    private javax.swing.JTextField txtMaxAppointments;
    private javax.swing.JTextField txtStartingTime;
    // End of variables declaration//GEN-END:variables
}

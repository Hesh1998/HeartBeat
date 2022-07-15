package DialogBoxes;

import javax.swing.JDialog;


public class AddQualification extends javax.swing.JDialog {

    public AddQualification(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        scrlQualification = new javax.swing.JScrollPane();
        txtQualification = new javax.swing.JTextArea();
        btnAddQualification = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Qualification");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtQualification.setColumns(20);
        txtQualification.setRows(5);
        scrlQualification.setViewportView(txtQualification);

        pnlBackground.add(scrlQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 610, 170));

        btnAddQualification.setBackground(new java.awt.Color(0, 0, 153));
        btnAddQualification.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddQualification.setForeground(new java.awt.Color(255, 255, 255));
        btnAddQualification.setText("Add Qualification");
        btnAddQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQualificationActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAddQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 320, 60));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQualificationActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAddQualificationActionPerformed


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
            java.util.logging.Logger.getLogger(AddQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQualification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddQualification dialog = new AddQualification(new JDialog(), true);
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
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrlQualification;
    private javax.swing.JTextArea txtQualification;
    // End of variables declaration//GEN-END:variables
}

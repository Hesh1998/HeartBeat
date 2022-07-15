// dialog box related to application informatin of the program

package DialogBoxes;


public class ApplicationInfo extends javax.swing.JDialog {


    public ApplicationInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.pack();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblInfoLine3 = new javax.swing.JLabel();
        lblInfoLine1 = new javax.swing.JLabel();
        lblInfoLine2 = new javax.swing.JLabel();
        lblTeamCyberLogo = new javax.swing.JLabel();
        lblTeamCyberSoftwareLogo = new javax.swing.JLabel();
        lblHeartBeatLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Us");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setBackground(new java.awt.Color(204, 255, 255));
        lblHeading.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(153, 153, 153));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Product Information");
        lblHeading.setOpaque(true);
        pnlBackground.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 550, 50));

        lblInfoLine3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfoLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoLine3.setText("small / medium scale Medical Center");
        pnlBackground.add(lblInfoLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 550, 40));

        lblInfoLine1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfoLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoLine1.setText("HeartBeat is a Software developed by Team Cyber Software");
        pnlBackground.add(lblInfoLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 40));

        lblInfoLine2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfoLine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoLine2.setText("to handle all the basic and complex procedures related to a");
        pnlBackground.add(lblInfoLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 550, 40));

        lblTeamCyberLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesApplicationInfo/Team Cyber min.PNG"))); // NOI18N
        lblTeamCyberLogo.setText("jLabel1");
        pnlBackground.add(lblTeamCyberLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 70));

        lblTeamCyberSoftwareLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesApplicationInfo/Team Cyber Software.png"))); // NOI18N
        pnlBackground.add(lblTeamCyberSoftwareLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        lblHeartBeatLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesApplicationInfo/HeartBeat.PNG"))); // NOI18N
        pnlBackground.add(lblHeartBeatLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(ApplicationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ApplicationInfo dialog = new ApplicationInfo(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHeartBeatLogo;
    private javax.swing.JLabel lblInfoLine1;
    private javax.swing.JLabel lblInfoLine2;
    private javax.swing.JLabel lblInfoLine3;
    private javax.swing.JLabel lblTeamCyberLogo;
    private javax.swing.JLabel lblTeamCyberSoftwareLogo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}

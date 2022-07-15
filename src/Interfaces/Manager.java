package Interfaces;

import CodingInterfaces.ManagerCode;
import DialogBoxes.*;

import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manager extends javax.swing.JFrame implements Runnable {
    private int hour, second, minute;
    private int day, month, year;
    private String timeStr, yearStr;
    private int k1=1, k2=1;
    private String staff_ID=null;
    private DefaultTableModel modelSDT, modelCDT;
    private String colsSDT[]={"Staff ID", "Name", "Staff Type"};
    private String colsCDT[]={"Consultant ID", "Consultant", "Consultant Speciality"};
    
    public Manager(String forename, String surname, String staff_ID) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.staff_ID=staff_ID;
        
        lblSelectDashboard.setVisible(true);
        lblSelectConsultants.setVisible(false);
        lblSelectOtherStaff.setVisible(false);
        lblUser.setText("  "+forename+" "+surname);

        pnlDashboard.setVisible(true);
        pnlOtherStaff.setVisible(false);
        pnlConsultants.setVisible(false);

        Thread t = new Thread(this);
        t.start();

        tblConsultantDetailsC.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        tblOtherStaffDetailsO.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        
        modelCDT=(DefaultTableModel) tblConsultantDetailsC.getModel();
        modelCDT.setDataVector(null, colsCDT);
        
        modelSDT=(DefaultTableModel) tblOtherStaffDetailsO.getModel();
        modelSDT.setDataVector(null, colsSDT);
        
        setDashboard();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlSelect = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblConsultnats = new javax.swing.JLabel();
        lblOtherStaff = new javax.swing.JLabel();
        lblSelectOtherStaff = new javax.swing.JLabel();
        lblSelectDashboard = new javax.swing.JLabel();
        lblSelectConsultants = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        pnlHeading = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        pnlOtherStaff = new javax.swing.JPanel();
        txtSearchOtherStaffO = new javax.swing.JTextField();
        lblSearchOtherStaffO = new javax.swing.JLabel();
        lblOtherStaffHeadingO = new javax.swing.JLabel();
        lblOtherStaffDetailsO = new javax.swing.JLabel();
        scrlOtherStaffDetailsO = new javax.swing.JScrollPane();
        tblOtherStaffDetailsO = new javax.swing.JTable();
        btnViewDetailsO = new javax.swing.JButton();
        btnUpdateDetailsO = new javax.swing.JButton();
        btnDeleteO = new javax.swing.JButton();
        btnAddO = new javax.swing.JButton();
        pnlConsultants = new javax.swing.JPanel();
        txtSearchConsultantC = new javax.swing.JTextField();
        lblSearchConsultantC = new javax.swing.JLabel();
        lblConsultantsHeadingC = new javax.swing.JLabel();
        scrlConsultantDetailsC = new javax.swing.JScrollPane();
        tblConsultantDetailsC = new javax.swing.JTable();
        lblConsultantDetailsC = new javax.swing.JLabel();
        btnViewDetailsC = new javax.swing.JButton();
        btnAddC = new javax.swing.JButton();
        btnDeleteC = new javax.swing.JButton();
        btnUpdateDetailsC = new javax.swing.JButton();
        pnlDashboard = new javax.swing.JPanel();
        lblDashboardHeadingD = new javax.swing.JLabel();
        pnlTotalSupStaffD = new javax.swing.JPanel();
        lblTotalSupStaffLogoD = new javax.swing.JLabel();
        lblTotalSupStaffCountD = new javax.swing.JLabel();
        lblTotalSupStaffD = new javax.swing.JLabel();
        pnlTotalManagersD = new javax.swing.JPanel();
        lblTotalManagersLogoD = new javax.swing.JLabel();
        lblTotalManagersCountD = new javax.swing.JLabel();
        lblTotalManagersD = new javax.swing.JLabel();
        pnlTotalConsultantsD = new javax.swing.JPanel();
        lblTotalConsultantsLogoD = new javax.swing.JLabel();
        lblTotalConsultantsCountD = new javax.swing.JLabel();
        lblTotalConsultantsD = new javax.swing.JLabel();
        pnlTotalReceptionistsD = new javax.swing.JPanel();
        lblTotalReceptionistsLogoD = new javax.swing.JLabel();
        lblTotalReceptionistsCountD = new javax.swing.JLabel();
        lblTotalReceptionistsD = new javax.swing.JLabel();
        pnlTotalNursesD = new javax.swing.JPanel();
        lblTotalNursesLogoD = new javax.swing.JLabel();
        lblTotalNursesCountD = new javax.swing.JLabel();
        lblTotalNursesD = new javax.swing.JLabel();
        pnlTotalPharmacistsD = new javax.swing.JPanel();
        lblTotalPharmacistsLogoD = new javax.swing.JLabel();
        lblTotalPharmacistsCountD = new javax.swing.JLabel();
        lblTotalPharmacistsD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSelect.setBackground(new java.awt.Color(0, 0, 153));
        pnlSelect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboard.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Dashboard.png"))); // NOI18N
        lblDashboard.setText("  Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        pnlSelect.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 50));

        lblConsultnats.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblConsultnats.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultnats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Consultant D.png"))); // NOI18N
        lblConsultnats.setText(" Consultants");
        lblConsultnats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultnatsMouseClicked(evt);
            }
        });
        pnlSelect.add(lblConsultnats, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 50));

        lblOtherStaff.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblOtherStaff.setForeground(new java.awt.Color(255, 255, 255));
        lblOtherStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Staff.png"))); // NOI18N
        lblOtherStaff.setText("  Other Staff");
        lblOtherStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOtherStaffMouseClicked(evt);
            }
        });
        pnlSelect.add(lblOtherStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 50));

        lblSelectOtherStaff.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectOtherStaff.setOpaque(true);
        pnlSelect.add(lblSelectOtherStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 10, 50));

        lblSelectDashboard.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectDashboard.setOpaque(true);
        pnlSelect.add(lblSelectDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 10, 50));

        lblSelectConsultants.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectConsultants.setOpaque(true);
        pnlSelect.add(lblSelectConsultants, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 50));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Logo.PNG"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        pnlSelect.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 210, 70));

        lblTime.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        pnlSelect.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 210, 50));

        lblDate.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        pnlSelect.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1000, 230, 50));

        pnlBackground.add(pnlSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 1080));

        pnlHeading.setBackground(new java.awt.Color(0, 0, 153));
        pnlHeading.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/User.png"))); // NOI18N
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });
        pnlHeading.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 280, 70));

        pnlBackground.add(pnlHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1640, 70));

        pnlOtherStaff.setBackground(new java.awt.Color(255, 255, 255));
        pnlOtherStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchOtherStaffO.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchOtherStaffO.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtSearchOtherStaffO.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchOtherStaffO.setText("Enter Staff ID");
        txtSearchOtherStaffO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchOtherStaffO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchOtherStaffOMouseClicked(evt);
            }
        });
        txtSearchOtherStaffO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchOtherStaffOActionPerformed(evt);
            }
        });
        txtSearchOtherStaffO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchOtherStaffOKeyPressed(evt);
            }
        });
        pnlOtherStaff.add(txtSearchOtherStaffO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 30, 140, 40));

        lblSearchOtherStaffO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Search.png"))); // NOI18N
        pnlOtherStaff.add(lblSearchOtherStaffO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, 40, 40));

        lblOtherStaffHeadingO.setBackground(new java.awt.Color(204, 255, 255));
        lblOtherStaffHeadingO.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblOtherStaffHeadingO.setForeground(new java.awt.Color(153, 153, 153));
        lblOtherStaffHeadingO.setText(" Manager > Other Staff");
        lblOtherStaffHeadingO.setOpaque(true);
        pnlOtherStaff.add(lblOtherStaffHeadingO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        lblOtherStaffDetailsO.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblOtherStaffDetailsO.setText("Other Staff Details");
        lblOtherStaffDetailsO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlOtherStaff.add(lblOtherStaffDetailsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, -1));

        tblOtherStaffDetailsO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblOtherStaffDetailsO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Staff ID", "Name", "Staff Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOtherStaffDetailsO.setGridColor(new java.awt.Color(255, 255, 255));
        tblOtherStaffDetailsO.setRowHeight(35);
        tblOtherStaffDetailsO.getTableHeader().setReorderingAllowed(false);
        scrlOtherStaffDetailsO.setViewportView(tblOtherStaffDetailsO);
        if (tblOtherStaffDetailsO.getColumnModel().getColumnCount() > 0) {
            tblOtherStaffDetailsO.getColumnModel().getColumn(0).setResizable(false);
            tblOtherStaffDetailsO.getColumnModel().getColumn(1).setResizable(false);
            tblOtherStaffDetailsO.getColumnModel().getColumn(1).setPreferredWidth(7);
            tblOtherStaffDetailsO.getColumnModel().getColumn(2).setResizable(false);
            tblOtherStaffDetailsO.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        pnlOtherStaff.add(scrlOtherStaffDetailsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1540, 680));

        btnViewDetailsO.setBackground(new java.awt.Color(0, 0, 153));
        btnViewDetailsO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnViewDetailsO.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetailsO.setText("View Details");
        btnViewDetailsO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsOActionPerformed(evt);
            }
        });
        pnlOtherStaff.add(btnViewDetailsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 890, 320, 60));

        btnUpdateDetailsO.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateDetailsO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateDetailsO.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDetailsO.setText("Update Details");
        btnUpdateDetailsO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsOActionPerformed(evt);
            }
        });
        pnlOtherStaff.add(btnUpdateDetailsO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 890, 320, 60));

        btnDeleteO.setBackground(new java.awt.Color(0, 0, 153));
        btnDeleteO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeleteO.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteO.setText("Delete Staff Member");
        btnDeleteO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOActionPerformed(evt);
            }
        });
        pnlOtherStaff.add(btnDeleteO, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 890, 320, 60));

        btnAddO.setBackground(new java.awt.Color(0, 0, 153));
        btnAddO.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddO.setForeground(new java.awt.Color(255, 255, 255));
        btnAddO.setText("Add New Staff Member");
        btnAddO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOActionPerformed(evt);
            }
        });
        pnlOtherStaff.add(btnAddO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 890, 320, 60));

        pnlBackground.add(pnlOtherStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlConsultants.setBackground(new java.awt.Color(255, 255, 255));
        pnlConsultants.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchConsultantC.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchConsultantC.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtSearchConsultantC.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchConsultantC.setText("Enter Consultant ID");
        txtSearchConsultantC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchConsultantC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchConsultantCMouseClicked(evt);
            }
        });
        txtSearchConsultantC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchConsultantCActionPerformed(evt);
            }
        });
        pnlConsultants.add(txtSearchConsultantC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 190, 40));

        lblSearchConsultantC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Search.png"))); // NOI18N
        pnlConsultants.add(lblSearchConsultantC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, 40, 40));

        lblConsultantsHeadingC.setBackground(new java.awt.Color(204, 255, 255));
        lblConsultantsHeadingC.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblConsultantsHeadingC.setForeground(new java.awt.Color(153, 153, 153));
        lblConsultantsHeadingC.setText(" Manager > Consultants");
        lblConsultantsHeadingC.setOpaque(true);
        pnlConsultants.add(lblConsultantsHeadingC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        tblConsultantDetailsC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblConsultantDetailsC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Dr. Amal Perera", "Neuro Surgeon"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Consultant ID", "Consultant", "Consultant Speciality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultantDetailsC.setGridColor(new java.awt.Color(255, 255, 255));
        tblConsultantDetailsC.setRowHeight(35);
        tblConsultantDetailsC.getTableHeader().setReorderingAllowed(false);
        scrlConsultantDetailsC.setViewportView(tblConsultantDetailsC);
        if (tblConsultantDetailsC.getColumnModel().getColumnCount() > 0) {
            tblConsultantDetailsC.getColumnModel().getColumn(0).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(1).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(1).setPreferredWidth(7);
            tblConsultantDetailsC.getColumnModel().getColumn(2).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        pnlConsultants.add(scrlConsultantDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1540, 680));

        lblConsultantDetailsC.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblConsultantDetailsC.setText("Consultant Details");
        lblConsultantDetailsC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlConsultants.add(lblConsultantDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, -1));

        btnViewDetailsC.setBackground(new java.awt.Color(0, 0, 153));
        btnViewDetailsC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnViewDetailsC.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetailsC.setText("View Details");
        btnViewDetailsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnViewDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 890, 320, 60));

        btnAddC.setBackground(new java.awt.Color(0, 0, 153));
        btnAddC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddC.setForeground(new java.awt.Color(255, 255, 255));
        btnAddC.setText("Add New Consultant");
        btnAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnAddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 890, 320, 60));

        btnDeleteC.setBackground(new java.awt.Color(0, 0, 153));
        btnDeleteC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeleteC.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteC.setText("Delete Consultant");
        btnDeleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnDeleteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 890, 320, 60));

        btnUpdateDetailsC.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateDetailsC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateDetailsC.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDetailsC.setText("Update Details");
        btnUpdateDetailsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnUpdateDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 890, 320, 60));

        pnlBackground.add(pnlConsultants, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboardHeadingD.setBackground(new java.awt.Color(204, 255, 255));
        lblDashboardHeadingD.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblDashboardHeadingD.setForeground(new java.awt.Color(153, 153, 153));
        lblDashboardHeadingD.setText(" Manager > Dashboard");
        lblDashboardHeadingD.setOpaque(true);
        pnlDashboard.add(lblDashboardHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        pnlTotalSupStaffD.setBackground(new java.awt.Color(255, 204, 204));
        pnlTotalSupStaffD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalSupStaffLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Supporting Staff.png"))); // NOI18N
        pnlTotalSupStaffD.add(lblTotalSupStaffLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalSupStaffCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalSupStaffD.add(lblTotalSupStaffCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, 40));

        lblTotalSupStaffD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalSupStaffD.setText("Total Number of Supporting Staff  : ");
        pnlTotalSupStaffD.add(lblTotalSupStaffD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalSupStaffD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 710, 180));

        pnlTotalManagersD.setBackground(new java.awt.Color(204, 255, 153));
        pnlTotalManagersD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalManagersLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Manager.png"))); // NOI18N
        pnlTotalManagersD.add(lblTotalManagersLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalManagersCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalManagersD.add(lblTotalManagersCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 90, 40));

        lblTotalManagersD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalManagersD.setText("Total Number of Managers  : ");
        pnlTotalManagersD.add(lblTotalManagersD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalManagersD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 710, 180));

        pnlTotalConsultantsD.setBackground(new java.awt.Color(255, 102, 102));
        pnlTotalConsultantsD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalConsultantsLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Consultant.png"))); // NOI18N
        pnlTotalConsultantsD.add(lblTotalConsultantsLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalConsultantsCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalConsultantsD.add(lblTotalConsultantsCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 90, 40));

        lblTotalConsultantsD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalConsultantsD.setText("Total Number of Consultants  : ");
        pnlTotalConsultantsD.add(lblTotalConsultantsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalConsultantsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 710, 180));

        pnlTotalReceptionistsD.setBackground(new java.awt.Color(255, 255, 204));
        pnlTotalReceptionistsD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalReceptionistsLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Receptionist.png"))); // NOI18N
        pnlTotalReceptionistsD.add(lblTotalReceptionistsLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalReceptionistsCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalReceptionistsD.add(lblTotalReceptionistsCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 80, 40));

        lblTotalReceptionistsD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalReceptionistsD.setText("Total Number of Receptionists  : ");
        pnlTotalReceptionistsD.add(lblTotalReceptionistsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalReceptionistsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 710, 180));

        pnlTotalNursesD.setBackground(new java.awt.Color(204, 204, 255));
        pnlTotalNursesD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalNursesLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Nurse.png"))); // NOI18N
        pnlTotalNursesD.add(lblTotalNursesLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalNursesCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalNursesD.add(lblTotalNursesCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 90, 40));

        lblTotalNursesD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalNursesD.setText("Total Number of Nurses  : ");
        pnlTotalNursesD.add(lblTotalNursesD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalNursesD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 710, 180));

        pnlTotalPharmacistsD.setBackground(new java.awt.Color(255, 153, 255));
        pnlTotalPharmacistsD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotalPharmacistsLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesManager/Pharmacist.png"))); // NOI18N
        pnlTotalPharmacistsD.add(lblTotalPharmacistsLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTotalPharmacistsCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTotalPharmacistsD.add(lblTotalPharmacistsCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 80, 40));

        lblTotalPharmacistsD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTotalPharmacistsD.setText("Total Number of Pharmacists  : ");
        pnlTotalPharmacistsD.add(lblTotalPharmacistsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTotalPharmacistsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 710, 180));

        pnlBackground.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        lblSelectDashboard.setVisible(true);
        lblSelectConsultants.setVisible(false);
        lblSelectOtherStaff.setVisible(false);

        pnlDashboard.setVisible(true);
        pnlOtherStaff.setVisible(false);
        pnlConsultants.setVisible(false);
        
        setDashboard();
    }//GEN-LAST:event_lblDashboardMouseClicked
    
    public void setDashboard(){
        ManagerCode mc=new ManagerCode();
        try{
           int count[]=mc.handleDashboard();
            lblTotalConsultantsCountD.setText(Integer.toString(count[0])); 
            lblTotalManagersCountD.setText(Integer.toString(count[1]));
            lblTotalNursesCountD.setText(Integer.toBinaryString(count[2]));
            lblTotalPharmacistsCountD.setText(Integer.toString(count[3]));
            lblTotalReceptionistsCountD.setText(Integer.toString(count[4]));
            lblTotalSupStaffCountD.setText(Integer.toString(count[5]));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    private void lblConsultnatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultnatsMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectConsultants.setVisible(true);
        lblSelectOtherStaff.setVisible(false);

        pnlDashboard.setVisible(false);
        pnlOtherStaff.setVisible(false);
        pnlConsultants.setVisible(true);
        
        ManagerCode mc=new ManagerCode();
        try{
            String tableConsultants[][]=mc.returnConsultantDetails();
            modelCDT.setDataVector(tableConsultants, colsCDT);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_lblConsultnatsMouseClicked

    private void lblOtherStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOtherStaffMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectConsultants.setVisible(false);
        lblSelectOtherStaff.setVisible(true);

        pnlDashboard.setVisible(false);
        pnlOtherStaff.setVisible(true);
        pnlConsultants.setVisible(false);
        
        ManagerCode mc=new ManagerCode();
        try{
            String tableOtherStaff[][]=mc.returnStaffDetails();
            modelSDT.setDataVector(tableOtherStaff, colsCDT);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_lblOtherStaffMouseClicked

    private void txtSearchConsultantCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchConsultantCMouseClicked
        if (k1 == 1) {
            txtSearchConsultantC.setText("");
        }
        k1++;
    }//GEN-LAST:event_txtSearchConsultantCMouseClicked

    private void txtSearchConsultantCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchConsultantCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchConsultantCActionPerformed

    private void btnViewDetailsCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsCActionPerformed
        new ViewConsultantDetails(this, true).setVisible(true);
    }//GEN-LAST:event_btnViewDetailsCActionPerformed

    private void btnAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCActionPerformed
        new AddConsultant(this, true).setVisible(true);
    }//GEN-LAST:event_btnAddCActionPerformed

    private void btnDeleteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCActionPerformed
        
    }//GEN-LAST:event_btnDeleteCActionPerformed

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        new StaffProfile(this, true, staff_ID).setVisible(true);
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        new ApplicationInfo(this, true).setVisible(true);
    }//GEN-LAST:event_lblLogoMouseClicked

    private void btnUpdateDetailsCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsCActionPerformed
        new UpdateConsultant(this, true).setVisible(true);
    }//GEN-LAST:event_btnUpdateDetailsCActionPerformed

    private void txtSearchOtherStaffOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchOtherStaffOMouseClicked
        if (k2 == 1) {
            txtSearchOtherStaffO.setText("");
        }
        k2++;
    }//GEN-LAST:event_txtSearchOtherStaffOMouseClicked

    private void txtSearchOtherStaffOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchOtherStaffOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchOtherStaffOActionPerformed

    private void btnViewDetailsOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsOActionPerformed
        new ViewStaffDetails(this, true).setVisible(true);
    }//GEN-LAST:event_btnViewDetailsOActionPerformed

    private void btnUpdateDetailsOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsOActionPerformed
        new UpdateStaffMember(this, true).setVisible(true);
    }//GEN-LAST:event_btnUpdateDetailsOActionPerformed

    private void btnDeleteOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOActionPerformed
        
    }//GEN-LAST:event_btnDeleteOActionPerformed

    private void btnAddOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOActionPerformed
        new AddStaffMember(this, true).setVisible(true);
    }//GEN-LAST:event_btnAddOActionPerformed

    private void txtSearchOtherStaffOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchOtherStaffOKeyPressed
        if (k2 == 1) {
            txtSearchOtherStaffO.setText("");
        }
        k2++;
    }//GEN-LAST:event_txtSearchOtherStaffOKeyPressed


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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager("Fname", "Lname", "No_ID").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddC;
    private javax.swing.JButton btnAddO;
    private javax.swing.JButton btnDeleteC;
    private javax.swing.JButton btnDeleteO;
    private javax.swing.JButton btnUpdateDetailsC;
    private javax.swing.JButton btnUpdateDetailsO;
    private javax.swing.JButton btnViewDetailsC;
    private javax.swing.JButton btnViewDetailsO;
    private javax.swing.JLabel lblConsultantDetailsC;
    private javax.swing.JLabel lblConsultantsHeadingC;
    private javax.swing.JLabel lblConsultnats;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDashboardHeadingD;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOtherStaff;
    private javax.swing.JLabel lblOtherStaffDetailsO;
    private javax.swing.JLabel lblOtherStaffHeadingO;
    private javax.swing.JLabel lblSearchConsultantC;
    private javax.swing.JLabel lblSearchOtherStaffO;
    private javax.swing.JLabel lblSelectConsultants;
    private javax.swing.JLabel lblSelectDashboard;
    private javax.swing.JLabel lblSelectOtherStaff;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotalConsultantsCountD;
    private javax.swing.JLabel lblTotalConsultantsD;
    private javax.swing.JLabel lblTotalConsultantsLogoD;
    private javax.swing.JLabel lblTotalManagersCountD;
    private javax.swing.JLabel lblTotalManagersD;
    private javax.swing.JLabel lblTotalManagersLogoD;
    private javax.swing.JLabel lblTotalNursesCountD;
    private javax.swing.JLabel lblTotalNursesD;
    private javax.swing.JLabel lblTotalNursesLogoD;
    private javax.swing.JLabel lblTotalPharmacistsCountD;
    private javax.swing.JLabel lblTotalPharmacistsD;
    private javax.swing.JLabel lblTotalPharmacistsLogoD;
    private javax.swing.JLabel lblTotalReceptionistsCountD;
    private javax.swing.JLabel lblTotalReceptionistsD;
    private javax.swing.JLabel lblTotalReceptionistsLogoD;
    private javax.swing.JLabel lblTotalSupStaffCountD;
    private javax.swing.JLabel lblTotalSupStaffD;
    private javax.swing.JLabel lblTotalSupStaffLogoD;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlConsultants;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlOtherStaff;
    private javax.swing.JPanel pnlSelect;
    private javax.swing.JPanel pnlTotalConsultantsD;
    private javax.swing.JPanel pnlTotalManagersD;
    private javax.swing.JPanel pnlTotalNursesD;
    private javax.swing.JPanel pnlTotalPharmacistsD;
    private javax.swing.JPanel pnlTotalReceptionistsD;
    private javax.swing.JPanel pnlTotalSupStaffD;
    private javax.swing.JScrollPane scrlConsultantDetailsC;
    private javax.swing.JScrollPane scrlOtherStaffDetailsO;
    private javax.swing.JTable tblConsultantDetailsC;
    private javax.swing.JTable tblOtherStaffDetailsO;
    private javax.swing.JTextField txtSearchConsultantC;
    private javax.swing.JTextField txtSearchOtherStaffO;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        while (true) {
            try {
                Calendar c = Calendar.getInstance();

                hour = c.get(Calendar.HOUR_OF_DAY);
                if (hour > 12) {
                    hour -= 12;
                }
                minute = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);

                SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
                SimpleDateFormat date = new SimpleDateFormat("E, MMM dd yyyy");

                Date dateObj = c.getTime();
                timeStr = time.format(dateObj);
                yearStr = date.format(dateObj);
                lblTime.setText(timeStr);
                lblDate.setText(yearStr);
            } catch (Exception e) {

            }
        }
    }
}

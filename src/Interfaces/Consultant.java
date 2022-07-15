package Interfaces;

import CodingInterfaces.ConsultantCode;
import DialogBoxes.*;
import Validation.ValidateData;

import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consultant extends javax.swing.JFrame implements Runnable {
    private int hour, second, minute;
    private int day, month, year;
    private String timeStr, yearStr;
    private int k1 = 1;
    private String consultant_ID=null;
    private DefaultTableModel modelTSDD, modelPHTT;
    private String colsTSDD[]={"Day", "Starting Time", "Ending Time", "Room No", "Max Appointments", "Current Appointments"};
    private String colsPHTT[]={"Prescription No", "Diagnosed Illness", "Drug Prescribed", "Dose"};
    private String details[]=null;
    
    
    public Consultant(String forename, String surname, String consultant_ID) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.consultant_ID=consultant_ID;
        
        lblSelectDashboard.setVisible(true);
        lblSelectTreatPatient.setVisible(false);
        lblUser.setText("  "+forename+" "+surname);

        pnlDashboard.setVisible(true);
        pnlTreatPatient.setVisible(false);

        Thread t = new Thread(this);
        t.start();

        tblPrescriptionHistoryT.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
        modelTSDD=(DefaultTableModel) tblTimeSlotDetailsD.getModel();
        modelTSDD.setDataVector(null, colsTSDD);
        
        tblTimeSlotDetailsD.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        modelPHTT=(DefaultTableModel) tblPrescriptionHistoryT.getModel();
        modelPHTT.setDataVector(null, colsPHTT);
        
        setDashboard();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlSelect = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblTreatPatient = new javax.swing.JLabel();
        lblSelectDashboard = new javax.swing.JLabel();
        lblSelectTreatPatient = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        pnlHeading = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        pnlTreatPatient = new javax.swing.JPanel();
        txtSearchT = new javax.swing.JTextField();
        lblSearchT = new javax.swing.JLabel();
        lblHeadingTreatPatientT = new javax.swing.JLabel();
        lblPatientCodeT = new javax.swing.JLabel();
        txtAppointmentNoT = new javax.swing.JTextField();
        lblForenameT = new javax.swing.JLabel();
        txtNameT = new javax.swing.JTextField();
        txtGenderT = new javax.swing.JTextField();
        lblGenderT = new javax.swing.JLabel();
        lblPaidT = new javax.swing.JLabel();
        lblBloodGroupT = new javax.swing.JLabel();
        txtBloodGroupT = new javax.swing.JTextField();
        lblPrescriptionHistoryT = new javax.swing.JLabel();
        btnGiveAPrescriptionT = new javax.swing.JButton();
        txtPaidT = new javax.swing.JTextField();
        lblPersonalDetailsT = new javax.swing.JLabel();
        scrlPrescriptionHistoryT = new javax.swing.JScrollPane();
        tblPrescriptionHistoryT = new javax.swing.JTable();
        lblAgeT = new javax.swing.JLabel();
        txtAgeT = new javax.swing.JTextField();
        pnlDashboard = new javax.swing.JPanel();
        lblDashboardHeadingD = new javax.swing.JLabel();
        pnlTodayAppointmentsD = new javax.swing.JPanel();
        lblTodayAppointmentsLogoD = new javax.swing.JLabel();
        lblTodayAppointmentsCountD = new javax.swing.JLabel();
        lblTodayAppointmentsD = new javax.swing.JLabel();
        pnlAllAppointmentsD = new javax.swing.JPanel();
        lblAllAppointmentsLogoD = new javax.swing.JLabel();
        lblAllAppointmentsCountD = new javax.swing.JLabel();
        lblAllAppointmentsD = new javax.swing.JLabel();
        lblTimeSlotsDetailsD = new javax.swing.JLabel();
        cmbSearchDayD = new javax.swing.JComboBox<>();
        scrlTimeSlotDetailsD = new javax.swing.JScrollPane();
        tblTimeSlotDetailsD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultant");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSelect.setBackground(new java.awt.Color(0, 0, 153));
        pnlSelect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboard.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Dashboard.png"))); // NOI18N
        lblDashboard.setText("  Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        pnlSelect.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 50));

        lblTreatPatient.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTreatPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblTreatPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Patient.png"))); // NOI18N
        lblTreatPatient.setText("  Treat Patient");
        lblTreatPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTreatPatientMouseClicked(evt);
            }
        });
        pnlSelect.add(lblTreatPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 50));

        lblSelectDashboard.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectDashboard.setOpaque(true);
        pnlSelect.add(lblSelectDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 10, 50));

        lblSelectTreatPatient.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectTreatPatient.setOpaque(true);
        pnlSelect.add(lblSelectTreatPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 50));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Logo.PNG"))); // NOI18N
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
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/User.png"))); // NOI18N
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });
        pnlHeading.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 280, 70));

        pnlBackground.add(pnlHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1640, 70));

        pnlTreatPatient.setBackground(new java.awt.Color(255, 255, 255));
        pnlTreatPatient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchT.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchT.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtSearchT.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchT.setText("Enter Appointment No");
        txtSearchT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchTMouseClicked(evt);
            }
        });
        txtSearchT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTActionPerformed(evt);
            }
        });
        pnlTreatPatient.add(txtSearchT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, 220, 40));

        lblSearchT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Search.png"))); // NOI18N
        lblSearchT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchTMouseClicked(evt);
            }
        });
        pnlTreatPatient.add(lblSearchT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, 40, 40));

        lblHeadingTreatPatientT.setBackground(new java.awt.Color(204, 255, 255));
        lblHeadingTreatPatientT.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblHeadingTreatPatientT.setForeground(new java.awt.Color(153, 153, 153));
        lblHeadingTreatPatientT.setText(" Consultant > Treat Patient");
        lblHeadingTreatPatientT.setOpaque(true);
        pnlTreatPatient.add(lblHeadingTreatPatientT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        lblPatientCodeT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPatientCodeT.setText("Appointment No");
        pnlTreatPatient.add(lblPatientCodeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtAppointmentNoT.setEditable(false);
        txtAppointmentNoT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAppointmentNoT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtAppointmentNoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 450, 40));

        lblForenameT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblForenameT.setText("Name");
        pnlTreatPatient.add(lblForenameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtNameT.setEditable(false);
        txtNameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNameT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtNameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 450, 40));

        txtGenderT.setEditable(false);
        txtGenderT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGenderT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtGenderT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, 450, 40));

        lblGenderT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGenderT.setText("Gender                    ");
        pnlTreatPatient.add(lblGenderT, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

        lblPaidT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPaidT.setText("Paid / Not Paid");
        pnlTreatPatient.add(lblPaidT, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, -1));

        lblBloodGroupT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBloodGroupT.setText("Blood Group");
        pnlTreatPatient.add(lblBloodGroupT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 160, -1));

        txtBloodGroupT.setEditable(false);
        txtBloodGroupT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBloodGroupT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtBloodGroupT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 450, 40));

        lblPrescriptionHistoryT.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblPrescriptionHistoryT.setText("Prescription History");
        lblPrescriptionHistoryT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(lblPrescriptionHistoryT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 210, -1));

        btnGiveAPrescriptionT.setBackground(new java.awt.Color(0, 0, 153));
        btnGiveAPrescriptionT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGiveAPrescriptionT.setForeground(new java.awt.Color(255, 255, 255));
        btnGiveAPrescriptionT.setText("Give a Prescription");
        btnGiveAPrescriptionT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveAPrescriptionTActionPerformed(evt);
            }
        });
        pnlTreatPatient.add(btnGiveAPrescriptionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 910, 320, 60));

        txtPaidT.setEditable(false);
        txtPaidT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPaidT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtPaidT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 290, 450, 40));

        lblPersonalDetailsT.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblPersonalDetailsT.setText("Personal Details");
        lblPersonalDetailsT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(lblPersonalDetailsT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, -1));

        tblPrescriptionHistoryT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPrescriptionHistoryT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Prescription No", "Diagnosed Illness", "Drug Prescribed", "Dose"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescriptionHistoryT.setGridColor(new java.awt.Color(255, 255, 255));
        tblPrescriptionHistoryT.setRowHeight(35);
        tblPrescriptionHistoryT.getTableHeader().setReorderingAllowed(false);
        scrlPrescriptionHistoryT.setViewportView(tblPrescriptionHistoryT);
        if (tblPrescriptionHistoryT.getColumnModel().getColumnCount() > 0) {
            tblPrescriptionHistoryT.getColumnModel().getColumn(0).setResizable(false);
            tblPrescriptionHistoryT.getColumnModel().getColumn(1).setResizable(false);
            tblPrescriptionHistoryT.getColumnModel().getColumn(2).setResizable(false);
            tblPrescriptionHistoryT.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblPrescriptionHistoryT.getColumnModel().getColumn(3).setResizable(false);
            tblPrescriptionHistoryT.getColumnModel().getColumn(3).setPreferredWidth(7);
        }

        pnlTreatPatient.add(scrlPrescriptionHistoryT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 1540, 420));

        lblAgeT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAgeT.setText("Age");
        pnlTreatPatient.add(lblAgeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, -1, -1));

        txtAgeT.setEditable(false);
        txtAgeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAgeT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlTreatPatient.add(txtAgeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 220, 450, 40));

        pnlBackground.add(pnlTreatPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboardHeadingD.setBackground(new java.awt.Color(204, 255, 255));
        lblDashboardHeadingD.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblDashboardHeadingD.setForeground(new java.awt.Color(153, 153, 153));
        lblDashboardHeadingD.setText(" Consultant > Dashboard");
        lblDashboardHeadingD.setOpaque(true);
        pnlDashboard.add(lblDashboardHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        pnlTodayAppointmentsD.setBackground(new java.awt.Color(204, 204, 255));
        pnlTodayAppointmentsD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTodayAppointmentsLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Today Appointments.png"))); // NOI18N
        pnlTodayAppointmentsD.add(lblTodayAppointmentsLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblTodayAppointmentsCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlTodayAppointmentsD.add(lblTodayAppointmentsCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 90, 40));

        lblTodayAppointmentsD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblTodayAppointmentsD.setText("Total Appointments for Today : ");
        pnlTodayAppointmentsD.add(lblTodayAppointmentsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlTodayAppointmentsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 710, 180));

        pnlAllAppointmentsD.setBackground(new java.awt.Color(255, 102, 102));
        pnlAllAppointmentsD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAllAppointmentsLogoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesConsultant/Total Appointments.png"))); // NOI18N
        pnlAllAppointmentsD.add(lblAllAppointmentsLogoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblAllAppointmentsCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlAllAppointmentsD.add(lblAllAppointmentsCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 90, 40));

        lblAllAppointmentsD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblAllAppointmentsD.setText("Total Number of Appointments : ");
        pnlAllAppointmentsD.add(lblAllAppointmentsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlAllAppointmentsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 710, 180));

        lblTimeSlotsDetailsD.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblTimeSlotsDetailsD.setText("Time Slot Details");
        lblTimeSlotsDetailsD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlDashboard.add(lblTimeSlotsDetailsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 180, -1));

        cmbSearchDayD.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cmbSearchDayD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Time Slots", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cmbSearchDayD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSearchDayDItemStateChanged(evt);
            }
        });
        pnlDashboard.add(cmbSearchDayD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 190, 40));

        tblTimeSlotDetailsD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblTimeSlotDetailsD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Day", "Starting Time", "Ending Time", "Room No", "Max Appointments", "Current Appointments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTimeSlotDetailsD.setGridColor(new java.awt.Color(255, 255, 255));
        tblTimeSlotDetailsD.setRowHeight(35);
        tblTimeSlotDetailsD.getTableHeader().setReorderingAllowed(false);
        scrlTimeSlotDetailsD.setViewportView(tblTimeSlotDetailsD);
        if (tblTimeSlotDetailsD.getColumnModel().getColumnCount() > 0) {
            tblTimeSlotDetailsD.getColumnModel().getColumn(0).setResizable(false);
            tblTimeSlotDetailsD.getColumnModel().getColumn(1).setResizable(false);
            tblTimeSlotDetailsD.getColumnModel().getColumn(2).setResizable(false);
            tblTimeSlotDetailsD.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblTimeSlotDetailsD.getColumnModel().getColumn(3).setResizable(false);
            tblTimeSlotDetailsD.getColumnModel().getColumn(3).setPreferredWidth(7);
            tblTimeSlotDetailsD.getColumnModel().getColumn(4).setResizable(false);
            tblTimeSlotDetailsD.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblTimeSlotDetailsD.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlDashboard.add(scrlTimeSlotDetailsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 1540, 250));

        pnlBackground.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        lblSelectDashboard.setVisible(true);
        lblSelectTreatPatient.setVisible(false);

        pnlDashboard.setVisible(true);
        pnlTreatPatient.setVisible(false);
        setDashboard();
    }//GEN-LAST:event_lblDashboardMouseClicked
    
    public void setDashboard(){
        ConsultantCode cd=new ConsultantCode();
        try{
            int count[]=cd.handleDashboard(yearStr, consultant_ID);
            lblAllAppointmentsCountD.setText(Integer.toString(count[0]));
            lblTodayAppointmentsCountD.setText(Integer.toString(count[1]));
            
            String tableTimeSlotDetailsD[][]=cd.DashboardGetTimeSlotDetailsTable(consultant_ID, cmbSearchDayD.getSelectedItem().toString());
            modelTSDD.setDataVector(tableTimeSlotDetailsD, colsTSDD);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
               
        cmbSearchDayD.setSelectedIndex(0);
    }
    
    private void lblTreatPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTreatPatientMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectTreatPatient.setVisible(true);

        ResetTreatPatient();
    }//GEN-LAST:event_lblTreatPatientMouseClicked

    public void ResetTreatPatient(){
        pnlDashboard.setVisible(false);
        pnlTreatPatient.setVisible(true);
        txtSearchT.setText("Enter Appointment No");
        k1=1;
        
        txtAppointmentNoT.setText("");
        txtNameT.setText("");
        txtBloodGroupT.setText("");
        txtGenderT.setText("");
        txtAgeT.setText("");
        txtPaidT.setText("");
        
        modelPHTT.setDataVector(null, colsPHTT);
    }
    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        new ConsultantProfile(this, true, consultant_ID).setVisible(true);
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        new ApplicationInfo(this, true).setVisible(true);
    }//GEN-LAST:event_lblLogoMouseClicked

    private void txtSearchTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchTMouseClicked
        if (k1 == 1) {
            txtSearchT.setText("");
        }
        k1++;
    }//GEN-LAST:event_txtSearchTMouseClicked

    private void txtSearchTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchTActionPerformed

    private void btnGiveAPrescriptionTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveAPrescriptionTActionPerformed
        int appointmentNo=Integer.parseInt(txtAppointmentNoT.getText());
        new Prescription(this, true, consultant_ID, details[6], appointmentNo).setVisible(true);
    }//GEN-LAST:event_btnGiveAPrescriptionTActionPerformed

    private void cmbSearchDayDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSearchDayDItemStateChanged
        ConsultantCode cd=new ConsultantCode();
        try{
            String tableTimeSlotDetailsD[][]=cd.DashboardGetTimeSlotDetailsTable(consultant_ID, cmbSearchDayD.getSelectedItem().toString());
            modelTSDD.setDataVector(tableTimeSlotDetailsD, colsTSDD);    
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_cmbSearchDayDItemStateChanged

    private void lblSearchTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchTMouseClicked
        ConsultantCode cd=new ConsultantCode();
        ValidateData v=new ValidateData();
        try{
            if(v.isValidAppointmentNo(txtSearchT.getText(), consultant_ID)){
                details=cd.getAppointmentDetails(txtSearchT.getText());
                txtAppointmentNoT.setText(details[0]);
                txtNameT.setText(details[1]);
                txtBloodGroupT.setText(details[2]);
                txtGenderT.setText(details[3]);
                txtAgeT.setText(details[4]);
                txtPaidT.setText(details[5]);
                
                String tablePrescriptionHistoryDetailsD[][]=cd.DashboardGetPrescriptionHistoryTable(consultant_ID, details[6]);
                modelPHTT.setDataVector(tablePrescriptionHistoryDetailsD, colsPHTT);    
                
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Appointment Number, Please enter again !", "Error", JOptionPane.ERROR_MESSAGE);
                ResetTreatPatient();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblSearchTMouseClicked


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
            java.util.logging.Logger.getLogger(Consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultant("FName", "LName", "No_ID").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiveAPrescriptionT;
    private javax.swing.JComboBox<String> cmbSearchDayD;
    private javax.swing.JLabel lblAgeT;
    private javax.swing.JLabel lblAllAppointmentsCountD;
    private javax.swing.JLabel lblAllAppointmentsD;
    private javax.swing.JLabel lblAllAppointmentsLogoD;
    private javax.swing.JLabel lblBloodGroupT;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDashboardHeadingD;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblForenameT;
    private javax.swing.JLabel lblGenderT;
    private javax.swing.JLabel lblHeadingTreatPatientT;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPaidT;
    private javax.swing.JLabel lblPatientCodeT;
    private javax.swing.JLabel lblPersonalDetailsT;
    private javax.swing.JLabel lblPrescriptionHistoryT;
    private javax.swing.JLabel lblSearchT;
    private javax.swing.JLabel lblSelectDashboard;
    private javax.swing.JLabel lblSelectTreatPatient;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeSlotsDetailsD;
    private javax.swing.JLabel lblTodayAppointmentsCountD;
    private javax.swing.JLabel lblTodayAppointmentsD;
    private javax.swing.JLabel lblTodayAppointmentsLogoD;
    private javax.swing.JLabel lblTreatPatient;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlAllAppointmentsD;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlSelect;
    private javax.swing.JPanel pnlTodayAppointmentsD;
    private javax.swing.JPanel pnlTreatPatient;
    private javax.swing.JScrollPane scrlPrescriptionHistoryT;
    private javax.swing.JScrollPane scrlTimeSlotDetailsD;
    private javax.swing.JTable tblPrescriptionHistoryT;
    private javax.swing.JTable tblTimeSlotDetailsD;
    private javax.swing.JTextField txtAgeT;
    private javax.swing.JTextField txtAppointmentNoT;
    private javax.swing.JTextField txtBloodGroupT;
    private javax.swing.JTextField txtGenderT;
    private javax.swing.JTextField txtNameT;
    private javax.swing.JTextField txtPaidT;
    private javax.swing.JTextField txtSearchT;
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

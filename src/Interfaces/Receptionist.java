// The Receptionist interface of the application

package Interfaces;

import CodingInterfaces.CommonOperations;
import CodingInterfaces.ReceptionistCode;
import DialogBoxes.*;
import Print.PrintSupport;
import Validation.ValidateData;
import com.mysql.cj.xdevapi.Schema;
import java.awt.Color;
import java.awt.Component;

import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Receptionist extends javax.swing.JFrame implements Runnable {
    // variables used to handle and display date and time
    private int hour, second, minute;
    private int day, month, year;
    private String timeStr, yearStr;
    
    // other variables used in the class
    private int k1 = 1, k2 = 1, k3 = 1, k4 = 1, k5 = 1;
    private String staff_ID=null;
    private boolean appointmentPrintStatus=false;
    private int regTimeSlotID=0;
    private String consultantIDList[]=null;
    private String isValidConsultantID[]=null;
    private DefaultTableModel modelADT, modelCDT, modelTDT;
    private String colsADT[]={"Appointment No", "Consultant", "Speciality", "Date", "Time", "Room No", "Paid"};
    private String colsCDT[]={"CON-ID", "Consultant", "Consultant Speciality", "Email", "Charge per Patient", "Mobile No", "LAN No"};
    private String colsTDT[]={"Day", "Starting Time", "Ending Time", "Consultant", "Room No", "Max Appointments", "Current Appointments"};
    
    public Receptionist(String forename, String surname, String staff_ID) {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); // maximizes the GUI to the whole screen
        
        this.staff_ID=staff_ID;
          
        // displays all related components and stats in the dashboard
        displayDashboard();

        // displays logged in user name in the dashboard
        lblUser.setText("  "+forename+" "+surname);
        
        // related to displaying date and time
        Thread t = new Thread(this);
        t.start();
        
        // setting properties for all the tables and date chooser fields used in the GUI
        tblAppointmentDetailsU.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
        modelADT=(DefaultTableModel) tblAppointmentDetailsU.getModel();
        modelADT.setDataVector(null, colsADT);
        
        tblConsultantDetailsC.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        modelCDT=(DefaultTableModel) tblConsultantDetailsC.getModel();
        modelCDT.setDataVector(null, colsCDT);
        
        tblTimeSlotDetailsC.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        modelTDT=(DefaultTableModel) tblTimeSlotDetailsC.getModel();
        modelTDT.setDataVector(null, colsTDT);
        
        dchDateOfBirthR.getDateEditor().setEnabled(false);
        dchDateOfBirthU.getDateEditor().setEnabled(false);   
    }
    
    // displays all related components and stats in the dashboard
    public void displayDashboard(){
        lblSelectDashboard.setVisible(true);
        lblSelectRegPatient.setVisible(false);
        lblSelectUpdPatient.setVisible(false);
        lblSelectTimeSlot.setVisible(false);
        
        pnlDashboard.setVisible(true);
        pnlRegisterPatient.setVisible(false);
        pnlUpdatePatient.setVisible(false);
        pnlConsultants.setVisible(false);
        
        // to display stats in dashboard
        ReceptionistCode rc=new ReceptionistCode();
        try{
            int count[]=rc.handleDashboard();
            lblAllPatientCountD.setText(Integer.toString(count[0]));
            lblAllRoomCountD.setText(Integer.toString(count[1]));
            lblAllConsultantCountD.setText(Integer.toString(count[2]));
            lblAllAppointmentCountD.setText(Integer.toString(count[3]));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlSelect = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblRegPatient = new javax.swing.JLabel();
        lblUpdPatient = new javax.swing.JLabel();
        lblConsultantAndTS = new javax.swing.JLabel();
        lblSelectTimeSlot = new javax.swing.JLabel();
        lblSelectDashboard = new javax.swing.JLabel();
        lblSelectRegPatient = new javax.swing.JLabel();
        lblSelectUpdPatient = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        pnlHeading = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        pnlConsultants = new javax.swing.JPanel();
        txtSearchConsultantC = new javax.swing.JTextField();
        lblSearchConsultantC = new javax.swing.JLabel();
        lblConsultantsHeadingC = new javax.swing.JLabel();
        scrlConsultantDetailsC1 = new javax.swing.JScrollPane();
        tblTimeSlotDetailsC = new javax.swing.JTable();
        scrlConsultantDetailsC = new javax.swing.JScrollPane();
        tblConsultantDetailsC = new javax.swing.JTable();
        lblTimeSlotsDetailsC = new javax.swing.JLabel();
        lblConsultantDetailsC1 = new javax.swing.JLabel();
        cmbSearchDayC = new javax.swing.JComboBox<>();
        btnAddTimeSlotC = new javax.swing.JButton();
        btnUpdateTimeSlot = new javax.swing.JButton();
        btnDeleteTimeSlotC = new javax.swing.JButton();
        pnlUpdatePatient = new javax.swing.JPanel();
        txtSearchU = new javax.swing.JTextField();
        lblSearchU = new javax.swing.JLabel();
        lblUpdatePatientHeadingU = new javax.swing.JLabel();
        lblAppointmentDetailsU = new javax.swing.JLabel();
        lblPatientCodeU = new javax.swing.JLabel();
        txtPatientCodeU = new javax.swing.JTextField();
        lblForenameU = new javax.swing.JLabel();
        txtForenameU = new javax.swing.JTextField();
        lblSurnameU = new javax.swing.JLabel();
        txtSurnameU = new javax.swing.JTextField();
        lblGenderU = new javax.swing.JLabel();
        cmbGenderU = new javax.swing.JComboBox<>();
        lblDateOfBirthU = new javax.swing.JLabel();
        lblBloodGroupU = new javax.swing.JLabel();
        lblNICU = new javax.swing.JLabel();
        txtNICU = new javax.swing.JTextField();
        lblEmailU = new javax.swing.JLabel();
        txtEmailU = new javax.swing.JTextField();
        lblMobileNoU = new javax.swing.JLabel();
        txtMobileNoU = new javax.swing.JTextField();
        lblLANNoU = new javax.swing.JLabel();
        txtLANNoU = new javax.swing.JTextField();
        lblAddressU = new javax.swing.JLabel();
        txtAddressNumberU = new javax.swing.JTextField();
        txtAddressStreetU = new javax.swing.JTextField();
        txtAddressCityU = new javax.swing.JTextField();
        lblPersonalDetailsU = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointmentDetailsU = new javax.swing.JTable();
        chkNICU = new javax.swing.JCheckBox();
        chkAddressU = new javax.swing.JCheckBox();
        chkSurnameU = new javax.swing.JCheckBox();
        chkGenderU = new javax.swing.JCheckBox();
        chkDateOfBirthU = new javax.swing.JCheckBox();
        chkBloodGroupU = new javax.swing.JCheckBox();
        chkForenameU = new javax.swing.JCheckBox();
        chkEmailU = new javax.swing.JCheckBox();
        chkMobileNoU = new javax.swing.JCheckBox();
        chkLANNoU = new javax.swing.JCheckBox();
        btnUpateU = new javax.swing.JButton();
        btnDeleteAppointmentU = new javax.swing.JButton();
        btnResetU = new javax.swing.JButton();
        btnAddAppointmentU = new javax.swing.JButton();
        btnUpdateAppointmentU = new javax.swing.JButton();
        dchDateOfBirthU = new com.toedter.calendar.JDateChooser();
        cmbBloodGroupU = new javax.swing.JComboBox<>();
        pnlRegisterPatient = new javax.swing.JPanel();
        lblRegisterPatientHeadingR = new javax.swing.JLabel();
        lblPatientCodeR = new javax.swing.JLabel();
        txtPatientCodeR = new javax.swing.JTextField();
        lblForenameR = new javax.swing.JLabel();
        txtForenameR = new javax.swing.JTextField();
        lblSurnameR = new javax.swing.JLabel();
        txtSurnameR = new javax.swing.JTextField();
        lblDateOfBirthR = new javax.swing.JLabel();
        lblGenderR = new javax.swing.JLabel();
        lblBloodGroupR = new javax.swing.JLabel();
        lblNICR = new javax.swing.JLabel();
        txtNICR = new javax.swing.JTextField();
        lblEmailR = new javax.swing.JLabel();
        txtEmailR = new javax.swing.JTextField();
        lblMobileNoR = new javax.swing.JLabel();
        txtMobileNoR = new javax.swing.JTextField();
        lblAppointmentDetailsR = new javax.swing.JLabel();
        cmbBloodGroupR = new javax.swing.JComboBox<>();
        lblLANNoR = new javax.swing.JLabel();
        txtLANNoR = new javax.swing.JTextField();
        lblAddressR = new javax.swing.JLabel();
        txtAddressCityR = new javax.swing.JTextField();
        txtAddressNumberR = new javax.swing.JTextField();
        txtAddressStreetR = new javax.swing.JTextField();
        lblPersonalDetailsR = new javax.swing.JLabel();
        lblAppointmentNoR = new javax.swing.JLabel();
        lblConsultantSpecialityR = new javax.swing.JLabel();
        cmbConsultantSpecialityR = new javax.swing.JComboBox<>();
        lblConsultantR = new javax.swing.JLabel();
        cmbConsultantR = new javax.swing.JComboBox<>();
        lblDateAndTimeR = new javax.swing.JLabel();
        cmbDateAndTimeR = new javax.swing.JComboBox<>();
        btnPrintR = new javax.swing.JButton();
        btnClearR = new javax.swing.JButton();
        scrlAppointmentReceiptR = new javax.swing.JScrollPane();
        txtArAppointmentReceiptR = new javax.swing.JTextArea();
        btnRegisterR = new javax.swing.JButton();
        dchDateOfBirthR = new com.toedter.calendar.JDateChooser();
        cmbGenderR = new javax.swing.JComboBox<>();
        txtAppointmentNoR = new javax.swing.JTextField();
        chkPaymentDone = new javax.swing.JCheckBox();
        pnlDashboard = new javax.swing.JPanel();
        lblDashboardHeadingD = new javax.swing.JLabel();
        pnlRoomD = new javax.swing.JPanel();
        lblRoomD = new javax.swing.JLabel();
        lblAllRoomCountD = new javax.swing.JLabel();
        lblAllRoomHeadingD = new javax.swing.JLabel();
        pnlPatientD = new javax.swing.JPanel();
        lblPatientD = new javax.swing.JLabel();
        lblAllPatientCountD = new javax.swing.JLabel();
        lblPatientHeadingD = new javax.swing.JLabel();
        pnlAppointmentD = new javax.swing.JPanel();
        lblAppointmentD = new javax.swing.JLabel();
        lblAllAppointmentCountD = new javax.swing.JLabel();
        lblAppointmentHeadingD = new javax.swing.JLabel();
        pnlConsultantD = new javax.swing.JPanel();
        lblConsultantD = new javax.swing.JLabel();
        lblAllConsultantCountD = new javax.swing.JLabel();
        lblConsultantHeadingD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSelect.setBackground(new java.awt.Color(0, 0, 153));
        pnlSelect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboard.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Dashboard.png"))); // NOI18N
        lblDashboard.setText("  Dashboard");
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        pnlSelect.add(lblDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 50));

        lblRegPatient.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblRegPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblRegPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Register.png"))); // NOI18N
        lblRegPatient.setText("  Register Patient");
        lblRegPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegPatientMouseClicked(evt);
            }
        });
        pnlSelect.add(lblRegPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 50));

        lblUpdPatient.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblUpdPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Update.png"))); // NOI18N
        lblUpdPatient.setText("  Update Patient");
        lblUpdPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdPatientMouseClicked(evt);
            }
        });
        pnlSelect.add(lblUpdPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 50));

        lblConsultantAndTS.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblConsultantAndTS.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultantAndTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Consultant D.png"))); // NOI18N
        lblConsultantAndTS.setText(" Consultants");
        lblConsultantAndTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultantAndTSMouseClicked(evt);
            }
        });
        pnlSelect.add(lblConsultantAndTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 50));

        lblSelectTimeSlot.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectTimeSlot.setOpaque(true);
        pnlSelect.add(lblSelectTimeSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 10, 50));

        lblSelectDashboard.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectDashboard.setOpaque(true);
        pnlSelect.add(lblSelectDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 10, 50));

        lblSelectRegPatient.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectRegPatient.setOpaque(true);
        pnlSelect.add(lblSelectRegPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 10, 50));

        lblSelectUpdPatient.setBackground(new java.awt.Color(51, 51, 255));
        lblSelectUpdPatient.setOpaque(true);
        pnlSelect.add(lblSelectUpdPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 10, 50));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Logo.PNG"))); // NOI18N
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
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/User.png"))); // NOI18N
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });
        pnlHeading.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 280, 70));

        pnlBackground.add(pnlHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1640, 70));

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
        pnlConsultants.add(txtSearchConsultantC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 200, 40));

        lblSearchConsultantC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Search.png"))); // NOI18N
        lblSearchConsultantC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchConsultantCMouseClicked(evt);
            }
        });
        pnlConsultants.add(lblSearchConsultantC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, 40, 40));

        lblConsultantsHeadingC.setBackground(new java.awt.Color(204, 255, 255));
        lblConsultantsHeadingC.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblConsultantsHeadingC.setForeground(new java.awt.Color(153, 153, 153));
        lblConsultantsHeadingC.setText(" Receptionist > Consultants and Time Slots");
        lblConsultantsHeadingC.setOpaque(true);
        pnlConsultants.add(lblConsultantsHeadingC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        tblTimeSlotDetailsC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblTimeSlotDetailsC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "", null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Day", "Starting Time", "Ending Time", "Consultant", "Room No", "Max Appointments", "Current Appointments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTimeSlotDetailsC.setGridColor(new java.awt.Color(255, 255, 255));
        tblTimeSlotDetailsC.setRowHeight(35);
        tblTimeSlotDetailsC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTimeSlotDetailsC.getTableHeader().setReorderingAllowed(false);
        scrlConsultantDetailsC1.setViewportView(tblTimeSlotDetailsC);
        if (tblTimeSlotDetailsC.getColumnModel().getColumnCount() > 0) {
            tblTimeSlotDetailsC.getColumnModel().getColumn(0).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(0).setPreferredWidth(7);
            tblTimeSlotDetailsC.getColumnModel().getColumn(1).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblTimeSlotDetailsC.getColumnModel().getColumn(2).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblTimeSlotDetailsC.getColumnModel().getColumn(3).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(4).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(4).setPreferredWidth(5);
            tblTimeSlotDetailsC.getColumnModel().getColumn(5).setResizable(false);
            tblTimeSlotDetailsC.getColumnModel().getColumn(6).setResizable(false);
        }

        pnlConsultants.add(scrlConsultantDetailsC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 1540, 300));

        tblConsultantDetailsC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblConsultantDetailsC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CON-ID", "Consultant", "Consultant Speciality", "Email", "Charge per patient", "Mobile No", "LAN No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tblConsultantDetailsC.getColumnModel().getColumn(3).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblConsultantDetailsC.getColumnModel().getColumn(4).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(5).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(5).setPreferredWidth(20);
            tblConsultantDetailsC.getColumnModel().getColumn(6).setResizable(false);
            tblConsultantDetailsC.getColumnModel().getColumn(6).setPreferredWidth(5);
        }

        pnlConsultants.add(scrlConsultantDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1540, 270));

        lblTimeSlotsDetailsC.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblTimeSlotsDetailsC.setText("Time Slot Details");
        lblTimeSlotsDetailsC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlConsultants.add(lblTimeSlotsDetailsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 180, -1));

        lblConsultantDetailsC1.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblConsultantDetailsC1.setText("Consultant Details");
        lblConsultantDetailsC1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlConsultants.add(lblConsultantDetailsC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, -1));

        cmbSearchDayC.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cmbSearchDayC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Timeslots", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        cmbSearchDayC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSearchDayCItemStateChanged(evt);
            }
        });
        pnlConsultants.add(cmbSearchDayC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 40));

        btnAddTimeSlotC.setBackground(new java.awt.Color(0, 0, 153));
        btnAddTimeSlotC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddTimeSlotC.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTimeSlotC.setText("Add New Time Slot");
        btnAddTimeSlotC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTimeSlotCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnAddTimeSlotC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 910, 320, 60));

        btnUpdateTimeSlot.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateTimeSlot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateTimeSlot.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateTimeSlot.setText("Update Time Slot");
        btnUpdateTimeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTimeSlotActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnUpdateTimeSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 910, 320, 60));

        btnDeleteTimeSlotC.setBackground(new java.awt.Color(0, 0, 153));
        btnDeleteTimeSlotC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeleteTimeSlotC.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTimeSlotC.setText("Delete Time Slot");
        btnDeleteTimeSlotC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTimeSlotCActionPerformed(evt);
            }
        });
        pnlConsultants.add(btnDeleteTimeSlotC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 910, 320, 60));

        pnlBackground.add(pnlConsultants, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlUpdatePatient.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpdatePatient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchU.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchU.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtSearchU.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchU.setText("Enter Patient Code");
        txtSearchU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchUMouseClicked(evt);
            }
        });
        txtSearchU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(txtSearchU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 210, 40));

        lblSearchU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Search.png"))); // NOI18N
        lblSearchU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSearchUMouseEntered(evt);
            }
        });
        pnlUpdatePatient.add(lblSearchU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 30, 40, 40));

        lblUpdatePatientHeadingU.setBackground(new java.awt.Color(204, 255, 255));
        lblUpdatePatientHeadingU.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblUpdatePatientHeadingU.setForeground(new java.awt.Color(153, 153, 153));
        lblUpdatePatientHeadingU.setText(" Receptionist > Update Patient");
        lblUpdatePatientHeadingU.setOpaque(true);
        pnlUpdatePatient.add(lblUpdatePatientHeadingU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        lblAppointmentDetailsU.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblAppointmentDetailsU.setText("Appointment Details");
        lblAppointmentDetailsU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(lblAppointmentDetailsU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 220, -1));

        lblPatientCodeU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPatientCodeU.setText("Generated Patient Code  ");
        pnlUpdatePatient.add(lblPatientCodeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtPatientCodeU.setEditable(false);
        txtPatientCodeU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPatientCodeU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtPatientCodeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 330, 40));

        lblForenameU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblForenameU.setText("Edit Forename                ");
        pnlUpdatePatient.add(lblForenameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtForenameU.setEditable(false);
        txtForenameU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtForenameU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtForenameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 330, 40));

        lblSurnameU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSurnameU.setText("Edit Surname                 ");
        pnlUpdatePatient.add(lblSurnameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtSurnameU.setEditable(false);
        txtSurnameU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSurnameU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtSurnameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 330, 40));

        lblGenderU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGenderU.setText("Edit Gender                    ");
        pnlUpdatePatient.add(lblGenderU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        cmbGenderU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbGenderU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbGenderU.setEnabled(false);
        pnlUpdatePatient.add(cmbGenderU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 330, 40));

        lblDateOfBirthU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateOfBirthU.setText("Edit Date of Birth          ");
        pnlUpdatePatient.add(lblDateOfBirthU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        lblBloodGroupU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBloodGroupU.setText("Edit Blood Group           ");
        pnlUpdatePatient.add(lblBloodGroupU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        lblNICU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNICU.setText("Edit NIC                       ");
        pnlUpdatePatient.add(lblNICU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        txtNICU.setEditable(false);
        txtNICU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNICU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtNICU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 330, 40));

        lblEmailU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmailU.setText("Edit Email                    ");
        pnlUpdatePatient.add(lblEmailU, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, -1, -1));

        txtEmailU.setEditable(false);
        txtEmailU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmailU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtEmailU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 330, 40));

        lblMobileNoU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMobileNoU.setText("Edit Mobile-No");
        pnlUpdatePatient.add(lblMobileNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 290, -1));

        txtMobileNoU.setEditable(false);
        txtMobileNoU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMobileNoU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtMobileNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 220, 330, 40));

        lblLANNoU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLANNoU.setText("Edit LAN-No");
        pnlUpdatePatient.add(lblLANNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 290, -1));

        txtLANNoU.setEditable(false);
        txtLANNoU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLANNoU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(txtLANNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 290, 330, 40));

        lblAddressU.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddressU.setText("Edit Address");
        pnlUpdatePatient.add(lblAddressU, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 290, -1));

        txtAddressNumberU.setEditable(false);
        txtAddressNumberU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumberU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumberU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressNumberUMouseClicked(evt);
            }
        });
        txtAddressNumberU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressNumberUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(txtAddressNumberU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 360, 330, 40));

        txtAddressStreetU.setEditable(false);
        txtAddressStreetU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressStreetU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressStreetU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressStreetUMouseClicked(evt);
            }
        });
        pnlUpdatePatient.add(txtAddressStreetU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 400, 330, 40));

        txtAddressCityU.setEditable(false);
        txtAddressCityU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCityU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCityU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressCityUMouseClicked(evt);
            }
        });
        txtAddressCityU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCityUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(txtAddressCityU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 440, 330, 40));

        lblPersonalDetailsU.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblPersonalDetailsU.setText("Personal Details");
        lblPersonalDetailsU.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlUpdatePatient.add(lblPersonalDetailsU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, -1));

        tblAppointmentDetailsU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblAppointmentDetailsU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment No", "Consultant Speciality", "Consultant", "Date", "Time", "Room No", "Paid (Yes / No)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppointmentDetailsU.setGridColor(new java.awt.Color(255, 255, 255));
        tblAppointmentDetailsU.setRowHeight(35);
        tblAppointmentDetailsU.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAppointmentDetailsU);
        if (tblAppointmentDetailsU.getColumnModel().getColumnCount() > 0) {
            tblAppointmentDetailsU.getColumnModel().getColumn(0).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(1).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblAppointmentDetailsU.getColumnModel().getColumn(2).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(2).setPreferredWidth(7);
            tblAppointmentDetailsU.getColumnModel().getColumn(3).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblAppointmentDetailsU.getColumnModel().getColumn(4).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(5).setResizable(false);
            tblAppointmentDetailsU.getColumnModel().getColumn(5).setPreferredWidth(20);
            tblAppointmentDetailsU.getColumnModel().getColumn(6).setResizable(false);
        }

        pnlUpdatePatient.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 1540, 220));

        chkNICU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkNICU.setText("Edit");
        chkNICU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNICUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkNICU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, -1, -1));

        chkAddressU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkAddressU.setText("Edit");
        chkAddressU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAddressUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkAddressU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 370, -1, -1));

        chkSurnameU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkSurnameU.setText("Edit");
        chkSurnameU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSurnameUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkSurnameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        chkGenderU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkGenderU.setText("Edit");
        chkGenderU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGenderUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkGenderU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        chkDateOfBirthU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDateOfBirthU.setText("Edit");
        chkDateOfBirthU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDateOfBirthUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkDateOfBirthU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        chkBloodGroupU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkBloodGroupU.setText("Edit");
        chkBloodGroupU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBloodGroupUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkBloodGroupU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        chkForenameU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkForenameU.setText("Edit");
        chkForenameU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkForenameUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkForenameU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        chkEmailU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkEmailU.setText("Edit");
        chkEmailU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmailUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkEmailU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 160, -1, -1));

        chkMobileNoU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkMobileNoU.setText("Edit");
        chkMobileNoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMobileNoUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkMobileNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 230, -1, -1));

        chkLANNoU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkLANNoU.setText("Edit");
        chkLANNoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLANNoUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(chkLANNoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 300, -1, -1));

        btnUpateU.setBackground(new java.awt.Color(0, 0, 153));
        btnUpateU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpateU.setForeground(new java.awt.Color(255, 255, 255));
        btnUpateU.setText("Update");
        btnUpateU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpateUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(btnUpateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 560, 320, 50));

        btnDeleteAppointmentU.setBackground(new java.awt.Color(0, 0, 153));
        btnDeleteAppointmentU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDeleteAppointmentU.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAppointmentU.setText("Delete Appointment");
        btnDeleteAppointmentU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAppointmentUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(btnDeleteAppointmentU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 920, 320, 50));

        btnResetU.setBackground(new java.awt.Color(0, 0, 153));
        btnResetU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnResetU.setForeground(new java.awt.Color(255, 255, 255));
        btnResetU.setText("Reset");
        btnResetU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(btnResetU, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 320, 50));

        btnAddAppointmentU.setBackground(new java.awt.Color(0, 0, 153));
        btnAddAppointmentU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddAppointmentU.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAppointmentU.setText("Add Appointment");
        btnAddAppointmentU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(btnAddAppointmentU, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 920, 320, 50));

        btnUpdateAppointmentU.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateAppointmentU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateAppointmentU.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAppointmentU.setText("Update Appointment");
        btnUpdateAppointmentU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentUActionPerformed(evt);
            }
        });
        pnlUpdatePatient.add(btnUpdateAppointmentU, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 920, 320, 50));

        dchDateOfBirthU.setEnabled(false);
        dchDateOfBirthU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnlUpdatePatient.add(dchDateOfBirthU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 330, 40));

        cmbBloodGroupU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbBloodGroupU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        cmbBloodGroupU.setEnabled(false);
        pnlUpdatePatient.add(cmbBloodGroupU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 330, 40));

        pnlBackground.add(pnlUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlRegisterPatient.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegisterPatient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegisterPatientHeadingR.setBackground(new java.awt.Color(204, 255, 255));
        lblRegisterPatientHeadingR.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblRegisterPatientHeadingR.setForeground(new java.awt.Color(153, 153, 153));
        lblRegisterPatientHeadingR.setText(" Receptionist > Register Patient");
        lblRegisterPatientHeadingR.setOpaque(true);
        pnlRegisterPatient.add(lblRegisterPatientHeadingR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        lblPatientCodeR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPatientCodeR.setText("Generated Patient Code  ");
        pnlRegisterPatient.add(lblPatientCodeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtPatientCodeR.setEditable(false);
        txtPatientCodeR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPatientCodeR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtPatientCodeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 370, 40));

        lblForenameR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblForenameR.setText("Enter Forename                ");
        pnlRegisterPatient.add(lblForenameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtForenameR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtForenameR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtForenameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 370, 40));

        lblSurnameR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSurnameR.setText("Enter Surname                 ");
        pnlRegisterPatient.add(lblSurnameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtSurnameR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSurnameR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtSurnameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 370, 40));

        lblDateOfBirthR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateOfBirthR.setText("Enter Date of Birth          ");
        pnlRegisterPatient.add(lblDateOfBirthR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        lblGenderR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblGenderR.setText("Enter Gender                    ");
        pnlRegisterPatient.add(lblGenderR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        lblBloodGroupR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBloodGroupR.setText("Enter Blood Group           ");
        pnlRegisterPatient.add(lblBloodGroupR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        lblNICR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNICR.setText("Enter NIC                       ");
        pnlRegisterPatient.add(lblNICR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        txtNICR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNICR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtNICR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 370, 40));

        lblEmailR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmailR.setText("Enter Email                    ");
        pnlRegisterPatient.add(lblEmailR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        txtEmailR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmailR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtEmailR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 370, 40));

        lblMobileNoR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMobileNoR.setText("Enter Mobile-No");
        pnlRegisterPatient.add(lblMobileNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 290, -1));

        txtMobileNoR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMobileNoR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtMobileNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 710, 370, 40));

        lblAppointmentDetailsR.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblAppointmentDetailsR.setText("Appointment Details");
        lblAppointmentDetailsR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(lblAppointmentDetailsR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 220, -1));

        cmbBloodGroupR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbBloodGroupR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        pnlRegisterPatient.add(cmbBloodGroupR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 370, 40));

        lblLANNoR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLANNoR.setText("Enter LAN-No");
        pnlRegisterPatient.add(lblLANNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 790, 290, -1));

        txtLANNoR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLANNoR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtLANNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 780, 370, 40));

        lblAddressR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAddressR.setText("Enter Address");
        pnlRegisterPatient.add(lblAddressR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 860, 290, -1));

        txtAddressCityR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressCityR.setForeground(new java.awt.Color(153, 153, 153));
        txtAddressCityR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressCityR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressCityRMouseClicked(evt);
            }
        });
        pnlRegisterPatient.add(txtAddressCityR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 930, 370, 40));

        txtAddressNumberR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressNumberR.setForeground(new java.awt.Color(153, 153, 153));
        txtAddressNumberR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressNumberR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressNumberRMouseClicked(evt);
            }
        });
        pnlRegisterPatient.add(txtAddressNumberR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 850, 370, 40));

        txtAddressStreetR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressStreetR.setForeground(new java.awt.Color(153, 153, 153));
        txtAddressStreetR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddressStreetR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressStreetRMouseClicked(evt);
            }
        });
        pnlRegisterPatient.add(txtAddressStreetR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 890, 370, 40));

        lblPersonalDetailsR.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        lblPersonalDetailsR.setText("Personal Details");
        lblPersonalDetailsR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(lblPersonalDetailsR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, -1));

        lblAppointmentNoR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAppointmentNoR.setText("Generated Appointment No  ");
        pnlRegisterPatient.add(lblAppointmentNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, -1, -1));

        lblConsultantSpecialityR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultantSpecialityR.setText("Select Consultant Speciality");
        pnlRegisterPatient.add(lblConsultantSpecialityR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, -1));

        cmbConsultantSpecialityR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbConsultantSpecialityR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultantSpecialityRItemStateChanged(evt);
            }
        });
        pnlRegisterPatient.add(cmbConsultantSpecialityR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 220, 370, 40));

        lblConsultantR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblConsultantR.setText("Select Consultant");
        pnlRegisterPatient.add(lblConsultantR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, -1, -1));

        cmbConsultantR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbConsultantR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultantRItemStateChanged(evt);
            }
        });
        pnlRegisterPatient.add(cmbConsultantR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 290, 370, 40));

        lblDateAndTimeR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDateAndTimeR.setText("Select Date and Time");
        pnlRegisterPatient.add(lblDateAndTimeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        cmbDateAndTimeR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbDateAndTimeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDateAndTimeRActionPerformed(evt);
            }
        });
        pnlRegisterPatient.add(cmbDateAndTimeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 730, 40));

        btnPrintR.setBackground(new java.awt.Color(0, 0, 153));
        btnPrintR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPrintR.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintR.setText("Print Receipt");
        btnPrintR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintRActionPerformed(evt);
            }
        });
        pnlRegisterPatient.add(btnPrintR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 910, 320, 60));

        btnClearR.setBackground(new java.awt.Color(0, 0, 153));
        btnClearR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnClearR.setForeground(new java.awt.Color(255, 255, 255));
        btnClearR.setText("Clear");
        btnClearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRActionPerformed(evt);
            }
        });
        pnlRegisterPatient.add(btnClearR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, 220, 60));

        txtArAppointmentReceiptR.setEditable(false);
        txtArAppointmentReceiptR.setColumns(20);
        txtArAppointmentReceiptR.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtArAppointmentReceiptR.setRows(5);
        scrlAppointmentReceiptR.setViewportView(txtArAppointmentReceiptR);

        pnlRegisterPatient.add(scrlAppointmentReceiptR, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 730, 300));

        btnRegisterR.setBackground(new java.awt.Color(0, 0, 153));
        btnRegisterR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegisterR.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterR.setText("Register");
        btnRegisterR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterRActionPerformed(evt);
            }
        });
        pnlRegisterPatient.add(btnRegisterR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 500, 220, 60));

        dchDateOfBirthR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnlRegisterPatient.add(dchDateOfBirthR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 370, 40));

        cmbGenderR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmbGenderR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        pnlRegisterPatient.add(cmbGenderR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 370, 40));

        txtAppointmentNoR.setEditable(false);
        txtAppointmentNoR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAppointmentNoR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRegisterPatient.add(txtAppointmentNoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 370, 40));

        chkPaymentDone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chkPaymentDone.setText("Payment Done");
        chkPaymentDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPaymentDoneActionPerformed(evt);
            }
        });
        pnlRegisterPatient.add(chkPaymentDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, 60));

        pnlBackground.add(pnlRegisterPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        pnlDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashboardHeadingD.setBackground(new java.awt.Color(204, 255, 255));
        lblDashboardHeadingD.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblDashboardHeadingD.setForeground(new java.awt.Color(153, 153, 153));
        lblDashboardHeadingD.setText(" Receptionist > Dashboard");
        lblDashboardHeadingD.setOpaque(true);
        pnlDashboard.add(lblDashboardHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1540, 50));

        pnlRoomD.setBackground(new java.awt.Color(204, 255, 153));
        pnlRoomD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoomD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Room.png"))); // NOI18N
        pnlRoomD.add(lblRoomD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblAllRoomCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlRoomD.add(lblAllRoomCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 90, 40));

        lblAllRoomHeadingD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblAllRoomHeadingD.setText("Number of Consultant Rooms : ");
        pnlRoomD.add(lblAllRoomHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlRoomD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 710, 180));

        pnlPatientD.setBackground(new java.awt.Color(255, 102, 102));
        pnlPatientD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Patient.png"))); // NOI18N
        pnlPatientD.add(lblPatientD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblAllPatientCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlPatientD.add(lblAllPatientCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 90, 40));

        lblPatientHeadingD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblPatientHeadingD.setText("Number of all registered Patients : ");
        pnlPatientD.add(lblPatientHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlPatientD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 710, 180));

        pnlAppointmentD.setBackground(new java.awt.Color(255, 153, 255));
        pnlAppointmentD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAppointmentD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Appointment.png"))); // NOI18N
        pnlAppointmentD.add(lblAppointmentD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblAllAppointmentCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlAppointmentD.add(lblAllAppointmentCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, 40));

        lblAppointmentHeadingD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblAppointmentHeadingD.setText("Number of all Appointments made : ");
        pnlAppointmentD.add(lblAppointmentHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlAppointmentD, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 710, 180));

        pnlConsultantD.setBackground(new java.awt.Color(204, 204, 255));
        pnlConsultantD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConsultantD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesReceptionist/Consultant.png"))); // NOI18N
        pnlConsultantD.add(lblConsultantD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 160));

        lblAllConsultantCountD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        pnlConsultantD.add(lblAllConsultantCountD, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 90, 40));

        lblConsultantHeadingD.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblConsultantHeadingD.setText("Number of working Consultants : ");
        pnlConsultantD.add(lblConsultantHeadingD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 40));

        pnlDashboard.add(pnlConsultantD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 710, 180));

        pnlBackground.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 1640, 1010));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // operations executed when Dashboard option is selected from the selection panel at left
    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        displayDashboard();
    }//GEN-LAST:event_lblDashboardMouseClicked

    // operations executed when Register Patient option is selected from the selection panel at left
    private void lblRegPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegPatientMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectRegPatient.setVisible(true);
        lblSelectUpdPatient.setVisible(false);
        lblSelectTimeSlot.setVisible(false);

        pnlDashboard.setVisible(false);
        pnlRegisterPatient.setVisible(true);
        pnlUpdatePatient.setVisible(false);
        pnlConsultants.setVisible(false);
        
        // resets all selections made related to a patient registration
        resetRegisterPatient();
        txtArAppointmentReceiptR.selectAll();
        txtArAppointmentReceiptR.replaceSelection("");
    }//GEN-LAST:event_lblRegPatientMouseClicked
    
    // method which handles setting the consultant name list in the combo box
    public void displayConsultantList(){
        ReceptionistCode rc=new ReceptionistCode();
        try{
            cmbConsultantR.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetConsultantNameList(cmbConsultantSpecialityR.getItemAt(cmbConsultantSpecialityR.getSelectedIndex()))));
            consultantIDList=rc.RegisterPatientGetConsultantIDList(cmbConsultantSpecialityR.getItemAt(cmbConsultantSpecialityR.getSelectedIndex()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // method which handles setting the time slot details list in the combo box
    public void displayDateAndTimeList(){
        ReceptionistCode rc=new ReceptionistCode();
        try{
            cmbDateAndTimeR.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetDateAndTimeList(consultantIDList[cmbConsultantR.getSelectedIndex()])));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // method which resets state of all components on patient registration panel to it's default 
    public void resetRegisterPatient(){
        ReceptionistCode rc=new ReceptionistCode();
        ValidateData v=new ValidateData();
        
        // sets consultant speciality list in the combo box
        try{
            cmbConsultantSpecialityR.setModel(new javax.swing.DefaultComboBoxModel<>(rc.RegisterPatientGetConsultantSpecialityList()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // sets consultant name list and timeslots list in the comboboxes
        displayConsultantList();
        displayDateAndTimeList();
        
        // sets all components state to default
        txtForenameR.setText("");
        txtSurnameR.setText("");
        cmbGenderR.setSelectedIndex(0);
        dchDateOfBirthR.setCalendar(null);
        cmbBloodGroupR.setSelectedIndex(0);
        txtNICR.setText("");
        txtEmailR.setText("");
        txtMobileNoR.setText("");
        txtLANNoR.setText("");
        txtAddressNumberR.setText("Number");
        txtAddressNumberR.setForeground(new Color(153,153,153));
        k1=1;
        txtAddressStreetR.setText("Street");
        txtAddressStreetR.setForeground(new Color(153,153,153));
        k2=1;
        txtAddressCityR.setText("City");
        txtAddressCityR.setForeground(new Color(153,153,153));
        k3=1;
        appointmentPrintStatus=false;
        chkPaymentDone.setSelected(false);
        
        // sets newly generated patient code and appointment number in patient registration panel (for next patient registration)
        try{
            String codes[]=rc.RegisterPatientGetGeneratedCodes();
            if(v.isValidLength(codes[0], 10) && v.isValidLength(codes[1], 5)){
                btnRegisterR.setEnabled(true);
                btnPrintR.setEnabled(true);
                
                txtPatientCodeR.setText(codes[0]);
                txtAppointmentNoR.setText(codes[1]);
            }else{
                btnRegisterR.setEnabled(false);
                btnPrintR.setEnabled(false);
                JOptionPane.showMessageDialog(this, "No more Patient Registrations are possible !", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // operations executed when Update Patient option is selected from the selection panel at left
    private void lblUpdPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdPatientMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectRegPatient.setVisible(false);
        lblSelectUpdPatient.setVisible(true);
        lblSelectTimeSlot.setVisible(false);

        pnlDashboard.setVisible(false);
        pnlRegisterPatient.setVisible(false);
        pnlUpdatePatient.setVisible(true);
        pnlConsultants.setVisible(false);
        
        resetUpdatePatient(true);
    }//GEN-LAST:event_lblUpdPatientMouseClicked
    
    // method which resets state of all components on patient updation panel to it's default 
    public void resetUpdatePatient(boolean isClearSearch){
        if(isClearSearch){
            txtSearchU.setText("Enter Patient Code");
        }
        k4=1;
        txtPatientCodeU.setText("");
        txtPatientCodeU.setEditable(false);
        txtForenameU.setText("");
        txtForenameU.setEditable(false);
        txtSurnameU.setText("");
        txtSurnameU.setEditable(false);
        cmbGenderU.setSelectedIndex(0);
        cmbGenderU.setEnabled(false);
        dchDateOfBirthU.setDate(null);
        dchDateOfBirthU.getDateEditor().setEnabled(false);
        cmbBloodGroupU.setSelectedIndex(0);
        cmbBloodGroupU.setEnabled(false);
        txtNICU.setText("");
        txtNICU.setEditable(false);
        txtEmailU.setText("");
        txtEmailU.setEditable(false);
        txtMobileNoU.setText("");
        txtMobileNoU.setEditable(false);
        txtLANNoU.setText("");
        txtLANNoU.setEditable(false);
        txtAddressNumberU.setText("");
        txtAddressNumberU.setEditable(false);
        txtAddressStreetU.setText("");
        txtAddressStreetU.setEditable(false);
        txtAddressCityU.setText("");
        txtAddressCityU.setEditable(false);
        
        chkForenameU.setSelected(false);
        chkAddressU.setSelected(false);
        chkBloodGroupU.setSelected(false);
        chkDateOfBirthU.setSelected(false);
        chkEmailU.setSelected(false);
        chkGenderU.setSelected(false);
        chkLANNoU.setSelected(false);
        chkMobileNoU.setSelected(false);
        chkNICU.setSelected(false);
        chkSurnameU.setSelected(false);
        
        modelADT.setDataVector(null, colsADT);
    }
    
    // operations executed when Consultants option is selected from the selection panel at left
    private void lblConsultantAndTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultantAndTSMouseClicked
        lblSelectDashboard.setVisible(false);
        lblSelectRegPatient.setVisible(false);
        lblSelectUpdPatient.setVisible(false);
        lblSelectTimeSlot.setVisible(true);

        pnlDashboard.setVisible(false);
        pnlRegisterPatient.setVisible(false);
        pnlUpdatePatient.setVisible(false);
        pnlConsultants.setVisible(true);
        
        txtSearchConsultantC.setText("Enter Consultant ID");
        k5=1;
        cmbSearchDayC.setSelectedIndex(0);
        
        ReceptionistCode rc=new ReceptionistCode();
        try{
            String consultantsDetailsTable[][]=rc.ConsultantGetConsultantDetailsTableFullOrSearched("Full", null);
            modelCDT.setDataVector(consultantsDetailsTable, colsCDT);
            
            String timeSlotDetailsTable[][]=rc.ConsultantGetTimeSlotDetailsTableFullOrSearched(cmbSearchDayC.getSelectedItem().toString(), "Full", null);
            modelTDT.setDataVector(timeSlotDetailsTable, colsTDT);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_lblConsultantAndTSMouseClicked

    private void txtAddressNumberRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressNumberRMouseClicked
        // Clears the initial description in address number field in the patient registration panel when clicked for the first time
        if (k1 == 1) {
            txtAddressNumberR.setText("");
            txtAddressNumberR.setForeground(Color.black);
        }
        k1++;
    }//GEN-LAST:event_txtAddressNumberRMouseClicked

    private void txtAddressStreetRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressStreetRMouseClicked
        // Clears the initial description in address street field in the patient registration panel when clicked for the first time
        if (k2 == 1) {
            txtAddressStreetR.setText("");
            txtAddressStreetR.setForeground(Color.black);
        }
        k2++;
    }//GEN-LAST:event_txtAddressStreetRMouseClicked

    private void txtAddressCityRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressCityRMouseClicked
        // Clears the initial description in address city field in the patient registration panel when clicked for the first time
        if (k3 == 1) {
            txtAddressCityR.setText("");
            txtAddressCityR.setForeground(Color.black);
        }
        k3++;
    }//GEN-LAST:event_txtAddressCityRMouseClicked

    private void cmbDateAndTimeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDateAndTimeRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDateAndTimeRActionPerformed

    private void btnClearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRActionPerformed
        // Clear button in Patient Registration panel
        resetRegisterPatient();
        txtArAppointmentReceiptR.selectAll();
        txtArAppointmentReceiptR.replaceSelection("");
    }//GEN-LAST:event_btnClearRActionPerformed

    private void txtSearchUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchUMouseClicked
        // Clears the initial description in search patient field in the patient updation panel when clicked for the first time
        if (k4 == 1) {
            txtSearchU.setText("");
        }
        k4++;
    }//GEN-LAST:event_txtSearchUMouseClicked

    private void txtSearchUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUActionPerformed

    private void txtAddressNumberUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressNumberUMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressNumberUMouseClicked

    private void txtAddressStreetUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressStreetUMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressStreetUMouseClicked

    private void txtAddressCityUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressCityUMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressCityUMouseClicked

    private void txtAddressNumberUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressNumberUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressNumberUActionPerformed
    
    // operations related to update button in patient updation panel
    private void btnUpateUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpateUActionPerformed
        ValidateData v=new ValidateData();
        ReceptionistCode rc=new ReceptionistCode();
        
        if(txtPatientCodeU.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Search for required patient !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!(v.isValidForenameOrSurname(txtForenameU.getText()) && v.isValidLength(txtForenameU.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Forename, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!(v.isValidForenameOrSurname(txtSurnameU.getText()) && v.isValidLength(txtSurnameU.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Surname, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(dchDateOfBirthU.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Date of Birth !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtNICU.getText().equals(""))) && (!(v.isValidNIC(txtNICU.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid NIC, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtEmailU.getText().equals(""))) && (!(v.isValidEmail(txtEmailU.getText()) && v.isValidLength(txtEmailU.getText(), 30)))){
            JOptionPane.showMessageDialog(this, "Invalid Email, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtMobileNoU.getText().equals("") && txtLANNoU.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Can't leave both Mobile No and LAN No empty, Please Enter atleast one !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtMobileNoU.getText().equals(""))) && (!(v.isValidPhoneNum(txtMobileNoU.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid Mobile No, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtLANNoU.getText().equals(""))) && (!(v.isValidPhoneNum(txtLANNoU.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid LAN No, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtAddressNumberU.getText().equals("") || txtAddressStreetU.getText().equals("") || 
                txtAddressCityU.getText().equals("") || !(v.isValidLength(txtAddressNumberU.getText(), 30)) || !(v.isValidLength(txtAddressStreetU.getText(), 30)) || !(v.isValidLength(txtAddressCityU.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Address, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                rc.UpdatePatientUpdation(txtPatientCodeU.getText(), txtForenameU.getText(), txtSurnameU.getText(), cmbGenderU.getSelectedItem().toString(), dchDateOfBirthU.getDate().toString(), cmbBloodGroupU.getSelectedItem().toString(), txtNICU.getText(), txtEmailU.getText(), txtMobileNoU.getText(), txtLANNoU.getText(), txtAddressNumberU.getText(), txtAddressStreetU.getText(), txtAddressCityU.getText());
                JOptionPane.showMessageDialog(this, "Patient Personal Details updated successfully");
                UpdSearch();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpateUActionPerformed
    
    // operations related to Delete Appointment button in Patient Updation panel
    private void btnDeleteAppointmentUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAppointmentUActionPerformed
        ReceptionistCode rc=new ReceptionistCode();
        
        if(tblAppointmentDetailsU.getRowCount()>0){
            try{
                int selectedRow=tblAppointmentDetailsU.getSelectedRow();
                String selectedData=tblAppointmentDetailsU.getValueAt(selectedRow, 0).toString();
                int selectedAppointmentNo=Integer.parseInt(selectedData);

                int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Appointment ?", "Swing Tester", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    try{
                        rc.UpdatePatientDeleteAppointment(selectedAppointmentNo);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(this, "Appointment deleted successfully");
                }    
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please select Appointment to Delete from Table !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No Appointments available !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAppointmentUActionPerformed

    private void txtAddressCityUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressCityUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressCityUActionPerformed

    private void btnResetUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUActionPerformed
        resetUpdatePatient(true);
    }//GEN-LAST:event_btnResetUActionPerformed
    
    // operations done when Add Appointment button in Patient Update panel is clicked
    private void btnAddAppointmentUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentUActionPerformed
        new AddAppointment(this, true, txtPatientCodeU.getText(), yearStr, txtForenameU.getText(), txtSurnameU.getText()).setVisible(true);
    }//GEN-LAST:event_btnAddAppointmentUActionPerformed

    // operations done when Update Appointment button in Patient Update panel is clicked
    private void btnUpdateAppointmentUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentUActionPerformed
        ReceptionistCode rc=new ReceptionistCode();
        
        if(tblAppointmentDetailsU.getRowCount()>0){
            try{
                int selectedRow=tblAppointmentDetailsU.getSelectedRow();
                String selectedData=tblAppointmentDetailsU.getValueAt(selectedRow, 0).toString();
                int selectedAppointmentNo=Integer.parseInt(selectedData);
                
                new UpdateAppointment(this, true, selectedAppointmentNo, txtPatientCodeU.getText(), yearStr, txtForenameU.getText(), txtSurnameU.getText()).setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please select Appointment to Update from Table !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No Appointments available !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateAppointmentUActionPerformed

    private void txtSearchConsultantCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchConsultantCMouseClicked
        // Clears the initial description in search consultant field in the consultant details panel when clicked for the first time
        if (k5 == 1) {
            txtSearchConsultantC.setText("");
        }
        k5++;
    }//GEN-LAST:event_txtSearchConsultantCMouseClicked

    private void txtSearchConsultantCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchConsultantCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchConsultantCActionPerformed

    // operations done when Add Time Slot button in Consultants panel is clicked
    private void btnAddTimeSlotCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTimeSlotCActionPerformed
        try{
            if(tblConsultantDetailsC.getRowCount()>0){
                String selectedConsultantID=null;
                String selectedConsultantName=null;
                if(tblConsultantDetailsC.getRowCount()==1){
                    selectedConsultantID=tblConsultantDetailsC.getValueAt(0, 0).toString();
                    selectedConsultantName=tblConsultantDetailsC.getValueAt(0, 1).toString(); 
                }else{
                    int selectedRow=tblConsultantDetailsC.getSelectedRow();
                    selectedConsultantID=tblConsultantDetailsC.getValueAt(selectedRow, 0).toString();
                    selectedConsultantName=tblConsultantDetailsC.getValueAt(selectedRow, 1).toString();    
                }
                
                new AddTimeSlot(this, true, selectedConsultantID, selectedConsultantName).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "No consultant data available in Consultant Details Table !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please select Consultant from Consultant Details Table !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddTimeSlotCActionPerformed

    // operations done when Delete Time Slot button in Consultants panel is clicked
    private void btnDeleteTimeSlotCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTimeSlotCActionPerformed
        try{
            if(tblConsultantDetailsC.getRowCount()==1){
                String selectedConsultantID=tblConsultantDetailsC.getValueAt(0, 0).toString();
                String selectedConsultantName=tblConsultantDetailsC.getValueAt(0, 1).toString(); 
                
                int selectedRow=tblTimeSlotDetailsC.getSelectedRow();
                String day=tblTimeSlotDetailsC.getValueAt(selectedRow, 0).toString();
                String startingTime=tblTimeSlotDetailsC.getValueAt(selectedRow, 1).toString();
                String roomNo=tblTimeSlotDetailsC.getValueAt(selectedRow, 4).toString();
                String currentPatients=tblTimeSlotDetailsC.getValueAt(selectedRow, 6).toString();
                
                String timeSlot=day+" at "+startingTime+", Assigned Room No : "+roomNo;
                
                ReceptionistCode rc=new ReceptionistCode();
                int timeSlotID=rc.RegisterPatientGetTimeSlotID(timeSlot);
                
                if(currentPatients.equals("0")){
                    rc.ConsultantDeleteTimeSlot(timeSlotID);
                    JOptionPane.showMessageDialog(this, "Timeslot deleted successfully");
                }else{
                    JOptionPane.showMessageDialog(this, "You Can't delete this Time slot !", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Please search for required Consultant ID !", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please select Time Slot from Time Slot Details Table !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteTimeSlotCActionPerformed

    // operations done when User Profile Name in Heading is clicked
    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        // Opens staffProfile dialog box when the user name displayed in the dashboard is clicked
        new StaffProfile(this, true, staff_ID).setVisible(true);
    }//GEN-LAST:event_lblUserMouseClicked

    // operations done when HeartBeat label in Consultants Heading is clicked
    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        new ApplicationInfo(this, true).setVisible(true);
    }//GEN-LAST:event_lblLogoMouseClicked

    // Operations done when Item state changed in Consultant Speciality combo box in patient registration panel
    private void cmbConsultantSpecialityRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultantSpecialityRItemStateChanged
        displayConsultantList();
        displayDateAndTimeList();
    }//GEN-LAST:event_cmbConsultantSpecialityRItemStateChanged

    // Operations done when Item state changed in Consultant combo box in patient registration panel
    private void cmbConsultantRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultantRItemStateChanged
        displayDateAndTimeList();
    }//GEN-LAST:event_cmbConsultantRItemStateChanged
    
    // operations executed when register patient button is clicked in register patient panel
    private void btnRegisterRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterRActionPerformed
        ValidateData v=new ValidateData();
        ReceptionistCode rc=new ReceptionistCode();
        CommonOperations co=new CommonOperations();
       
        if(!(v.isValidForenameOrSurname(txtForenameR.getText()) && v.isValidLength(txtForenameR.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Forename, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!(v.isValidForenameOrSurname(txtSurnameR.getText()) && v.isValidLength(txtSurnameR.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Surname, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(dchDateOfBirthR.getDate()==null){
            JOptionPane.showMessageDialog(this, "Please Enter Date of Birth !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtNICR.getText().equals(""))) && (!(v.isValidNIC(txtNICR.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid NIC, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtEmailR.getText().equals(""))) && (!(v.isValidEmail(txtEmailR.getText()) && v.isValidLength(txtEmailR.getText(), 30)))){
            JOptionPane.showMessageDialog(this, "Invalid Email, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtMobileNoR.getText().equals("") && txtLANNoR.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Can't leave both Mobile No and LAN No empty, Please Enter atleast one !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtMobileNoR.getText().equals(""))) && (!(v.isValidPhoneNum(txtMobileNoR.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid Mobile No, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if((!(txtLANNoR.getText().equals(""))) && (!(v.isValidPhoneNum(txtLANNoR.getText())))){
            JOptionPane.showMessageDialog(this, "Invalid LAN No, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(txtAddressNumberR.getText().equals("") || txtAddressStreetR.getText().equals("") || txtAddressCityR.getText().equals("") || k1==1 || k2==1 || k3==1 || !(v.isValidLength(txtAddressNumberR.getText(), 30)) || !(v.isValidLength(txtAddressStreetR.getText(), 30)) || !(v.isValidLength(txtAddressCityR.getText(), 30))){
            JOptionPane.showMessageDialog(this, "Invalid Address, Please Enter again !", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cmbDateAndTimeR.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "No Time slots availabe, Please choose another consultant !", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                String paymentDate="";
                
                if(chkPaymentDone.isSelected()){
                    paymentDate=co.convertInterfaceDateToDatabase(yearStr);
                }
                
                String receipt=rc.RegisterPatientGetAppointmentReceipt(txtPatientCodeR.getText(), (txtForenameR.getText()+" "+txtSurnameR.getText()), 
                        txtAppointmentNoR.getText(), cmbConsultantSpecialityR.getSelectedItem().toString() , cmbConsultantR.getSelectedItem().toString(), 
                        cmbDateAndTimeR.getSelectedItem().toString(), yearStr, paymentDate);
                txtArAppointmentReceiptR.setText(receipt);
                regTimeSlotID=rc.RegisterPatientGetTimeSlotID(cmbDateAndTimeR.getSelectedItem().toString());
                rc.RegisterPatientRegistration(txtPatientCodeR.getText(), txtForenameR.getText(), txtSurnameR.getText(), cmbGenderR.getSelectedItem().toString(), 
                        dchDateOfBirthR.getDate().toString(), cmbBloodGroupR.getSelectedItem().toString(), txtNICR.getText(), txtEmailR.getText(), txtMobileNoR.getText(), txtLANNoR.getText(), txtAddressNumberR.getText(), txtAddressStreetR.getText(), txtAddressCityR.getText(), Integer.parseInt(txtAppointmentNoR.getText()), regTimeSlotID, paymentDate);
                JOptionPane.showMessageDialog(this, "Patient Registration Successful");
                regTimeSlotID=0;
                resetRegisterPatient();
                appointmentPrintStatus=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegisterRActionPerformed
    
    // operations executed when print receipt button is clicked in register patient panel
    private void btnPrintRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintRActionPerformed
        if(appointmentPrintStatus==true){
            PrintSupport.printComponent(txtArAppointmentReceiptR); //Prints the textArea
            txtArAppointmentReceiptR.setText("");
            appointmentPrintStatus=false;
        }else{
            JOptionPane.showMessageDialog(this, "Please Complete Patient Registration !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintRActionPerformed

    // operations done when Search icon is clicked in heading of Patient Update panel
    private void lblSearchUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchUMouseClicked
        UpdSearch();
    }//GEN-LAST:event_lblSearchUMouseClicked
    
    // searches patient personal and appointment details when patient code is given
    public void UpdSearch(){
        resetUpdatePatient(false);
        ReceptionistCode rc=new ReceptionistCode();
        ValidateData v=new ValidateData();

        try{
            String isPatientCodeValid[]=v.isValidPatientCode(txtSearchU.getText());

            if(isPatientCodeValid[0]=="valid"){
                String data[]=rc.UpdatePatientGetSearchPatientDetails(isPatientCodeValid[1]);
                
                txtPatientCodeU.setText(data[0]);
                txtForenameU.setText(data[1]);
                txtSurnameU.setText(data[2]);
                
                if(data[3].equals("Male")){
                    cmbGenderU.setSelectedIndex(0);
                }else{
                    cmbGenderU.setSelectedIndex(1);
                }
                
                CommonOperations co=new CommonOperations();
                String date=co.convertDateToJDateChooser(data[4]);
                Date dateNew=new SimpleDateFormat("MMM d, yyyy").parse(date);
                dchDateOfBirthU.setDate(dateNew);
                
                if(data[5].equals("A+")){
                    cmbBloodGroupU.setSelectedIndex(0);
                }else if(data[5].equals("A-")){
                    cmbBloodGroupU.setSelectedIndex(1);
                }else if(data[5].equals("B+")){
                    cmbBloodGroupU.setSelectedIndex(2);
                }else if(data[5].equals("B-")){
                    cmbBloodGroupU.setSelectedIndex(3);
                }else if(data[5].equals("AB+")){
                    cmbBloodGroupU.setSelectedIndex(4);
                }else if(data[5].equals("AB-")){
                    cmbBloodGroupU.setSelectedIndex(5);
                }else if(data[5].equals("O+")){
                    cmbBloodGroupU.setSelectedIndex(6);
                }else if(data[5].equals("O-")){
                    cmbBloodGroupU.setSelectedIndex(7);
                }
                
                txtNICU.setText(data[6]);
                txtEmailU.setText(data[7]);
                txtMobileNoU.setText(data[8]);
                txtLANNoU.setText(data[9]);
                txtAddressNumberU.setText(data[10]);
                txtAddressStreetU.setText(data[11]);
                txtAddressCityU.setText(data[12]);
                
                String appointmentDetailsTable[][]=rc.UpdatePatientGetAppointmentDetailsTable(data[0], yearStr);  
                modelADT.setDataVector(appointmentDetailsTable, colsADT);
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Patient Code, please enter again !", "Error", JOptionPane.ERROR_MESSAGE);
                txtSearchU.setText("");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // operation related to edit check box of Forename in patien update panel
    private void chkForenameUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkForenameUActionPerformed
        if(chkForenameU.isSelected()){
            txtForenameU.setEditable(true);
        }else{
            txtForenameU.setEditable(false);
        }
    }//GEN-LAST:event_chkForenameUActionPerformed

    private void chkSurnameUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSurnameUActionPerformed
        if(chkSurnameU.isSelected()){
            txtSurnameU.setEditable(true);
        }else{
            txtSurnameU.setEditable(false);
        }
    }//GEN-LAST:event_chkSurnameUActionPerformed

    private void chkGenderUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGenderUActionPerformed
        if(chkGenderU.isSelected()){
            cmbGenderU.setEnabled(true);
        }else{
            cmbGenderU.setEnabled(false);
        }
    }//GEN-LAST:event_chkGenderUActionPerformed

    private void chkDateOfBirthUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDateOfBirthUActionPerformed
        if(chkDateOfBirthU.isSelected()){
            dchDateOfBirthU.setEnabled(true);
            dchDateOfBirthU.getDateEditor().setEnabled(false);
        }else{
            dchDateOfBirthU.setEnabled(false);
        }
    }//GEN-LAST:event_chkDateOfBirthUActionPerformed

    private void chkBloodGroupUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBloodGroupUActionPerformed
        if(chkBloodGroupU.isSelected()){
            cmbBloodGroupU.setEnabled(true);
        }else{
            cmbBloodGroupU.setEnabled(false);
        }
    }//GEN-LAST:event_chkBloodGroupUActionPerformed

    private void chkNICUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNICUActionPerformed
        if(chkNICU.isSelected()){
            txtNICU.setEditable(true);
        }else{
            txtNICU.setEditable(false);
        }
    }//GEN-LAST:event_chkNICUActionPerformed

    private void chkEmailUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmailUActionPerformed
        if(chkEmailU.isSelected()){
            txtEmailU.setEditable(true);
        }else{
            txtEmailU.setEditable(false);
        }
    }//GEN-LAST:event_chkEmailUActionPerformed

    private void chkMobileNoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMobileNoUActionPerformed
        if(chkMobileNoU.isSelected()){
            txtMobileNoU.setEditable(true);
        }else{
            txtMobileNoU.setEditable(false);
        }
    }//GEN-LAST:event_chkMobileNoUActionPerformed

    private void chkLANNoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLANNoUActionPerformed
        if(chkLANNoU.isSelected()){
            txtLANNoU.setEditable(true);
        }else{
            txtLANNoU.setEditable(false);
        }
    }//GEN-LAST:event_chkLANNoUActionPerformed

    private void chkAddressUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAddressUActionPerformed
        if(chkAddressU.isSelected()){
            txtAddressNumberU.setEditable(true);
            txtAddressStreetU.setEditable(true);
            txtAddressCityU.setEditable(true);
        }else{
            txtAddressNumberU.setEditable(false);
            txtAddressStreetU.setEditable(false);
            txtAddressCityU.setEditable(false);
        }
    }//GEN-LAST:event_chkAddressUActionPerformed

    private void lblSearchUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchUMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSearchUMouseEntered

    private void chkPaymentDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPaymentDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPaymentDoneActionPerformed

    // operations executed when combo box related to days in consultant panel is clicked (near time slot details table)
    private void cmbSearchDayCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSearchDayCItemStateChanged
        ReceptionistCode rc=new ReceptionistCode();
        if(k5==1){    
            try{
                String consultantsDetailsTable[][]=rc.ConsultantGetConsultantDetailsTableFullOrSearched("Full", null);
                modelCDT.setDataVector(consultantsDetailsTable, colsCDT);

                String timeSlotDetailsTable[][]=rc.ConsultantGetTimeSlotDetailsTableFullOrSearched(cmbSearchDayC.getSelectedItem().toString(), "Full", null);
                modelTDT.setDataVector(timeSlotDetailsTable, colsTDT);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try{
                String consultantsDetailsTable[][]=rc.ConsultantGetConsultantDetailsTableFullOrSearched("Searched", isValidConsultantID[1]);
                modelCDT.setDataVector(consultantsDetailsTable, colsCDT);

                String timeSlotDetailsTable[][]=rc.ConsultantGetTimeSlotDetailsTableFullOrSearched(cmbSearchDayC.getSelectedItem().toString(), "Searched", isValidConsultantID[1]);
                modelTDT.setDataVector(timeSlotDetailsTable, colsTDT);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmbSearchDayCItemStateChanged

    // operations executed when search icon of consultants panel is clicked
    private void lblSearchConsultantCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchConsultantCMouseClicked
        ReceptionistCode rc=new ReceptionistCode();
        ValidateData v=new ValidateData();
        try{
            isValidConsultantID=v.isValidConsultantID(txtSearchConsultantC.getText());
            if(isValidConsultantID[0]=="valid"){
                try{
                    String consultantsDetailsTable[][]=rc.ConsultantGetConsultantDetailsTableFullOrSearched("Searched", isValidConsultantID[1]);
                    modelCDT.setDataVector(consultantsDetailsTable, colsCDT);

                    cmbSearchDayC.setSelectedIndex(0);
                    String timeSlotDetailsTable[][]=rc.ConsultantGetTimeSlotDetailsTableFullOrSearched(cmbSearchDayC.getSelectedItem().toString(), "Searched", isValidConsultantID[1]);
                    modelTDT.setDataVector(timeSlotDetailsTable, colsTDT);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
                }   
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Consultant ID, please enter again !", "Error", JOptionPane.ERROR_MESSAGE);
                txtSearchConsultantC.setText("Enter Consultant ID");
                k5=1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Database Connection error, Please contact Team Cyber !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_lblSearchConsultantCMouseClicked

    // operations executed when Update Timeslot button in consultants panel is clicked
    private void btnUpdateTimeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTimeSlotActionPerformed
        try{
            if(tblConsultantDetailsC.getRowCount()==1){
                int selectedRow=tblTimeSlotDetailsC.getSelectedRow();
                String ConsultantID=tblConsultantDetailsC.getValueAt(0, 0).toString();
                String ConsultantName=tblConsultantDetailsC.getValueAt(0, 1).toString(); 
                String day=tblTimeSlotDetailsC.getValueAt(selectedRow, 0).toString();
                String startingTime=tblTimeSlotDetailsC.getValueAt(selectedRow, 1).toString();
                String endingTime=tblTimeSlotDetailsC.getValueAt(selectedRow, 2).toString();
                String roomNo=tblTimeSlotDetailsC.getValueAt(selectedRow, 4).toString();
                String maxAppointments=tblTimeSlotDetailsC.getValueAt(selectedRow, 5).toString();
                String currentAppointments=tblTimeSlotDetailsC.getValueAt(selectedRow, 6).toString();
               
                String timeSlot=day+" at "+startingTime+", Assigned Room No : "+roomNo;
                
                ReceptionistCode rc=new ReceptionistCode();
                int timeSlotID=rc.RegisterPatientGetTimeSlotID(timeSlot);
                
                new UpdateTimeSlot(this, true, timeSlotID, ConsultantID, ConsultantName, day, startingTime, endingTime, roomNo, maxAppointments, currentAppointments).setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(this, "Please search for required Consultant ID !", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please select Time Slot from Time Slot Details Table !", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateTimeSlotActionPerformed

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
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptionist("FName", "Sname", "No_ID").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppointmentU;
    private javax.swing.JButton btnAddTimeSlotC;
    private javax.swing.JButton btnClearR;
    private javax.swing.JButton btnDeleteAppointmentU;
    private javax.swing.JButton btnDeleteTimeSlotC;
    private javax.swing.JButton btnPrintR;
    private javax.swing.JButton btnRegisterR;
    private javax.swing.JButton btnResetU;
    private javax.swing.JButton btnUpateU;
    private javax.swing.JButton btnUpdateAppointmentU;
    private javax.swing.JButton btnUpdateTimeSlot;
    private javax.swing.JCheckBox chkAddressU;
    private javax.swing.JCheckBox chkBloodGroupU;
    private javax.swing.JCheckBox chkDateOfBirthU;
    private javax.swing.JCheckBox chkEmailU;
    private javax.swing.JCheckBox chkForenameU;
    private javax.swing.JCheckBox chkGenderU;
    private javax.swing.JCheckBox chkLANNoU;
    private javax.swing.JCheckBox chkMobileNoU;
    private javax.swing.JCheckBox chkNICU;
    private javax.swing.JCheckBox chkPaymentDone;
    private javax.swing.JCheckBox chkSurnameU;
    private javax.swing.JComboBox<String> cmbBloodGroupR;
    private javax.swing.JComboBox<String> cmbBloodGroupU;
    private javax.swing.JComboBox<String> cmbConsultantR;
    private javax.swing.JComboBox<String> cmbConsultantSpecialityR;
    private javax.swing.JComboBox<String> cmbDateAndTimeR;
    private javax.swing.JComboBox<String> cmbGenderR;
    private javax.swing.JComboBox<String> cmbGenderU;
    private javax.swing.JComboBox<String> cmbSearchDayC;
    private com.toedter.calendar.JDateChooser dchDateOfBirthR;
    private com.toedter.calendar.JDateChooser dchDateOfBirthU;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressR;
    private javax.swing.JLabel lblAddressU;
    private javax.swing.JLabel lblAllAppointmentCountD;
    private javax.swing.JLabel lblAllConsultantCountD;
    private javax.swing.JLabel lblAllPatientCountD;
    private javax.swing.JLabel lblAllRoomCountD;
    private javax.swing.JLabel lblAllRoomHeadingD;
    private javax.swing.JLabel lblAppointmentD;
    private javax.swing.JLabel lblAppointmentDetailsR;
    private javax.swing.JLabel lblAppointmentDetailsU;
    private javax.swing.JLabel lblAppointmentHeadingD;
    private javax.swing.JLabel lblAppointmentNoR;
    private javax.swing.JLabel lblBloodGroupR;
    private javax.swing.JLabel lblBloodGroupU;
    private javax.swing.JLabel lblConsultantAndTS;
    private javax.swing.JLabel lblConsultantD;
    private javax.swing.JLabel lblConsultantDetailsC1;
    private javax.swing.JLabel lblConsultantHeadingD;
    private javax.swing.JLabel lblConsultantR;
    private javax.swing.JLabel lblConsultantSpecialityR;
    private javax.swing.JLabel lblConsultantsHeadingC;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDashboardHeadingD;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateAndTimeR;
    private javax.swing.JLabel lblDateOfBirthR;
    private javax.swing.JLabel lblDateOfBirthU;
    private javax.swing.JLabel lblEmailR;
    private javax.swing.JLabel lblEmailU;
    private javax.swing.JLabel lblForenameR;
    private javax.swing.JLabel lblForenameU;
    private javax.swing.JLabel lblGenderR;
    private javax.swing.JLabel lblGenderU;
    private javax.swing.JLabel lblLANNoR;
    private javax.swing.JLabel lblLANNoU;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMobileNoR;
    private javax.swing.JLabel lblMobileNoU;
    private javax.swing.JLabel lblNICR;
    private javax.swing.JLabel lblNICU;
    private javax.swing.JLabel lblPatientCodeR;
    private javax.swing.JLabel lblPatientCodeU;
    private javax.swing.JLabel lblPatientD;
    private javax.swing.JLabel lblPatientHeadingD;
    private javax.swing.JLabel lblPersonalDetailsR;
    private javax.swing.JLabel lblPersonalDetailsU;
    private javax.swing.JLabel lblRegPatient;
    private javax.swing.JLabel lblRegisterPatientHeadingR;
    private javax.swing.JLabel lblRoomD;
    private javax.swing.JLabel lblSearchConsultantC;
    private javax.swing.JLabel lblSearchU;
    private javax.swing.JLabel lblSelectDashboard;
    private javax.swing.JLabel lblSelectRegPatient;
    private javax.swing.JLabel lblSelectTimeSlot;
    private javax.swing.JLabel lblSelectUpdPatient;
    private javax.swing.JLabel lblSurnameR;
    private javax.swing.JLabel lblSurnameU;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeSlotsDetailsC;
    private javax.swing.JLabel lblUpdPatient;
    private javax.swing.JLabel lblUpdatePatientHeadingU;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlAppointmentD;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlConsultantD;
    private javax.swing.JPanel pnlConsultants;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlPatientD;
    private javax.swing.JPanel pnlRegisterPatient;
    private javax.swing.JPanel pnlRoomD;
    private javax.swing.JPanel pnlSelect;
    private javax.swing.JPanel pnlUpdatePatient;
    private javax.swing.JScrollPane scrlAppointmentReceiptR;
    private javax.swing.JScrollPane scrlConsultantDetailsC;
    private javax.swing.JScrollPane scrlConsultantDetailsC1;
    private javax.swing.JTable tblAppointmentDetailsU;
    private javax.swing.JTable tblConsultantDetailsC;
    private javax.swing.JTable tblTimeSlotDetailsC;
    private javax.swing.JTextField txtAddressCityR;
    private javax.swing.JTextField txtAddressCityU;
    private javax.swing.JTextField txtAddressNumberR;
    private javax.swing.JTextField txtAddressNumberU;
    private javax.swing.JTextField txtAddressStreetR;
    private javax.swing.JTextField txtAddressStreetU;
    private javax.swing.JTextField txtAppointmentNoR;
    private javax.swing.JTextArea txtArAppointmentReceiptR;
    private javax.swing.JTextField txtEmailR;
    private javax.swing.JTextField txtEmailU;
    private javax.swing.JTextField txtForenameR;
    private javax.swing.JTextField txtForenameU;
    private javax.swing.JTextField txtLANNoR;
    private javax.swing.JTextField txtLANNoU;
    private javax.swing.JTextField txtMobileNoR;
    private javax.swing.JTextField txtMobileNoU;
    private javax.swing.JTextField txtNICR;
    private javax.swing.JTextField txtNICU;
    private javax.swing.JTextField txtPatientCodeR;
    private javax.swing.JTextField txtPatientCodeU;
    private javax.swing.JTextField txtSearchConsultantC;
    private javax.swing.JTextField txtSearchU;
    private javax.swing.JTextField txtSurnameR;
    private javax.swing.JTextField txtSurnameU;
    // End of variables declaration//GEN-END:variables

    
    private void setExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // code related to displaying date and time
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

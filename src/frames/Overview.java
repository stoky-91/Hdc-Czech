/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import hdcczech.DbConnection;
import hdcczech.Training;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mstok
 */
public class Overview extends javax.swing.JFrame {

    Connection conn = new DbConnection().connect();
    PreparedStatement pst;
    ResultSet rs;
    Login1 log = new Login1();

    /**
     * naplnění ComboBoxu trenéry
     *
     * @throws SQLException
     */
    public void ComboBox() throws SQLException {
        String sql = "SELECT * from trainers";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        jComboBox1.addItem("Všichni");
        while (rs.next()) {
            String name = rs.getString("name");
            jComboBox1.addItem(name);

        }
    }

    /**
     * ComboBox()-naplnění trenéry maximalizování okna
     */
    public Overview() throws SQLException, ParseException {
        initComponents();
        ComboBox();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        Date();

    }

    void username(String user) {
        nameLabel3.setText(user);
    }

    public void Date() throws ParseException {
        Calendar ca = new GregorianCalendar();
        String day = ca.get(Calendar.DAY_OF_MONTH) + "";
        String month = ca.get(Calendar.MONTH) + 1 + "";
        String year = ca.get(Calendar.YEAR) + "";

        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }

        String dd = year + "-" + month + "-" + day;
        java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dd);
        jDateChooser1.setDate(date1);
        jDateChooser2.setDate(date1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setText("Tréninky");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(303, 21, 110, 36);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton2.setText("Přehled");
        jPanel1.add(jButton2);
        jButton2.setBounds(451, 21, 89, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mstok\\OneDrive\\Dokumenty\\NetBeansProjects\\HdcCzech\\src\\hdcczech\\images\\Bez názvu.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(7, 7, 240, 114);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Trenéři");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(584, 21, 87, 36);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton4.setText("Odhlásit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(831, 21, 95, 36);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton5.setText("Účet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(699, 21, 90, 36);

        nameLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nameLabel3);
        nameLabel3.setBounds(700, 70, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 130);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setMaximumRowCount(50);
        jComboBox1.setToolTipText("");
        jComboBox1.setPreferredSize(new java.awt.Dimension(35, 34));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(105, 16, 200, 34);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Trenér");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(38, 22, 49, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Od");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(387, 22, 22, 22);

        jDateChooser1.setDateFormatString("dd.MM.yyyy");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(421, 22, 170, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Do");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(629, 22, 22, 22);

        jDateChooser2.setDateFormatString("dd.MM.yyyy");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
        });
        jPanel2.add(jDateChooser2);
        jDateChooser2.setBounds(663, 22, 170, 28);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("Hledat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(872, 22, 163, 34);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdcczech/images/9bPYnG - kopie.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(-10, 0, 1190, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 130, 1178, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Čas od", "Čas do", "Hráč", "Trenér", "Trenér", "Trenér", "Poznámky", "Trénink"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 235, 1172, 406);

        jLabel6.setText("Počet tréninků HST");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 660, 120, 16);

        jLabel8.setText("Počet tréninků na ledě");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 710, 130, 16);

        jLabel9.setText("Počet tréninků v posilovně");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 750, 150, 16);

        jLabel10.setText("Počet tréninků celkem");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 790, 140, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Otevření okna User, zavření stávajícího
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            TrainingUser user = new TrainingUser();
            user.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Otevření okna Admin, zavření stávajícího
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Admin acc = null;
        try {
            acc = new Admin();
        } catch (SQLException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
        acc.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Otřevření okna AddTrainer, zavření stávajícího
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddTrainer add = null;
        try {
            add = new AddTrainer();
        } catch (SQLException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * Otevření okna s tréninky, zavření stávajícího
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Trainings tr = new Trainings();
            tr.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


    }//GEN-LAST:event_jTable1MouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked

    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked

    }//GEN-LAST:event_jDateChooser2MouseClicked

    /**
     * Zobrazení tréninkových jednotek zvoleného trenéra ve zvoleném období v
     * tabulce
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
            String date = sDate.format(jDateChooser1.getDate());
            String date1 = sDate.format(jDateChooser2.getDate());
            
            DbConnection db = new DbConnection();
            ArrayList<Training> TrainingList = db.TrainingData(jComboBox1.getSelectedItem().toString(), date, date1);
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"Datum", "Čas od", "Čas do", "Hráč", "Trenér", "Trenér", "Trenér", "Poznámky", "Trénink"});
            Object[] row = new Object[9];
            for (int i = 0; i < TrainingList.size(); i++) {
                row[0] = TrainingList.get(i).dateD;
                row[1] = TrainingList.get(i).time;
                row[2] = TrainingList.get(i).time1;
                row[3] = TrainingList.get(i).player;
                row[4] = TrainingList.get(i).trainer;
                row[5] = TrainingList.get(i).trainer1;
                row[6] = TrainingList.get(i).trainer2;
                row[7] = TrainingList.get(i).notes;
                row[8] = TrainingList.get(i).training;
                model.addRow(row);
            }
            jTable1.setModel(model);
            jTable1.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(jDateChooser1.getDate());
        String date1 = sDate.format(jDateChooser2.getDate());
        DbConnection db = new DbConnection();
        ArrayList<Training> TrainingList = db.AllTraining(date, date1);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Datum", "Čas od", "Čas do", "Hráč", "Trenér", "Trenér", "Trenér", "Poznámky", "Trénink"});
        Object[] row = new Object[9];
        for (int i = 0; i < TrainingList.size(); i++) {
            row[0] = TrainingList.get(i).dateD;
            row[1] = TrainingList.get(i).time;
            row[2] = TrainingList.get(i).time1;
            row[3] = TrainingList.get(i).player;
            row[4] = TrainingList.get(i).trainer;
            row[5] = TrainingList.get(i).trainer1;
            row[6] = TrainingList.get(i).trainer2;
            row[7] = TrainingList.get(i).notes;
            row[8] = TrainingList.get(i).training;
            model.addRow(row);
        }
        jTable1.setModel(model);
        jTable1.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new Overview().setVisible(true);
                    } catch (ParseException ex) {
                        Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static final javax.swing.JLabel nameLabel3 = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
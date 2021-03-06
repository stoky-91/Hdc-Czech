/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import hdcczech.Clear;
import hdcczech.DbConnection;
import hdcczech.Managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mstok
 */
public class Admin extends javax.swing.JFrame implements Clear {

     Connection conn = new DbConnection().connect(); 
    PreparedStatement pst;
    Statement stmt;
    ResultSet rs;


    /**
     *
     * - komponenty - show_admin()-zobrazení trenérů v tabulce - maximalizace
     * okna
     */
    public Admin() throws SQLException {
        initComponents();
        show_admin();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
  
    }

    /**
     * Vypsání trenérů z databáze
     *
     * @return ArrayList s manažery
     */
    public ArrayList<Managers> managersList() throws SQLException {
        ArrayList<Managers> managersList = new ArrayList<>();
        try {

            String query1 = "SELECT * from managers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Managers managers;
            while (rs.next()) {
                managers = new Managers(rs.getString("idManagers"), rs.getString("name"), rs.getString("username"));
                managersList.add(managers);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 0);
        }

        return managersList;
    }

    /**
     * Zobrazení trenérů v tabulce
     */
    public void show_admin() throws SQLException {
        ArrayList<Managers> list = managersList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getUsername();
            model.addRow(row);
        }

    }

    /**
     * interface na vyprázdnění TextFieldů
     */
    @Override
    public void clearFields() {
        idTxt.setText("");
        nameTxt.setText("");
        usernameTxt.setText("");
        passwordTxt.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        confirmBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
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

        nameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nameLabel1);
        nameLabel1.setBounds(702, 79, 270, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdcczech/images/9bPYnG - kopie.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-9, -10, 1540, 170);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(37, 45, 30, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Jméno a příjmení");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(37, 101, 150, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Přihlašovací jméno");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(37, 163, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Heslo");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(37, 239, 60, 22);

        idTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(idTxt);
        idTxt.setBounds(236, 33, 200, 34);

        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(nameTxt);
        nameTxt.setBounds(236, 89, 200, 34);

        usernameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(usernameTxt);
        usernameTxt.setBounds(236, 151, 200, 34);

        passwordTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(passwordTxt);
        passwordTxt.setBounds(236, 227, 200, 34);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jméno a příjmení", "Přihlašovací jméno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(454, 6, 675, 452);

        reset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reset.setText("Reset");
        reset.setPreferredSize(new java.awt.Dimension(100, 34));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(37, 403, 100, 34);

        delete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        delete.setText("Vymazat");
        delete.setPreferredSize(new java.awt.Dimension(100, 34));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(37, 322, 100, 34);

        add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add.setText("Přidat");
        add.setPreferredSize(new java.awt.Dimension(100, 34));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(336, 322, 100, 34);

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Upravit");
        update.setPreferredSize(new java.awt.Dimension(100, 34));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(336, 403, 100, 34);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hdcczech/images/9bPYnG - kopie.jpg"))); // NOI18N
        jLabel10.setLabelFor(delete);
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(-12, -40, 1530, 650);

        jTabbedPane1.addTab("Administrátor", jPanel2);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Současné heslo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Nové heslo");

        txtoldpass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNewPass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        confirmBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        confirmBtn.setText("Potvrdit");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtoldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNewPass)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)))
                .addContainerGap(1155, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtoldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Změnit heslo", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Otevře okno s tréninky, zavře stávající
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Trainings ad = new Trainings();
            ad.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Otevře okno s přehledem, zavře stávající
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Overview over = null;
        try {
            try {
                over = new Overview();
            } catch (ParseException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        over.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Otevře okno s AddTrainer, zavře stávajícího
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddTrainer add = null;
        try {
            add = new AddTrainer();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Otevře okno pro přihlášení, zavře stávající
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login1 login = new Login1();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * tlačítko přidá manažera do databáze
     */
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {

            String query = "INSERT into managers(idManagers, name, username, password) values (?,?,?,?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, idTxt.getText());
            pst.setString(2, nameTxt.getText());
            pst.setString(3, usernameTxt.getText());
            pst.setString(4, passwordTxt.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_admin();
            JOptionPane.showMessageDialog(null, "Úspěšně vloženo");
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chyba");
        }

        //reset
        clearFields();


    }//GEN-LAST:event_addActionPerformed

    /**
     * Příkaz vymaže zvoleného manažera z databáze
     */
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "delete from managers where idManagers=" + value;
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_admin();
            JOptionPane.showMessageDialog(null, "Úspěšně vymazáno");
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * Po kliknutí na manažera v tabulce, se zobrazí jeho údaje v TextFieldech,
     * kde se mohou editovat
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        idTxt.setText(model.getValueAt(i, 0).toString());
        nameTxt.setText(model.getValueAt(i, 1).toString());
        usernameTxt.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * Update manažerů v databázi
     *
     * @param evt
     */
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {

            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE managers set idManagers = ?,name=?, username=? where idManagers=" + value;
            pst = conn.prepareStatement(query);
            pst.setString(1, idTxt.getText());
            pst.setString(2, nameTxt.getText());
            pst.setString(3, usernameTxt.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_admin();
            JOptionPane.showMessageDialog(null, "Úspěšně upraveno");
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    /**
     * Vyčištění Textfieldů
     */
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        clearFields();
    }//GEN-LAST:event_resetActionPerformed


    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed

         try {
             Connection conn = new DbConnection().connect();
             Statement stmt = conn.createStatement();
             String oldpass = "select * from managers where username = '"+nameLabel1.getText()+"' and password = '"+txtoldpass.getText()+"'";
             ResultSet rs = stmt.executeQuery(oldpass);
             if(rs.next()){
             String updatepass = "Update managers set password = '"+txtNewPass.getText()+"' where username = '"+nameLabel1.getText()+"'";
             int k = stmt.executeUpdate(updatepass);
             if(k>0){
             JOptionPane.showMessageDialog(rootPane, "Heslo úspěšně změněno");
             txtoldpass.setText("");
             txtNewPass.setText("");
             }
             else{
             JOptionPane.showMessageDialog(rootPane, "Heslo nezměněno");
             }
             
             }
             else{
               JOptionPane.showMessageDialog(rootPane, "Heslo není správně");
             }
            
         } catch (SQLException ex) { 
             Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
         try {
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_confirmBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Admin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton delete;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static final javax.swing.JLabel nameLabel1 = new javax.swing.JLabel();
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton reset;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtoldpass;
    private javax.swing.JButton update;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}

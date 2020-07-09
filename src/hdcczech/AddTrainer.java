/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;


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
public class AddTrainer extends javax.swing.JFrame implements Clear {

    Connection conn = new DbConnection().connect();
    PreparedStatement pst;

    /**
     * -komponenty
     * - show_trainers() - zobrazení trenérů v tabulce
     * - maximalizace okna
     */
    public AddTrainer() throws SQLException {
        initComponents();
        show_trainers();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
       }

    /**
     * Výběr všech trenérů do ArrayListu
     * @return ArrayList s trenéry
     */
     public ArrayList<Trainer> trainersList() throws SQLException {
        ArrayList<Trainer> trainersList = new ArrayList<>();
        try {  
            
            String query1 = "SELECT * from trainers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Trainer trainer;
            while (rs.next()) {
                trainer = new Trainer(rs.getString("idTrainers"), rs.getString("name"), rs.getString("mobile"), rs.getString("mail"), rs.getString("specialization"));
                trainersList.add(trainer);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 0);
        }
        return trainersList;
    }
     
     /**
      * Přidání trenérů do tabulky
      */
    public void show_trainers() throws SQLException {
        ArrayList<Trainer> list = trainersList();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getMobile();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getSpecialization();
            model.addRow(row);
        }

    }

    /**
     * Interface - vyčištění TextFieldů
     */
    @Override
    public void clearFields() {
        idTxt.setText("");
        nameTxt.setText("");
        mobileTxt.setText("");
        mailTxt.setText("");
        specializationTxt.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        specializationTxt = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setText("Tréninky");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton2.setText("Přehled");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mstok\\OneDrive\\Dokumenty\\NetBeansProjects\\HdcCzech\\src\\hdcczech\\images\\Bez názvu.png")); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Trenéři");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton4.setText("Odhlásit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton5.setText("Účet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton4))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(44, 35, 19, 22);

        idTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idTxt.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel2.add(idTxt);
        idTxt.setBounds(213, 23, 200, 34);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Jméno a příjmení");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(44, 99, 124, 22);

        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameTxt.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel2.add(nameTxt);
        nameTxt.setBounds(213, 87, 200, 34);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Telefon");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(44, 169, 56, 22);

        mobileTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mobileTxt.setPreferredSize(new java.awt.Dimension(200, 34));
        mobileTxt.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(mobileTxt);
        mobileTxt.setBounds(213, 157, 200, 34);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(44, 228, 47, 22);

        mailTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mailTxt.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel2.add(mailTxt);
        mailTxt.setBounds(213, 216, 200, 34);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Specializace");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(44, 280, 87, 22);

        specializationTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        specializationTxt.setPreferredSize(new java.awt.Dimension(200, 34));
        jPanel2.add(specializationTxt);
        specializationTxt.setBounds(213, 268, 200, 34);

        reset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(44, 431, 100, 34);

        add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add.setText("Přidat");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(313, 361, 100, 34);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jméno a příjmení", "Telefon", "E-mail", "Specializace"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(425, 6, 726, 459);

        clear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        clear.setText("Vymazat");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(44, 361, 100, 34);

        update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        update.setText("Upravit");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(313, 431, 100, 34);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Zobrazení okna pro přihlášení, zavření stávajícího
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login1 login = new Login1();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Zobrazení okna Admin, zavření stávajícího
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Admin adm = null;
        try {
            adm = new Admin();
        } catch (SQLException ex) {
            Logger.getLogger(AddTrainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        adm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Zobrazení okna s přehledem, zavření stávajícího
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Overview over = null;
        try {
            over = new Overview();
        } catch (SQLException ex) {
            Logger.getLogger(AddTrainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        over.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Uložení trenéra do databáze
     */
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {

            String query = "INSERT into trainers(idTrainers, name, mobile, mail, specialization) values (?,?,?,?,?)";
            pst = conn.prepareStatement(query);

            pst.setString(1, idTxt.getText());
            pst.setString(2, nameTxt.getText());
            pst.setString(3, mobileTxt.getText());
            pst.setString(4, mailTxt.getText());
            pst.setString(5, specializationTxt.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            show_trainers();
            JOptionPane.showMessageDialog(null, "Úspěšně vloženo");
               pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trenér s tímto ID je již vložen");
        }

        //reset
        clearFields();

    }//GEN-LAST:event_addActionPerformed

    /**
     * Vymazání zvoleného trenéra z databáze
     */
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        try {

            int row = jTable2.getSelectedRow();
            String value = (jTable2.getModel().getValueAt(row, 0).toString());
            String query = "delete from trainers where idTrainers=" + value;
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            show_trainers();
            JOptionPane.showMessageDialog(null, "Úspěšně vymazáno");
               pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        clearFields();
    }//GEN-LAST:event_clearActionPerformed

    /**
     * Po kliknutí na trenéra v tabulce se zobrazí jeho podrobnosti v TextFieldech
     */
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int i = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        idTxt.setText(model.getValueAt(i, 0).toString());
        nameTxt.setText(model.getValueAt(i, 1).toString());
        mobileTxt.setText(model.getValueAt(i, 2).toString());
        mailTxt.setText(model.getValueAt(i, 3).toString());
        specializationTxt.setText(model.getValueAt(i, 4).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * Update trenérů 
     */
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {

            int row = jTable2.getSelectedRow();
            String value = (jTable2.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE trainers set idTrainers = ?,name=?, mobile=?, mail=?, specialization=? where idTrainers=" + value;
            pst = conn.prepareStatement(query);

            pst.setString(1, idTxt.getText());
            pst.setString(2, nameTxt.getText());
            pst.setString(3, mobileTxt.getText());
            pst.setString(4, mailTxt.getText());
            pst.setString(5, specializationTxt.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            show_trainers();
            JOptionPane.showMessageDialog(null, "Úspěšně upraveno");
               pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        clearFields();
    }//GEN-LAST:event_resetActionPerformed

    /**
     * Zobrazí okno s tréninky, zavře stávající
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Trainings ad = new Trainings();
            ad.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(AddTrainer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddTrainer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new AddTrainer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddTrainer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton reset;
    private javax.swing.JTextField specializationTxt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

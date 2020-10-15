/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import static frames.AddTrainer.nameLabel;
import static frames.Admin.nameLabel1;
import static frames.Trainings.nameLabel2;
import static frames.Overview.nameLabel3;
import frames.Trainings;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mstok
 */
public class DbConnection {

    private Connection DBConnection;
    Connection conn;
    PreparedStatement pst;
    private static String username;

    /*public void setLogName(String un) {
        username = un;
    }

    public String getLogName() {
        return username;
    }*/

 /* public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }
     */
    /**
     *
     * @return připojení k databázi
     */
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success(1)");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error check mysql driver for java : " + ex);
            System.exit(0);

        }

        String url = "jdbc:mysql://localhost:3306/hdc?allowPublicKeyRetrieval=true&useSSL=false";
        String name = "root";
        String password = "1111";

        try {
            DBConnection = (Connection) DriverManager.getConnection(url, name, password);
            System.out.println("Database Connected(2)");

        } catch (SQLException se) {
            System.out.println("Database application is not running or incorrect url/name/password for the database :" + se);
            JOptionPane.showMessageDialog(null, "base application is not running or incorrect url/name/password for the database : " + se);
            System.exit(0);
        }
        return DBConnection;
    }

    /**
     *
     * @param name - uživatelské jméno
     * @param password - heslo metoda na kontrolu uživatelského jména s heslem
     */
    public boolean checkLogin(String username, String password) throws ParseException {
        Connection conn = new DbConnection().connect();
        // String sql = "select * from managers where username = ? and password =? ";
        // String sql1 = "select * from admin where username = ? and password =? ";

        String sql = "select username, password from managers where username = ? and password =? ";
        String sql1 = "select username, password from admin where username = ? and password =? ";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps.setString(1, username);
            ps.setString(2, password);
            ps1.setString(1, username);
            ps1.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();
            if (rs.next()) {

                System.out.println("Správné zadání");
                nameLabel.setText(rs.getString(1));
                nameLabel1.setText(rs.getString(1));
                nameLabel2.setText(rs.getString(1));
                nameLabel3.setText(rs.getString(1));
                new Trainings().setVisible(true);
                // setLogName(name);
                return true;
            } else if (rs1.next()) {
                System.out.println("Správné zadání");
                new Trainings().setVisible(true);
                // setLogName(name);

                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Přihlašovací jméno nebo heslo jsou nesprávné");
                System.out.println("Přihlašovací jméno nebo heslo jsou nesprávné" + username + " " + password);
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("sql exception in submit btn :" + ex);

        } catch (HeadlessException ez) {
            System.out.println("Error :" + ez);
        }

        return false;
    }
    
        public void closeConnection() {
    	try { if (conn != null) conn.close(); } catch (SQLException se) {}
        try { if (pst != null) pst.close(); } catch (SQLException se) {}
  
    }

    public ArrayList<Training> AllTraining(String date, String date1) {
        ArrayList<Training> TrainingList = new ArrayList<>();
        conn = new DbConnection().connect();
        PreparedStatement pst;
        ResultSet rs;
        try {
            String query = "SELECT * from training where date between '" + date + "' and '" + date1 + "'";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery(query);
            Training training;

            while (rs.next()) {
                training = new Training(rs.getDate("date"), rs.getString("time"), rs.getString("time1"), rs.getString("player"), rs.getString("trainer"), rs.getString("trainer1"), rs.getString("trainer2"), rs.getString("notes"), rs.getString("training"));
                TrainingList.add(training);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return TrainingList;
    }

    /**
     * Metoda na vybraní tréninků podle trenéra a časového intervalu
     *
     * @param trainer - Trenér
     * @param date - Od vybraného dne
     * @param date1 - Do vybraného dne
     * @return ArrayList s tréninky
     * @throws SQLException
     */
    public ArrayList<Training> TrainingData(String trainer, String date, String date1) throws SQLException {
        ArrayList<Training> TrainingList = new ArrayList<>();
        conn = new DbConnection().connect();
        PreparedStatement pst;
                ResultSet rs;
                 

        try {
            String query = "SELECT * from training where trainer='" + trainer + "' or trainer1='" + trainer + "' or trainer2='" + trainer + "'and date between '" + date + "' and '" + date1 + "'";
             String query1 = "SELECT * from training where date between '" + date + "' and '" + date1 + "'";
            
            
                 
            Training training;

          if(trainer.equals("Všichni")){
                pst = conn.prepareStatement(query1);
            rs = pst.executeQuery(query1); 
            while (rs.next()) {
                training = new Training(rs.getDate("date"), rs.getString("time"), rs.getString("time1"), rs.getString("player"), rs.getString("trainer"), rs.getString("trainer1"), rs.getString("trainer2"), rs.getString("notes"), rs.getString("training"));
                TrainingList.add(training);
            }
            return TrainingList;
          }
          else{
             pst = conn.prepareStatement(query);
            rs = pst.executeQuery(query);
          while (rs.next()) {
                training = new Training(rs.getDate("date"), rs.getString("time"), rs.getString("time1"), rs.getString("player"), rs.getString("trainer"), rs.getString("trainer1"), rs.getString("trainer2"), rs.getString("notes"), rs.getString("training"));
                TrainingList.add(training);
            }
          }
          
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return TrainingList;
    }

    /**
     * Metoda na vyhledání tréninku podle data
     *
     * @param date - vybrané datum
     * @return ArrayList s tréninky
     * @throws SQLException
     */
    public ArrayList<Training> TrainingsData(String date) throws SQLException {
        ArrayList<Training> TrainingsList = new ArrayList<>();
        conn = new DbConnection().connect();
        PreparedStatement pst;
        ResultSet rs;

        try {

            String query = "select time, time1, player, trainer, trainer1, trainer2, notes, training from training where date= '" + date + "'";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery(query);

            Training training;

            while (rs.next()) {
                training = new Training(rs.getDate("date"), rs.getString("time"), rs.getString("time1"), rs.getString("player"), rs.getString("trainer"), rs.getString("notes"), rs.getString("training"));
                TrainingsList.add(training);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return TrainingsList;
    }

}

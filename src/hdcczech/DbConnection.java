/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void setLogName(String un) {
        username = un;
    }

    public String getLogName() {
        return username;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

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
     * @param password - heslo
     * metoda na kontrolu uživatelského jména s heslem
     */
    public boolean checkLogin(String name, String password) throws ParseException {
        Connection conn = new DbConnection().connect();
        String sql = "select * from managers where name = ? and password =? ";
        String sql1 = "select * from admin where name = ? and password =? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps.setString(1, name);
            ps.setString(2, password);
            ps1.setString(1, name);
            ps1.setString(2, password);

            ResultSet rs = ps.executeQuery();
            ResultSet rs1 = ps1.executeQuery();
            if (rs.next()) {
                System.out.println("Správné zadání");
                new Trainings().setVisible(true);
                setLogName(name);
                return true;
            } else if (rs1.next()) {
                System.out.println("Správné zadání");
                new Trainings().setVisible(true);
                setLogName(name);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Přihlašovací jméno nebo heslo jsou nesprávné");
                System.out.println("Přihlašovací jméno nebo heslo jsou nesprávné" + name + " " + password);
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("sql exception in submit btn :" + ex);

        } catch (HeadlessException ez) {
            System.out.println("Error :" + ez);
        }

        return false;
    }

    /**
     * Metoda na vybraní tréninků podle trenéra a časového intervalu 
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
     * Metoda na vyhledání tréninku podle data
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

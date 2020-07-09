/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mstok
 */
public class Trainer extends Person{

    /**
     * 
     */
    protected String mobile;
    protected String email;
     protected String specialization;
      static ArrayList<Trainer> trainers = new ArrayList<>();
    
  
     
    
    public Trainer(String ID, String name, String mobile, String email, String specialization) {
        super(ID, name);
        this.mobile = mobile;
        this.email = email;
        this.specialization = specialization;
    }

    public Trainer(String ID, String name) {
        super(ID, name);
    }

    public Trainer() {
    }
        
    
 public static ArrayList<Trainer> getTrainers() {
        return trainers;
    }
 

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

      public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

   /**
    * Sql dotaz pro výběr trenérů
    * @return ArrayList trenérů
    * @throws SQLException 
    */
    public ArrayList<Trainer> trainersList() throws SQLException {
        ArrayList<Trainer> trainersList = new ArrayList<>();
        try {

            Connection conn = new DbConnection().connect();
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
   
    }
    
    
   
    
    
  
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import java.util.ArrayList;

/**
 *
 * @author mstok
 */
public class Managers extends Person {
    
    
    protected String username;
    protected String password;
    static ArrayList<Managers> managers = new ArrayList<>();

    public Managers(String ID, String name, String username, String password) {
        super(ID, name);
        this.username = username;
        this.password = password;
    }
 
    public Managers(String ID, String name, String username) {
        super(ID, name);
        this.username = username;
        
    }
    
    public Managers() {
    }    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<Managers> getManagers() {
        return managers;
    }

    public static void setManagers(ArrayList<Managers> managers) {
        Managers.managers = managers;
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
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mstok
 */
public class Person  implements Serializable{
    
    /**
     * Id a jméno osoby
     */
    protected String ID;
    protected String name;

    
    public Person(String ID, String name) {
        this.ID = ID;
        this.name = name;          
    }
 

    public Person() {
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

    
    

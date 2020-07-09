/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author mstok
 */
public class Training {

    protected String player, player1, trainer, trainer1, trainer2, time, time1, notes, notes1, training;      
    protected Date dateD;

   

    public Training(Date dateD, String time, String time1, String player, String trainer, String trainer1, String trainer2, String notes, String notes1) {

        this.dateD = dateD;
        this.player = player;
        this.time = time;
        this.time1 = time1;
        this.trainer = trainer;
        this.trainer1 = trainer1;
        this.trainer2 = trainer2;
        this.notes = notes;
        this.notes1 = notes1;
    }

    public Training(String training) {
    }

    public Training(Date dateD, String time, String time1, String player, String trainer, String notes, String training) {

        this.dateD = dateD;
        this.time = time;
        this.time1 = time1;
        this.player = player;
        this.trainer = trainer;
        this.notes = notes;
        this.training = training;

    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getTrainer1() {
        return trainer1;
    }

    public void setTrainer1(String trainer1) {
        this.trainer1 = trainer1;
    }

    public String getTrainer2() {
        return trainer1;
    }

    public void setTrainer2(String trainer1) {
        this.trainer1 = trainer1;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes1() {
        return notes1;
    }

    public void setNotes1(String notes1) {
        this.notes1 = notes1;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

}

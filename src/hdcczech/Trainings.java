/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdcczech;

import java.awt.Dimension;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mstok
 */
public class Trainings extends javax.swing.JFrame implements Serializable {

    Date date, time, time1;
    Trainer tr = new Trainer();
    Connection conn = new DbConnection().connect();
    PreparedStatement pst;
    ResultSet rs;

    /**
     * - komponenty
     * - TrainerCombo()-naplnění ComboBoxů trenéry
     * - nastavení rychlosti ScrollBaru
     * - maximalizace okna
     * - Date()- formátovaní jDateChooseru
     * @throws java.text.ParseException
     */
    public Trainings() throws SQLException, ParseException {

        initComponents();
        TrainerCombo();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        Date();

    }

    /**
     * formátovaní jDateChooseru
     */
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
        dayChooser.setDate(date1);
    }

   
/**
 * naplnění ComboBoxů trenéry
 */
    private void TrainerCombo() {
        try {

            String sql = "SELECT * from trainers";
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                jComboBox1.addItem(name);
                jComboBox2.addItem(name);
                jComboBox3.addItem(name);
                jComboBox4.addItem(name);
                jComboBox5.addItem(name);
                jComboBox6.addItem(name);
                jComboBox7.addItem(name);
                jComboBox8.addItem(name);
                jComboBox9.addItem(name);
                jComboBox10.addItem(name);
                jComboBox11.addItem(name);
                jComboBox12.addItem(name);
                jComboBox13.addItem(name);
                jComboBox14.addItem(name);
                jComboBox15.addItem(name);
                jComboBox16.addItem(name);
                jComboBox17.addItem(name);
                jComboBox18.addItem(name);
                jComboBox19.addItem(name);
                jComboBox20.addItem(name);
                jComboBox21.addItem(name);
                jComboBox22.addItem(name);
                jComboBox23.addItem(name);
                jComboBox24.addItem(name);
                jComboBox25.addItem(name);
                jComboBox26.addItem(name);
                jComboBox27.addItem(name);
                jComboBox28.addItem(name);
                jComboBox29.addItem(name);
                jComboBox30.addItem(name);
                jComboBox31.addItem(name);
                jComboBox32.addItem(name);
                jComboBox33.addItem(name);
                jComboBox34.addItem(name);
                jComboBox35.addItem(name);
                jComboBox36.addItem(name);
                jComboBox37.addItem(name);
                jComboBox38.addItem(name);
                jComboBox39.addItem(name);
                jComboBox40.addItem(name);
                jComboBox41.addItem(name);
                jComboBox42.addItem(name);
                jComboBox43.addItem(name);
                jComboBox44.addItem(name);
                jComboBox45.addItem(name);
                jComboBox46.addItem(name);
                jComboBox47.addItem(name);
                jComboBox48.addItem(name);
                jComboBox49.addItem(name);
                jComboBox50.addItem(name);
                jComboBox51.addItem(name);
                jComboBox52.addItem(name);
                jComboBox53.addItem(name);
                jComboBox54.addItem(name);
                jComboBox55.addItem(name);
                jComboBox56.addItem(name);
                jComboBox57.addItem(name);
                jComboBox58.addItem(name);
                jComboBox59.addItem(name);
                jComboBox60.addItem(name);
                jComboBox61.addItem(name);
                jComboBox62.addItem(name);
                jComboBox63.addItem(name);
                jComboBox64.addItem(name);
                jComboBox65.addItem(name);
                jComboBox66.addItem(name);
                jComboBox67.addItem(name);
                jComboBox68.addItem(name);
                jComboBox69.addItem(name);
                jComboBox70.addItem(name);
                jComboBox71.addItem(name);
                jComboBox72.addItem(name);
                jComboBox73.addItem(name);
                jComboBox74.addItem(name);
                jComboBox75.addItem(name);
                jComboBox76.addItem(name);
                jComboBox77.addItem(name);
                jComboBox78.addItem(name);
                jComboBox79.addItem(name);
                jComboBox80.addItem(name);
                jComboBox81.addItem(name);
                jComboBox82.addItem(name);
                jComboBox83.addItem(name);
                jComboBox84.addItem(name);
                jComboBox85.addItem(name);
                jComboBox86.addItem(name);
                jComboBox87.addItem(name);
                jComboBox88.addItem(name);
                jComboBox89.addItem(name);
                jComboBox90.addItem(name);
                jComboBox91.addItem(name);
                jComboBox92.addItem(name);
                jComboBox93.addItem(name);
                jComboBox94.addItem(name);
                jComboBox95.addItem(name);
                jComboBox96.addItem(name);
                jComboBox97.addItem(name);
                jComboBox98.addItem(name);
                jComboBox99.addItem(name);
                jComboBox100.addItem(name);
                jComboBox101.addItem(name);
                jComboBox102.addItem(name);
                jComboBox103.addItem(name);
                jComboBox104.addItem(name);
                jComboBox105.addItem(name);
                jComboBox106.addItem(name);
                jComboBox107.addItem(name);
                jComboBox108.addItem(name);
                jComboBox109.addItem(name);
                jComboBox110.addItem(name);
                jComboBox111.addItem(name);
                jComboBox112.addItem(name);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

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
        choice1 = new java.awt.Choice();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dayChooser = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel257 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jPanel53 = new javax.swing.JPanel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox72 = new javax.swing.JComboBox<>();
        jLabel263 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jPanel28 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel55 = new javax.swing.JPanel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel275 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel29 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel281 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jSpinner17 = new javax.swing.JSpinner();
        jSpinner18 = new javax.swing.JSpinner();
        jSpinner19 = new javax.swing.JSpinner();
        jSpinner20 = new javax.swing.JSpinner();
        jPanel57 = new javax.swing.JPanel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox73 = new javax.swing.JComboBox<>();
        jLabel287 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jSpinner22 = new javax.swing.JSpinner();
        jSpinner23 = new javax.swing.JSpinner();
        jSpinner24 = new javax.swing.JSpinner();
        jPanel30 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jSpinner26 = new javax.swing.JSpinner();
        jSpinner27 = new javax.swing.JSpinner();
        jSpinner28 = new javax.swing.JSpinner();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jPanel59 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jComboBox29 = new javax.swing.JComboBox<>();
        jComboBox30 = new javax.swing.JComboBox<>();
        jLabel299 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jSpinner29 = new javax.swing.JSpinner();
        jSpinner30 = new javax.swing.JSpinner();
        jSpinner31 = new javax.swing.JSpinner();
        jSpinner32 = new javax.swing.JSpinner();
        jPanel31 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jComboBox31 = new javax.swing.JComboBox<>();
        jComboBox32 = new javax.swing.JComboBox<>();
        jLabel305 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jSpinner33 = new javax.swing.JSpinner();
        jSpinner34 = new javax.swing.JSpinner();
        jSpinner35 = new javax.swing.JSpinner();
        jSpinner36 = new javax.swing.JSpinner();
        jPanel61 = new javax.swing.JPanel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jComboBox33 = new javax.swing.JComboBox<>();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        jComboBox37 = new javax.swing.JComboBox<>();
        jComboBox74 = new javax.swing.JComboBox<>();
        jLabel311 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jSpinner38 = new javax.swing.JSpinner();
        jSpinner39 = new javax.swing.JSpinner();
        jSpinner40 = new javax.swing.JSpinner();
        jPanel32 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jSpinner41 = new javax.swing.JSpinner();
        jSpinner42 = new javax.swing.JSpinner();
        jSpinner43 = new javax.swing.JSpinner();
        jSpinner44 = new javax.swing.JSpinner();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jComboBox38 = new javax.swing.JComboBox<>();
        jComboBox39 = new javax.swing.JComboBox<>();
        jComboBox40 = new javax.swing.JComboBox<>();
        jComboBox41 = new javax.swing.JComboBox<>();
        jComboBox42 = new javax.swing.JComboBox<>();
        jComboBox43 = new javax.swing.JComboBox<>();
        jPanel63 = new javax.swing.JPanel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jComboBox44 = new javax.swing.JComboBox<>();
        jComboBox45 = new javax.swing.JComboBox<>();
        jLabel323 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jSpinner45 = new javax.swing.JSpinner();
        jSpinner46 = new javax.swing.JSpinner();
        jSpinner47 = new javax.swing.JSpinner();
        jSpinner48 = new javax.swing.JSpinner();
        jPanel33 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jComboBox46 = new javax.swing.JComboBox<>();
        jComboBox47 = new javax.swing.JComboBox<>();
        jLabel329 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jSpinner49 = new javax.swing.JSpinner();
        jSpinner50 = new javax.swing.JSpinner();
        jSpinner51 = new javax.swing.JSpinner();
        jSpinner52 = new javax.swing.JSpinner();
        jPanel65 = new javax.swing.JPanel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jComboBox48 = new javax.swing.JComboBox<>();
        jComboBox49 = new javax.swing.JComboBox<>();
        jComboBox50 = new javax.swing.JComboBox<>();
        jComboBox51 = new javax.swing.JComboBox<>();
        jComboBox52 = new javax.swing.JComboBox<>();
        jComboBox75 = new javax.swing.JComboBox<>();
        jLabel335 = new javax.swing.JLabel();
        jSpinner53 = new javax.swing.JSpinner();
        jSpinner54 = new javax.swing.JSpinner();
        jSpinner55 = new javax.swing.JSpinner();
        jSpinner56 = new javax.swing.JSpinner();
        jPanel34 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jSpinner57 = new javax.swing.JSpinner();
        jSpinner58 = new javax.swing.JSpinner();
        jSpinner59 = new javax.swing.JSpinner();
        jSpinner60 = new javax.swing.JSpinner();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jComboBox53 = new javax.swing.JComboBox<>();
        jComboBox54 = new javax.swing.JComboBox<>();
        jComboBox55 = new javax.swing.JComboBox<>();
        jComboBox56 = new javax.swing.JComboBox<>();
        jComboBox57 = new javax.swing.JComboBox<>();
        jComboBox58 = new javax.swing.JComboBox<>();
        jPanel67 = new javax.swing.JPanel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jComboBox59 = new javax.swing.JComboBox<>();
        jComboBox60 = new javax.swing.JComboBox<>();
        jLabel347 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jSpinner61 = new javax.swing.JSpinner();
        jSpinner62 = new javax.swing.JSpinner();
        jSpinner63 = new javax.swing.JSpinner();
        jSpinner64 = new javax.swing.JSpinner();
        jPanel35 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jComboBox61 = new javax.swing.JComboBox<>();
        jComboBox62 = new javax.swing.JComboBox<>();
        jLabel353 = new javax.swing.JLabel();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jSpinner65 = new javax.swing.JSpinner();
        jSpinner66 = new javax.swing.JSpinner();
        jSpinner67 = new javax.swing.JSpinner();
        jSpinner68 = new javax.swing.JSpinner();
        jPanel69 = new javax.swing.JPanel();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jComboBox63 = new javax.swing.JComboBox<>();
        jComboBox64 = new javax.swing.JComboBox<>();
        jComboBox65 = new javax.swing.JComboBox<>();
        jComboBox66 = new javax.swing.JComboBox<>();
        jComboBox67 = new javax.swing.JComboBox<>();
        jComboBox76 = new javax.swing.JComboBox<>();
        jLabel359 = new javax.swing.JLabel();
        jSpinner69 = new javax.swing.JSpinner();
        jSpinner70 = new javax.swing.JSpinner();
        jSpinner71 = new javax.swing.JSpinner();
        jSpinner72 = new javax.swing.JSpinner();
        jPanel36 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jLabel360 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jSpinner73 = new javax.swing.JSpinner();
        jSpinner74 = new javax.swing.JSpinner();
        jSpinner75 = new javax.swing.JSpinner();
        jSpinner76 = new javax.swing.JSpinner();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jComboBox68 = new javax.swing.JComboBox<>();
        jComboBox69 = new javax.swing.JComboBox<>();
        jComboBox70 = new javax.swing.JComboBox<>();
        jComboBox71 = new javax.swing.JComboBox<>();
        jComboBox77 = new javax.swing.JComboBox<>();
        jComboBox78 = new javax.swing.JComboBox<>();
        jPanel71 = new javax.swing.JPanel();
        jLabel366 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jComboBox79 = new javax.swing.JComboBox<>();
        jComboBox80 = new javax.swing.JComboBox<>();
        jLabel371 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jSpinner77 = new javax.swing.JSpinner();
        jSpinner78 = new javax.swing.JSpinner();
        jSpinner79 = new javax.swing.JSpinner();
        jSpinner80 = new javax.swing.JSpinner();
        jPanel37 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jComboBox81 = new javax.swing.JComboBox<>();
        jComboBox82 = new javax.swing.JComboBox<>();
        jLabel377 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jSpinner81 = new javax.swing.JSpinner();
        jSpinner82 = new javax.swing.JSpinner();
        jSpinner83 = new javax.swing.JSpinner();
        jSpinner84 = new javax.swing.JSpinner();
        jPanel73 = new javax.swing.JPanel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jComboBox83 = new javax.swing.JComboBox<>();
        jComboBox84 = new javax.swing.JComboBox<>();
        jComboBox85 = new javax.swing.JComboBox<>();
        jComboBox86 = new javax.swing.JComboBox<>();
        jComboBox87 = new javax.swing.JComboBox<>();
        jComboBox88 = new javax.swing.JComboBox<>();
        jLabel383 = new javax.swing.JLabel();
        jSpinner85 = new javax.swing.JSpinner();
        jSpinner86 = new javax.swing.JSpinner();
        jSpinner87 = new javax.swing.JSpinner();
        jSpinner88 = new javax.swing.JSpinner();
        jPanel38 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jSpinner89 = new javax.swing.JSpinner();
        jSpinner90 = new javax.swing.JSpinner();
        jSpinner91 = new javax.swing.JSpinner();
        jSpinner92 = new javax.swing.JSpinner();
        jTextField89 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jComboBox89 = new javax.swing.JComboBox<>();
        jComboBox90 = new javax.swing.JComboBox<>();
        jComboBox91 = new javax.swing.JComboBox<>();
        jComboBox92 = new javax.swing.JComboBox<>();
        jComboBox93 = new javax.swing.JComboBox<>();
        jComboBox94 = new javax.swing.JComboBox<>();
        jPanel75 = new javax.swing.JPanel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jComboBox95 = new javax.swing.JComboBox<>();
        jComboBox96 = new javax.swing.JComboBox<>();
        jLabel395 = new javax.swing.JLabel();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField96 = new javax.swing.JTextField();
        jSpinner93 = new javax.swing.JSpinner();
        jSpinner94 = new javax.swing.JSpinner();
        jSpinner95 = new javax.swing.JSpinner();
        jSpinner96 = new javax.swing.JSpinner();
        jPanel39 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jLabel396 = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jComboBox97 = new javax.swing.JComboBox<>();
        jComboBox98 = new javax.swing.JComboBox<>();
        jLabel401 = new javax.swing.JLabel();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();
        jSpinner97 = new javax.swing.JSpinner();
        jSpinner98 = new javax.swing.JSpinner();
        jSpinner99 = new javax.swing.JSpinner();
        jSpinner100 = new javax.swing.JSpinner();
        jPanel77 = new javax.swing.JPanel();
        jLabel402 = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jTextField101 = new javax.swing.JTextField();
        jTextField102 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jComboBox99 = new javax.swing.JComboBox<>();
        jComboBox100 = new javax.swing.JComboBox<>();
        jComboBox101 = new javax.swing.JComboBox<>();
        jComboBox102 = new javax.swing.JComboBox<>();
        jComboBox103 = new javax.swing.JComboBox<>();
        jComboBox104 = new javax.swing.JComboBox<>();
        jLabel407 = new javax.swing.JLabel();
        jSpinner101 = new javax.swing.JSpinner();
        jSpinner102 = new javax.swing.JSpinner();
        jSpinner103 = new javax.swing.JSpinner();
        jSpinner104 = new javax.swing.JSpinner();
        jPanel40 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jSpinner105 = new javax.swing.JSpinner();
        jSpinner106 = new javax.swing.JSpinner();
        jSpinner107 = new javax.swing.JSpinner();
        jSpinner108 = new javax.swing.JSpinner();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jComboBox105 = new javax.swing.JComboBox<>();
        jComboBox106 = new javax.swing.JComboBox<>();
        jComboBox107 = new javax.swing.JComboBox<>();
        jComboBox108 = new javax.swing.JComboBox<>();
        jComboBox109 = new javax.swing.JComboBox<>();
        jComboBox110 = new javax.swing.JComboBox<>();
        jPanel79 = new javax.swing.JPanel();
        jLabel414 = new javax.swing.JLabel();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jComboBox111 = new javax.swing.JComboBox<>();
        jComboBox112 = new javax.swing.JComboBox<>();
        jLabel419 = new javax.swing.JLabel();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jTextField111 = new javax.swing.JTextField();
        jTextField112 = new javax.swing.JTextField();
        jSpinner109 = new javax.swing.JSpinner();
        jSpinner110 = new javax.swing.JSpinner();
        jSpinner111 = new javax.swing.JSpinner();
        jSpinner112 = new javax.swing.JSpinner();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2500, 3700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setText("Tréninky");

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
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addComponent(jButton4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Kalendář");

        dayChooser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dayChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayChooserMouseClicked(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("Uložit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(dayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1885, 3254));

        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel252.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel252.setText("Čas od");

        jLabel253.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel253.setText("Čas do");

        jLabel254.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel254.setText("Hráči");

        jLabel255.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel255.setText("Trenér");

        jLabel256.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel256.setText("Poznámky");

        jComboBox9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jComboBox10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel257.setBackground(new java.awt.Color(204, 204, 255));
        jLabel257.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("HST 2");
        jLabel257.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jSpinner9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594015200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner9.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner9, "HH:mm"));
        jSpinner9.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594017900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner10.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner10, "HH:mm"));
        jSpinner10.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner12.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner12, "HH:mm"));
        jSpinner12.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594017900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner11.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner11, "HH:mm"));
        jSpinner11.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel255)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel256)
                .addGap(114, 114, 114))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel252)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel253)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel254))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel256)
                            .addComponent(jLabel255))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel257)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel252)
                            .addComponent(jLabel253)
                            .addComponent(jLabel254))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel53.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel258.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel258.setText("Čas od");

        jLabel259.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel259.setText("Čas do");

        jLabel260.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel260.setText("Hráč / Tým");

        jLabel261.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel261.setText("Trenér");

        jLabel262.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel262.setText("Poznámky");

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox72.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox72.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel263.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel263.setText("Led");
        jLabel263.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner16.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594018800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner16.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner16, "HH:mm"));
        jSpinner16.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner15.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594015200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner15.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner15, "HH:mm"));
        jSpinner15.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594011600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner13.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner13, "HH:mm"));
        jSpinner13.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner14.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594015200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner14.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner14, "HH:mm"));
        jSpinner14.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel258)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel259)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel260)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel261)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel53Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel53Layout.createSequentialGroup()
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel53Layout.createSequentialGroup()
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel262)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel263)
                .addGap(11, 11, 11)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel258)
                    .addComponent(jLabel259)
                    .addComponent(jLabel260)
                    .addComponent(jLabel261)
                    .addComponent(jLabel262))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox72, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel54.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel264.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel264.setText("Čas od");

        jLabel265.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel265.setText("Čas do");

        jLabel266.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel266.setText("Hráč / Tým");

        jLabel267.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel267.setText("Trenér");

        jLabel268.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel268.setText("Poznámky");

        jLabel269.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel269.setText("Posilovna/Suchá");
        jLabel269.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594017000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner6.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner6, "HH:mm"));
        jSpinner6.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594018800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner7.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner7, "HH:mm"));
        jSpinner7.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594015200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner5.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner5, "HH:mm"));
        jSpinner5.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner8.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner8, "HH:mm"));
        jSpinner8.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel269, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel54Layout.createSequentialGroup()
                                .addComponent(jLabel264)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel265)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel266)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel267)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel54Layout.createSequentialGroup()
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel268)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel269)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel264)
                    .addComponent(jLabel265)
                    .addComponent(jLabel266)
                    .addComponent(jLabel267)
                    .addComponent(jLabel268))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel270.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel270.setText("Čas od");

        jLabel271.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel271.setText("Čas do");

        jLabel272.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel272.setText("Hráči");

        jLabel273.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel273.setText("Trenér");

        jLabel274.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel274.setText("Poznámky");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel275.setBackground(new java.awt.Color(204, 204, 255));
        jLabel275.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel275.setText("HST 1");
        jLabel275.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594015200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "HH:mm"));
        jSpinner1.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594017900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner2.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner2, "HH:mm"));
        jSpinner2.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner4.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner4, "HH:mm"));
        jSpinner4.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594017900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner3.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner3, "HH:mm"));
        jSpinner3.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel273)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel274)
                .addGap(114, 114, 114))
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel275, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel270)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel271)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel272))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel274)
                            .addComponent(jLabel273))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel275)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel270)
                            .addComponent(jLabel271)
                            .addComponent(jLabel272))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel55Layout.createSequentialGroup()
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel276.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel276.setText("Čas od");

        jLabel277.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel277.setText("Čas do");

        jLabel278.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel278.setText("Hráči");

        jLabel279.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel279.setText("Trenér");

        jLabel280.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel280.setText("Poznámky");

        jComboBox16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });

        jComboBox17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel281.setBackground(new java.awt.Color(204, 204, 255));
        jLabel281.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel281.setText("HST 2");
        jLabel281.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jSpinner17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner17.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner17.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner17, "HH:mm"));
        jSpinner17.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner18.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594023300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner18.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner18, "HH:mm"));
        jSpinner18.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner19.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner19.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner19, "HH:mm"));
        jSpinner19.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner20.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594023300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner20.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner20, "HH:mm"));
        jSpinner20.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel279)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel280)
                .addGap(114, 114, 114))
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel276)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel277)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel278))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel280)
                            .addComponent(jLabel279))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel281)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel276)
                            .addComponent(jLabel277)
                            .addComponent(jLabel278))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel57.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel282.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel282.setText("Čas od");

        jLabel283.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel283.setText("Čas do");

        jLabel284.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel284.setText("Hráč / Tým");

        jLabel285.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel285.setText("Trenér");

        jLabel286.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel286.setText("Poznámky");

        jTextField21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox18ActionPerformed(evt);
            }
        });

        jComboBox19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox73.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox73.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel287.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel287.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel287.setText("Led");
        jLabel287.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner21.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner21.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner21, "HH:mm"));
        jSpinner21.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner22.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594022400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner22.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner22, "HH:mm"));
        jSpinner22.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner23.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594018800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner23.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner23, "HH:mm"));
        jSpinner23.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner24.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594022400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner24.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner24, "HH:mm"));
        jSpinner24.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel282)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel283)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel284)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel285)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel286)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel287)
                .addGap(11, 11, 11)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel282)
                    .addComponent(jLabel283)
                    .addComponent(jLabel284)
                    .addComponent(jLabel285)
                    .addComponent(jLabel286))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel58.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel288.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel288.setText("Čas od");

        jLabel289.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel289.setText("Čas do");

        jLabel290.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel290.setText("Hráč / Tým");

        jLabel291.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel291.setText("Trenér");

        jLabel292.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel292.setText("Poznámky");

        jLabel293.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("Posilovna/Suchá");
        jLabel293.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner25.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594022400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner25.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner25, "HH:mm"));
        jSpinner25.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner26.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594024200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner26.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner26, "HH:mm"));
        jSpinner26.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner27.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner27.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner27, "HH:mm"));
        jSpinner27.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner28.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner28.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner28, "HH:mm"));
        jSpinner28.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox23ActionPerformed(evt);
            }
        });

        jComboBox24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jLabel288)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel289)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel290)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel291)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel292)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel293)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel288)
                    .addComponent(jLabel289)
                    .addComponent(jLabel290)
                    .addComponent(jLabel291)
                    .addComponent(jLabel292))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel294.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel294.setText("Čas od");

        jLabel295.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel295.setText("Čas do");

        jLabel296.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel296.setText("Hráči");

        jLabel297.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel297.setText("Trenér");

        jLabel298.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel298.setText("Poznámky");

        jComboBox29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox29ActionPerformed(evt);
            }
        });

        jComboBox30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel299.setBackground(new java.awt.Color(204, 204, 255));
        jLabel299.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel299.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel299.setText("HST 1");
        jLabel299.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jSpinner29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner29.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594020600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner29.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner29, "HH:mm"));
        jSpinner29.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner30.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594023300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner30.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner30, "HH:mm"));
        jSpinner30.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner31.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner31.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner31, "HH:mm"));
        jSpinner31.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner32.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594023300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner32.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner32, "HH:mm"));
        jSpinner32.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField29))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel297)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel298)
                .addGap(114, 114, 114))
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel299, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel294)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel295)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel296))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addComponent(jSpinner29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addComponent(jSpinner32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel298)
                            .addComponent(jLabel297))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel299)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel294)
                            .addComponent(jLabel295)
                            .addComponent(jLabel296))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel300.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel300.setText("Čas od");

        jLabel301.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel301.setText("Čas do");

        jLabel302.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel302.setText("Hráči");

        jLabel303.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel303.setText("Trenér");

        jLabel304.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel304.setText("Poznámky");

        jComboBox31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox31ActionPerformed(evt);
            }
        });

        jComboBox32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel305.setBackground(new java.awt.Color(204, 204, 255));
        jLabel305.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel305.setText("HST 2");
        jLabel305.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jSpinner33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner33.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner33.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner33, "HH:mm"));
        jSpinner33.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner34.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594028700000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner34.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner34, "HH:mm"));
        jSpinner34.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner35.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594031400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner35.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner35, "HH:mm"));
        jSpinner35.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner36.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594028700000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner36.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner36, "HH:mm"));
        jSpinner36.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField33))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel303)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel304)
                .addGap(114, 114, 114))
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel300)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel301)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel302))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel60Layout.createSequentialGroup()
                                .addComponent(jSpinner33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel60Layout.createSequentialGroup()
                                .addComponent(jSpinner36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel304)
                            .addComponent(jLabel303))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel305)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel300)
                            .addComponent(jLabel301)
                            .addComponent(jLabel302))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel60Layout.createSequentialGroup()
                                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel61.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel306.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel306.setText("Čas od");

        jLabel307.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel307.setText("Čas do");

        jLabel308.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel308.setText("Hráč / Tým");

        jLabel309.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel309.setText("Trenér");

        jLabel310.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel310.setText("Poznámky");

        jTextField37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox33ActionPerformed(evt);
            }
        });

        jComboBox34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox74.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox74.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel311.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel311.setText("Led");
        jLabel311.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner37.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594033200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner37.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner37, "HH:mm"));
        jSpinner37.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner38.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594029600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner38.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner38, "HH:mm"));
        jSpinner38.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner39.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner39.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner39, "HH:mm"));
        jSpinner39.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner40.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594029600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner40.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner40, "HH:mm"));
        jSpinner40.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel306)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel307)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel308)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel309)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addComponent(jSpinner39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addComponent(jSpinner38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel61Layout.createSequentialGroup()
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel61Layout.createSequentialGroup()
                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel310)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel311)
                .addGap(11, 11, 11)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel306)
                    .addComponent(jLabel307)
                    .addComponent(jLabel308)
                    .addComponent(jLabel309)
                    .addComponent(jLabel310))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel62.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel312.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel312.setText("Čas od");

        jLabel313.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel313.setText("Čas do");

        jLabel314.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel314.setText("Hráč / Tým");

        jLabel315.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel315.setText("Trenér");

        jLabel316.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel316.setText("Poznámky");

        jLabel317.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("Posilovna/Suchá");
        jLabel317.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner41.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594027800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner41.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner41, "HH:mm"));
        jSpinner41.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner42.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594029600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner42.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner42, "HH:mm"));
        jSpinner42.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner43.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner43.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner43, "HH:mm"));
        jSpinner43.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner44.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594031400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner44.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner44, "HH:mm"));
        jSpinner44.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox38ActionPerformed(evt);
            }
        });

        jComboBox39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(jLabel312)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel313)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel314)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel315)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addComponent(jSpinner43, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner41, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner42, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel316)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel317)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel312)
                    .addComponent(jLabel313)
                    .addComponent(jLabel314)
                    .addComponent(jLabel315)
                    .addComponent(jLabel316))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel318.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel318.setText("Čas od");

        jLabel319.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel319.setText("Čas do");

        jLabel320.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel320.setText("Hráči");

        jLabel321.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel321.setText("Trenér");

        jLabel322.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel322.setText("Poznámky");

        jComboBox44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox44ActionPerformed(evt);
            }
        });

        jComboBox45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox45.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel323.setBackground(new java.awt.Color(204, 204, 255));
        jLabel323.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel323.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel323.setText("HST 1");
        jLabel323.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jTextField46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jSpinner45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner45.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594026000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner45.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner45, "HH:mm"));
        jSpinner45.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner46.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594028700000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner46.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner46, "HH:mm"));
        jSpinner46.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner47.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594031400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner47.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner47, "HH:mm"));
        jSpinner47.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner48.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594028700000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner48.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner48, "HH:mm"));
        jSpinner48.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField48, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField45))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel321)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel322)
                .addGap(114, 114, 114))
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel323, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel318)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel319)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel320))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(jSpinner45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(jSpinner48, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner47, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel322)
                            .addComponent(jLabel321))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel323)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel318)
                            .addComponent(jLabel319)
                            .addComponent(jLabel320))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel324.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel324.setText("Čas od");

        jLabel325.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel325.setText("Čas do");

        jLabel326.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel326.setText("Hráči");

        jLabel327.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel327.setText("Trenér");

        jLabel328.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel328.setText("Poznámky");

        jComboBox46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox46.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox46ActionPerformed(evt);
            }
        });

        jComboBox47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox47.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel329.setBackground(new java.awt.Color(204, 204, 255));
        jLabel329.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel329.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel329.setText("HST 2");
        jLabel329.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jTextField50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField51.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });

        jSpinner49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner49.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594033200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner49.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner49, "HH:mm"));
        jSpinner49.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner50.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594035900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner50.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner50, "HH:mm"));
        jSpinner50.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner51.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner51.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner51.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner51, "HH:mm"));
        jSpinner51.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner52.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594035900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner52.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner52, "HH:mm"));
        jSpinner52.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField52, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField49))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel327)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel328)
                .addGap(114, 114, 114))
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel329, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel324)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel325)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel326))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addComponent(jSpinner49, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addComponent(jSpinner52, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner51, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel328)
                            .addComponent(jLabel327))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel329)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel324)
                            .addComponent(jLabel325)
                            .addComponent(jLabel326))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel64Layout.createSequentialGroup()
                                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel65.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel330.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel330.setText("Čas od");

        jLabel331.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel331.setText("Čas do");

        jLabel332.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel332.setText("Hráč / Tým");

        jLabel333.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel333.setText("Trenér");

        jLabel334.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel334.setText("Poznámky");

        jTextField53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField56.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox48.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox48ActionPerformed(evt);
            }
        });

        jComboBox49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox49.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox50.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox51.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox51.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox52.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox75.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox75.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel335.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel335.setText("Led");
        jLabel335.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner53.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594040400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner53.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner53, "HH:mm"));
        jSpinner53.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner54.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594036800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner54.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner54, "HH:mm"));
        jSpinner54.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner55.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594033200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner55.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner55, "HH:mm"));
        jSpinner55.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner56.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner56.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594036800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner56.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner56, "HH:mm"));
        jSpinner56.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel330)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel331)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel332)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel333)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addComponent(jSpinner55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner56, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addComponent(jSpinner54, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner53, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel65Layout.createSequentialGroup()
                                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel65Layout.createSequentialGroup()
                                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel334)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel335)
                .addGap(11, 11, 11)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel330)
                    .addComponent(jLabel331)
                    .addComponent(jLabel332)
                    .addComponent(jLabel333)
                    .addComponent(jLabel334))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel66.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel336.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel336.setText("Čas od");

        jLabel337.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel337.setText("Čas do");

        jLabel338.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel338.setText("Hráč / Tým");

        jLabel339.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel339.setText("Trenér");

        jLabel340.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel340.setText("Poznámky");

        jLabel341.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel341.setText("Posilovna/Suchá");
        jLabel341.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner57.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594035000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner57.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner57, "HH:mm"));
        jSpinner57.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner58.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594036800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner58.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner58, "HH:mm"));
        jSpinner58.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner59.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594033200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner59.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner59, "HH:mm"));
        jSpinner59.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner60.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner60.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner60, "HH:mm"));
        jSpinner60.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox53ActionPerformed(evt);
            }
        });

        jComboBox54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox54.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox55.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox56.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox56.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox57.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox58.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel341, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(jLabel336)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel337)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel338)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel339)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addComponent(jSpinner59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner57, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner58, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner60, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel340)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel341)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel336)
                    .addComponent(jLabel337)
                    .addComponent(jLabel338)
                    .addComponent(jLabel339)
                    .addComponent(jLabel340))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner58, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner60, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel342.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel342.setText("Čas od");

        jLabel343.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel343.setText("Čas do");

        jLabel344.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel344.setText("Hráči");

        jLabel345.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel345.setText("Trenér");

        jLabel346.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel346.setText("Poznámky");

        jComboBox59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox59.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox59ActionPerformed(evt);
            }
        });

        jComboBox60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox60.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel347.setBackground(new java.awt.Color(204, 204, 255));
        jLabel347.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel347.setText("HST 1");
        jLabel347.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });

        jTextField62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField63.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField64.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField64ActionPerformed(evt);
            }
        });

        jSpinner61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner61.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594033200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner61.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner61, "HH:mm"));
        jSpinner61.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner62.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594035900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner62.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner62, "HH:mm"));
        jSpinner62.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner63.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner63.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner63.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner63, "HH:mm"));
        jSpinner63.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner64.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner64.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594035900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner64.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner64, "HH:mm"));
        jSpinner64.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jComboBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField64, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField61))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel345)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel346)
                .addGap(114, 114, 114))
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel347, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel342)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel343)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel344))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jSpinner61, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner62, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jSpinner64, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner63, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel346)
                            .addComponent(jLabel345))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox60, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel347)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel342)
                            .addComponent(jLabel343)
                            .addComponent(jLabel344))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner62, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner64, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner63, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel348.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel348.setText("Čas od");

        jLabel349.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel349.setText("Čas do");

        jLabel350.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel350.setText("Hráči");

        jLabel351.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel351.setText("Trenér");

        jLabel352.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel352.setText("Poznámky");

        jComboBox61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox61.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox61ActionPerformed(evt);
            }
        });

        jComboBox62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox62.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel353.setBackground(new java.awt.Color(204, 204, 255));
        jLabel353.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel353.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel353.setText("HST 2");
        jLabel353.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField65.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField65ActionPerformed(evt);
            }
        });

        jTextField66.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField67.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField68.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField68ActionPerformed(evt);
            }
        });

        jSpinner65.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner65.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner65.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner65, "HH:mm"));
        jSpinner65.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner66.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner66.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594041300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner66.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner66, "HH:mm"));
        jSpinner66.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner67.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner67.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner67.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner67, "HH:mm"));
        jSpinner67.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner68.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner68.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594041300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner68.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner68, "HH:mm"));
        jSpinner68.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addComponent(jComboBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField68, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField65))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel351)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel352)
                .addGap(114, 114, 114))
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel353, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel348)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel349)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel350))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addComponent(jSpinner65, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner66, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addComponent(jSpinner68, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner67, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel352)
                            .addComponent(jLabel351))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel68Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel353)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel348)
                            .addComponent(jLabel349)
                            .addComponent(jLabel350))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel68Layout.createSequentialGroup()
                                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner65, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner66, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner67, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel69.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel354.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel354.setText("Čas od");

        jLabel355.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel355.setText("Čas do");

        jLabel356.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel356.setText("Hráč / Tým");

        jLabel357.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel357.setText("Trenér");

        jLabel358.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel358.setText("Poznámky");

        jTextField69.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField70.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField71.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField72.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox63.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox63.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox63ActionPerformed(evt);
            }
        });

        jComboBox64.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox64.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox65.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox65.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox66.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox66.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox67.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox67.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox76.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel359.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel359.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel359.setText("Led");
        jLabel359.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner69.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner69.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner69.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner69, "HH:mm"));
        jSpinner69.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner70.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner70.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594040400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner70.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner70, "HH:mm"));
        jSpinner70.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner71.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner71.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594040400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner71.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner71, "HH:mm"));
        jSpinner71.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner72.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner72.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner72.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner72, "HH:mm"));
        jSpinner72.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel354)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel355)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel356)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel357)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel69Layout.createSequentialGroup()
                                .addComponent(jSpinner71, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner72, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel69Layout.createSequentialGroup()
                                .addComponent(jSpinner70, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner69, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel69Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel69Layout.createSequentialGroup()
                                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel69Layout.createSequentialGroup()
                                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel358)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel359, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel359)
                .addGap(11, 11, 11)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel354)
                    .addComponent(jLabel355)
                    .addComponent(jLabel356)
                    .addComponent(jLabel357)
                    .addComponent(jLabel358))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel69Layout.createSequentialGroup()
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner71, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner72, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner70, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel70.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel360.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel360.setText("Čas od");

        jLabel361.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel361.setText("Čas do");

        jLabel362.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel362.setText("Hráč / Tým");

        jLabel363.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel363.setText("Trenér");

        jLabel364.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel364.setText("Poznámky");

        jLabel365.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel365.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel365.setText("Posilovna/Suchá");
        jLabel365.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner73.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner73.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594040400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner73.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner73, "HH:mm"));
        jSpinner73.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner74.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner74.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594042200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner74.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner74, "HH:mm"));
        jSpinner74.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner75.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner75.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner75.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner75, "HH:mm"));
        jSpinner75.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner76.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner76.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner76, "HH:mm"));
        jSpinner76.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField73.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField74.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField75.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox68.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox68.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox68ActionPerformed(evt);
            }
        });

        jComboBox69.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox69.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox70.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox70.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox71.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox71.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox77.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox77.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox78.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox78.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel365, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jLabel360)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel361)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel362)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel363)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jSpinner75, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner73, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner74, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner76, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel364)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel365)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel360)
                    .addComponent(jLabel361)
                    .addComponent(jLabel362)
                    .addComponent(jLabel363)
                    .addComponent(jLabel364))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner74, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel366.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel366.setText("Čas od");

        jLabel367.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel367.setText("Čas do");

        jLabel368.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel368.setText("Hráči");

        jLabel369.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel369.setText("Trenér");

        jLabel370.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel370.setText("Poznámky");

        jComboBox79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox79.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox79ActionPerformed(evt);
            }
        });

        jComboBox80.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox80.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel371.setBackground(new java.awt.Color(204, 204, 255));
        jLabel371.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel371.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel371.setText("HST 1");
        jLabel371.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField77.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField77ActionPerformed(evt);
            }
        });

        jTextField78.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField80.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField80ActionPerformed(evt);
            }
        });

        jSpinner77.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner77.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594038600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner77.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner77, "HH:mm"));
        jSpinner77.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner78.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner78.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594041300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner78.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner78, "HH:mm"));
        jSpinner78.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner79.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner79.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner79, "HH:mm"));
        jSpinner79.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner80.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner80.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594041300000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner80.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner80, "HH:mm"));
        jSpinner80.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField80, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField77))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel369)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel370)
                .addGap(114, 114, 114))
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel371, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel366)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel367)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel368))
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel71Layout.createSequentialGroup()
                                .addComponent(jSpinner77, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner78, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel71Layout.createSequentialGroup()
                                .addComponent(jSpinner80, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner79, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel370)
                            .addComponent(jLabel369))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel371)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel366)
                            .addComponent(jLabel367)
                            .addComponent(jLabel368))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel71Layout.createSequentialGroup()
                                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner80, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner79, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel372.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel372.setText("Čas od");

        jLabel373.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel373.setText("Čas do");

        jLabel374.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel374.setText("Hráči");

        jLabel375.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel375.setText("Trenér");

        jLabel376.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel376.setText("Poznámky");

        jComboBox81.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox81.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox81ActionPerformed(evt);
            }
        });

        jComboBox82.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox82.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel377.setBackground(new java.awt.Color(204, 204, 255));
        jLabel377.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel377.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel377.setText("HST 2");
        jLabel377.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField81.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField81ActionPerformed(evt);
            }
        });

        jTextField82.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField83.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField84.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField84ActionPerformed(evt);
            }
        });

        jSpinner81.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner81.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594045800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner81.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner81, "HH:mm"));
        jSpinner81.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner82.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner82.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594048500000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner82.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner82, "HH:mm"));
        jSpinner82.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner83.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner83.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner83.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner83, "HH:mm"));
        jSpinner83.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner84.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner84.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594048500000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner84.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner84, "HH:mm"));
        jSpinner84.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jComboBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField84, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField81))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel375)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel376)
                .addGap(114, 114, 114))
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel377, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel372)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel373)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel374))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addComponent(jSpinner81, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner82, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addComponent(jSpinner84, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner83, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel376)
                            .addComponent(jLabel375))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel377)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel372)
                            .addComponent(jLabel373)
                            .addComponent(jLabel374))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel72Layout.createSequentialGroup()
                                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner82, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner83, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel73.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel378.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel378.setText("Čas od");

        jLabel379.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel379.setText("Čas do");

        jLabel380.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel380.setText("Hráč / Tým");

        jLabel381.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel381.setText("Trenér");

        jLabel382.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel382.setText("Poznámky");

        jTextField85.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField85.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField86.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField86.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField87.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField87.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField88.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField88.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox83.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox83.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox83ActionPerformed(evt);
            }
        });

        jComboBox84.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox84.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox85.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox85.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox86.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox86.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox87.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox87.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox88.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox88.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel383.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel383.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel383.setText("Led");
        jLabel383.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner85.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner85.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner85.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner85, "HH:mm"));
        jSpinner85.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner86.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner86.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594047600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner86.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner86, "HH:mm"));
        jSpinner86.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner87.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner87.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594044000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner87.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner87, "HH:mm"));
        jSpinner87.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner88.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner88.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594047600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner88.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner88, "HH:mm"));
        jSpinner88.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel378)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel379)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel380)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel381)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel73Layout.createSequentialGroup()
                                .addComponent(jSpinner87, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner88, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel73Layout.createSequentialGroup()
                                .addComponent(jSpinner86, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner85, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel73Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel73Layout.createSequentialGroup()
                                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel73Layout.createSequentialGroup()
                                        .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel382)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel383, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel383)
                .addGap(11, 11, 11)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel378)
                    .addComponent(jLabel379)
                    .addComponent(jLabel380)
                    .addComponent(jLabel381)
                    .addComponent(jLabel382))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox86, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner87, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner88, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner86, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner85, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox88, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel74.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel384.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel384.setText("Čas od");

        jLabel385.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel385.setText("Čas do");

        jLabel386.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel386.setText("Hráč / Tým");

        jLabel387.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel387.setText("Trenér");

        jLabel388.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel388.setText("Poznámky");

        jLabel389.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel389.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel389.setText("Posilovna/Suchá");
        jLabel389.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner89.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner89.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594134000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner89.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner89, "HH:mm"));
        jSpinner89.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner90.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner90.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594049400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner90.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner90, "HH:mm"));
        jSpinner90.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner91.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner91.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594045800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner91.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner91, "HH:mm"));
        jSpinner91.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner92.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner92.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner92.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner92, "HH:mm"));
        jSpinner92.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField89.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField89.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField90.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField90.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField91.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField91.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField92.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField92.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox89.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox89.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox89ActionPerformed(evt);
            }
        });

        jComboBox90.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox90.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox91.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox91.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox92.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox92.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox93.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox93.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox94.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox94.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel389, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel74Layout.createSequentialGroup()
                                .addComponent(jLabel384)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel385)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel386)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel387)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel74Layout.createSequentialGroup()
                                .addComponent(jSpinner91, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner89, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox89, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner90, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner92, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox91, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel388)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel389)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel384)
                    .addComponent(jLabel385)
                    .addComponent(jLabel386)
                    .addComponent(jLabel387)
                    .addComponent(jLabel388))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner91, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner89, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox89, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner90, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner92, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox91, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel390.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel390.setText("Čas od");

        jLabel391.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel391.setText("Čas do");

        jLabel392.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel392.setText("Hráči");

        jLabel393.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel393.setText("Trenér");

        jLabel394.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel394.setText("Poznámky");

        jComboBox95.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox95.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox95ActionPerformed(evt);
            }
        });

        jComboBox96.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox96.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel395.setBackground(new java.awt.Color(204, 204, 255));
        jLabel395.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel395.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel395.setText("HST 1");
        jLabel395.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField93.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField93.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField93ActionPerformed(evt);
            }
        });

        jTextField94.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField94.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField95.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField95.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField96.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField96.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField96ActionPerformed(evt);
            }
        });

        jSpinner93.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner93.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594045800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner93.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner93, "HH:mm"));
        jSpinner93.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner94.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner94.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594048500000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner94.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner94, "HH:mm"));
        jSpinner94.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner95.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner95.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner95.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner95, "HH:mm"));
        jSpinner95.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner96.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner96.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594048500000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner96.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner96, "HH:mm"));
        jSpinner96.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox96, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jComboBox95, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField96, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField93))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel393)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel394)
                .addGap(114, 114, 114))
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel395, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel390)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel391)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel392))
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel75Layout.createSequentialGroup()
                                .addComponent(jSpinner93, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner94, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel75Layout.createSequentialGroup()
                                .addComponent(jSpinner96, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner95, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel394)
                            .addComponent(jLabel393))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox95, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox96, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel395)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel390)
                            .addComponent(jLabel391)
                            .addComponent(jLabel392))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel75Layout.createSequentialGroup()
                                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner94, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner96, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner95, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel396.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel396.setText("Čas od");

        jLabel397.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel397.setText("Čas do");

        jLabel398.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel398.setText("Hráči");

        jLabel399.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel399.setText("Trenér");

        jLabel400.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel400.setText("Poznámky");

        jComboBox97.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox97.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox97ActionPerformed(evt);
            }
        });

        jComboBox98.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox98.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel401.setBackground(new java.awt.Color(204, 204, 255));
        jLabel401.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel401.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel401.setText("HST 2");
        jLabel401.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField97.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField97.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField97ActionPerformed(evt);
            }
        });

        jTextField98.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField98.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField99.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField99.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField100.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField100ActionPerformed(evt);
            }
        });

        jSpinner97.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner97.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner97.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner97, "HH:mm"));
        jSpinner97.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner98.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner98.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594053900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner98.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner98, "HH:mm"));
        jSpinner98.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner99.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner99.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594056600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner99.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner99, "HH:mm"));
        jSpinner99.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner100.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner100.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594053900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner100.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner100, "HH:mm"));
        jSpinner100.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox98, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jComboBox97, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField100, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField97))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel399)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel400)
                .addGap(114, 114, 114))
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel401, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel396)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel397)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel398))
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel76Layout.createSequentialGroup()
                                .addComponent(jSpinner97, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner98, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel76Layout.createSequentialGroup()
                                .addComponent(jSpinner100, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner99, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel400)
                            .addComponent(jLabel399))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox97, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox98, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel401)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel396)
                            .addComponent(jLabel397)
                            .addComponent(jLabel398))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel76Layout.createSequentialGroup()
                                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner97, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner98, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner100, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel77.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel402.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel402.setText("Čas od");

        jLabel403.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel403.setText("Čas do");

        jLabel404.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel404.setText("Hráč / Tým");

        jLabel405.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel405.setText("Trenér");

        jLabel406.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel406.setText("Poznámky");

        jTextField101.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField101.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField102.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField102.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField103.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField103.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField104.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField104.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox99.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox99.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox99ActionPerformed(evt);
            }
        });

        jComboBox100.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox100.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox101.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox101.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox102.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox102.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox103.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox103.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox104.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox104.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel407.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel407.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel407.setText("Led");
        jLabel407.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner101.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner101.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594058400000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner101.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner101, "HH:mm"));
        jSpinner101.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner102.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner102.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594054800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner102.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner102, "HH:mm"));
        jSpinner102.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner103.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner103.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner103.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner103, "HH:mm"));
        jSpinner103.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner104.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner104.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594054800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner104.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner104, "HH:mm"));
        jSpinner104.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel402)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel403)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel404)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel405)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addComponent(jSpinner103, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner104, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addComponent(jSpinner102, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner101, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jComboBox103, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel77Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel77Layout.createSequentialGroup()
                                        .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox101, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel77Layout.createSequentialGroup()
                                        .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox99, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel406)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel407, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel407)
                .addGap(11, 11, 11)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel402)
                    .addComponent(jLabel403)
                    .addComponent(jLabel404)
                    .addComponent(jLabel405)
                    .addComponent(jLabel406))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox100, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox103, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox101, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox102, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner103, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner104, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner102, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner101, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox104, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel78.setPreferredSize(new java.awt.Dimension(850, 330));

        jLabel408.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel408.setText("Čas od");

        jLabel409.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel409.setText("Čas do");

        jLabel410.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel410.setText("Hráč / Tým");

        jLabel411.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel411.setText("Trenér");

        jLabel412.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel412.setText("Poznámky");

        jLabel413.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel413.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel413.setText("Posilovna/Suchá");
        jLabel413.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinner105.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner105.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594053000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner105.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner105, "HH:mm"));
        jSpinner105.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner106.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner106.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594054800000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner106.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner106, "HH:mm"));
        jSpinner106.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner107.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner107.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner107.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner107, "HH:mm"));
        jSpinner107.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner108.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner108.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594056600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner108.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner108, "HH:mm"));
        jSpinner108.setMinimumSize(new java.awt.Dimension(55, 34));

        jTextField105.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField105.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField106.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField106.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField107.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField107.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField108.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField108.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox105.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox105.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox105ActionPerformed(evt);
            }
        });

        jComboBox106.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox106.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox107.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox107.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox108.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox108.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox109.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox109.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBox110.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox110.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel413, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel78Layout.createSequentialGroup()
                                .addComponent(jLabel408)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel409)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel410)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel411)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel78Layout.createSequentialGroup()
                                .addComponent(jSpinner107, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner105, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox105, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox106, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSpinner106, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner108, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox110, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel412)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel413)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel408)
                    .addComponent(jLabel409)
                    .addComponent(jLabel410)
                    .addComponent(jLabel411)
                    .addComponent(jLabel412))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner107, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner105, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox105, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox106, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox109, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner106, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner108, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox107, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox108, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox110, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel414.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel414.setText("Čas od");

        jLabel415.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel415.setText("Čas do");

        jLabel416.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel416.setText("Hráči");

        jLabel417.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel417.setText("Trenér");

        jLabel418.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel418.setText("Poznámky");

        jComboBox111.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox111.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox111ActionPerformed(evt);
            }
        });

        jComboBox112.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox112.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel419.setBackground(new java.awt.Color(204, 204, 255));
        jLabel419.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel419.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel419.setText("HST 1");
        jLabel419.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField109.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField109.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField109ActionPerformed(evt);
            }
        });

        jTextField110.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField110.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField111.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField111.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField112.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField112.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField112ActionPerformed(evt);
            }
        });

        jSpinner109.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner109.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594051200000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner109.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner109, "HH:mm"));
        jSpinner109.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner110.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner110.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594053900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner110.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner110, "HH:mm"));
        jSpinner110.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner111.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner111.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594056600000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner111.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner111, "HH:mm"));
        jSpinner111.setMinimumSize(new java.awt.Dimension(55, 34));

        jSpinner112.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinner112.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594053900000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner112.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner112, "HH:mm"));
        jSpinner112.setMinimumSize(new java.awt.Dimension(55, 34));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox112, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addComponent(jComboBox111, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField112, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField109))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel417)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel418)
                .addGap(114, 114, 114))
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel419, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel414)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel415)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel416))
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel79Layout.createSequentialGroup()
                                .addComponent(jSpinner109, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner110, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel79Layout.createSequentialGroup()
                                .addComponent(jSpinner112, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner111, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel418)
                            .addComponent(jLabel417))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox112, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel419)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel414)
                            .addComponent(jLabel415)
                            .addComponent(jLabel416))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel79Layout.createSequentialGroup()
                                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner109, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner110, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner112, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1898, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Zobrazí okno pro přihlášení, zavře stávající
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Login1 login = new Login1();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Zobrazení okna s manažery, zavření stávajícího
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Admin acc = null;
        try {
            acc = new Admin();
        } catch (SQLException ex) {
            Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
        }
        acc.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * zobrazení okna AddTrainer, zavření stávajícího
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddTrainer add = null;
        try {
            add = new AddTrainer();
        } catch (SQLException ex) {
            Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
        }
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dayChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayChooserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dayChooserMouseClicked

    /**
     * Uložení tréninků do databáze
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        date = new Date(dayChooser.getDate().getTime());
SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");

        try {
            String query = "INSERT into training(date, time, time1, player, trainer, trainer1, trainer2, notes, training) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(query);

            if (jTextField1.getText().isEmpty() && jComboBox1.getSelectedItem().toString().isEmpty() && jTextField3.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner1.getValue().toString());
                pst.setString(3, jSpinner2.getValue().toString());
                pst.setString(4, jTextField1.getText());
                pst.setString(5, jComboBox1.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField3.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();
            }

            if (jTextField2.getText().isEmpty() && jComboBox2.getSelectedItem().toString().isEmpty() && jTextField4.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner3.getValue().toString());
                pst.setString(3, jSpinner4.getValue().toString());
                pst.setString(4, jTextField2.getText());
                pst.setString(5, jComboBox2.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField4.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField9.getText().isEmpty() && jComboBox9.getSelectedItem().toString().isEmpty() && jTextField10.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner9.getValue().toString());
                pst.setString(3, jSpinner10.getValue().toString());
                pst.setString(4, jTextField9.getText());
                pst.setString(5, jComboBox9.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField10.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }

            if (jTextField11.getText().isEmpty() && jComboBox10.getSelectedItem().toString().isEmpty() && jTextField12.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner11.getValue().toString());
                pst.setString(3, jSpinner12.getValue().toString());
                pst.setString(4, jTextField11.getText());
                pst.setString(5, jComboBox10.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField12.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField30.getText().isEmpty() && jComboBox29.getSelectedItem().toString().isEmpty() && jTextField29.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner29.getValue().toString());
                pst.setString(3, jSpinner30.getValue().toString());
                pst.setString(4, jTextField30.getText());
                pst.setString(5, jComboBox29.getSelectedItem().toString());
                pst.setString(8, "");
                pst.setString(9, "");
                pst.setString(6, jTextField29.getText());
                pst.setString(7, "Hst");
                pst.executeUpdate();

            }
            if (jTextField31.getText().isEmpty() && jComboBox30.getSelectedItem().toString().isEmpty() && jTextField32.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner32.getValue().toString());
                pst.setString(3, jSpinner31.getValue().toString());
                pst.setString(4, jTextField31.getText());
                pst.setString(5, jComboBox30.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField32.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField18.getText().isEmpty() && jComboBox16.getSelectedItem().toString().isEmpty() && jTextField18.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner17.getValue().toString());
                pst.setString(3, jSpinner18.getValue().toString());
                pst.setString(4, jTextField18.getText());
                pst.setString(5, jComboBox16.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField17.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField19.getText().isEmpty() && jComboBox17.getSelectedItem().toString().isEmpty() && jTextField20.getText().isEmpty()) {
                ;
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner20.getValue().toString());
                pst.setString(3, jSpinner19.getValue().toString());
                pst.setString(4, jTextField19.getText());
                pst.setString(5, jComboBox17.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField20.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField46.getText().isEmpty() && jComboBox44.getSelectedItem().toString().isEmpty() && jTextField45.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner45.getValue().toString());
                pst.setString(3, jSpinner46.getValue().toString());
                pst.setString(4, jTextField46.getText());
                pst.setString(5, jComboBox44.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField45.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField47.getText().isEmpty() && jComboBox45.getSelectedItem().toString().isEmpty() && jTextField48.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner48.getValue().toString());
                pst.setString(3, jSpinner47.getValue().toString());
                pst.setString(4, jTextField47.getText());
                pst.setString(5, jComboBox48.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField48.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField34.getText().isEmpty() && jComboBox31.getSelectedItem().toString().isEmpty() && jTextField33.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner33.getValue().toString());
                pst.setString(3, jSpinner34.getValue().toString());
                pst.setString(4, jTextField34.getText());
                pst.setString(5, jComboBox31.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField33.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField35.getText().isEmpty() && jComboBox32.getSelectedItem().toString().isEmpty() && jTextField36.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner36.getValue().toString());
                pst.setString(3, jSpinner35.getValue().toString());
                pst.setString(4, jTextField35.getText());
                pst.setString(5, jComboBox32.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField36.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField62.getText().isEmpty() && jComboBox59.getSelectedItem().toString().isEmpty() && jTextField61.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner61.getValue().toString());
                pst.setString(3, jSpinner62.getValue().toString());
                pst.setString(4, jTextField62.getText());
                pst.setString(5, jComboBox59.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField61.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField63.getText().isEmpty() && jComboBox60.getSelectedItem().toString().isEmpty() && jTextField64.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner64.getValue().toString());
                pst.setString(3, jSpinner63.getValue().toString());
                pst.setString(4, jTextField63.getText());
                pst.setString(5, jComboBox60.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField64.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField50.getText().isEmpty() && jComboBox46.getSelectedItem().toString().isEmpty() && jTextField49.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner49.getValue().toString());
                pst.setString(3, jSpinner50.getValue().toString());
                pst.setString(4, jTextField50.getText());
                pst.setString(5, jComboBox46.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField49.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField51.getText().isEmpty() && jComboBox47.getSelectedItem().toString().isEmpty() && jTextField52.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner52.getValue().toString());
                pst.setString(3, jSpinner51.getValue().toString());
                pst.setString(4, jTextField51.getText());
                pst.setString(5, jComboBox47.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField52.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField78.getText().isEmpty() && jComboBox79.getSelectedItem().toString().isEmpty() && jTextField77.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner77.getValue().toString());
                pst.setString(3, jSpinner78.getValue().toString());
                pst.setString(4, jTextField78.getText());
                pst.setString(5, jComboBox79.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField77.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField79.getText().isEmpty() && jComboBox80.getSelectedItem().toString().isEmpty() && jTextField80.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner80.getValue().toString());
                pst.setString(3, jSpinner79.getValue().toString());
                pst.setString(4, jTextField79.getText());
                pst.setString(5, jComboBox80.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField80.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField66.getText().isEmpty() && jComboBox61.getSelectedItem().toString().isEmpty() && jTextField65.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner65.getValue().toString());
                pst.setString(3, jSpinner66.getValue().toString());
                pst.setString(4, jTextField66.getText());
                pst.setString(5, jComboBox61.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField65.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField67.getText().isEmpty() && jComboBox62.getSelectedItem().toString().isEmpty() && jTextField68.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner68.getValue().toString());
                pst.setString(3, jSpinner67.getValue().toString());
                pst.setString(4, jTextField67.getText());
                pst.setString(5, jComboBox62.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField68.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField94.getText().isEmpty() && jComboBox95.getSelectedItem().toString().isEmpty() && jTextField93.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner93.getValue().toString());
                pst.setString(3, jSpinner94.getValue().toString());
                pst.setString(4, jTextField94.getText());
                pst.setString(5, jComboBox95.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField93.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField95.getText().isEmpty() && jComboBox96.getSelectedItem().toString().isEmpty() && jTextField95.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner96.getValue().toString());
                pst.setString(3, jSpinner95.getValue().toString());
                pst.setString(4, jTextField95.getText());
                pst.setString(5, jComboBox95.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField96.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField82.getText().isEmpty() && jComboBox81.getSelectedItem().toString().isEmpty() && jTextField81.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner81.getValue().toString());
                pst.setString(3, jSpinner82.getValue().toString());
                pst.setString(4, jTextField82.getText());
                pst.setString(5, jComboBox1.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField81.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField83.getText().isEmpty() && jComboBox82.getSelectedItem().toString().isEmpty() && jTextField84.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner84.getValue().toString());
                pst.setString(3, jSpinner83.getValue().toString());
                pst.setString(4, jTextField83.getText());
                pst.setString(5, jComboBox82.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField84.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }

            if (jTextField110.getText().isEmpty() && jComboBox111.getSelectedItem().toString().isEmpty() && jTextField109.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner109.getValue().toString());
                pst.setString(3, jSpinner110.getValue().toString());
                pst.setString(4, jTextField110.getText());
                pst.setString(5, jComboBox111.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField109.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField111.getText().isEmpty() && jComboBox112.getSelectedItem().toString().isEmpty() && jTextField112.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner112.getValue().toString());
                pst.setString(3, jSpinner111.getValue().toString());
                pst.setString(4, jTextField111.getText());
                pst.setString(5, jComboBox112.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField112.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }
            if (jTextField98.getText().isEmpty() && jComboBox97.getSelectedItem().toString().isEmpty() && jTextField97.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner97.getValue().toString());
                pst.setString(3, jSpinner98.getValue().toString());
                pst.setString(4, jTextField98.getText());
                pst.setString(5, jComboBox97.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField97.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();

            }

            if (jTextField99.getText().isEmpty() && jComboBox98.getSelectedItem().toString().isEmpty() && jTextField100.getText().isEmpty()) {

            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner100.getValue().toString());
                pst.setString(3, jSpinner99.getValue().toString());
                pst.setString(4, jTextField99.getText());
                pst.setString(5, jComboBox98.getSelectedItem().toString());
                pst.setString(6, "");
                pst.setString(7, "");
                pst.setString(8, jTextField100.getText());
                pst.setString(9, "Hst");
                pst.executeUpdate();
            }

            if (jTextField5.getText().isEmpty() && jComboBox3.getSelectedItem().toString().isEmpty()
                    && jComboBox4.getSelectedItem().toString().isEmpty()
                    && jComboBox5.getSelectedItem().toString().isEmpty() && jTextField6.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner5.getValue().toString());
                pst.setString(3, jSpinner6.getValue().toString());
                pst.setString(4, jTextField5.getText());
                pst.setString(5, jComboBox3.getSelectedItem().toString());
                pst.setString(6, jComboBox4.getSelectedItem().toString());
                pst.setString(7, jComboBox5.getSelectedItem().toString());
                pst.setString(8, jTextField6.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField7.getText().isEmpty() && jComboBox6.getSelectedItem().toString().isEmpty()
                    && jComboBox7.getSelectedItem().toString().isEmpty()
                    && jComboBox8.getSelectedItem().toString().isEmpty() && jTextField8.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner7.getValue().toString());
                pst.setString(3, jSpinner8.getValue().toString());
                pst.setString(4, jTextField7.getText());
                pst.setString(5, jComboBox6.getSelectedItem().toString());
                pst.setString(6, jComboBox7.getSelectedItem().toString());
                pst.setString(7, jComboBox8.getSelectedItem().toString());
                pst.setString(8, jTextField8.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField26.getText().isEmpty() && jComboBox23.getSelectedItem().toString().isEmpty()
                    && jComboBox24.getSelectedItem().toString().isEmpty()
                    && jComboBox27.getSelectedItem().toString().isEmpty() && jTextField27.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner27.getValue().toString());
                pst.setString(3, jSpinner25.getValue().toString());
                pst.setString(4, jTextField26.getText());
                pst.setString(5, jComboBox23.getSelectedItem().toString());
                pst.setString(6, jComboBox24.getSelectedItem().toString());
                pst.setString(7, jComboBox27.getSelectedItem().toString());
                pst.setString(8, jTextField27.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField25.getText().isEmpty() && jComboBox25.getSelectedItem().toString().isEmpty()
                    && jComboBox26.getSelectedItem().toString().isEmpty()
                    && jComboBox28.getSelectedItem().toString().isEmpty() && jTextField28.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner26.getValue().toString());
                pst.setString(3, jSpinner28.getValue().toString());
                pst.setString(4, jTextField25.getText());
                pst.setString(5, jComboBox25.getSelectedItem().toString());
                pst.setString(6, jComboBox26.getSelectedItem().toString());
                pst.setString(7, jComboBox28.getSelectedItem().toString());
                pst.setString(8, jTextField28.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField42.getText().isEmpty() && jComboBox38.getSelectedItem().toString().isEmpty()
                    && jComboBox39.getSelectedItem().toString().isEmpty()
                    && jComboBox42.getSelectedItem().toString().isEmpty() && jTextField43.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner43.getValue().toString());
                pst.setString(3, jSpinner41.getValue().toString());
                pst.setString(4, jTextField42.getText());
                pst.setString(5, jComboBox38.getSelectedItem().toString());
                pst.setString(6, jComboBox39.getSelectedItem().toString());
                pst.setString(7, jComboBox42.getSelectedItem().toString());
                pst.setString(8, jTextField43.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField41.getText().isEmpty() && jComboBox40.getSelectedItem().toString().isEmpty()
                    && jComboBox41.getSelectedItem().toString().isEmpty()
                    && jComboBox43.getSelectedItem().toString().isEmpty() && jTextField44.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner42.getValue().toString());
                pst.setString(3, jSpinner44.getValue().toString());
                pst.setString(4, jTextField41.getText());
                pst.setString(5, jComboBox40.getSelectedItem().toString());
                pst.setString(6, jComboBox41.getSelectedItem().toString());
                pst.setString(7, jComboBox43.getSelectedItem().toString());
                pst.setString(8, jTextField44.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField58.getText().isEmpty() && jComboBox53.getSelectedItem().toString().isEmpty()
                    && jComboBox54.getSelectedItem().toString().isEmpty()
                    && jComboBox57.getSelectedItem().toString().isEmpty() && jTextField59.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner59.getValue().toString());
                pst.setString(3, jSpinner57.getValue().toString());
                pst.setString(4, jTextField58.getText());
                pst.setString(5, jComboBox53.getSelectedItem().toString());
                pst.setString(6, jComboBox54.getSelectedItem().toString());
                pst.setString(7, jComboBox57.getSelectedItem().toString());
                pst.setString(8, jTextField59.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField57.getText().isEmpty() && jComboBox55.getSelectedItem().toString().isEmpty()
                    && jComboBox56.getSelectedItem().toString().isEmpty()
                    && jComboBox58.getSelectedItem().toString().isEmpty() && jTextField60.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner58.getValue().toString());
                pst.setString(3, jSpinner60.getValue().toString());
                pst.setString(4, jTextField57.getText());
                pst.setString(5, jComboBox55.getSelectedItem().toString());
                pst.setString(6, jComboBox56.getSelectedItem().toString());
                pst.setString(7, jComboBox58.getSelectedItem().toString());
                pst.setString(8, jTextField60.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField74.getText().isEmpty() && jComboBox68.getSelectedItem().toString().isEmpty()
                    && jComboBox69.getSelectedItem().toString().isEmpty()
                    && jComboBox77.getSelectedItem().toString().isEmpty() && jTextField75.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner75.getValue().toString());
                pst.setString(3, jSpinner73.getValue().toString());
                pst.setString(4, jTextField74.getText());
                pst.setString(5, jComboBox68.getSelectedItem().toString());
                pst.setString(6, jComboBox69.getSelectedItem().toString());
                pst.setString(7, jComboBox77.getSelectedItem().toString());
                pst.setString(8, jTextField75.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField73.getText().isEmpty() && jComboBox70.getSelectedItem().toString().isEmpty()
                    && jComboBox71.getSelectedItem().toString().isEmpty()
                    && jComboBox78.getSelectedItem().toString().isEmpty() && jTextField76.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner74.getValue().toString());
                pst.setString(3, jSpinner76.getValue().toString());
                pst.setString(4, jTextField73.getText());
                pst.setString(5, jComboBox70.getSelectedItem().toString());
                pst.setString(6, jComboBox71.getSelectedItem().toString());
                pst.setString(7, jComboBox78.getSelectedItem().toString());
                pst.setString(8, jTextField76.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField90.getText().isEmpty() && jComboBox89.getSelectedItem().toString().isEmpty()
                    && jComboBox90.getSelectedItem().toString().isEmpty()
                    && jComboBox93.getSelectedItem().toString().isEmpty() && jTextField91.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner91.getValue().toString());
                pst.setString(3, jSpinner89.getValue().toString());
                pst.setString(4, jTextField90.getText());
                pst.setString(5, jComboBox89.getSelectedItem().toString());
                pst.setString(6, jComboBox90.getSelectedItem().toString());
                pst.setString(7, jComboBox93.getSelectedItem().toString());
                pst.setString(8, jTextField91.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField89.getText().isEmpty() && jComboBox91.getSelectedItem().toString().isEmpty()
                    && jComboBox95.getSelectedItem().toString().isEmpty()
                    && jComboBox94.getSelectedItem().toString().isEmpty() && jTextField92.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner90.getValue().toString());
                pst.setString(3, jSpinner92.getValue().toString());
                pst.setString(4, jTextField89.getText());
                pst.setString(5, jComboBox91.getSelectedItem().toString());
                pst.setString(6, jComboBox92.getSelectedItem().toString());
                pst.setString(7, jComboBox94.getSelectedItem().toString());
                pst.setString(8, jTextField92.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField106.getText().isEmpty() && jComboBox105.getSelectedItem().toString().isEmpty()
                    && jComboBox106.getSelectedItem().toString().isEmpty()
                    && jComboBox109.getSelectedItem().toString().isEmpty() && jTextField107.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner107.getValue().toString());
                pst.setString(3, jSpinner105.getValue().toString());
                pst.setString(4, jTextField106.getText());
                pst.setString(5, jComboBox105.getSelectedItem().toString());
                pst.setString(6, jComboBox106.getSelectedItem().toString());
                pst.setString(7, jComboBox109.getSelectedItem().toString());
                pst.setString(8, jTextField107.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField105.getText().isEmpty() && jComboBox107.getSelectedItem().toString().isEmpty()
                    && jComboBox108.getSelectedItem().toString().isEmpty()
                    && jComboBox110.getSelectedItem().toString().isEmpty() && jTextField108.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner106.getValue().toString());
                pst.setString(3, jSpinner108.getValue().toString());
                pst.setString(4, jTextField105.getText());
                pst.setString(5, jComboBox107.getSelectedItem().toString());
                pst.setString(6, jComboBox108.getSelectedItem().toString());
                pst.setString(7, jComboBox110.getSelectedItem().toString());
                pst.setString(8, jTextField108.getText());
                pst.setString(9, "Posilovna/Suchá");
                pst.executeUpdate();
            }

            if (jTextField13.getText().isEmpty() && jComboBox11.getSelectedItem().toString().isEmpty()
                    && jComboBox12.getSelectedItem().toString().isEmpty()
                    && jComboBox13.getSelectedItem().toString().isEmpty() && jTextField14.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner13.getValue().toString());
                pst.setString(3, jSpinner14.getValue().toString());
                pst.setString(4, jTextField13.getText());
                pst.setString(5, jComboBox11.getSelectedItem().toString());
                pst.setString(6, jComboBox12.getSelectedItem().toString());
                pst.setString(7, jComboBox13.getSelectedItem().toString());
                pst.setString(8, jTextField14.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField15.getText().isEmpty() && jComboBox14.getSelectedItem().toString().isEmpty()
                    && jComboBox15.getSelectedItem().toString().isEmpty()
                    && jComboBox72.getSelectedItem().toString().isEmpty() && jTextField16.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner15.getValue().toString());
                pst.setString(3, jSpinner16.getValue().toString());
                pst.setString(4, jTextField15.getText());
                pst.setString(5, jComboBox14.getSelectedItem().toString());
                pst.setString(6, jComboBox15.getSelectedItem().toString());
                pst.setString(7, jComboBox72.getSelectedItem().toString());
                pst.setString(8, jTextField16.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField22.getText().isEmpty() && jComboBox18.getSelectedItem().toString().isEmpty()
                    && jComboBox19.getSelectedItem().toString().isEmpty()
                    && jComboBox22.getSelectedItem().toString().isEmpty() && jTextField23.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner23.getValue().toString());
                pst.setString(3, jSpinner24.getValue().toString());
                pst.setString(4, jTextField22.getText());
                pst.setString(5, jComboBox18.getSelectedItem().toString());
                pst.setString(6, jComboBox19.getSelectedItem().toString());
                pst.setString(7, jComboBox22.getSelectedItem().toString());
                pst.setString(8, jTextField23.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField21.getText().isEmpty() && jComboBox20.getSelectedItem().toString().isEmpty()
                    && jComboBox21.getSelectedItem().toString().isEmpty()
                    && jComboBox73.getSelectedItem().toString().isEmpty() && jTextField24.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner22.getValue().toString());
                pst.setString(3, jSpinner21.getValue().toString());
                pst.setString(4, jTextField21.getText());
                pst.setString(5, jComboBox20.getSelectedItem().toString());
                pst.setString(6, jComboBox21.getSelectedItem().toString());
                pst.setString(7, jComboBox73.getSelectedItem().toString());
                pst.setString(8, jTextField24.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField38.getText().isEmpty() && jComboBox33.getSelectedItem().toString().isEmpty()
                    && jComboBox34.getSelectedItem().toString().isEmpty()
                    && jComboBox37.getSelectedItem().toString().isEmpty() && jTextField39.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner39.getValue().toString());
                pst.setString(3, jSpinner40.getValue().toString());
                pst.setString(4, jTextField38.getText());
                pst.setString(5, jComboBox33.getSelectedItem().toString());
                pst.setString(6, jComboBox34.getSelectedItem().toString());
                pst.setString(7, jComboBox37.getSelectedItem().toString());
                pst.setString(8, jTextField39.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField37.getText().isEmpty() && jComboBox35.getSelectedItem().toString().isEmpty()
                    && jComboBox36.getSelectedItem().toString().isEmpty()
                    && jComboBox74.getSelectedItem().toString().isEmpty() && jTextField40.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner38.getValue().toString());
                pst.setString(3, jSpinner37.getValue().toString());
                pst.setString(4, jTextField37.getText());
                pst.setString(5, jComboBox35.getSelectedItem().toString());
                pst.setString(6, jComboBox36.getSelectedItem().toString());
                pst.setString(7, jComboBox74.getSelectedItem().toString());
                pst.setString(8, jTextField40.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField54.getText().isEmpty() && jComboBox48.getSelectedItem().toString().isEmpty()
                    && jComboBox49.getSelectedItem().toString().isEmpty()
                    && jComboBox52.getSelectedItem().toString().isEmpty() && jTextField55.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner55.getValue().toString());
                pst.setString(3, jSpinner56.getValue().toString());
                pst.setString(4, jTextField54.getText());
                pst.setString(5, jComboBox48.getSelectedItem().toString());
                pst.setString(6, jComboBox49.getSelectedItem().toString());
                pst.setString(7, jComboBox52.getSelectedItem().toString());
                pst.setString(8, jTextField55.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField53.getText().isEmpty() && jComboBox50.getSelectedItem().toString().isEmpty()
                    && jComboBox51.getSelectedItem().toString().isEmpty()
                    && jComboBox75.getSelectedItem().toString().isEmpty() && jTextField56.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner54.getValue().toString());
                pst.setString(3, jSpinner53.getValue().toString());
                pst.setString(4, jTextField53.getText());
                pst.setString(5, jComboBox50.getSelectedItem().toString());
                pst.setString(6, jComboBox51.getSelectedItem().toString());
                pst.setString(7, jComboBox75.getSelectedItem().toString());
                pst.setString(8, jTextField56.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField70.getText().isEmpty() && jComboBox63.getSelectedItem().toString().isEmpty()
                    && jComboBox64.getSelectedItem().toString().isEmpty()
                    && jComboBox67.getSelectedItem().toString().isEmpty() && jTextField71.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner71.getValue().toString());
                pst.setString(3, jSpinner72.getValue().toString());
                pst.setString(4, jTextField70.getText());
                pst.setString(5, jComboBox63.getSelectedItem().toString());
                pst.setString(6, jComboBox64.getSelectedItem().toString());
                pst.setString(7, jComboBox67.getSelectedItem().toString());
                pst.setString(8, jTextField71.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField69.getText().isEmpty() && jComboBox65.getSelectedItem().toString().isEmpty()
                    && jComboBox66.getSelectedItem().toString().isEmpty()
                    && jComboBox76.getSelectedItem().toString().isEmpty() && jTextField72.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner70.getValue().toString());
                pst.setString(3, jSpinner69.getValue().toString());
                pst.setString(4, jTextField69.getText());
                pst.setString(5, jComboBox65.getSelectedItem().toString());
                pst.setString(6, jComboBox66.getSelectedItem().toString());
                pst.setString(7, jComboBox76.getSelectedItem().toString());
                pst.setString(8, jTextField72.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField86.getText().isEmpty() && jComboBox83.getSelectedItem().toString().isEmpty()
                    && jComboBox84.getSelectedItem().toString().isEmpty()
                    && jComboBox87.getSelectedItem().toString().isEmpty() && jTextField87.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner87.getValue().toString());
                pst.setString(3, jSpinner88.getValue().toString());
                pst.setString(4, jTextField86.getText());
                pst.setString(5, jComboBox83.getSelectedItem().toString());
                pst.setString(6, jComboBox84.getSelectedItem().toString());
                pst.setString(7, jComboBox87.getSelectedItem().toString());
                pst.setString(8, jTextField87.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField85.getText().isEmpty() && jComboBox85.getSelectedItem().toString().isEmpty()
                    && jComboBox86.getSelectedItem().toString().isEmpty()
                    && jComboBox88.getSelectedItem().toString().isEmpty() && jTextField88.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner86.getValue().toString());
                pst.setString(3, jSpinner85.getValue().toString());
                pst.setString(4, jTextField85.getText());
                pst.setString(5, jComboBox85.getSelectedItem().toString());
                pst.setString(6, jComboBox86.getSelectedItem().toString());
                pst.setString(7, jComboBox88.getSelectedItem().toString());
                pst.setString(8, jTextField88.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField102.getText().isEmpty() && jComboBox99.getSelectedItem().toString().isEmpty()
                    && jComboBox100.getSelectedItem().toString().isEmpty()
                    && jComboBox103.getSelectedItem().toString().isEmpty() && jTextField103.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner103.getValue().toString());
                pst.setString(3, jSpinner104.getValue().toString());
                pst.setString(4, jTextField102.getText());
                pst.setString(5, jComboBox99.getSelectedItem().toString());
                pst.setString(6, jComboBox100.getSelectedItem().toString());
                pst.setString(7, jComboBox103.getSelectedItem().toString());
                pst.setString(8, jTextField103.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            if (jTextField101.getText().isEmpty() && jComboBox101.getSelectedItem().toString().isEmpty()
                    && jComboBox102.getSelectedItem().toString().isEmpty()
                    && jComboBox104.getSelectedItem().toString().isEmpty() && jTextField104.getText().isEmpty()) {
            } else {
                pst.setDate(1, date);
                pst.setString(2, jSpinner102.getValue().toString());
                pst.setString(3, jSpinner101.getValue().toString());
                pst.setString(4, jTextField101.getText());
                pst.setString(5, jComboBox101.getSelectedItem().toString());
                pst.setString(6, jComboBox102.getSelectedItem().toString());
                pst.setString(7, jComboBox104.getSelectedItem().toString());
                pst.setString(8, jTextField104.getText());
                pst.setString(9, "Led");
                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Úspěšně vloženo");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Administrátor s tímto ID je již vložen");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * otevře okno s přehledem tréninků, zavře stávající
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Overview over = null;
        try {
            over = new Overview();
        } catch (SQLException ex) {
            Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
        }
        over.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jComboBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox18ActionPerformed

    private void jComboBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox23ActionPerformed

    private void jComboBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox29ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jComboBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox31ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jComboBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox33ActionPerformed

    private void jComboBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox38ActionPerformed

    private void jComboBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox44ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jComboBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox46ActionPerformed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jComboBox48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox48ActionPerformed

    private void jComboBox53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox53ActionPerformed

    private void jComboBox59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox59ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jTextField64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField64ActionPerformed

    private void jComboBox61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox61ActionPerformed

    private void jTextField65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField65ActionPerformed

    private void jTextField68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField68ActionPerformed

    private void jComboBox63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox63ActionPerformed

    private void jComboBox68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox68ActionPerformed

    private void jComboBox79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox79ActionPerformed

    private void jTextField77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField77ActionPerformed

    private void jTextField80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField80ActionPerformed

    private void jComboBox81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox81ActionPerformed

    private void jTextField81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField81ActionPerformed

    private void jTextField84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField84ActionPerformed

    private void jComboBox83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox83ActionPerformed

    private void jComboBox89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox89ActionPerformed

    private void jComboBox95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox95ActionPerformed

    private void jTextField93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField93ActionPerformed

    private void jTextField96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField96ActionPerformed

    private void jComboBox97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox97ActionPerformed

    private void jTextField97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField97ActionPerformed

    private void jTextField100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField100ActionPerformed

    private void jComboBox99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox99ActionPerformed

    private void jComboBox105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox105ActionPerformed

    private void jComboBox111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox111ActionPerformed

    private void jTextField109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField109ActionPerformed

    private void jTextField112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField112ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /*try {
            Serialization();
        } catch (SQLException ex) {
            Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        try {
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
            String date = sDate.format(dayChooser.getDate());
            String query = "select time, time1, player, trainer, trainer1, trainer2, notes, training from training where date= '" + date + "'";
            pst=conn.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            //Training training;
            
            while (rs.next()) {
                // training = new Training(rs.getDate("date"), rs.getString("time"), rs.getString("time1"), rs.getString("player"), rs.getString("trainer"), rs.getString("notes"), rs.getString("training"));
                // TrainingsList.add(training);
                //}
                
                
                //if(rs.next()) {
                
                String FN = rs.getString("player");
                jTextField1.setText(FN);
                String LN = rs.getString("trainer");
                jComboBox1.setSelectedItem(LN);
                String Des = rs.getString("notes");
                jTextField3.setText(Des);
                
           
                
                
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
                
                
                    
        
        
        
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
            java.util.logging.Logger.getLogger(Trainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new Trainings().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Trainings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private com.toedter.calendar.JDateChooser dayChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox100;
    private javax.swing.JComboBox<String> jComboBox101;
    private javax.swing.JComboBox<String> jComboBox102;
    private javax.swing.JComboBox<String> jComboBox103;
    private javax.swing.JComboBox<String> jComboBox104;
    private javax.swing.JComboBox<String> jComboBox105;
    private javax.swing.JComboBox<String> jComboBox106;
    private javax.swing.JComboBox<String> jComboBox107;
    private javax.swing.JComboBox<String> jComboBox108;
    private javax.swing.JComboBox<String> jComboBox109;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox110;
    private javax.swing.JComboBox<String> jComboBox111;
    private javax.swing.JComboBox<String> jComboBox112;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox45;
    private javax.swing.JComboBox<String> jComboBox46;
    private javax.swing.JComboBox<String> jComboBox47;
    private javax.swing.JComboBox<String> jComboBox48;
    private javax.swing.JComboBox<String> jComboBox49;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox50;
    private javax.swing.JComboBox<String> jComboBox51;
    private javax.swing.JComboBox<String> jComboBox52;
    private javax.swing.JComboBox<String> jComboBox53;
    private javax.swing.JComboBox<String> jComboBox54;
    private javax.swing.JComboBox<String> jComboBox55;
    private javax.swing.JComboBox<String> jComboBox56;
    private javax.swing.JComboBox<String> jComboBox57;
    private javax.swing.JComboBox<String> jComboBox58;
    private javax.swing.JComboBox<String> jComboBox59;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox60;
    private javax.swing.JComboBox<String> jComboBox61;
    private javax.swing.JComboBox<String> jComboBox62;
    private javax.swing.JComboBox<String> jComboBox63;
    private javax.swing.JComboBox<String> jComboBox64;
    private javax.swing.JComboBox<String> jComboBox65;
    private javax.swing.JComboBox<String> jComboBox66;
    private javax.swing.JComboBox<String> jComboBox67;
    private javax.swing.JComboBox<String> jComboBox68;
    private javax.swing.JComboBox<String> jComboBox69;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox70;
    private javax.swing.JComboBox<String> jComboBox71;
    private javax.swing.JComboBox<String> jComboBox72;
    private javax.swing.JComboBox<String> jComboBox73;
    private javax.swing.JComboBox<String> jComboBox74;
    private javax.swing.JComboBox<String> jComboBox75;
    private javax.swing.JComboBox<String> jComboBox76;
    private javax.swing.JComboBox<String> jComboBox77;
    private javax.swing.JComboBox<String> jComboBox78;
    private javax.swing.JComboBox<String> jComboBox79;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox80;
    private javax.swing.JComboBox<String> jComboBox81;
    private javax.swing.JComboBox<String> jComboBox82;
    private javax.swing.JComboBox<String> jComboBox83;
    private javax.swing.JComboBox<String> jComboBox84;
    private javax.swing.JComboBox<String> jComboBox85;
    private javax.swing.JComboBox<String> jComboBox86;
    private javax.swing.JComboBox<String> jComboBox87;
    private javax.swing.JComboBox<String> jComboBox88;
    private javax.swing.JComboBox<String> jComboBox89;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBox90;
    private javax.swing.JComboBox<String> jComboBox91;
    private javax.swing.JComboBox<String> jComboBox92;
    private javax.swing.JComboBox<String> jComboBox93;
    private javax.swing.JComboBox<String> jComboBox94;
    private javax.swing.JComboBox<String> jComboBox95;
    private javax.swing.JComboBox<String> jComboBox96;
    private javax.swing.JComboBox<String> jComboBox97;
    private javax.swing.JComboBox<String> jComboBox98;
    private javax.swing.JComboBox<String> jComboBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner100;
    private javax.swing.JSpinner jSpinner101;
    private javax.swing.JSpinner jSpinner102;
    private javax.swing.JSpinner jSpinner103;
    private javax.swing.JSpinner jSpinner104;
    private javax.swing.JSpinner jSpinner105;
    private javax.swing.JSpinner jSpinner106;
    private javax.swing.JSpinner jSpinner107;
    private javax.swing.JSpinner jSpinner108;
    private javax.swing.JSpinner jSpinner109;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner110;
    private javax.swing.JSpinner jSpinner111;
    private javax.swing.JSpinner jSpinner112;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner34;
    private javax.swing.JSpinner jSpinner35;
    private javax.swing.JSpinner jSpinner36;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner39;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner41;
    private javax.swing.JSpinner jSpinner42;
    private javax.swing.JSpinner jSpinner43;
    private javax.swing.JSpinner jSpinner44;
    private javax.swing.JSpinner jSpinner45;
    private javax.swing.JSpinner jSpinner46;
    private javax.swing.JSpinner jSpinner47;
    private javax.swing.JSpinner jSpinner48;
    private javax.swing.JSpinner jSpinner49;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner50;
    private javax.swing.JSpinner jSpinner51;
    private javax.swing.JSpinner jSpinner52;
    private javax.swing.JSpinner jSpinner53;
    private javax.swing.JSpinner jSpinner54;
    private javax.swing.JSpinner jSpinner55;
    private javax.swing.JSpinner jSpinner56;
    private javax.swing.JSpinner jSpinner57;
    private javax.swing.JSpinner jSpinner58;
    private javax.swing.JSpinner jSpinner59;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner60;
    private javax.swing.JSpinner jSpinner61;
    private javax.swing.JSpinner jSpinner62;
    private javax.swing.JSpinner jSpinner63;
    private javax.swing.JSpinner jSpinner64;
    private javax.swing.JSpinner jSpinner65;
    private javax.swing.JSpinner jSpinner66;
    private javax.swing.JSpinner jSpinner67;
    private javax.swing.JSpinner jSpinner68;
    private javax.swing.JSpinner jSpinner69;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner70;
    private javax.swing.JSpinner jSpinner71;
    private javax.swing.JSpinner jSpinner72;
    private javax.swing.JSpinner jSpinner73;
    private javax.swing.JSpinner jSpinner74;
    private javax.swing.JSpinner jSpinner75;
    private javax.swing.JSpinner jSpinner76;
    private javax.swing.JSpinner jSpinner77;
    private javax.swing.JSpinner jSpinner78;
    private javax.swing.JSpinner jSpinner79;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner80;
    private javax.swing.JSpinner jSpinner81;
    private javax.swing.JSpinner jSpinner82;
    private javax.swing.JSpinner jSpinner83;
    private javax.swing.JSpinner jSpinner84;
    private javax.swing.JSpinner jSpinner85;
    private javax.swing.JSpinner jSpinner86;
    private javax.swing.JSpinner jSpinner87;
    private javax.swing.JSpinner jSpinner88;
    private javax.swing.JSpinner jSpinner89;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JSpinner jSpinner90;
    private javax.swing.JSpinner jSpinner91;
    private javax.swing.JSpinner jSpinner92;
    private javax.swing.JSpinner jSpinner93;
    private javax.swing.JSpinner jSpinner94;
    private javax.swing.JSpinner jSpinner95;
    private javax.swing.JSpinner jSpinner96;
    private javax.swing.JSpinner jSpinner97;
    private javax.swing.JSpinner jSpinner98;
    private javax.swing.JSpinner jSpinner99;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    // End of variables declaration//GEN-END:variables
}

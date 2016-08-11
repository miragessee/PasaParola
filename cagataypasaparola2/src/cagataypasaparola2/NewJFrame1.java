/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cagataypasaparola2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

/**
 *
 * @author Hakan
 */
public class NewJFrame1 extends javax.swing.JFrame {
    Player playMP3;
    int kontrol = 0;
    int start = 0;
    int start2 = 0;

    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel dlm2 = new DefaultListModel();
    
    Timer myTimer2 = new Timer();
    TimerTask gorev2 = new TimerTask() {
        @Override
        public void run() {
            if(Integer.parseInt(jLabel4.getText()) == 20)
            {
                playSound3();
            }
            if(Integer.parseInt(jLabel4.getText()) == 16)
            {
                playSound3();
            }
            if(Integer.parseInt(jLabel4.getText()) == 12)
            {
                playSound3();
            }
            
            if(Integer.parseInt(jLabel4.getText()) == 8)
            {
                playSound3();
            }
            
            if(Integer.parseInt(jLabel4.getText()) == 4)
            {
                playSound3();
            }
            
        }
    };
    
    Timer myTimer3 = new Timer();
    TimerTask gorev3 = new TimerTask() {
        @Override
        public void run() {
            playSound4();
        }
    };

    public void playSound() {

        try {
            //AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/muzikler/dogruyanit.mp3"));
            String bip = String.valueOf(this.getClass().getResource("/muzikler/dogruyanit.mp3"));
            String bip2 = String.valueOf(System.getProperty("user.dir")+"/muzikler/dogruyanit.mp3");
            String[] words = bip.split("file:/");
            //System.out.println(words[1]);
            FileInputStream fis = new FileInputStream(bip2);
            playMP3 = new Player(fis);

            playMP3.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void playSound2() {

        try {
            //AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/muzikler/dogruyanit.mp3"));
            String bip = String.valueOf(this.getClass().getResource("/muzikler/yanlisyanit.mp3"));
            String bip2 = String.valueOf(System.getProperty("user.dir")+"/muzikler/yanlisyanit.mp3");
            String[] words = bip.split("file:/");
            //System.out.println(words[1]);
            FileInputStream fis = new FileInputStream(bip2);
            Player playMP3 = new Player(fis);

            playMP3.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void playSound3() {

        try {
            //AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/muzikler/dogruyanit.mp3"));
            String bip = String.valueOf(this.getClass().getResource("/muzikler/son20sn.mp3"));
            String bip2 = String.valueOf(System.getProperty("user.dir")+"/muzikler/son20sn.mp3");
            String[] words = bip.split("file:/");
            //System.out.println(words[1]);
            FileInputStream fis = new FileInputStream(bip2);
            Player playMP3 = new Player(fis);

            playMP3.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void playSound4() {

        try {
            //AudioInputStream as = AudioSystem.getAudioInputStream(this.getClass().getResource("/muzikler/dogruyanit.mp3"));
            String bip = String.valueOf(this.getClass().getResource("/muzikler/oyun.mp3"));
            String bip2 = String.valueOf(System.getProperty("user.dir")+"/muzikler/oyun.mp3");
            String[] words = bip.split("file:/");
            //System.out.println(words[1]);
            FileInputStream fis = new FileInputStream(bip2);
            playMP3 = new Player(fis);

            playMP3.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    Timer myTimer = new Timer();
    TimerTask gorev = new TimerTask() {
        @Override
        public void run() {
            int a = Integer.parseInt(jLabel4.getText());
            a--;
            jLabel4.setText(String.valueOf(a));
            renkDegistir(butonBul("b" + kontrol));
            bitisKontrol();
        }
    };
    
    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
        jPanel1.setBackground(Color.pink);
        jPanel2.setBackground(Color.pink);
        jPanel3.setBackground(Color.pink);
        jButton0.setBackground(Color.LIGHT_GRAY);
        cevapla.setBackground(Color.green);
        pas.setBackground(Color.red);
        myTimer3.schedule(gorev3,0,1);
        myTimer.schedule(gorev,0,1000);
        myTimer2.schedule(gorev2,0,1);
        dlm.addElement("an authorization to use a service");
        dlm.addElement("the management of commercial enterprises");
        dlm.addElement("fame, renown");
        dlm.addElement("an image used in whole or in part as a trademark or service mark");
        dlm.addElement("anything admitted by a court to prove");
        dlm.addElement("a beneficial capability of a piece of software");
        dlm.addElement("game");
        dlm.addElement("the upper part of the human body or the front part of the body in animals");
        dlm.addElement("a day's travelling");
        dlm.addElement("slashing");
        dlm.addElement("a deficiency or need");
        dlm.addElement("mental or emotinal state");
        dlm.addElement("a fable, a short tale ");
        dlm.addElement("a soft cushion used to support the head in bed");
        dlm.addElement("level of excellence");
        dlm.addElement("to ask somebody to do something ");
        dlm.addElement("the perfom a cursory investigation");
        dlm.addElement("an act of prostitution ");
        dlm.addElement("being the only one of it's kind");
        dlm.addElement("an intention or prospect");
        dlm.addElement("a pocketbook for kerping money");
        dlm.addElement("a heavy, gaseous chemical element (Symbol Xe)");
        dlm.addElement("an unusually long time");
        dlm.addElement("an african animal with black and white stripes");
        
        dlm2.addElement("account");
        dlm2.addElement("business");
        dlm2.addElement("celebrity");
        dlm2.addElement("device");
        dlm2.addElement("evidence");
        dlm2.addElement("feature");
        dlm2.addElement("game");
        dlm2.addElement("head");
        dlm2.addElement("journey");
        dlm2.addElement("knife");
        dlm2.addElement("lack");
        dlm2.addElement("mood");
        dlm2.addElement("novel");
        dlm2.addElement("pillow");
        dlm2.addElement("quality");
        dlm2.addElement("request");
        dlm2.addElement("scope");
        dlm2.addElement("trick");
        dlm2.addElement("unique");
        dlm2.addElement("view");
        dlm2.addElement("wallet");
        dlm2.addElement("xenon");
        dlm2.addElement("year");
        dlm2.addElement("zebra");
        
        jTextArea1.setText((String) dlm.getElementAt(kontrol));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cevapla = new javax.swing.JButton();
        pas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAGATAY PASAPORALA GAME");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Cagatay Pasaparola");

        jLabel4.setText("180");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel5.setText("Kalan süre:");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel6.setText("Soru:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel7.setText("Cevap:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        cevapla.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        cevapla.setText("Cevapla");
        cevapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevaplaActionPerformed(evt);
            }
        });

        pas.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        pas.setText("Pas");
        pas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton0.setText("A");
        jButton0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton0.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton0.setName("b0"); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("B");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1.setName("b1"); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("C");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton2.setName("b2"); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("D");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton3.setName("b3"); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("E");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton4.setName("b4"); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("F");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton5.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton5.setName("b5"); // NOI18N

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("G");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton6.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton6.setName("b6"); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("H");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton7.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton7.setName("b7"); // NOI18N

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("J");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton8.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton8.setName("b8"); // NOI18N

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton9.setText("K");
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton9.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton9.setName("b9"); // NOI18N

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setText("L");
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton10.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton10.setName("b10"); // NOI18N

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("M");
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton11.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton11.setName("b11"); // NOI18N

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton12.setText("N");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton12.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton12.setName("b12"); // NOI18N

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setText("P");
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton13.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton13.setName("b13"); // NOI18N

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setText("Q");
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton14.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton14.setName("b14"); // NOI18N

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("R");
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton15.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton15.setName("b15"); // NOI18N

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setText("S");
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton16.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton16.setName("b16"); // NOI18N

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("T");
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton17.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton17.setName("b17"); // NOI18N

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("U");
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton18.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton18.setName("b18"); // NOI18N

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setText("V");
        jButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton19.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton19.setName("b19"); // NOI18N

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("W");
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton20.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton20.setName("b20"); // NOI18N

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setText("X");
        jButton21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton21.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton21.setName("b21"); // NOI18N

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setText("Y");
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton22.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton22.setName("b22"); // NOI18N

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setText("Z");
        jButton23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton23.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton23.setName("b23"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton0)
                        .addGap(5, 5, 5)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(6, 6, 6)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 51), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 102, 0), new java.awt.Color(0, 204, 51)));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel2.setText("Doğru yanıt");

        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(204, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel9.setText("Yanlış yanıt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(46, 46, 46))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cevapla, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cevapla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cevaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevaplaActionPerformed
        // TODO add your handling code here:
        final java.awt.event.ActionEvent e=evt;
        if(dlm2.getElementAt(kontrol).equals(jTextField1.getText().toLowerCase()))
        {
            playSound();
            butonBul("b"+kontrol).setBackground(Color.green);
            int ds = Integer.parseInt(jLabel3.getText());
            ds++;
            jLabel3.setText(String.valueOf(ds));
            jTextField1.setText("");
        }
        else
        {
            playSound2();
            butonBul("b"+kontrol).setBackground(Color.red);
            int ds = Integer.parseInt(jLabel8.getText());
            ds++;
            jLabel8.setText(String.valueOf(ds));
            jTextField1.setText("");
        }
        kontrol++;
        if (kontrol > 23 || start2 == 1) {
            start2 = 1;
            if(kontrol > 23)
            {
                kontrol = 0;
            }
            for(int i = kontrol; i <= 23;i++)
            {
                if(butonBul("b" + i).getBackground() != Color.yellow)
                {
                    kontrol++;
                }
                else if(butonBul("b" + i).getBackground() == Color.yellow)
                {
                    break;
                }
                else
                {
                    bitisKontrol();
                }
            }
        }
        if(kontrol != 24)
        {
            jTextArea1.setText((String) dlm.getElementAt(kontrol));
        }
        bitisKontrol();
    }//GEN-LAST:event_cevaplaActionPerformed

    private void pasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasActionPerformed
        // TODO add your handling code here:
        butonBul("b" + kontrol).setBackground(Color.yellow);
        kontrol++;
        if (kontrol > 23 || start2 == 1) {
            start2 = 1;
            if(kontrol > 23)
            {
                kontrol = 0;
            }
            for(int i = kontrol; i <= 23;i++)
            {
                if(butonBul("b" + i).getBackground() != Color.yellow)
                {
                    kontrol++;
                }
                else if(butonBul("b" + i).getBackground() == Color.yellow)
                {
                    break;
                }
                else
                {
                    bitisKontrol();
                }
            }
        }
        jTextArea1.setText((String) dlm.getElementAt(kontrol));
        bitisKontrol();
    }//GEN-LAST:event_pasActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            cevapla.doClick();
        }
    }//GEN-LAST:event_jTextField1KeyPressed
    public void bitisKontrol(){
        if (Integer.parseInt(jLabel4.getText()) <= 0 || (Integer.parseInt(jLabel3.getText()) + Integer.parseInt(jLabel8.getText()) >= 24)) {
            try {
                myTimer.cancel();
                myTimer2.cancel();
                myTimer3.cancel();
                playMP3.close();
                NewJFrame2 nf = new NewJFrame2();
                nf.setVisible(true);
                nf.setLocationRelativeTo(null);
                nf.getjLabel3().setText(jLabel4.getText());
                nf.getjLabel8().setText(jLabel3.getText());
                nf.getjLabel9().setText(jLabel8.getText());
                int puan = Integer.parseInt(nf.getjLabel3().getText());
                nf.getjLabel5().setText(String.valueOf((puan*10+100+Integer.parseInt(jLabel3.getText()) - Integer.parseInt(jLabel8.getText())+20)));
                nf.getContentPane().setBackground(new Color(10,81,196));
                InputStream istream = this.getClass().getResourceAsStream("/icons/Bloodyslime.TTF");
                Font myFont = Font.createFont(Font.TRUETYPE_FONT, istream);
                myFont = myFont.deriveFont(36.0f);
                nf.getjLabel1().setFont(myFont);
                nf.getjLabel2().setFont(myFont);
                nf.getjLabel3().setFont(myFont);
                nf.getjLabel4().setFont(myFont);
                nf.getjLabel5().setFont(myFont);
                nf.getjLabel6().setFont(myFont);
                nf.getjLabel7().setFont(myFont);
                nf.getjLabel8().setFont(myFont);
                nf.getjLabel9().setFont(myFont);
                nf.getjButton1().setFont(myFont);
                nf.getjButton1().setBackground(new Color(140,0,149));
                //nf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(false);
                dispose();
            } catch (FontFormatException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
    
    public JButton butonBul(String name){
        JButton sonuc=null;
        Component[] list=jPanel1.getComponents();
        for(Component a:list){
            if(((JButton)a).getName().equals(name)){
                sonuc=((JButton)a);
                break;
            }
        }
        return sonuc;
    }
    
    public void renkDegistir(JButton btn) {
        if(start == 0)
        {
            for(int i = 0 ; i<=23;i++)
            {
                butonBul("b" + i).setBackground(Color.lightGray);
            }
            start = 1;
        }
        
        if (butonBul("b" + kontrol).getBackground() == Color.yellow || butonBul("b" + kontrol).getBackground() == Color.lightGray || butonBul("b" + kontrol).getBackground() == Color.magenta || butonBul("b" + kontrol).getBackground() == Color.white) {
            if (Integer.parseInt(jLabel4.getText()) % 2 == 0) {
                btn.setBackground(Color.magenta);
            } else {
                btn.setBackground(Color.white);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cevapla;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pas;
    // End of variables declaration//GEN-END:variables
}

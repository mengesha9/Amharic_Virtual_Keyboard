
package amkeyboard;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class amhKeyboard extends javax.swing.JFrame {

   private static int shift=0;
   private static int cc=0;
   private static int x=0;
    public amhKeyboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("amKeyboard");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setMaximumSize(null);

        jTextField1.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setKeymap(null);

        jButton38.setFont(new java.awt.Font("ALXethiopian", 0, 24)); // NOI18N
        jButton38.setToolTipText("");
        jButton38.setBorderPainted(false);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.setIconTextGap(8);
        jButton38.setInheritsPopupMenu(true);
        jButton38.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton38.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton38.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Abyssinica SIL", 0, 12)); // NOI18N
        jButton39.setText("EN/ዐማርኛ");
        jButton39.setToolTipText("");
        jButton39.setBorderPainted(false);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.setIconTextGap(8);
        jButton39.setInheritsPopupMenu(true);
        jButton39.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton39.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton39.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton40.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton40.setText("ሰ");
        jButton40.setToolTipText("");
        jButton40.setBorderPainted(false);
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.setIconTextGap(8);
        jButton40.setInheritsPopupMenu(true);
        jButton40.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton40.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton40.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton41.setText("ሠ");
        jButton41.setToolTipText("");
        jButton41.setBorderPainted(false);
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.setIconTextGap(8);
        jButton41.setInheritsPopupMenu(true);
        jButton41.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton41.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton41.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton42.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton42.setName(""); // NOI18N
        jButton42.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton43.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton43.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton44.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton44.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton44.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton45.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton45.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton46.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton46.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton47.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton47.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton47.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton4.setText("ገ");
        jButton4.setToolTipText("");
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(8);
        jButton4.setInheritsPopupMenu(true);
        jButton4.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton48.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton48.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton48.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton5.setText("የ");
        jButton5.setToolTipText("");
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(8);
        jButton5.setInheritsPopupMenu(true);
        jButton5.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton49.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton49.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton6.setText("ደ");
        jButton6.setToolTipText("");
        jButton6.setBorderPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setIconTextGap(8);
        jButton6.setInheritsPopupMenu(true);
        jButton6.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton7.setText("ተ");
        jButton7.setToolTipText("");
        jButton7.setBorderPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setIconTextGap(8);
        jButton7.setInheritsPopupMenu(true);
        jButton7.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton8.setText("ከ");
        jButton8.setToolTipText("");
        jButton8.setBorderPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(8);
        jButton8.setInheritsPopupMenu(true);
        jButton8.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton9.setText("አ");
        jButton9.setToolTipText("");
        jButton9.setBorderPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setIconTextGap(8);
        jButton9.setInheritsPopupMenu(true);
        jButton9.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton10.setText("ጠ");
        jButton10.setToolTipText("");
        jButton10.setBorderPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setIconTextGap(8);
        jButton10.setInheritsPopupMenu(true);
        jButton10.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton10.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton10.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton11.setText("መ");
        jButton11.setToolTipText("");
        jButton11.setBorderPainted(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setIconTextGap(8);
        jButton11.setInheritsPopupMenu(true);
        jButton11.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton11.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton11.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton12.setText("ቀ");
        jButton12.setToolTipText("");
        jButton12.setBorderPainted(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setIconTextGap(8);
        jButton12.setInheritsPopupMenu(true);
        jButton12.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton12.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton12.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton13.setText("ወ");
        jButton13.setToolTipText("");
        jButton13.setBorderPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setIconTextGap(8);
        jButton13.setInheritsPopupMenu(true);
        jButton13.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton13.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton13.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton1.setText("በ");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(8);
        jButton1.setInheritsPopupMenu(true);
        jButton1.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton2.setText("ቸ");
        jButton2.setToolTipText("");
        jButton2.setBorderPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(8);
        jButton2.setInheritsPopupMenu(true);
        jButton2.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton3.setText("ነ");
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(8);
        jButton3.setInheritsPopupMenu(true);
        jButton3.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton14.setText("ዘ");
        jButton14.setToolTipText("");
        jButton14.setBorderPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setIconTextGap(8);
        jButton14.setInheritsPopupMenu(true);
        jButton14.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton14.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton14.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton15.setText("ረ");
        jButton15.setToolTipText("");
        jButton15.setBorderPainted(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setIconTextGap(8);
        jButton15.setInheritsPopupMenu(true);
        jButton15.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton15.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton15.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton16.setText("ሸ");
        jButton16.setToolTipText("");
        jButton16.setBorderPainted(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setIconTextGap(8);
        jButton16.setInheritsPopupMenu(true);
        jButton16.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton16.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton16.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton17.setText("ለ");
        jButton17.setToolTipText("");
        jButton17.setBorderPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setIconTextGap(8);
        jButton17.setInheritsPopupMenu(true);
        jButton17.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton17.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton17.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton18.setText("ዠ");
        jButton18.setToolTipText("");
        jButton18.setBorderPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setIconTextGap(8);
        jButton18.setInheritsPopupMenu(true);
        jButton18.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton18.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton18.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton19.setText("ፐ");
        jButton19.setToolTipText("");
        jButton19.setBorderPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setIconTextGap(8);
        jButton19.setInheritsPopupMenu(true);
        jButton19.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton19.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton19.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton20.setText("ፀ");
        jButton20.setToolTipText("");
        jButton20.setBorderPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setIconTextGap(8);
        jButton20.setInheritsPopupMenu(true);
        jButton20.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton20.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton20.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton21.setText("ጨ");
        jButton21.setToolTipText("");
        jButton21.setBorderPainted(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setIconTextGap(8);
        jButton21.setInheritsPopupMenu(true);
        jButton21.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton21.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton21.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton22.setText("ጰ");
        jButton22.setToolTipText("");
        jButton22.setBorderPainted(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setIconTextGap(8);
        jButton22.setInheritsPopupMenu(true);
        jButton22.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton22.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton22.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton23.setText("ቨ");
        jButton23.setToolTipText("");
        jButton23.setBorderPainted(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setIconTextGap(8);
        jButton23.setInheritsPopupMenu(true);
        jButton23.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton23.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton23.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton24.setText("ኀ");
        jButton24.setToolTipText("");
        jButton24.setBorderPainted(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setIconTextGap(8);
        jButton24.setInheritsPopupMenu(true);
        jButton24.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton24.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton24.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton25.setText("ጸ");
        jButton25.setToolTipText("");
        jButton25.setBorderPainted(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setIconTextGap(8);
        jButton25.setInheritsPopupMenu(true);
        jButton25.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton25.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton25.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("\u274E");
        jButton26.setToolTipText("");
        jButton26.setBorderPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setIconTextGap(8);
        jButton26.setInheritsPopupMenu(true);
        jButton26.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton26.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton26.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton27.setText("ሀ");
        jButton27.setToolTipText("");
        jButton27.setBorderPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setIconTextGap(8);
        jButton27.setInheritsPopupMenu(true);
        jButton27.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton27.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton27.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("\u27F8");
        jButton28.setToolTipText("");
        jButton28.setBorderPainted(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setIconTextGap(8);
        jButton28.setInheritsPopupMenu(true);
        jButton28.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton28.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton28.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton29.setText("ፈ");
        jButton29.setToolTipText("");
        jButton29.setBorderPainted(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setIconTextGap(8);
        jButton29.setInheritsPopupMenu(true);
        jButton29.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton29.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton29.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton30.setText("ኸ");
        jButton30.setToolTipText("");
        jButton30.setBorderPainted(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setIconTextGap(8);
        jButton30.setInheritsPopupMenu(true);
        jButton30.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton30.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton30.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton31.setText("ጀ");
        jButton31.setToolTipText("");
        jButton31.setBorderPainted(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setIconTextGap(8);
        jButton31.setInheritsPopupMenu(true);
        jButton31.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton31.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton31.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton32.setText("ዐ");
        jButton32.setToolTipText("");
        jButton32.setBorderPainted(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setIconTextGap(8);
        jButton32.setInheritsPopupMenu(true);
        jButton32.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton32.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton32.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton33.setText("ኘ");
        jButton33.setToolTipText("");
        jButton33.setBorderPainted(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setIconTextGap(8);
        jButton33.setInheritsPopupMenu(true);
        jButton33.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton33.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton33.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jButton34.setText("ሐ");
        jButton34.setToolTipText("");
        jButton34.setBorderPainted(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setIconTextGap(8);
        jButton34.setInheritsPopupMenu(true);
        jButton34.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton34.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton34.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("\u21A9"+" Enter");
        jButton35.setToolTipText("");
        jButton35.setBorderPainted(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setIconTextGap(8);
        jButton35.setInheritsPopupMenu(true);
        jButton35.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton35.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton35.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("\u2328");
        jButton36.setToolTipText("");
        jButton36.setBorderPainted(false);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setIconTextGap(8);
        jButton36.setInheritsPopupMenu(true);
        jButton36.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton36.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton36.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Abyssinica SIL", 1, 24)); // NOI18N
        jButton37.setText(".");
        jButton37.setToolTipText("");
        jButton37.setBorderPainted(false);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.setIconTextGap(8);
        jButton37.setInheritsPopupMenu(true);
        jButton37.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton37.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton37.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton47, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))))
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jMenu1.setText("File");

        jMenuItem2.setText("save");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(40, 20));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+ jButton3.getText());}
        if(shift%2==0){
        jButton42.setText("\u1290");
        jButton43.setText("\u1291");
        jButton44.setText("\u1292");
        jButton45.setText("\u1293");
        jButton46.setText("\u1294");
        jButton47.setText("\u1295");
        jButton48.setText("\u1296");
        jButton49.setText("\u1297");}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(shift%2!=0){ jTextField1.setText(jTextField1.getText()+ jButton1.getText());}
       if(shift%2==0){ jButton42.setText("\u1260");
        jButton43.setText("\u1261");
        jButton44.setText("\u1262");
        jButton45.setText("\u1263");
        jButton46.setText("\u1264");
        jButton47.setText("\u1265");
        jButton48.setText("\u1266");
        jButton49.setText("\u1267");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(shift%2!=0){ jTextField1.setText(jTextField1.getText()+ jButton7.getText());}
        if(shift%2==0){jButton42.setText("\u1270");
        jButton43.setText("\u1271");
        jButton44.setText("\u1272");
        jButton45.setText("\u1273");
        jButton46.setText("\u1274");
        jButton47.setText("\u1275");
        jButton48.setText("\u1276");
        jButton49.setText("\u1277");}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      if(shift%2!=0){ jTextField1.setText(jTextField1.getText()+ jButton5.getText());}
        if(shift%2==0) {jButton42.setText("\u12E8");
        jButton43.setText("\u12E9");
        jButton44.setText("\u12EA");
        jButton45.setText("\u12EB");
        jButton46.setText("\u12EC");
        jButton47.setText("\u12ED");
        jButton48.setText("\u12EE");
        jButton49.setText("\u12EF");}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton11.getText());}
        if(shift%2==0){jButton42.setText("\u1218");
        jButton43.setText("\u1219");
        jButton44.setText("\u121A");
        jButton45.setText("\u121B");
        jButton46.setText("\u121C");
        jButton47.setText("\u121D");
        jButton48.setText("\u121E");
        jButton49.setText("\u121F");}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if(shift%2!=0){ jTextField1.setText(jTextField1.getText()+ jButton9.getText());}
        if(shift%2==0){jButton42.setText("\u12A0");
        jButton43.setText("\u12A1");
        jButton44.setText("\u12A2");
        jButton45.setText("\u12A3");
        jButton46.setText("\u12A4");
        jButton47.setText("\u12A5");
        jButton48.setText("\u12A6");
        jButton49.setText("\u12A7");}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       if(shift%2!=0){ jTextField1.setText(jTextField1.getText()+ jButton15.getText());}
        if(shift%2==0){jButton42.setText("\u1228");
        jButton43.setText("\u1229");
        jButton44.setText("\u122A");
        jButton45.setText("\u122B");
        jButton46.setText("\u122C");
        jButton47.setText("\u122D");
        jButton48.setText("\u122E");
        jButton49.setText("\u122F");}
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
       jTextField1.setText(jTextField1.getText()+jButton42.getText());
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton43.getText());
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton44.getText());
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
       jTextField1.setText(jTextField1.getText()+jButton45.getText());
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton46.getText());
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton47.getText());
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton48.getText());
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton49.getText());
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton13.getText());}
        if(shift%2==0){jButton42.setText("\u12C8");
        jButton43.setText("\u12C9");
        jButton44.setText("\u12CA");
        jButton45.setText("\u12CB");
        jButton46.setText("\u12CC");
        jButton47.setText("\u12CD");
        jButton48.setText("\u12CE");
        jButton49.setText("\u12CF");}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton17.getText());}
        if(shift%2==0){jButton42.setText("\u1208");
        jButton43.setText("\u1209");
        jButton44.setText("\u120A");
        jButton45.setText("\u120B");
        jButton46.setText("\u120C");
        jButton47.setText("\u120D");
        jButton48.setText("\u120E");
        jButton49.setText("\u120F");}
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton40.getText());}
        if(shift%2==0){jButton42.setText("\u1230");
        jButton43.setText("\u1231");
        jButton44.setText("\u1232");
        jButton45.setText("\u1233");
        jButton46.setText("\u1234");
        jButton47.setText("\u1235");
        jButton48.setText("\u1236");
        jButton49.setText("\u1237");}
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton2.getText());}
        if(shift%2==0){ jButton42.setText("\u1278");
        jButton43.setText("\u1279");
        jButton44.setText("\u127A");
        jButton45.setText("\u127B");
        jButton46.setText("\u127C");
        jButton47.setText("\u127D");
        jButton48.setText("\u127E");
        jButton49.setText("\u127F");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton4.getText());}
        if(shift%2==0){jButton42.setText("\u1308");
        jButton43.setText("\u1309");
        jButton44.setText("\u130A");
        jButton45.setText("\u130B");
        jButton46.setText("\u130C");
        jButton47.setText("\u130D");
        jButton48.setText("\u130E");
        jButton49.setText("\u1313");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton6.getText());}
        if(shift%2==0){jButton42.setText("\u12F0");
        jButton43.setText("\u12F1");
        jButton44.setText("\u12F2");
        jButton45.setText("\u12F3");
        jButton46.setText("\u12F4");
        jButton47.setText("\u12F5");
        jButton48.setText("\u12F6");
        jButton49.setText("\u12F7");}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton8.getText());}
        if(shift%2==0){jButton42.setText("\u12A8");
        jButton43.setText("\u12A9");
        jButton44.setText("\u12AA");
        jButton45.setText("\u12AB");
        jButton46.setText("\u12AC");
        jButton47.setText("\u12AD");
        jButton48.setText("\u12AE");
        jButton49.setText("\u12AF");}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton10.getText());}
        if(shift%2==0){ jButton42.setText("\u1320");
        jButton43.setText("\u1321");
        jButton44.setText("\u1322");
        jButton45.setText("\u1323");
        jButton46.setText("\u1324");
        jButton47.setText("\u1325");
        jButton48.setText("\u1326");
        jButton49.setText("\u1327");}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton12.getText());}
        if(shift%2==0){jButton42.setText("\u1240");
        jButton43.setText("\u1241");
        jButton44.setText("\u1242");
        jButton45.setText("\u1243");
        jButton46.setText("\u1244");
        jButton47.setText("\u1245");
        jButton48.setText("\u1246");
        jButton49.setText("\u124B");}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton14.getText());}
        if(shift%2==0){jButton42.setText("\u12D8");
        jButton43.setText("\u12D9");
        jButton44.setText("\u12DA");
        jButton45.setText("\u12DB");
        jButton46.setText("\u12DC");
        jButton47.setText("\u12DD");
        jButton48.setText("\u12DE");
        jButton49.setText("\u12DF");}
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton16.getText());}
        if(shift%2==0){jButton42.setText("\u1238");
        jButton43.setText("\u1239");
        jButton44.setText("\u123A");
        jButton45.setText("\u123B");
        jButton46.setText("\u123C");
        jButton47.setText("\u123D");
        jButton48.setText("\u123E");
        jButton49.setText("\u123F");}
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton18.getText());}
        if(shift%2==0){jButton42.setText("\u12E0");
        jButton43.setText("\u12E1");
        jButton44.setText("\u12E2");
        jButton45.setText("\u12E3");
        jButton46.setText("\u12E4");
        jButton47.setText("\u12E5");
        jButton48.setText("\u12E6");
        jButton49.setText("\u12E7");}
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
       if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton41.getText());}
        if(shift%2==0){jButton42.setText("\u1220");
        jButton43.setText("\u1221");
        jButton44.setText("\u1222");
        jButton45.setText("\u1223");
        jButton46.setText("\u1224");
        jButton47.setText("\u1225");
        jButton48.setText("\u1226");
        jButton49.setText("\u1227");}
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
       if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton29.getText());}
        if(shift%2==0){ jButton42.setText("\u1348");
        jButton43.setText("\u1349");
        jButton44.setText("\u134A");
        jButton45.setText("\u134B");
        jButton46.setText("\u134C");
        jButton47.setText("\u134D");
        jButton48.setText("\u134E");
        jButton49.setText("\u134F");}
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton27.getText());}
        if(shift%2==0){jButton42.setText("\u1200");
        jButton43.setText("\u1201");
        jButton44.setText("\u1202");
        jButton45.setText("\u1203");
        jButton46.setText("\u1204");
        jButton47.setText("\u1205");
        jButton48.setText("\u1206");
        jButton49.setText("\u1207");}
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton33.getText());}
        if(shift%2==0){jButton42.setText("\u1298");
        jButton43.setText("\u1299");
        jButton44.setText("\u129A");
        jButton45.setText("\u129B");
        jButton46.setText("\u129C");
        jButton47.setText("\u129D");
        jButton48.setText("\u129E");
        jButton49.setText("\u129F");}
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton31.getText());}
        if(shift%2==0){jButton42.setText("\u1300");
        jButton43.setText("\u1301");
        jButton44.setText("\u1302");
        jButton45.setText("\u1303");
        jButton46.setText("\u1304");
        jButton47.setText("\u1305");
        jButton48.setText("\u1306");
        jButton49.setText("\u1307");}
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton21.getText());}
        if(shift%2==0){jButton42.setText("\u1328");
        jButton43.setText("\u1329");
        jButton44.setText("\u132A");
        jButton45.setText("\u132B");
        jButton46.setText("\u132C");
        jButton47.setText("\u132D");
        jButton48.setText("\u132E");
        jButton49.setText("\u132F");}
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton19.getText());}
        if(shift%2==0){jButton42.setText("\u1350");
        jButton43.setText("\u1351");
        jButton44.setText("\u1352");
        jButton45.setText("\u1353");
        jButton46.setText("\u1354");
        jButton47.setText("\u1355");
        jButton48.setText("\u1356");
        jButton49.setText("\u1357");}
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton25.getText());}
        if(shift%2==0){jButton42.setText("\u1338");
        jButton43.setText("\u1339");
        jButton44.setText("\u133A");
        jButton45.setText("\u133B");
        jButton46.setText("\u133C");
        jButton47.setText("\u133D");
        jButton48.setText("\u133E");
        jButton49.setText("\u133F");}
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton23.getText());}
        if(shift%2==0){jButton42.setText("\u1268");
        jButton43.setText("\u1269");
        jButton44.setText("\u126A");
        jButton45.setText("\u126B");
        jButton46.setText("\u126C");
        jButton47.setText("\u126D");
        jButton48.setText("\u126E");
        jButton49.setText("\u126F");}
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
         if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton32.getText());}
        if(shift%2==0){jButton42.setText("\u12D0");
        jButton43.setText("\u12D1");
        jButton44.setText("\u12D2");
        jButton45.setText("\u12D3");
        jButton46.setText("\u12D4");
        jButton47.setText("\u12D5");
        jButton48.setText("\u12D6");
        jButton49.setText("");}
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
         if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton34.getText());}
        if(shift%2==0){jButton42.setText("\u1210");
        jButton43.setText("\u1211");
        jButton44.setText("\u1212");
        jButton45.setText("\u1213");
        jButton46.setText("\u1214");
        jButton47.setText("\u1215");
        jButton48.setText("\u1216");
        jButton49.setText("\u1217");}
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton20.getText());}
        if(shift%2==0){jButton42.setText("\u1340");
        jButton43.setText("\u1341");
        jButton44.setText("\u1342");
        jButton45.setText("\u1343");
        jButton46.setText("\u1344");
        jButton47.setText("\u1345");
        jButton48.setText("\u1346");
        jButton49.setText("\u1347");}
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton22.getText());}
        if(shift%2==0){jButton42.setText("\u1330");
        jButton43.setText("\u1331");
        jButton44.setText("\u1332");
        jButton45.setText("\u1333");
        jButton46.setText("\u1334");
        jButton47.setText("\u1335");
        jButton48.setText("\u1336");
        jButton49.setText("\u1337");}
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton24.getText());}
        if(shift%2==0){jButton42.setText("\u1280");
        jButton43.setText("\u1281");
        jButton44.setText("\u1282");
        jButton45.setText("\u1283");
        jButton46.setText("\u1284");
        jButton47.setText("\u1285");
        jButton48.setText("\u1286");
        jButton49.setText("\u128B");}
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int var2 = jTextField1.getText().length();
        int var3 =  jTextField1.getText().length() - 1;
                if (var2 > 0) {
                    StringBuilder var5 = new StringBuilder( jTextField1.getText());
                    var5.deleteCharAt(var3);
                    String var4 = var5.toString();
                    jTextField1.setText(var4);}
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jTextField1.setText(jTextField1.getText()+" ");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if(shift%2!=0){jTextField1.setText(jTextField1.getText()+jButton30.getText());}
        if(shift%2==0){jButton42.setText("\u12B8");
        jButton43.setText("\u12B9");
        jButton44.setText("\u12BA");
        jButton45.setText("\u12BB");
        jButton46.setText("\u12BC");
        jButton47.setText("\u12BD");
        jButton48.setText("\u12BE");
        jButton49.setText("\u12C3");}
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(shift%2==0){jButton3.setText("1");
        jButton1.setText("2");
        jButton7.setText("3");
        jButton5.setText("4");
        jButton11.setText("5");
        jButton9.setText("6");
        jButton15.setText("7");
        jButton13.setText("8");
        jButton17.setText("9");
        jButton40.setText("0");
        jButton2.setText("#");
        jButton4.setText("$");
        jButton6.setText("%");
        jButton8.setText("&");
        jButton10.setText("*");
        jButton12.setText("-");
        jButton14.setText("=");
        jButton16.setText("(");
        jButton18.setText(")");
        jButton41.setText("!");
        jButton29.setText("\u1361");
        jButton27.setText("@");
        jButton33.setText("\u1363");
        jButton31.setText("\u1364");
        jButton21.setText("\u1365");
        jButton19.setText("\u1366");
        jButton25.setText("\u1367");
        jButton23.setText("\u1360");
        jButton30.setText("?");
        jButton32.setText("/");
        jButton34.setText("]");
        jButton20.setText("{");
        jButton22.setText("}");
        jButton24.setText("[");
        jButton42.setText("\u1369");
        jButton43.setText("\u136A");
        jButton44.setText("\u136B");
        jButton45.setText("\u136C");
        jButton46.setText("\u136D");
        jButton47.setText("\u136E");
        jButton48.setText("\u136F");
        jButton49.setText("\u1370");
        jButton37.setText("\u1362");
        }
        if(shift%2!=0){
        jButton1.setText("\u1260");
        jButton3.setText("\u1290");
        jButton7.setText("\u1270");
        jButton5.setText("\u12E8");
        jButton11.setText("\u1218");
        jButton9.setText("\u12A0");
        jButton15.setText("\u1228");
        jButton13.setText("\u12C8");
        jButton17.setText("\u1208");
        jButton40.setText("\u1230");
        jButton2.setText("\u1278");
        jButton4.setText("\u1308");
        jButton6.setText("\u12F0");
        jButton8.setText("\u12A8");
        jButton10.setText("\u1320");
        jButton12.setText("\u1240");
        jButton14.setText("\u12D8");
        jButton16.setText("\u1238");
        jButton18.setText("\u12E0");
        jButton41.setText("\u1220");
        jButton29.setText("\u1348");
        jButton27.setText("\u1200");
        jButton33.setText("\u1298");
        jButton31.setText("\u1300");
        jButton21.setText("\u1328");
        jButton19.setText("\u1350");
        jButton25.setText("\u1338");
        jButton23.setText("\u1268");
        jButton30.setText("\u12B8");
        jButton32.setText("\u12D0");
        jButton34.setText("\u1210");
        jButton20.setText("\u1340");
        jButton22.setText("\u1330");
        jButton24.setText("\u1280");
        jButton37.setText(".");
        }
        shift++;
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jTextField1.setText(jTextField1.getText()+jButton37.getText());
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
            if(cc%2==0){jTextField1.setBackground(new java.awt.Color(150, 200, 150));
           jPanel1.setBackground(new java.awt.Color(150, 20, 50)); }
            if(cc%2!=0){jTextField1.setBackground(new java.awt.Color(250, 250, 250));
            jPanel1.setBackground(new java.awt.Color(50, 250, 250));}
            cc++;
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    BufferedWriter buffWriter = null;
    try {
        FileWriter fw = new FileWriter("C:\\Users\\user\\Pictures\\first1.txt");
        buffWriter = new BufferedWriter(fw);
        int y=0;
        while (y<x) {
            
            String line = jTextField1.getText();
            buffWriter.write(line);
            buffWriter.newLine();
            y++;
        }
    } catch (IOException e) {
        System.out.println("Error writing to file");
    }
    if (buffWriter != null) {
        try { buffWriter.close(); }
        catch(IOException e) { /* ignore */ }
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jTextField1.setText(jTextField1.getText()+"#");//new line delimiter
        x++;
    }//GEN-LAST:event_jButton35ActionPerformed
   
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
            java.util.logging.Logger.getLogger(amhKeyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(amhKeyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(amhKeyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(amhKeyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new amhKeyboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
        

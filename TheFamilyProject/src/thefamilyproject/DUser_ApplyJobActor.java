package thefamilyproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author SD
 */
public class DUser_ApplyJobActor extends javax.swing.JFrame {

    ImageIcon icon1;

    public DUser_ApplyJobActor() {
        initComponents();
        Seticon();
        nameloginfo();
        ja_agef.requestFocus();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        InputMap im = ja_homeb.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap imb = ja_submitb.getInputMap(WHEN_FOCUSED);
        imb.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        imb.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
    }

    private void nameloginfo() {

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Temp\\UserTempLog.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");
                ja_namef1.setText(value[0]);
                ja_namef.setText(value[2]);
                ja_mailf.setText(value[3]);
            }

        } catch (FileNotFoundException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ja_logo = new javax.swing.JLabel();
        ja_name = new javax.swing.JLabel();
        ja_namef = new javax.swing.JTextField();
        ja_age = new javax.swing.JLabel();
        ja_agef = new javax.swing.JTextField();
        ja_nid = new javax.swing.JLabel();
        ja_nidf = new javax.swing.JTextField();
        ja_mail = new javax.swing.JLabel();
        ja_mailf = new javax.swing.JTextField();
        ja_pn = new javax.swing.JLabel();
        ja_pnf = new javax.swing.JTextField();
        ja_submitb = new javax.swing.JButton();
        ja_homeb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JA_BI = new javax.swing.JLabel();
        ja_namef1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ja_logo.setIcon(new javax.swing.ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\JobApLg.png")); // NOI18N
        ja_logo.setText("jLabel2");
        getContentPane().add(ja_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 150, 150));

        ja_name.setBackground(new java.awt.Color(0, 0, 0));
        ja_name.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_name.setForeground(new java.awt.Color(255, 255, 255));
        ja_name.setText("Name:");
        getContentPane().add(ja_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 80, 30));

        ja_namef.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_namef.setEnabled(false);
        ja_namef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_namefKeyTyped(evt);
            }
        });
        getContentPane().add(ja_namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 220, 30));

        ja_age.setBackground(new java.awt.Color(0, 0, 0));
        ja_age.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_age.setForeground(new java.awt.Color(255, 255, 255));
        ja_age.setText("Age:");
        getContentPane().add(ja_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 80, 30));

        ja_agef.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_agef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ja_agefMouseClicked(evt);
            }
        });
        ja_agef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ja_agefKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_agefKeyTyped(evt);
            }
        });
        getContentPane().add(ja_agef, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 220, 30));

        ja_nid.setBackground(new java.awt.Color(0, 0, 0));
        ja_nid.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_nid.setForeground(new java.awt.Color(255, 255, 255));
        ja_nid.setText("NID Number:");
        getContentPane().add(ja_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 150, 30));

        ja_nidf.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_nidf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ja_nidfMouseClicked(evt);
            }
        });
        ja_nidf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ja_nidfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_nidfKeyTyped(evt);
            }
        });
        getContentPane().add(ja_nidf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 220, 30));

        ja_mail.setBackground(new java.awt.Color(0, 0, 0));
        ja_mail.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_mail.setForeground(new java.awt.Color(255, 255, 255));
        ja_mail.setText("Mail:");
        getContentPane().add(ja_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, 30));

        ja_mailf.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_mailf.setEnabled(false);
        getContentPane().add(ja_mailf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 220, 30));

        ja_pn.setBackground(new java.awt.Color(0, 0, 0));
        ja_pn.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_pn.setForeground(new java.awt.Color(255, 255, 255));
        ja_pn.setText("Phone Number:");
        getContentPane().add(ja_pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 180, 30));

        ja_pnf.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_pnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ja_pnfMouseClicked(evt);
            }
        });
        ja_pnf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ja_pnfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_pnfKeyTyped(evt);
            }
        });
        getContentPane().add(ja_pnf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 220, 30));

        ja_submitb.setBackground(new java.awt.Color(61, 45, 48));
        ja_submitb.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        ja_submitb.setForeground(new java.awt.Color(255, 255, 255));
        ja_submitb.setText("Submit ");
        ja_submitb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_submitb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_submitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_submitbActionPerformed(evt);
            }
        });
        getContentPane().add(ja_submitb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 140, 50));

        ja_homeb.setBackground(new java.awt.Color(69, 61, 55));
        ja_homeb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ja_homeb.setForeground(new java.awt.Color(255, 255, 255));
        ja_homeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        ja_homeb.setText("Family Cafe");
        ja_homeb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_homeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_homeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_homebActionPerformed(evt);
            }
        });
        getContentPane().add(ja_homeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 164, 218));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 420, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 164, 218));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 390, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/author.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, -1));

        JA_BI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/image (7).png"))); // NOI18N
        JA_BI.setText("jLabel1");
        JA_BI.setMaximumSize(new java.awt.Dimension(500, 700));
        JA_BI.setMinimumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(JA_BI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        ja_namef1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ja_namef1.setEnabled(false);
        getContentPane().add(ja_namef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ja_submitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_submitbActionPerformed
        // TODO add your handling code here:
        jLabel2.setText("");
        jLabel3.setText("");
        //Make button pop up           ////////////////////////////////////////////
        ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\done.png");
        // Done button pop up          /////////////////////////////////////////////

        // Saving To File ///////////////////////////////////////////////////
        String u_name = ja_namef1.getText();
        String name = ja_namef.getText();
        String age = ja_agef.getText();
        String nid = ja_nidf.getText();
        String mail = ja_mailf.getText();
        String phone = ja_pnf.getText();

        if (name.equals("") && age.equals("") && nid.equals("") && mail.equals("") && phone.equals("")) {
            JOptionPane.showMessageDialog(this, "Oops, you forget to tell us.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (name.equals("") || age.equals("") || nid.equals("") || mail.equals("") || phone.equals("")) {
            jLabel2.setText("                        No Field Can Be Empty.");
        } else if (name.length() < 3 || name.length() > 20) {
            JOptionPane.showMessageDialog(this, "Invalid Name! \nGive your birth name.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(age) < 18) {
            jLabel2.setText("                You Are Small Right Now!");
            ja_agef.requestFocus();

        } else if (Integer.parseInt(age) > 60) {
            jLabel3.setText("Sorry, Currently We Do Not Have Any Suitable Job According To Your Age.");
            ja_agef.requestFocus();
        } else if (nid.length() < 10 || nid.length() > 12) {
            jLabel2.setText("                 Fake NID Number. Use Real One.");
            ja_nidf.requestFocus();
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail))) {
            jLabel2.setText("                 Email Seems Fake. Use Real One.");
        } else if (phone.length() != 11 || !(Pattern.matches("^[0][1][3-9]\\d{8}", phone))) {
            jLabel2.setText("                        Incorrect Phone Number.");
            ja_pnf.requestFocus();
        } else {

            try {

                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\NewActorReq.txt", true);
                Write.write(u_name + "\t" + name + "\t" + age + "\t" + mail + "\t" + nid + "\t" + phone + "\t.....\t");
                Write.write(System.getProperty("line.separator"));
                Write.close();

                JOptionPane.showMessageDialog(this, "Don't Forget To Mail Your C.V At job.ac@lovely.com. \nYou Will Be Called For Interview After Verification.", "Request Completed !!", JOptionPane.PLAIN_MESSAGE, icon);
                setVisible(false);
                new DUser_Menu().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error");
            }

        }   // Saving To File ///////////////////////////////////////////////////
    }//GEN-LAST:event_ja_submitbActionPerformed

    private void ja_agefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_agefKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            ja_nidf.requestFocus();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_agefKeyTyped

    private void ja_pnfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_pnfKeyTyped
        char c = evt.getKeyChar();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            ja_submitb.requestFocus();
            pressbutton();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    private void pressbutton() {
        ActionEvent evt = null;

        ja_submitbActionPerformed(evt);

    }//GEN-LAST:event_ja_pnfKeyTyped

    private void ja_nidfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_nidfKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            ja_pnf.requestFocus();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_nidfKeyTyped

    private void ja_homebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_homebActionPerformed
        // call home button end  //////////////////////////////////////////////////////////////////
        DUser_ActorCenter menu = new DUser_ActorCenter();
        menu.show();
        dispose();
        // call home button end ///////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_ja_homebActionPerformed

    private void ja_namefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_namefKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_namefKeyTyped

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\admin.png");
        JOptionPane.showMessageDialog(this, " Program Created By Shourav Deb \nTalk To Me: heyneeddev@gmail.com", "@author info", JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ja_agefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ja_agefMouseClicked
        jLabel2.setText("");
        jLabel3.setText("");
    }//GEN-LAST:event_ja_agefMouseClicked

    private void ja_nidfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ja_nidfMouseClicked
        jLabel2.setText("");
        jLabel3.setText("");
    }//GEN-LAST:event_ja_nidfMouseClicked

    private void ja_pnfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ja_pnfMouseClicked
        jLabel2.setText("");
        jLabel3.setText("");
    }//GEN-LAST:event_ja_pnfMouseClicked

    private void ja_agefKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_agefKeyPressed
        jLabel2.setText("");
        jLabel3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ja_agefKeyPressed

    private void ja_nidfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_nidfKeyPressed
        jLabel2.setText("");
        jLabel3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ja_nidfKeyPressed

    private void ja_pnfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_pnfKeyPressed
        jLabel2.setText("");
        jLabel3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ja_pnfKeyPressed

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
            java.util.logging.Logger.getLogger(DUser_ApplyJobActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUser_ApplyJobActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUser_ApplyJobActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUser_ApplyJobActor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DUser_ApplyJobActor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JA_BI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel ja_age;
    private javax.swing.JTextField ja_agef;
    private javax.swing.JButton ja_homeb;
    private javax.swing.JLabel ja_logo;
    private javax.swing.JLabel ja_mail;
    private javax.swing.JTextField ja_mailf;
    private javax.swing.JLabel ja_name;
    private javax.swing.JTextField ja_namef;
    private javax.swing.JTextField ja_namef1;
    private javax.swing.JLabel ja_nid;
    private javax.swing.JTextField ja_nidf;
    private javax.swing.JLabel ja_pn;
    private javax.swing.JTextField ja_pnf;
    private javax.swing.JButton ja_submitb;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

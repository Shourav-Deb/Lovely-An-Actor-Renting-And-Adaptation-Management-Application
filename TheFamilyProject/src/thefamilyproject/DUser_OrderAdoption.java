package thefamilyproject;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
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
public class DUser_OrderAdoption extends javax.swing.JFrame {

    /**
     * *
     * @author SD
     */
    ImageIcon icon1;

    public DUser_OrderAdoption() {
        initComponents();
        Seticon();
        nameloginfo();
        ja_u_namef.setEnabled(false);
        jTextField1.setVisible(false);
        ja_submitb3.setVisible(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        ja_mailf.requestFocus();
        InputMap im = ja_submitb1.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap imb = ja_submitb2.getInputMap(WHEN_FOCUSED);
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
                String[] name = value[2].split(" ");
                ja_age.setText("Hey " + name[0] + ", please fill up the detail to make easier process.");
                ja_u_namef.setText(value[0]);
                ja_mailf.setText(value[3]);
            }

        } catch (FileNotFoundException e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ja_name = new javax.swing.JLabel();
        ja_id = new javax.swing.JTextField();
        ja_age = new javax.swing.JLabel();
        ja_nid = new javax.swing.JLabel();
        ja_nidf = new javax.swing.JTextField();
        ja_mail = new javax.swing.JLabel();
        ja_mailf = new javax.swing.JTextField();
        ja_pn2 = new javax.swing.JLabel();
        ja_dayf = new javax.swing.JTextField();
        ja_submitb1 = new javax.swing.JButton();
        ja_submitb2 = new javax.swing.JButton();
        ja_submitb3 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        ja_pnf1 = new javax.swing.JTextField();
        ja_pn1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        JA_BI = new javax.swing.JLabel();
        ja_u_namef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ja_name.setBackground(new java.awt.Color(0, 0, 0));
        ja_name.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_name.setForeground(new java.awt.Color(255, 255, 255));
        ja_name.setText("Member ID No:");
        getContentPane().add(ja_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 30));

        ja_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ja_idFocusLost(evt);
            }
        });
        ja_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_idKeyTyped(evt);
            }
        });
        getContentPane().add(ja_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 170, 30));

        ja_age.setBackground(new java.awt.Color(0, 0, 0));
        ja_age.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        ja_age.setForeground(new java.awt.Color(51, 255, 153));
        getContentPane().add(ja_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 440, 30));

        ja_nid.setBackground(new java.awt.Color(0, 0, 0));
        ja_nid.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_nid.setForeground(new java.awt.Color(255, 255, 255));
        ja_nid.setText("NID Number:");
        getContentPane().add(ja_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 30));

        ja_nidf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ja_nidfPropertyChange(evt);
            }
        });
        ja_nidf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_nidfKeyTyped(evt);
            }
        });
        getContentPane().add(ja_nidf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 250, 30));

        ja_mail.setBackground(new java.awt.Color(0, 0, 0));
        ja_mail.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_mail.setForeground(new java.awt.Color(255, 255, 255));
        ja_mail.setText("Email:");
        getContentPane().add(ja_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        ja_mailf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_mailfKeyTyped(evt);
            }
        });
        getContentPane().add(ja_mailf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 250, 30));

        ja_pn2.setBackground(new java.awt.Color(0, 0, 0));
        ja_pn2.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_pn2.setForeground(new java.awt.Color(255, 255, 255));
        ja_pn2.setText("Total Kids:");
        getContentPane().add(ja_pn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 130, 30));

        ja_dayf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_dayfActionPerformed(evt);
            }
        });
        ja_dayf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ja_dayfPropertyChange(evt);
            }
        });
        ja_dayf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_dayfKeyTyped(evt);
            }
        });
        getContentPane().add(ja_dayf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 170, 30));

        ja_submitb1.setBackground(new java.awt.Color(60, 66, 64));
        ja_submitb1.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        ja_submitb1.setForeground(new java.awt.Color(255, 255, 255));
        ja_submitb1.setText("Cancel");
        ja_submitb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_submitb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_submitb1.setNextFocusableComponent(jLabel2);
        ja_submitb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_submitb1ActionPerformed(evt);
            }
        });
        getContentPane().add(ja_submitb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 140, 50));

        ja_submitb2.setBackground(new java.awt.Color(0, 102, 0));
        ja_submitb2.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        ja_submitb2.setForeground(new java.awt.Color(255, 255, 255));
        ja_submitb2.setText("Next");
        ja_submitb2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_submitb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_submitb2.setNextFocusableComponent(ja_submitb1);
        ja_submitb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_submitb2ActionPerformed(evt);
            }
        });
        getContentPane().add(ja_submitb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 140, 50));

        ja_submitb3.setBackground(new java.awt.Color(61, 4, 16));
        ja_submitb3.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        ja_submitb3.setForeground(new java.awt.Color(255, 255, 255));
        ja_submitb3.setText("Confirm");
        ja_submitb3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_submitb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_submitb3.setNextFocusableComponent(ja_submitb1);
        ja_submitb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_submitb3ActionPerformed(evt);
            }
        });
        getContentPane().add(ja_submitb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 140, 50));

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jSlider1.setNextFocusableComponent(ja_submitb2);
        jSlider1.setVerifyInputWhenFocusTarget(false);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSlider1MouseClicked(evt);
            }
        });
        jSlider1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSlider1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSlider1KeyTyped(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 230, -1));

        ja_pnf1.setEditable(false);
        ja_pnf1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ja_pnf1.setFocusable(false);
        ja_pnf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_pnf1KeyTyped(evt);
            }
        });
        ja_pnf1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                ja_pnf1VetoableChange(evt);
            }
        });
        getContentPane().add(ja_pnf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 40, 40));

        ja_pn1.setBackground(new java.awt.Color(0, 0, 0));
        ja_pn1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        ja_pn1.setForeground(new java.awt.Color(255, 255, 255));
        ja_pn1.setText("Phone Number:");
        getContentPane().add(ja_pn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 30));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Swis721 BlkEx BT", 3, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setNextFocusableComponent(ja_submitb3);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 190, 30));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel6.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel6.setMinimumSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 356, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/author.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 164, 218));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 450, 40));

        jLabel2.setFont(new java.awt.Font("Swis721 BlkEx BT", 3, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, 40));

        jSeparator1.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 200, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 10));

        JA_BI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/image (10).png"))); // NOI18N
        JA_BI.setMaximumSize(new java.awt.Dimension(500, 700));
        JA_BI.setMinimumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(JA_BI, new org.netbeans.lib.awtextra.AbsoluteConstraints(-540, 0, 1040, 700));

        ja_u_namef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ja_u_namefKeyTyped(evt);
            }
        });
        getContentPane().add(ja_u_namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, 30));

        jLabel4.setEnabled(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 270, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ja_submitb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_submitb1ActionPerformed
        DUser_AdoptionList menu = new DUser_AdoptionList();
        menu.click();
        menu.show();
        dispose();
    }//GEN-LAST:event_ja_submitb1ActionPerformed

    private void ja_submitb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_submitb2ActionPerformed
        try {
            jLabel5.setText("");
            String mail = ja_mailf.getText();
            String name = ja_id.getText();
            String nid = ja_nidf.getText();
            String phone = ja_dayf.getText();
            String day = ja_pnf1.getText();

            ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\transectionlogo.png");

            if (name.equals("") && mail.equals("") && nid.equals("") && phone.equals("") && day.equals("")) {
                jLabel5.setText("                       Oops, You Forget To Tell Us.");
            } else if (name.equals("") || nid.equals("") || phone.equals("") || day.equals("")) {
                jLabel5.setText("                       No Field Can Be Empty.");
            } else if (containsWhiteSpace(mail) == true) {                                            // Mail Verify
                jLabel5.setText("                       Mail Can Not Have Any Space.");
                ja_mailf.requestFocus();
            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail))) {
                jLabel5.setText("                      Email Seems Fake. Use Real One.");

                ja_mailf.requestFocus();
            } else if (nid.length() < 10 || nid.length() > 12) {
                jLabel5.setText("                    Fake NID Number. Use Real One.");
                ja_nidf.requestFocus();
            } else if (phone.length() != 11 || !(Pattern.matches("^[0][1][3-9]\\d{8}", phone))) {
                jLabel5.setText("                         Incorrect Phone Number.");
                ja_dayf.requestFocus();
            } else if (name.length() != 5 || vermem(name) == 0) {
                jLabel5.setText("             Use The Member ID From The List!");
                ja_id.requestFocus();
            } else if (vermem2(name) == 0) {
                jLabel5.setText("               This Member Is Currently Not Available.");
                ja_id.requestFocus();
            } else {
                int number = Integer.parseInt(day);
                int fee = 1000;
                JOptionPane.showMessageDialog(this, "Please Pay " + fee + " Tk Through Bkash Number 01999999990 & Give The Transaction Number.", "Payment", JOptionPane.PLAIN_MESSAGE, icon);
                jLabel5.setText("");
                jTextField1.setVisible(true);
                jSlider1.setEnabled(false);
                ja_submitb2.setEnabled(false);
                ja_submitb3.setEnabled(true);
                ja_id.setEnabled(false);
                ja_u_namef.setEnabled(false);
                ja_nidf.setEnabled(false);
                ja_mailf.setEnabled(false);
                ja_dayf.setEnabled(false);
                ja_pnf1.setEnabled(false);
                ja_submitb3.setVisible(true);
                ja_submitb2.setVisible(false);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_ja_submitb2ActionPerformed

    private static int vermem(String ename) {
        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
        int co = 0;
        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[1].equals(ename)) {
                    co++;

                }
            }
        } catch (Exception e) {
        }

        return co;
    }

    private static int vermem2(String ename) {
        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
        int co = 0;
        try {
            String a = "Yes";
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[1].equals(ename)) {
                    if (value[10].equals(a)) {

                        co++;
                    }
                }
            }
        } catch (Exception e) {
        }

        return co;
    }

    public static boolean containsWhiteSpace(String line) {                                         // Checks if there is a white space or not
        boolean space = false;
        if (line != null) {

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == ' ') {
                    space = true;
                }

            }
        }
        return space;
    }

    private void ja_dayfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_dayfKeyTyped
        jLabel5.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            ja_id.requestFocus();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_dayfKeyTyped

    private void ja_nidfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_nidfKeyTyped
        jLabel5.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            ja_dayf.requestFocus();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_nidfKeyTyped

    private void ja_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_idKeyTyped
        jLabel5.setText("");
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_ENTER) {
            jSlider1.requestFocus();
        } else if (!Character.isDigit(c)) {
            evt.consume();
        }


    }//GEN-LAST:event_ja_idKeyTyped

    private void ja_pnf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_pnf1KeyTyped
        jLabel5.setText("");
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_pnf1KeyTyped

    private void ja_dayfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_dayfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ja_dayfActionPerformed

    private void ja_submitb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_submitb3ActionPerformed

        String name = ja_id.getText();
        String u_name = ja_u_namef.getText();
        String nid = ja_nidf.getText();
        String mail = ja_mailf.getText();
        String phone = ja_dayf.getText();
        String day = ja_pnf1.getText();

        ImageIcon icon2 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\done1.png");

        String txid_num = jLabel4.getText();

        File file2 = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Txid.txt");

        try {

            Scanner scan1 = new Scanner(file2);

            while (scan1.hasNext()) {

                String line = scan1.nextLine();
                String[] value = line.split("\t");

                if (value[0].equals(txid_num)) {
                    try {
                        jTextField1.setText(" Payment Done");
                        FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\AdoptionRequest.txt", true);
                        Write.write(name + "\t" + u_name + "\t" + nid + "\t" + mail + "\t" + phone + "\t" + day + "\t" + txid_num + "\t.....\t");
                        Write.write(System.getProperty("line.separator"));
                        Write.close();

                        JOptionPane.showMessageDialog(this, "After Verifing Info You Will Be Contacted. For More Look At Adoption Rules.", "Request Complete", JOptionPane.PLAIN_MESSAGE, icon2);
                        setVisible(false);
                        DUser_AdoptionList menu = new DUser_AdoptionList();
                        menu.click();
                        menu.show();
                    } catch (Exception e) {
                    }
                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_ja_submitb3ActionPerformed

    private void ja_pnf1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_ja_pnf1VetoableChange
        String day = ja_pnf1.getText();
        int number = Integer.parseInt(day);
        jSlider1.setValue(number);
    }//GEN-LAST:event_ja_pnf1VetoableChange

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked
        jLabel5.setText("");
        int slide = jSlider1.getValue();
        ja_pnf1.setText(Integer.toString(slide));
    }//GEN-LAST:event_jSlider1MouseClicked

    private void jSlider1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSlider1KeyPressed
        int slide = jSlider1.getValue();
        ja_pnf1.setText(Integer.toString(slide));
    }//GEN-LAST:event_jSlider1KeyPressed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
        jLabel5.setText("");
        int slide = jSlider1.getValue();
        ja_pnf1.setText(Integer.toString(slide));
    }//GEN-LAST:event_jSlider1MouseDragged

    private void ja_u_namefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_u_namefKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ja_u_namefKeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\admin.png");
        JOptionPane.showMessageDialog(this, " Program Created By Shourav Deb \nTalk To Me: heyneeddev@gmail.com", "@author info", JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost

    }//GEN-LAST:event_formFocusLost

    private void ja_nidfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ja_nidfPropertyChange
        jLabel5.setText("");
    }//GEN-LAST:event_ja_nidfPropertyChange

    private void ja_dayfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ja_dayfPropertyChange
        jLabel5.setText("");
    }//GEN-LAST:event_ja_dayfPropertyChange

    private void ja_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ja_idFocusLost
        ImageIcon ii = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + ja_id.getText() + ".jpg");
        Image image = ii.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        jLabel6.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_ja_idFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        ImageIcon ii = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + ja_id.getText() + ".jpg");
        Image image = ii.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        jLabel6.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_formFocusGained

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            ja_submitb3.requestFocus();
            pressbutton3();
        } 
    }

    private void pressbutton3() {
        ActionEvent evt = null;

        ja_submitb3ActionPerformed(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jLabel4.setText(jTextField1.getText());
        jTextField1.setText("  Wrong TxID");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jSlider1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSlider1KeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_ENTER) {
            ja_submitb2.requestFocus();
            pressbutton();
        } else {
            int slide = jSlider1.getValue();
            ja_pnf1.setText(Integer.toString(slide));
        }
    }

    private void pressbutton() {
        ActionEvent evt = null;

        ja_submitb2ActionPerformed(evt);
    }//GEN-LAST:event_jSlider1KeyTyped

    private void ja_mailfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ja_mailfKeyTyped
        jLabel5.setText("");
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_ENTER) {
            ja_nidf.requestFocus();
        }
    }//GEN-LAST:event_ja_mailfKeyTyped

    /**
     * *
     * @author SD
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
            java.util.logging.Logger.getLogger(DUser_OrderAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUser_OrderAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUser_OrderAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUser_OrderAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DUser_OrderAdoption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JA_BI;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel ja_age;
    private javax.swing.JTextField ja_dayf;
    private javax.swing.JTextField ja_id;
    private javax.swing.JLabel ja_mail;
    private javax.swing.JTextField ja_mailf;
    private javax.swing.JLabel ja_name;
    private javax.swing.JLabel ja_nid;
    private javax.swing.JTextField ja_nidf;
    private javax.swing.JLabel ja_pn1;
    private javax.swing.JLabel ja_pn2;
    private javax.swing.JTextField ja_pnf1;
    private javax.swing.JButton ja_submitb1;
    private javax.swing.JButton ja_submitb2;
    private javax.swing.JButton ja_submitb3;
    private javax.swing.JTextField ja_u_namef;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

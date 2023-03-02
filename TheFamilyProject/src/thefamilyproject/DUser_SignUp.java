package thefamilyproject;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SD
 */
public class DUser_SignUp extends javax.swing.JFrame {

    public DUser_SignUp() {
        initComponents();
        Seticon();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        jTextField3.requestFocus();
        p1.setVisible(false);
        p2.setVisible(false);

        InputMap im = jButton1.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");

        InputMap im2 = jButton4.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = jButton6.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = jButton3.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im5 = jButton5.getInputMap(WHEN_FOCUSED);
        im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");

        InputMap im6 = j_Pic_Button.getInputMap(WHEN_FOCUSED);
        im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jasField1 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        j_Pic_Button = new javax.swing.JButton();
        j_Label_Image = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("    Enter Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 140, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, 50));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter  Username");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 160, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 350, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 90, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Email Adress");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Sign up");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 170, 60));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Log In");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setNextFocusableComponent(jTextField3);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 80, 30));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("About Us");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setNextFocusableComponent(jButton4);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 80, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/Signup.jpg"))); // NOI18N
        jLabel6.setText("About Us");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 610));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 610));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 310, 50));

        jPanel6.setBackground(new java.awt.Color(255, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jasField1.setBackground(new java.awt.Color(255, 255, 255));
        jasField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jasField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jasField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jasField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jasField1FocusLost(evt);
            }
        });
        jasField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jasField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jasField1KeyTyped(evt);
            }
        });
        jPanel6.add(jasField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/ps.png"))); // NOI18N
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        jPanel6.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 20, 30));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/psv.png"))); // NOI18N
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        jPanel6.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 440, 50));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 210, 30));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 30));

        jButton5.setBackground(new java.awt.Color(102, 51, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Privacy Policy");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 120, 30));

        jButton3.setBackground(new java.awt.Color(102, 51, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("T&C");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setNextFocusableComponent(jButton6);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 70, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 80, 30));

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        jCheckBox1.setText("By Clicking Sign Up, You Agree To Our Terms & Privacy Policy. For More Visit About Us.");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyTyped(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 0));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 430, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 140, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 490, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 490, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 490, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 490, 30));

        j_Pic_Button.setBackground(new java.awt.Color(0, 51, 51));
        j_Pic_Button.setForeground(new java.awt.Color(51, 51, 51));
        j_Pic_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/pho.png"))); // NOI18N
        j_Pic_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Pic_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Pic_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Pic_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(j_Pic_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 80, 30));

        j_Label_Image.setBackground(new java.awt.Color(51, 51, 51));
        j_Label_Image.setForeground(new java.awt.Color(51, 51, 51));
        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 140, 140));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 140, 140));

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


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        /// Making First Letter Capital
        String change = jTextField3.getText();

        char[] charArray = change.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isLetter(charArray[i])) {

                if (foundSpace) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {

                foundSpace = true;
            }
        }

        change = String.valueOf(charArray);
        jTextField3.setText(change);

        String u_name = jTextField1.getText();
        String pass = jasField1.getText();
        String name = jTextField3.getText();
        String mail = jTextField2.getText();

        if (u_name.equals("") || pass.equals("") || name.equals("") || mail.equals("")) {
            jLabel7.setText("Empty Field Found. Fill The Details.");
        } else if (name.length() < 3 || name.length() > 20) {                                     // Name Verify
            jLabel9.setText("Name Matches Scammer! Give Your Birth Name.");
            jTextField3.requestFocus();
        } else if (!(Pattern.matches("^[^\\ ].*[^\\ .]$", name))) {
            jLabel9.setText("Names Can Not Start Or End With Space !");
            jTextField3.requestFocus();
        } else if (containsWhiteSpace(name) == false) {
            jLabel9.setText("Give Your Full Name.");
            jTextField3.requestFocus();
        } else if (containsWhiteSpace(mail) == true) {                                            // Mail Verify
            jLabel11.setText("Mail Can Not Have Any Space.");
            jTextField2.requestFocus();
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail))) {
            jLabel11.setText("Email Seems Fake. Use Real One.");
            jTextField2.requestFocus();
        } else if (email_check(mail) != 0) {
            jLabel11.setText("Account Already Exists With This Email.");
            jTextField2.requestFocus();
        } else if (u_name.length() < 5) {                                                         // Username Verify
            jLabel10.setText("User Name Too Short! Use atleast 5 character.");
            jTextField1.requestFocus();
        } else if (name.equals(u_name)) {
            jLabel10.setText("Name Can Not Be Used As Username.");
            jTextField1.requestFocus();
        } else if (containsWhiteSpace(u_name) == true) {
            jLabel10.setText("Username Can Not Have Any Space.");
            jTextField1.requestFocus();
        } else if (!(Pattern.matches("^(?=[a-z0-9._]{5,15}$)(?!.*[_.]{2})[^_.].*[0-9][^_.]$", u_name))) {
            jLabel10.setText("Username Not Valid!");
            jTextField1.requestFocus();
        } else if (user_namecheck(u_name) != 0) {
            jLabel10.setText("Username Taken!");
            jTextField1.requestFocus();
        } else if (pass.equals(name) && pass.equals(u_name)) {                                              // Password Verify
            jLabel7.setText("Names Can Not Be Used As Password.");
            jasField1.requestFocus();
        } else if (pass.length() < 8) {
            jLabel7.setText("Really Buddy, This Password Is Too Easy To Get! Use At least 8 Characters.");
            jasField1.requestFocus();
        } else if (pass.length() > 12) {
            jLabel7.setText("Hey, This Password Will Be Too Hard To Remember! Use Maximum 12 Characters.");
            jasField1.requestFocus();
        } else if (!(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,12}$", pass))) {
            jLabel7.setText("Use One Uppercase, One Lowercase, One Number And One Special Character.");
            jasField1.requestFocus();
        } else if (j_Label_Image.getText() == "") {
            jLabel12.setText("Please Give Your Photo.");
            j_Pic_Button.requestFocus();

        } else {

            try {

                FileInputStream in = new FileInputStream(j_Label_Image.getText());
                FileOutputStream ou = new FileOutputStream("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + u_name + ".jpg");

                BufferedInputStream bin = new BufferedInputStream(in);
                BufferedOutputStream bou = new BufferedOutputStream(ou);

                int b = 0;
                while (b != -1) {
                    b = bin.read();
                    bou.write(b);
                }
                bin.close();
                bou.close();
                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt", true);
                Write.write(u_name + "\t" + pass + "\t" + name + "\t" + mail);
                Write.write(System.getProperty("line.separator"));
                Write.close();

                new Thread(new Runnable() {

                    public void run() {
                        try {
                            jButton1.setVisible(false);
                            jCheckBox1.setVisible(false);
                            jButton4.setEnabled(false);
                            jButton6.setEnabled(false);
                            jButton3.setEnabled(false);
                            jButton5.setEnabled(false);
                            p1.setVisible(false);
                            p2.setVisible(false);
                            j_Pic_Button.setEnabled(false);
                            doTask(5);
                            jLabel8.setText("   Configuring Your Data.");
                            doTask(5);
                            doTask(5);

                            doTask(10);
                            jLabel8.setText("  Account Created.");
                            doTask(12);
                            jLabel8.setText("   Hi " + name + ", Welcome To Lovely.");

                            doTask(30);
                            doTask(15);
                            doTask(30);
                            jLabel8.setText("   Log In To Continue.");

                            doTask(30);
                            doTask(35);
                            doTask(30);
                            doTask(30);
                            jLabel8.setText("   Redirecting You In 3.....");
                            doTask(40);
                            jLabel8.setText("   Redirecting You In 2...");
                            doTask(50);
                            jLabel8.setText("   Redirecting You In 1.");
                            doTask(3);

                            setVisible(false);

                            new DUser_LogIn().setVisible(true);

                        } catch (Exception e) {
                        }
                    }
                }).start();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error");
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed
    private void doTask(int progress) throws InterruptedException {

        Thread.sleep(700);
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

    private int user_namecheck(String user_name) {                                                     // Checks if  user name alreasy exits or not

        int count = 0;

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[0].equals(user_name)) {

                    count++;

                }

            }

        } catch (FileNotFoundException e) {
        }
        return count;
    }

    private int email_check(String mail) {                                                    // Checks if  email alreasy exits or not

        int count = 0;

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[3].equals(mail)) {

                    count++;

                }

            }

        } catch (Exception e) {
        }
        return count;
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jButton1.setEnabled(true);
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DUser_PrivacyPolicy menu = new DUser_PrivacyPolicy();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DUser_TC menu = new DUser_TC();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DUser_AboutUs menu = new DUser_AboutUs();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        } else if (c == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jTextField1.requestFocus();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jasField1.requestFocus();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jasField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jasField1KeyPressed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
    }//GEN-LAST:event_jasField1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DUser_LogIn menu = new DUser_LogIn();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jasField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jasField1KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jCheckBox1.requestFocus();
        }

    }//GEN-LAST:event_jasField1KeyTyped

    private void jCheckBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jCheckBox1.setSelected(true);
            jButton1.requestFocus();
        }

    }//GEN-LAST:event_jCheckBox1KeyTyped

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected()) {
            jButton1.setEnabled(true);
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged
    String selectedImagePath = "";
    private void j_Pic_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Pic_ButtonActionPerformed

        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
        JFileChooser browseImageFile = new JFileChooser("C:") {
            @Override

            protected JDialog createDialog(Component parent) throws HeadlessException {
                JDialog dialog = super.createDialog(parent);
                BufferedImage image = new BufferedImage(16, 16, BufferedImage.TYPE_3BYTE_BGR);
                dialog.setIconImage(new javax.swing.ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png").getImage());
                return dialog;
            }
        };

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "jpg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            if ((Pattern.matches("^.*?(jpg)$", selectedImagePath))) {
                JOptionPane.showMessageDialog(null, "Photo got attached.");
                //Display image on jlable
                ImageIcon ii = new ImageIcon(selectedImagePath);
                //Resize image to fit jlabel
                Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);

                j_Label_Image.setIcon(new ImageIcon(image));
                j_Label_Image.setText(selectedImagePath);
            } else {
                jLabel12.setText("Please Use JPG Image.");
            }
        }
    }//GEN-LAST:event_j_Pic_ButtonActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        String change = jTextField3.getText();

        char[] charArray = change.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isLetter(charArray[i])) {

                if (foundSpace) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {

                foundSpace = true;
            }
        }

        change = String.valueOf(charArray);
        jTextField3.setText(change);
    }//GEN-LAST:event_jTextField3FocusLost

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        jasField1.setEchoChar('*');
        p2.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_p2MouseClicked

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked

        jasField1.setEchoChar((char) 0); //password = JPasswordField
        p1.setVisible(false);
        p2.setVisible(true);

    }//GEN-LAST:event_p1MouseClicked

    private void jasField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jasField1FocusGained
        p1.setVisible(true);
    }//GEN-LAST:event_jasField1FocusGained

    private void jasField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jasField1FocusLost
        p1.setVisible(false);
        p2.setVisible(false);
    }//GEN-LAST:event_jasField1FocusLost

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
            java.util.logging.Logger.getLogger(DUser_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUser_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUser_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUser_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DUser_SignUp().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JButton j_Pic_Button;
    private javax.swing.JPasswordField jasField1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

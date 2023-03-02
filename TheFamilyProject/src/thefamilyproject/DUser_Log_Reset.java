package thefamilyproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public class DUser_Log_Reset extends javax.swing.JFrame {

    public DUser_Log_Reset() {

        initComponents();
        Seticon();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel7.setVisible(false);
        jLabel5.setVisible(false);
        jButton3.setVisible(false);p1.setVisible(false);
        p2.setVisible(false);  
        j_Back_Button1.setVisible(false);
        jNew_Password_TextField.setVisible(false);
        jLabel9.setVisible(false);
        jLabel8.setVisible(false);
        jLabel2.requestFocus();
        JRow_Count_Store.setVisible(false);
        j_Password_Store.setVisible(false);
        j_user_real_name_store.setVisible(false);
        InputMap back = j_Back_Button1.getInputMap(WHEN_FOCUSED);
        back.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        back.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im = jButton5.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im1 = jButton4.getInputMap(WHEN_FOCUSED);
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap i = j_Back_Button.getInputMap(WHEN_FOCUSED);
        i.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        i.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap i1 = jButton1.getInputMap(WHEN_FOCUSED);
        i1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        i1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap i2 = jButton2.getInputMap(WHEN_FOCUSED);
        i2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        i2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap i21 = jButton3.getInputMap(WHEN_FOCUSED);
        i21.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        i21.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jNew_Password_TextField = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        j_Back_Button1 = new javax.swing.JButton();
        j_Back_Button = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JRow_Count_Store = new javax.swing.JTextField();
        j_Password_Store = new javax.swing.JTextField();
        j_user_real_name_store = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 220, 50));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Serif", 2, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Using Email Adress");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 270, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Shonar Bangla", 2, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Using User Name");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 270, 40));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/psa.png"))); // NOI18N
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, 30));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/psva.png"))); // NOI18N
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, 30));

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Nothing To Find (^-^).");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 650, 20));

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Not an Email !");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 110, 30));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Mail Not Found !");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("User Not Found !");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 560, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 530, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 260, 20));

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Nothing To Find (^-^).");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 130, 30));

        jNew_Password_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jNew_Password_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jNew_Password_TextFieldFocusLost(evt);
            }
        });
        jNew_Password_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNew_Password_TextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(jNew_Password_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 200, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Change");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 110, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setText("Find");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 60, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setText("Find");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 60, 40));

        j_Back_Button1.setBackground(new java.awt.Color(60, 63, 65));
        j_Back_Button1.setForeground(new java.awt.Color(255, 255, 255));
        j_Back_Button1.setText("Done");
        j_Back_Button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Back_Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Back_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Back_Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(j_Back_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 90, 30));

        j_Back_Button.setBackground(new java.awt.Color(60, 63, 65));
        j_Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        j_Back_Button.setText("Cancel");
        j_Back_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Back_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(j_Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 310, 20));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 340, 30));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 210, 40));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 210, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recover Center");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/pass reset.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1000, 650));

        JRow_Count_Store.setFocusable(false);
        jPanel1.add(JRow_Count_Store, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        j_Password_Store.setFocusable(false);
        jPanel1.add(j_Password_Store, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        j_user_real_name_store.setFocusable(false);
        jPanel1.add(j_user_real_name_store, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 130, 20));

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

    private void j_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Back_ButtonActionPerformed

        DUser_LogIn menu = new DUser_LogIn();
        menu.show();
        dispose();
    }//GEN-LAST:event_j_Back_ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField2.setText("");
        jLabel8.setVisible(false);
        jLabel4.setVisible(false);
        String u_name = jTextField1.getText();
        int isa = 0;
        int linecount = 0;
        if (u_name.equals("")) {

            jLabel8.setVisible(true);
            jTextField1.requestFocus();

        } else {
            File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt");

            try {

                Scanner scan = new Scanner(file);

                while (scan.hasNext()) {

                    String line = scan.nextLine();
                    linecount++;
                    String[] value = line.split("\t");

                    if (value[0].equals(u_name)) {
                        isa++;
                        j_user_real_name_store.setText(value[2]);

                        JRow_Count_Store.setText(String.valueOf(linecount));
                    }

                }

            } catch (Exception e) {
            }
            if (isa > 0) {

                jLabel6.setText("Hi " + j_user_real_name_store.getText() + ", Just Catched your ID (^-^). Hurry recover it or it will run away.");

                jLabel4.setVisible(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField1.setEnabled(false);
                jLabel5.setVisible(true);
                jButton3.setVisible(true);
                jNew_Password_TextField.setVisible(true);
                jNew_Password_TextField.requestFocus();
                ///////////////////edit pass change.
            } else {
                jLabel4.setVisible(true);
                jTextField1.requestFocus();
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        int linecount = 0;
        String u_name = jTextField2.getText();
        int isa = 0;
        if (u_name.equals("")) {

            jLabel9.setVisible(true);
            jTextField2.requestFocus();

        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", u_name))) {

            jLabel3.setVisible(true);
            jTextField2.requestFocus();

        } else {
            File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt");

            try {

                Scanner scan = new Scanner(file);

                while (scan.hasNext()) {
                    linecount++;
                    String line = scan.nextLine();
                    String[] value = line.split("\t");

                    if (value[3].equals(u_name)) {
                        isa++;
                        j_user_real_name_store.setText(value[2]);

                        JRow_Count_Store.setText(String.valueOf(linecount));

                    }

                }

            } catch (Exception e) {
            }
            if (isa > 0) {

                jLabel6.setText("Hi " + j_user_real_name_store.getText() + ", Just Catched your ID (^-^). Hurry recover it or it will run away.");

                jLabel4.setVisible(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField1.setEnabled(false);
                jLabel5.setVisible(true);
                jButton3.setVisible(true);
                jNew_Password_TextField.setVisible(true);
                jNew_Password_TextField.requestFocus();
                ///////////////////edit pass change.
            } else {
                jLabel7.setVisible(true);
                jTextField2.requestFocus();
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pass = jNew_Password_TextField.getText();
        if (pass.length() < 8) {
            jLabel12.setVisible(false);
            jLabel11.setText("Really Buddy, This Password Is Too Easy To Get! Use At least 8 Characters.");
            jNew_Password_TextField.requestFocus();
        } else if (pass.length() > 12) {
            jLabel12.setVisible(false);
            jLabel11.setText("Hey, This Password Will Be Too Hard To Remember! Use Maximum 12 Characters.");
            jNew_Password_TextField.requestFocus();
        } else if (!(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,12}$", pass))) {
            jLabel11.setText("                                    Make Something Uncommon. ");
            jLabel12.setVisible(true);
            jLabel12.setText("Use At Least One Uppercase Letter, One Lowercase Letter, One Number And One Special Character.");
            jNew_Password_TextField.requestFocus();
        } else {

            String filePath = "C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt";

            int oldline = Integer.parseInt(JRow_Count_Store.getText());
            int newline = 0;
            File fileToBeModified = new File(filePath);

            BufferedReader reader = null;
            FileWriter writer = null;
            String oldContent = "";
            String replaced = "";

            try {
                reader = new BufferedReader(new FileReader(fileToBeModified));

                //Reading all the lines of input text file into oldContent
                String line = reader.readLine();

                while (line != null) {
                    newline++;
                    if (newline == oldline) {
                        String[] value = line.split("\t");

                        replaced = value[0] + "\t" + pass + "\t" + value[2] + "\t" + value[3];
                    } else {
                        replaced = line;
                    }

                    oldContent = oldContent + replaced + System.lineSeparator();

                    line = reader.readLine();
                }

                //Rewriting the input text file with newContent
                writer = new FileWriter(fileToBeModified);

                writer.write(oldContent);

                //Closing the resources
                reader.close();

                writer.close();
                jLabel11.setText("");
                jLabel12.setText("");
                jLabel6.setText("");
                jLabel2.requestFocus();
                jLabel10.setText("  (^-^) Password Reseted Successfully (^-^)");
                jNew_Password_TextField.setEnabled(false);
                j_Back_Button.setVisible(false);
                jButton3.setVisible(false);
                j_Back_Button1.setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();

        if (c == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
            pressbutton();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField1KeyTyped

    private void pressbutton() {
        ActionEvent evt = null;

        jButton1ActionPerformed(evt);
    }

    public void pressbutton2() {
        ActionEvent evt = null;

        jButton2ActionPerformed(evt);
    }
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {

            jButton2.requestFocus();
            pressbutton2();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jTextField1.setVisible(true);
        jTextField1.requestFocus();
        jButton1.setVisible(true);
        jTextField2.setVisible(false);

        jLabel9.setVisible(false);
        jButton2.setVisible(false);
        jLabel7.setVisible(false);
        jLabel3.setVisible(false);
        jTextField2.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField2.setVisible(true);
        jTextField2.requestFocus();
        jButton2.setVisible(true);
        jLabel8.setVisible(false);
        jButton1.setVisible(false);
        jTextField1.setVisible(false);
        jLabel4.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jNew_Password_TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNew_Password_TextFieldKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jButton3.requestFocus();
            pressbuttonchange();

        }
    }//GEN-LAST:event_jNew_Password_TextFieldKeyTyped
    private void pressbuttonchange() {
        ActionEvent evt = null;

        jButton3ActionPerformed(evt);
    }
    private void j_Back_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Back_Button1ActionPerformed
        DUser_LogIn menu = new DUser_LogIn();
        menu.show();
        dispose();
    }//GEN-LAST:event_j_Back_Button1ActionPerformed

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked

        jNew_Password_TextField.setEchoChar((char) 0); //password = JPasswordField
        p1.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_p1MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        jNew_Password_TextField.setEchoChar('*');
        p2.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_p2MouseClicked

    private void jNew_Password_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNew_Password_TextFieldFocusGained
 p1.setVisible(true);
    }//GEN-LAST:event_jNew_Password_TextFieldFocusGained

    private void jNew_Password_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jNew_Password_TextFieldFocusLost
       p1.setVisible(false);
        p2.setVisible(false);  
    }//GEN-LAST:event_jNew_Password_TextFieldFocusLost

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
            java.util.logging.Logger.getLogger(DUser_Log_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUser_Log_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUser_Log_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUser_Log_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DUser_Log_Reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JRow_Count_Store;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPasswordField jNew_Password_TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton j_Back_Button;
    private javax.swing.JButton j_Back_Button1;
    private javax.swing.JTextField j_Password_Store;
    private javax.swing.JTextField j_user_real_name_store;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

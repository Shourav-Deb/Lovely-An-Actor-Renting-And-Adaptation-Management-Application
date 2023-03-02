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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SD
 */
public class DUser_Account_Reset extends javax.swing.JFrame {

    public DUser_Account_Reset() {
        initComponents();

        Seticon();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        nameloginfo();
        InputMap im = jButton1.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");

        InputMap im2 = jButton2.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = j_Pic_Button.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");p1.setVisible(false);
        p2.setVisible(false);      
        j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + jTextField1.getText() + ".jpg");
        jLabel2.requestFocus();
        emailtemp.setVisible(false);
        emailtemp1.setVisible(false);
        Usernametemp.setVisible(false);
        jLabel3.setVisible(false);
        jButton1.setEnabled(false);

        ImageIcon ii = new ImageIcon(j_Label_Image.getText());
        Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
        j_Label_Image.setIcon(new ImageIcon(image));

    }

    private int nameloginfo() {                                                     // Checks if  user name already exits or not

        int count = 0;

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Temp\\UserTempLog.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                jTextField3.setText(value[2]);
                jTextField1.setText(value[0]);
                jTextField2.setText(value[3]);
                jasField1.setText(value[1]);
                emailtemp.setText(value[3]);
                Usernametemp.setText(value[0]);
                emailtemp1.setText(value[1]);

                try {

                    // getting table selected data to editable field
                    ImageIcon ii = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + value[0] + ".jpg");
                    Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
                    j_Label_Image.setIcon(new ImageIcon(image));

                } catch (Exception e) {
                }
            }

        } catch (FileNotFoundException e) {
        }
        return count;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jasField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        j_Pic_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        j_Label_Image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Usernametemp = new javax.swing.JTextField();
        emailtemp = new javax.swing.JTextField();
        emailtemp1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 160, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 200, 253));
        jLabel2.setText("PROFILE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 210, 70));

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/psa.png"))); // NOI18N
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 30, 30));

        p2.setBackground(new java.awt.Color(204, 204, 204));
        p2.setForeground(new java.awt.Color(255, 255, 255));
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/psva.png"))); // NOI18N
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
        });
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 30, 30));

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 240, 30));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 240, 30));

        jTextField2.setNextFocusableComponent(jButton1);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 240, 30));

        jasField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jasField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jasField1FocusLost(evt);
            }
        });
        jasField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jasField1KeyTyped(evt);
            }
        });
        jPanel1.add(jasField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 240, 30));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Menu");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setNextFocusableComponent(jTextField3);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 150, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 310, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 470, 20));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 51));
        jLabel3.setText("(●'◡'●) Profile Updated (●'◡'●)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 260, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 240, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 310, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 310, 20));

        jLabel8.setBackground(new java.awt.Color(51, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("     Name :");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 600, 80));

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("     User Name :");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 600, 80));

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("     Password :");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 720, 80));

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
        jPanel1.add(j_Pic_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 80, 30));

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("     Email Adress : ");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 720, 80));

        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 130, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/setting.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -210, 890, 890));

        Usernametemp.setText("jTextField4");
        jPanel1.add(Usernametemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        emailtemp.setText("jTextField4");
        jPanel1.add(emailtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        emailtemp1.setText("jTextField4");
        jPanel1.add(emailtemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DUser_Menu menu = new DUser_Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel9.setText("");
        jLabel7.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel3.setVisible(false);
        
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
            jLabel12.setText("Field Are Empty. Fill The Details.");

        } else if (name.length() < 3 || name.length() > 20) {                                     // Name Verify
            jLabel9.setText("Name Matches Scammer! Give Your Birth Name.");
            jTextField3.requestFocus();
        } else if (!(Pattern.matches("^[^\\ ].*[^\\ .]$", name))) {
            jLabel9.setText("Names Can Not Start Or End With Space!");
            jTextField3.requestFocus();
        } else if (containsWhiteSpace(name) == false) {
            jLabel9.setText("Give Your Full Name.");
            jTextField3.requestFocus();
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
        } else if (containsWhiteSpace(mail) == true) {                                            // Mail Verify
            jLabel11.setText("Mail Can Not Have Any Space.");
            jTextField2.requestFocus();
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail))) {
            jLabel11.setText("Email Seems Fake. Use Real One.");
            jTextField2.requestFocus();
        } else if (email_check(mail) != 0) {
            jLabel11.setText("Account Already Exists With This Email.");
            jTextField2.requestFocus();
        } else {
            try {
                String m = JOptionPane.showInputDialog(null, "Enter Old Password To Continue!", "Authentication", JOptionPane.WARNING_MESSAGE);
                if (m.equals(emailtemp1.getText())) {

                    if (j_Label_Image.getText() != "") {

                        String temp = "C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\temp\\" + jTextField1.getText() + ".jpg";

                        FileInputStream in = new FileInputStream(j_Label_Image.getText());
                        FileOutputStream ou = new FileOutputStream(temp);

                        BufferedInputStream bin = new BufferedInputStream(in);
                        BufferedOutputStream bou = new BufferedOutputStream(ou);

                        int b = 0;
                        while (b != -1) {
                            b = bin.read();
                            bou.write(b);
                        }
                        bin.close();
                        bou.close();

                        FileInputStream in1 = new FileInputStream(temp);
                        FileOutputStream out1 = new FileOutputStream("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + jTextField1.getText() + ".jpg");

                        // Copy the bits from instream to outstream
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = in1.read(buf)) > 0) {
                            out1.write(buf, 0, len);
                        }
                        in1.close();
                        out1.close();

                    }
                    int linecount = 0;
                    int matchline = 0;
                    String filepath = "C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt";
                    File file = new File(filepath);

                    try {

                        Scanner scan = new Scanner(file);

                        while (scan.hasNext()) {
                            linecount++;
                            String line = scan.nextLine();
                            String[] value = line.split("\t");

                            if (value[0].equals(Usernametemp.getText())) {
                                matchline = linecount;
                            }

                        }

                    } catch (Exception e) {
                    }

                    int newline = 0;
                    File fileToBeModified = new File(filepath);

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
                            if (newline == matchline) {
                                String[] value = line.split("\t");

                                replaced = u_name + "\t" + pass + "\t" + name + "\t" + mail;
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
                    } catch (IOException e) {
                    }
                    File tempfile = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Temp\\UserTempLog.txt");

                    BufferedReader br = new BufferedReader(new FileReader(tempfile));

                    String firstLine = br.readLine().trim();
                    String[] Cname = firstLine.split("\t");
                    br.close();

                    try {

                        tempfile.delete();
                        tempfile.createNewFile();
                        try ( FileWriter fw = new FileWriter(tempfile)) {
                            fw.write(u_name + "\t" + pass + "\t" + name + "\t" + mail + "\n");
                        }

                    } catch (IOException e) {

                    }
                    FileWriter Write61 = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Account_Reset_Detail.txt", true);

                    
                    if (u_name.equals(Cname[0])) {
                        Write61.write(Cname[0] + "\t   ");
                    } else {
                        Write61.write(Cname[0] + " >>> " + u_name + "\t   ");
                    }

                    if (pass.equals(Cname[1])) {
                        Write61.write(Cname[1] + "\t   ");
                    } else {
                        Write61.write(Cname[1] + " >>> " + pass + "\t   ");
                    }
                    if (name.equals(Cname[2])) {
                        Write61.write(Cname[2] + "\t   ");
                    } else {
                        Write61.write(Cname[2] + " >>> " + name + "\t   ");
                    }

                    if (mail.equals(Cname[3])) {
                        Write61.write(Cname[3]);
                    } else {
                        Write61.write(Cname[3] + " >>> " + mail);
                    }

                    Write61.write(System.getProperty("line.separator"));
                    Write61.close();
                    jLabel3.setVisible(true);
                    nameloginfo();
                } else if (!m.equals(emailtemp1.getText())) {
                    jLabel12.setText("Incorrect Password!");
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        jLabel3.setVisible(false);
        jButton1.setEnabled(true);

        jLabel12.setText("");
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        } else if (c == KeyEvent.VK_ENTER) {
            jTextField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jLabel3.setVisible(false);
        jButton1.setEnabled(true);

        jLabel12.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jasField1.requestFocus();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jasField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jasField1KeyTyped
        jButton1.setEnabled(true);
        jLabel3.setVisible(false);

        jLabel12.setText("");
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }


    }//GEN-LAST:event_jasField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        jButton1.setEnabled(true);
        jLabel3.setVisible(false);

        jLabel12.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
        } else if (Character.isWhitespace(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField2KeyTyped
    String selectedImagePath = "";
    private void j_Pic_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Pic_ButtonActionPerformed

        jLabel3.setVisible(false);
        jButton1.setEnabled(true);

        jLabel13.setText("");
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
                jLabel13.setText("Please Use JPG Image.");
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

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked

        jasField1.setEchoChar((char) 0); //password = JPasswordField
        p1.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_p1MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        jasField1.setEchoChar('*');
        p2.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_p2MouseClicked

    private void jasField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jasField1FocusLost
        p1.setVisible(false);
        p2.setVisible(false);      
    }//GEN-LAST:event_jasField1FocusLost

    private void jasField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jasField1FocusGained
        p1.setVisible(true);
    }//GEN-LAST:event_jasField1FocusGained
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
                    if (value[0].equals(Usernametemp.getText())) {
                        count = 0;
                    } else {
                        count++;
                    }

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

                    if (value[3].equals(emailtemp.getText())) {
                        count = 0;
                    } else {
                        count++;
                    }

                }

            }

        } catch (Exception e) {
        }
        return count;
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
            java.util.logging.Logger.getLogger(DUser_Account_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DUser_Account_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DUser_Account_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DUser_Account_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DUser_Account_Reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Usernametemp;
    private javax.swing.JTextField emailtemp;
    private javax.swing.JTextField emailtemp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JButton j_Pic_Button;
    public static javax.swing.JPasswordField jasField1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

package thefamilyproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SD
 */
public class DAuthority_AuthLog extends javax.swing.JFrame {

    /**
     *
     * @author SD
     */
    public DAuthority_AuthLog() {
        initComponents();
        Seticon();
        jTable.getTableHeader().setBackground(new java.awt.Color(81, 81, 189));
        jTable.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        AdminLog.requestFocus();
        jTable.setRowHeight(50);
        output.setEnabled(false);
        InputMap im = ja_homeb.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im2 = jButton.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im1 = jButton2.getInputMap(WHEN_FOCUSED);
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = jButton3.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = jButton1.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        jButton.setVisible(false);
        jButton3.setVisible(false);
        jTextField.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        showclick();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminLog = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        ja_homeb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AdminLog.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        AdminLog.setForeground(new java.awt.Color(255, 255, 255));
        AdminLog.setText("Authority Log Detail");
        AdminLog.setNextFocusableComponent(jButton1);
        getContentPane().add(AdminLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 380, 130));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 420, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 113, 420, 20));

        jButton3.setBackground(new java.awt.Color(28, 46, 42));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setNextFocusableComponent(jLabel1);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 80, 30));

        jButton1.setBackground(new java.awt.Color(28, 46, 42));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 80, 30));

        jButton2.setBackground(new java.awt.Color(28, 46, 42));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setNextFocusableComponent(ja_homeb);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 80, 30));

        jTextField2.setBackground(new java.awt.Color(28, 46, 42));
        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.setNextFocusableComponent(jTextField3);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 220, 30));

        jTextField3.setBackground(new java.awt.Color(28, 46, 42));
        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.setNextFocusableComponent(jTextField4);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 230, 30));

        jTextField4.setBackground(new java.awt.Color(28, 46, 42));
        jTextField4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.setNextFocusableComponent(jButton);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 160, 30));

        jTextField.setBackground(new java.awt.Color(28, 46, 42));
        jTextField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField.setForeground(new java.awt.Color(255, 255, 255));
        jTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField.setNextFocusableComponent(jTextField2);
        jTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCaretUpdate(evt);
            }
        });
        jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        jButton.setBackground(new java.awt.Color(28, 46, 42));
        jButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton.setText("Done");
        jButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton.setNextFocusableComponent(jButton3);
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 80, 30));

        jTable.setBackground(new java.awt.Color(83, 172, 145));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author ID", "Password", "Author Name", "Current Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable.setSelectionBackground(new java.awt.Color(60, 102, 88));
        jTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable.setShowGrid(true);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 920, 340));

        ja_homeb.setBackground(new java.awt.Color(59, 71, 79));
        ja_homeb.setForeground(new java.awt.Color(255, 255, 255));
        ja_homeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        ja_homeb.setText("Auth Center");
        ja_homeb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_homeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_homeb.setNextFocusableComponent(AdminLog);
        ja_homeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_homebActionPerformed(evt);
            }
        });
        getContentPane().add(ja_homeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/author.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/authlog.jpg"))); // NOI18N
        jLabel1.setNextFocusableComponent(jTextField);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1000, 730));

        output.setText("output");
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });
        getContentPane().add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ja_homebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_homebActionPerformed

        DAdmin_Authority menu = new DAdmin_Authority();
        menu.show();
        dispose();

    }//GEN-LAST:event_ja_homebActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\admin.png");
        JOptionPane.showMessageDialog(this, " Program Created By Shourav Deb \nTalk To Me: heyneeddev@gmail.com", "@author info", JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            int row = jTable.getSelectedRow();
            if (row >= 0) {
                int response = JOptionPane.showConfirmDialog(null, "Data can not be recovered after deleting!", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    model.removeRow(row);
                    File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Authority Pass.txt");
                    file.delete();
                    file.createNewFile();

                    try ( FileWriter fw = new FileWriter(file)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Author ID\tPassword\tAuthor Name\tCurrent Position\n");
                        for (int a = 0; a < jTable.getRowCount(); a++) {
                            for (int j = 0; j < jTable.getColumnCount(); j++) {
                                bw.write(jTable.getValueAt(a, j).toString() + "\t");
                            }
                            bw.newLine();
                        }
                        bw.close();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "You have not selected any data.", "Unselected", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        jLabel1.requestFocus();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

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

        String data = jTextField.getText();
        String pass = jTextField2.getText();
        String name = jTextField3.getText();
        String position = jTextField4.getText();

        if (data.equals("") || pass.equals("") || name.equals("") || position.equals("") || data.equals("                                    ID") || pass.equals("                             Password") || name.equals("                                 Name") || position.equals("                   Position")) {
            JOptionPane.showMessageDialog(this, "Provide All Data.", "Empty Field", JOptionPane.ERROR_MESSAGE);

        } else if (availcenter(data) == 0) {
            JOptionPane.showMessageDialog(null, "Author Already Listed!", "Duplicate Found", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Authority Pass.txt", true);
                Write.write(data + "\t" + pass + "\t" + name + "\t" + position + "\n");
                Write.close();
            } catch (Exception e) {
            }
            model.addRow(new String[]{data});
            int i = jTable.getRowCount() - 1;
            model.setValueAt(pass, i, 1);
            model.setValueAt(name, i, 2);
            model.setValueAt(position, i, 3);
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton.setVisible(false);
            jButton3.setVisible(false);

            jTextField.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
        }

    }//GEN-LAST:event_jButtonActionPerformed

    public int availcenter(String a) {

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Authority Pass.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[0].equals(a)) {
                    return 0;
                }

            }
        } catch (Exception e) {
        }
        return 1;

    }

    public void showclick() {
        ActionEvent evt = null;
        outputActionPerformed(evt);
    }


    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed

        try {
            File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Authority Pass.txt");
            BufferedReader br = new BufferedReader(new FileReader(filehc));

            String firstLine = br.readLine().trim();
            String[] Cname = firstLine.split("\t");
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setColumnIdentifiers(Cname);
            jTable.getTableHeader().setEnabled(false);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {

                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model.addRow(dataRow);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_outputActionPerformed

    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldKeyTyped

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int selectrow = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        jTextField.setText(model.getValueAt(selectrow, 0).toString());
        jTextField2.setText(model.getValueAt(selectrow, 1).toString());
        jTextField3.setText(model.getValueAt(selectrow, 2).toString());
        jTextField4.setText(model.getValueAt(selectrow, 3).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButton.requestFocus();
            pressbutton();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel1.requestFocus();
        jTextField.setText("                                    ID");
        jTextField4.setText("                   Position");
        jTextField3.setText("                                 Name");
        jTextField2.setText("                             Password");
        jLabel1.requestFocus();
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton.setVisible(true);
        jButton3.setVisible(true);

        jTextField.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminLog.requestFocus();
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton.setVisible(false);
        jButton3.setVisible(false);

        jTextField.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaretUpdate

    private void jTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusGained
        jTextField.setText("");
    }//GEN-LAST:event_jTextFieldFocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusLost
        if (jTextField.getText().equals("")) {
            jTextField.setText("                                    ID");
        }
    }//GEN-LAST:event_jTextFieldFocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("                             Password");
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("                                 Name");
        } else {
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
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("                   Position");
        }
    }//GEN-LAST:event_jTextField4FocusLost
    private void pressbutton() {
        ActionEvent evt = null;

        jButtonActionPerformed(evt);
    }

    /**
     *
     * @author SD
     * @param args
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DAuthority_AuthLog().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLog;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton ja_homeb;
    private javax.swing.JButton output;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

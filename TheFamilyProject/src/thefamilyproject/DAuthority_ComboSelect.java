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
public class DAuthority_ComboSelect extends javax.swing.JFrame {

    /**
     *
     * @author SD
     */
    public DAuthority_ComboSelect() {
        initComponents();
        Seticon();
        jTable.getTableHeader().setBackground(new java.awt.Color(12, 78, 12));
        jTable1.getTableHeader().setBackground(new java.awt.Color(12, 78, 12));
        jTable3.getTableHeader().setBackground(new java.awt.Color(12, 78, 12));
        jTable.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        jTable3.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        Update.requestFocus();
        jTable.setRowHeight(50);
        jTable1.setRowHeight(50);
        jTable3.setRowHeight(50);
        output.setEnabled(false);
        InputMap im = ja_homeb.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im2 = jButton.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im1 = jButton1.getInputMap(WHEN_FOCUSED);
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im1.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = jButton3.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = jButton4.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im5 = jButton5.getInputMap(WHEN_FOCUSED);
        im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im5.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im6 = jButton6.getInputMap(WHEN_FOCUSED);
        im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im6.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        showclick();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. @author SD
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Update = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        ja_homeb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Update.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Combo Selection Modify");
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Update.setNextFocusableComponent(jTextField);
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 460, 130));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 540, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 113, 540, 20));

        jTable1.setBackground(new java.awt.Color(39, 62, 44));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setNextFocusableComponent(jTextField3);
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable1.setShowGrid(true);
        jTable1.setShowHorizontalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 260, 340));

        jTextField3.setBackground(new java.awt.Color(28, 40, 46));
        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.setNextFocusableComponent(jButton3);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 100, 30));

        jButton6.setBackground(new java.awt.Color(28, 40, 46));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Delete");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setNextFocusableComponent(ja_homeb);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 80, 30));

        jButton5.setBackground(new java.awt.Color(28, 40, 46));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setNextFocusableComponent(jTextField3);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 80, 30));

        jButton3.setBackground(new java.awt.Color(28, 40, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setNextFocusableComponent(jButton6);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 80, 30));

        jButton1.setBackground(new java.awt.Color(28, 40, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setNextFocusableComponent(jButton5);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 80, 30));

        jTextField1.setBackground(new java.awt.Color(28, 40, 46));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setNextFocusableComponent(jButton1);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 100, 30));

        jButton4.setBackground(new java.awt.Color(28, 40, 46));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setNextFocusableComponent(jTextField1);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 80, 30));

        jTextField.setBackground(new java.awt.Color(28, 40, 46));
        jTextField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField.setForeground(new java.awt.Color(255, 255, 255));
        jTextField.setBorder(null);
        jTextField.setNextFocusableComponent(jButton);
        jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFocusGained(evt);
            }
        });
        jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 30));

        jButton.setBackground(new java.awt.Color(28, 40, 46));
        jButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton.setText("ADD");
        jButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton.setNextFocusableComponent(jButton4);
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, 30));

        jTable3.setBackground(new java.awt.Color(61, 87, 64));
        jTable3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setNextFocusableComponent(ja_homeb);
        jTable3.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable3.setShowGrid(true);
        jTable3.setShowHorizontalLines(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 260, 340));

        jTable.setBackground(new java.awt.Color(66, 84, 68));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Center"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setNextFocusableComponent(jTextField1);
        jTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable.setShowGrid(true);
        jTable.setShowHorizontalLines(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, 340));

        ja_homeb.setBackground(new java.awt.Color(59, 71, 79));
        ja_homeb.setForeground(new java.awt.Color(255, 255, 255));
        ja_homeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        ja_homeb.setText("Auth Center");
        ja_homeb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_homeb.setNextFocusableComponent(Update);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/comboselection.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -230, 1020, 840));

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            int row = jTable.getSelectedRow();
            if (row >= 0) {
                int response = JOptionPane.showConfirmDialog(null, "Data can not be recovered!", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    model.removeRow(row);
                    jTextField.setText("");
                    File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Center.txt");
                    file.delete();
                    file.createNewFile();

                    try ( FileWriter fw = new FileWriter(file)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Center\n");
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
                JOptionPane.showMessageDialog(null, "You have not selected any Center.", "Unselected", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        String data = jTextField.getText();
        if (data.equals("")) {
            JOptionPane.showMessageDialog(this, "What's This Center Is Called!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            jTextField.requestFocus();
        } else if (availcenter(data) == 0) {
            JOptionPane.showMessageDialog(null, "Center Already Listed!", "Duplicate Found", JOptionPane.ERROR_MESSAGE);
            jTextField.requestFocus();
        } else {
            try {

                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Center.txt", true);
                Write.write(data + "\n");
                Write.close();
                jTextField.setText("");
            } catch (Exception e) {
            }
            model.addRow(new String[]{data});
        }

    }//GEN-LAST:event_jButtonActionPerformed

    public int availcenter(String a) {

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Center.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();

                if (line.equals(a)) {
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
            File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Center.txt");
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

            File Language = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Language.txt");
            BufferedReader br2 = new BufferedReader(new FileReader(Language));

            String firstLine2 = br2.readLine().trim();
            String[] Cname2 = firstLine2.split("\t");
            DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
            model2.setColumnIdentifiers(Cname2);
            jTable3.getTableHeader().setEnabled(false);
            Object[] tableLines2 = br2.lines().toArray();

            for (int i = 0; i < tableLines2.length; i++) {

                String line2 = tableLines2[i].toString().trim();
                String[] dataRow2 = line2.split("\t");
                model2.addRow(dataRow2);
            }

            File Nature = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Nature.txt");
            BufferedReader br3 = new BufferedReader(new FileReader(Nature));

            String firstLine3 = br3.readLine().trim();
            String[] Cname3 = firstLine3.split("\t");
            DefaultTableModel model3 = (DefaultTableModel) jTable1.getModel();
            model3.setColumnIdentifiers(Cname3);
            jTable1.getTableHeader().setEnabled(false);
            Object[] tableLines3 = br3.lines().toArray();

            for (int i = 0; i < tableLines3.length; i++) {

                String line3 = tableLines3[i].toString().trim();
                String[] dataRow3 = line3.split("\t");
                model3.addRow(dataRow3);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_outputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String data = jTextField1.getText();
        if (data.equals("")) {
            jTextField1.requestFocus();
            JOptionPane.showMessageDialog(this, "What's This Nature Is Called!", "Empty Field", JOptionPane.ERROR_MESSAGE);
        } else if (availcenter2(data) == 0) {
            JOptionPane.showMessageDialog(this, "Nature Already Listed!", "Duplicate Found", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        } else {
            try {

                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Nature.txt", true);
                Write.write(data + "\n");
                Write.close();
                jTextField1.setText("");
            } catch (Exception e) {
            }
            model.addRow(new String[]{data});
        }

    }

    public int availcenter2(String a) {

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Nature.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();

                if (line.equals(a)) {
                    return 0;
                }

            }
        } catch (Exception e) {
        }
        return 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        String data = jTextField3.getText();
        if (data.equals("")) {
            JOptionPane.showMessageDialog(this, "What's This Language Is Called!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            jTextField3.requestFocus();
        } else if (availcenter3(data) == 0) {
            JOptionPane.showMessageDialog(this, "Language Already Listed!", "Duplicate Found", JOptionPane.ERROR_MESSAGE);
            jTextField3.requestFocus();
        } else {
            try {

                FileWriter Write = new FileWriter("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Language.txt", true);
                Write.write(data + "\n");
                Write.close();
                jTextField3.setText("");
            } catch (Exception e) {
            }
            model.addRow(new String[]{data});
        }

    }

    public int availcenter3(String a) {

        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Language.txt");

        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();

                if (line.equals(a)) {
                    return 0;
                }

            }
        } catch (Exception e) {
        }
        return 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            if (row >= 0) {
                int response = JOptionPane.showConfirmDialog(null, "Data can not be recovered!", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    model.removeRow(row);
                    jTextField1.setText("");
                    File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Nature.txt");
                    file.delete();
                    file.createNewFile();

                    try ( FileWriter fw = new FileWriter(file)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Nature\n");
                        for (int a = 0; a < jTable1.getRowCount(); a++) {
                            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                                bw.write(jTable1.getValueAt(a, j).toString() + "\t");
                            }
                            bw.newLine();
                        }
                        bw.close();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "You have not selected any Nature.", "Unselected", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            int row = jTable3.getSelectedRow();
            if (row >= 0) {
                int response = JOptionPane.showConfirmDialog(null, "Data can not be recovered!", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    model.removeRow(row);
                    jTextField3.setText("");
                    File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Language.txt");
                    file.delete();
                    file.createNewFile();

                    try ( FileWriter fw = new FileWriter(file)) {
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("Language\n");
                        for (int a = 0; a < jTable3.getRowCount(); a++) {
                            for (int j = 0; j < jTable3.getColumnCount(); j++) {
                                bw.write(jTable3.getValueAt(a, j).toString() + "\t");
                            }
                            bw.newLine();
                        }
                        bw.close();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "You have not selected any Language.", "Unselected", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButton.requestFocus();
            pressbutton();
        }
    }//GEN-LAST:event_jTextFieldKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
            pressbutton1();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButton3.requestFocus();
            pressbutton3();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        jTable.setRowSelectionAllowed(true);
        jTable1.setRowSelectionAllowed(false);
        jTable3.setRowSelectionAllowed(false);
    }//GEN-LAST:event_jTableMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        jTable1.setRowSelectionAllowed(true);
        jTable.setRowSelectionAllowed(false);
        jTable3.setRowSelectionAllowed(false);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        jTable3.setRowSelectionAllowed(true);
        jTable.setRowSelectionAllowed(false);
        jTable1.setRowSelectionAllowed(false);

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jTextField1.setText("");
        jTextField.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField3.setText("");
        jTextField.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFocusGained
        jTextField1.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jTextFieldFocusGained
    private void pressbutton() {
        ActionEvent evt = null;

        jButtonActionPerformed(evt);
    }

    private void pressbutton1() {
        ActionEvent evt = null;

        jButton1ActionPerformed(evt);
    }

    private void pressbutton3() {
        ActionEvent evt = null;

        jButton3ActionPerformed(evt);
    }

    /**
     *
     * @author SD
     * @param args
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DAuthority_ComboSelect().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Update;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton ja_homeb;
    private javax.swing.JButton output;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}
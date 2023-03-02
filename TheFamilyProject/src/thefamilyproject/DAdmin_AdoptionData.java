package thefamilyproject;

import java.awt.Color;
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
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author SD
 */
public class DAdmin_AdoptionData extends javax.swing.JFrame {

    DefaultTableModel dm;

    public DAdmin_AdoptionData() {
        Seticon();
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        j_Refresh_Button.requestFocus();
        j_Actor_Table.getTableHeader().setBackground(new java.awt.Color(86, 82, 52));
        j_Actor_Table.getTableHeader().setForeground(Color.WHITE);
        InputMap im3 = j_Back_Button.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = j_Refresh_Button.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(160);
        j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(5);
        j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(5).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(6).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(120);
        j_Actor_Table.getColumnModel().getColumn(8).setPreferredWidth(70);
        j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(90);
        j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);
        j_Actor_Table.getTableHeader().setEnabled(false);

        j_Add_Done_Button.setVisible(false);
        ComboCenter();
        LanguageCenter();
        NatureCenter();
    }

    public void ComboCenter() {

        String filePath = "C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Center.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                j_Holiday_Combo_Box.addItem(line);
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public void LanguageCenter() {

        String filePath = "C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Language.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                j_Language_Combo_Box.addItem(line);
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public void NatureCenter() {

        String filePath = "C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Combo Box Value\\Nature.txt";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String line = lines[i].toString();
                j_Nature_Combo_Box.addItem(line);
            }

        } catch (FileNotFoundException ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j_Actor_Data = new javax.swing.JPanel();
        j_Back_Button = new javax.swing.JButton();
        j_Label_Banner_Logo = new javax.swing.JLabel();
        j_Refresh_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cover2 = new javax.swing.JLabel();
        j_Actor_Table_ScrollPane = new javax.swing.JScrollPane();
        j_Actor_Table = new javax.swing.JTable();
        j_Delete_Button = new javax.swing.JButton();
        j_Add_Button = new javax.swing.JButton();
        j_Actor_ID_Field = new javax.swing.JTextField();
        j_Actor_Name_Field = new javax.swing.JTextField();
        j_Actor_Age_Field = new javax.swing.JTextField();
        j_Actor_Hight_Field = new javax.swing.JTextField();
        j_Actor_Weight_Field = new javax.swing.JTextField();
        j_Add_Done_Button = new javax.swing.JButton();
        j_Add_Cancel_Button = new javax.swing.JButton();
        j_Language_Combo_Box = new javax.swing.JComboBox<>();
        j_Holiday_Combo_Box = new javax.swing.JComboBox<>();
        j_Update_Button = new javax.swing.JButton();
        j_Nature_Combo_Box = new javax.swing.JComboBox<>();
        j_Gender_Combo_Box = new javax.swing.JComboBox<>();
        j_Pic_Button = new javax.swing.JButton();
        j_Radio_Available = new javax.swing.JRadioButton();
        j_Label_Image = new javax.swing.JLabel();
        j_Label_Cover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        j_Actor_Data.setPreferredSize(new java.awt.Dimension(1147, 753));
        j_Actor_Data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_Back_Button.setBackground(new java.awt.Color(35, 48, 53));
        j_Back_Button.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        j_Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        j_Back_Button.setText("Adoption Center");
        j_Back_Button.setToolTipText("");
        j_Back_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Back_Button.setName(""); // NOI18N
        j_Back_Button.setNextFocusableComponent(j_Refresh_Button);
        j_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Back_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        j_Label_Banner_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/adtnw123.png"))); // NOI18N
        j_Label_Banner_Logo.setNextFocusableComponent(j_Back_Button);
        j_Actor_Data.add(j_Label_Banner_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 370, -1));

        j_Refresh_Button.setBackground(java.awt.SystemColor.controlShadow);
        j_Refresh_Button.setToolTipText("");
        j_Refresh_Button.setBorder(null);
        j_Refresh_Button.setContentAreaFilled(false);
        j_Refresh_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Refresh_Button.setNextFocusableComponent(j_Back_Button);
        j_Refresh_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                j_Refresh_ButtonMouseReleased(evt);
            }
        });
        j_Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Refresh_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Refresh_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 150, 170));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Click To Know");
        j_Actor_Data.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 60));

        Cover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/Signup1232.jpg"))); // NOI18N
        Cover2.setText("jLabel1");
        Cover2.setPreferredSize(new java.awt.Dimension(1000, 600));
        j_Actor_Data.add(Cover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1120, 770));

        j_Actor_Table.setAutoCreateRowSorter(true);
        j_Actor_Table.setBackground(new java.awt.Color(106, 183, 75));
        j_Actor_Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Actor_Table.setFont(new java.awt.Font("Utsaah", 3, 17)); // NOI18N
        j_Actor_Table.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Image", "Member ID", "Name", "Age", "Gender", "Hight (meter)", "Weight (kg)", "Language", "Nature", "Center", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        j_Actor_Table.setToolTipText("");
        j_Actor_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Actor_Table.setFocusable(false);
        j_Actor_Table.setRowHeight(90);
        j_Actor_Table.setSelectionBackground(new java.awt.Color(138, 173, 124));
        j_Actor_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_TableMouseClicked(evt);
            }
        });
        j_Actor_Table_ScrollPane.setViewportView(j_Actor_Table);
        if (j_Actor_Table.getColumnModel().getColumnCount() > 0) {
            j_Actor_Table.getColumnModel().getColumn(0).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(35);
            j_Actor_Table.getColumnModel().getColumn(1).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(2).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(150);
            j_Actor_Table.getColumnModel().getColumn(3).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(5);
            j_Actor_Table.getColumnModel().getColumn(4).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(34);
            j_Actor_Table.getColumnModel().getColumn(5).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(5).setPreferredWidth(35);
            j_Actor_Table.getColumnModel().getColumn(6).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(6).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(7).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(105);
            j_Actor_Table.getColumnModel().getColumn(8).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(8).setPreferredWidth(80);
            j_Actor_Table.getColumnModel().getColumn(9).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(90);
            j_Actor_Table.getColumnModel().getColumn(10).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);
        }

        j_Actor_Data.add(j_Actor_Table_ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1120, 410));

        j_Delete_Button.setBackground(new java.awt.Color(109, 91, 66));
        j_Delete_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        j_Delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Delete_Button.setText("Delete");
        j_Delete_Button.setToolTipText("");
        j_Delete_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Delete_Button.setEnabled(false);
        j_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Delete_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Delete_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 260, 30));

        j_Add_Button.setBackground(new java.awt.Color(109, 91, 66));
        j_Add_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        j_Add_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Add_Button.setText("ADD");
        j_Add_Button.setToolTipText("");
        j_Add_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Add_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Add_Button.setEnabled(false);
        j_Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Add_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 140, 30));

        j_Actor_ID_Field.setBackground(new java.awt.Color(176, 177, 111));
        j_Actor_ID_Field.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        j_Actor_ID_Field.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_ID_Field.setToolTipText("");
        j_Actor_ID_Field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_Actor_ID_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        j_Actor_ID_Field.setEnabled(false);
        j_Actor_ID_Field.setSelectionColor(new java.awt.Color(255, 255, 255));
        j_Actor_ID_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_ID_FieldMouseClicked(evt);
            }
        });
        j_Actor_ID_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_Actor_ID_FieldKeyTyped(evt);
            }
        });
        j_Actor_Data.add(j_Actor_ID_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, 30));

        j_Actor_Name_Field.setBackground(new java.awt.Color(176, 177, 111));
        j_Actor_Name_Field.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        j_Actor_Name_Field.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Name_Field.setToolTipText("");
        j_Actor_Name_Field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_Actor_Name_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        j_Actor_Name_Field.setEnabled(false);
        j_Actor_Name_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                j_Actor_Name_FieldFocusLost(evt);
            }
        });
        j_Actor_Name_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_Name_FieldMouseClicked(evt);
            }
        });
        j_Actor_Name_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_Actor_Name_FieldKeyTyped(evt);
            }
        });
        j_Actor_Data.add(j_Actor_Name_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, 30));

        j_Actor_Age_Field.setBackground(new java.awt.Color(176, 177, 111));
        j_Actor_Age_Field.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        j_Actor_Age_Field.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Age_Field.setToolTipText("");
        j_Actor_Age_Field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_Actor_Age_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        j_Actor_Age_Field.setEnabled(false);
        j_Actor_Age_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_Age_FieldMouseClicked(evt);
            }
        });
        j_Actor_Age_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_Actor_Age_FieldKeyTyped(evt);
            }
        });
        j_Actor_Data.add(j_Actor_Age_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 50, 30));

        j_Actor_Hight_Field.setBackground(new java.awt.Color(176, 177, 111));
        j_Actor_Hight_Field.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        j_Actor_Hight_Field.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Hight_Field.setToolTipText("");
        j_Actor_Hight_Field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_Actor_Hight_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        j_Actor_Hight_Field.setEnabled(false);
        j_Actor_Hight_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_Hight_FieldMouseClicked(evt);
            }
        });
        j_Actor_Hight_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_Actor_Hight_FieldKeyTyped(evt);
            }
        });
        j_Actor_Data.add(j_Actor_Hight_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 80, 30));

        j_Actor_Weight_Field.setBackground(new java.awt.Color(176, 177, 111));
        j_Actor_Weight_Field.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        j_Actor_Weight_Field.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Weight_Field.setToolTipText("");
        j_Actor_Weight_Field.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_Actor_Weight_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        j_Actor_Weight_Field.setEnabled(false);
        j_Actor_Weight_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_Weight_FieldMouseClicked(evt);
            }
        });
        j_Actor_Weight_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_Actor_Weight_FieldKeyTyped(evt);
            }
        });
        j_Actor_Data.add(j_Actor_Weight_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 70, 30));

        j_Add_Done_Button.setBackground(new java.awt.Color(109, 91, 66));
        j_Add_Done_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        j_Add_Done_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Add_Done_Button.setText("Done");
        j_Add_Done_Button.setToolTipText("");
        j_Add_Done_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Add_Done_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Add_Done_Button.setEnabled(false);
        j_Add_Done_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Add_Done_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Add_Done_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 140, 30));

        j_Add_Cancel_Button.setBackground(new java.awt.Color(109, 91, 66));
        j_Add_Cancel_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        j_Add_Cancel_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Add_Cancel_Button.setText("Cancel");
        j_Add_Cancel_Button.setToolTipText("");
        j_Add_Cancel_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Add_Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Add_Cancel_Button.setEnabled(false);
        j_Add_Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Add_Cancel_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Add_Cancel_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 120, 30));

        j_Language_Combo_Box.setBackground(new java.awt.Color(176, 177, 111));
        j_Language_Combo_Box.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        j_Language_Combo_Box.setForeground(new java.awt.Color(255, 255, 255));
        j_Language_Combo_Box.setToolTipText("");
        j_Language_Combo_Box.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Language_Combo_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Language_Combo_Box.setEnabled(false);
        j_Actor_Data.add(j_Language_Combo_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 150, 30));

        j_Holiday_Combo_Box.setBackground(new java.awt.Color(176, 177, 111));
        j_Holiday_Combo_Box.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        j_Holiday_Combo_Box.setForeground(new java.awt.Color(255, 255, 255));
        j_Holiday_Combo_Box.setToolTipText("");
        j_Holiday_Combo_Box.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Holiday_Combo_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Holiday_Combo_Box.setEnabled(false);
        j_Actor_Data.add(j_Holiday_Combo_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 120, 30));

        j_Update_Button.setBackground(new java.awt.Color(109, 91, 66));
        j_Update_Button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        j_Update_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Update_Button.setText("Update");
        j_Update_Button.setToolTipText("");
        j_Update_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Update_Button.setEnabled(false);
        j_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Update_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 260, 30));

        j_Nature_Combo_Box.setBackground(new java.awt.Color(176, 177, 111));
        j_Nature_Combo_Box.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        j_Nature_Combo_Box.setForeground(new java.awt.Color(255, 255, 255));
        j_Nature_Combo_Box.setToolTipText("");
        j_Nature_Combo_Box.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Nature_Combo_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Nature_Combo_Box.setEnabled(false);
        j_Actor_Data.add(j_Nature_Combo_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 120, 30));

        j_Gender_Combo_Box.setBackground(new java.awt.Color(176, 177, 111));
        j_Gender_Combo_Box.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        j_Gender_Combo_Box.setForeground(new java.awt.Color(255, 255, 255));
        j_Gender_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        j_Gender_Combo_Box.setToolTipText("");
        j_Gender_Combo_Box.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Gender_Combo_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Gender_Combo_Box.setEnabled(false);
        j_Actor_Data.add(j_Gender_Combo_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 80, 30));

        j_Pic_Button.setBackground(new java.awt.Color(51, 51, 51));
        j_Pic_Button.setForeground(new java.awt.Color(102, 102, 102));
        j_Pic_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/pho.png"))); // NOI18N
        j_Pic_Button.setToolTipText("");
        j_Pic_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Pic_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Pic_Button.setEnabled(false);
        j_Pic_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Pic_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Pic_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 80, 30));

        j_Radio_Available.setBackground(new java.awt.Color(176, 177, 111));
        j_Radio_Available.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        j_Radio_Available.setForeground(new java.awt.Color(255, 255, 255));
        j_Radio_Available.setText("Available");
        j_Radio_Available.setToolTipText("");
        j_Radio_Available.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Radio_Available.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Radio_Available.setEnabled(false);
        j_Actor_Data.add(j_Radio_Available, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 100, 30));

        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        j_Label_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Label_ImageMouseClicked(evt);
            }
        });
        j_Actor_Data.add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 200));

        j_Label_Cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/Signup1231.jpg"))); // NOI18N
        j_Label_Cover.setPreferredSize(new java.awt.Dimension(1000, 600));
        j_Actor_Data.add(j_Label_Cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -120, 1220, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_Actor_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_Actor_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Back_ButtonActionPerformed

        DAdmin_AdoptionCenter menu = new DAdmin_AdoptionCenter();
        menu.show();
        dispose();


    }//GEN-LAST:event_j_Back_ButtonActionPerformed

    // For Rendering the Image
    class CellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {

            TableColumn tb = j_Actor_Table.getColumn("Image");
            tb.setMaxWidth(80);
            tb.setMinWidth(80);

            j_Actor_Table.setRowHeight(100);

            return (Component) value;
        }

    }

    private void j_Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Refresh_ButtonActionPerformed

        Cover2.setVisible(false);
        jLabel1.setVisible(false);
        j_Refresh_Button.setEnabled(false);
        j_Label_Banner_Logo.requestFocus();
        j_Update_Button.setEnabled(true);
        j_Radio_Available.setEnabled(true);
        j_Holiday_Combo_Box.setEnabled(true);
        j_Nature_Combo_Box.setEnabled(true);
        j_Language_Combo_Box.setEnabled(true);
        j_Gender_Combo_Box.setEnabled(true);
        j_Add_Button.setEnabled(true);
        j_Delete_Button.setEnabled(true);
        j_Pic_Button.setEnabled(true);

        j_Actor_Weight_Field.setEnabled(true);
        j_Actor_Hight_Field.setEnabled(true);

        j_Actor_Age_Field.setEnabled(true);
        j_Actor_Name_Field.setEnabled(true);
        j_Actor_ID_Field.setEnabled(true);

        File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(filehc));

            String firstLine = br.readLine().trim();
            String[] Cname = firstLine.split("\t");
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            model.setColumnIdentifiers(Cname);
            j_Actor_Table.getTableHeader().setEnabled(false);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {

                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model.addRow(dataRow);
            }
            j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
            j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(40);

            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(5);
            j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(160);
            j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(6).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(5).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(120);
            j_Actor_Table.getColumnModel().getColumn(8).setPreferredWidth(80);
            j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(90);
            j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);

        } catch (Exception ex) {
            Logger.getLogger(DAdmin_AdoptionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            j_Actor_Table.getColumn("Image").setCellRenderer(new CellRenderer());

            for (int a = 0; a < j_Actor_Table.getRowCount(); a++) {
                JLabel imageLabel = new JLabel();
                String fileex = model.getValueAt(a, 1).toString();
                ImageIcon imageicon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg");
                Image img = imageicon.getImage().getScaledInstance(80, 100, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(img));
                model.setValueAt(imageLabel, a, 0);
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_j_Refresh_ButtonActionPerformed

    private void j_Refresh_ButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Refresh_ButtonMouseReleased

        j_Refresh_Button.setEnabled(false);

        j_Refresh_Button.setVisible(false);
    }//GEN-LAST:event_j_Refresh_ButtonMouseReleased

    private void j_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Update_ButtonActionPerformed

        String change = j_Actor_Name_Field.getText();

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
        j_Actor_Name_Field.setText(change);

        try {
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            int i = j_Actor_Table.getSelectedRow();
            if (i >= 0) {
                String available;

                String member = j_Actor_ID_Field.getText();
                String name = j_Actor_Name_Field.getText();
                String age = j_Actor_Age_Field.getText();
                String hight = j_Actor_Hight_Field.getText();
                String weight = j_Actor_Weight_Field.getText();
                if (j_Radio_Available.isSelected() == true) {
                    available = "Yes";
                } else {
                    available = "No";
                }

                if (j_Label_Image.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select an Image.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Actor_ID_Field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select an ID Number.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Actor_Name_Field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select a Name.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Actor_Age_Field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select an Age.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Actor_Hight_Field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select a Hight.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Actor_Weight_Field.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select a Weight.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else if (j_Label_Image.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Forgot to select an Image.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                } else {

                    if (member.length() != 5) {
                        JOptionPane.showMessageDialog(null, "Member ID Order Mismatch!", "Member ID", JOptionPane.ERROR_MESSAGE);
                    } else if (actoridvalidation(j_Actor_ID_Field.getText()) == 0 && rowfilecheack(j_Actor_ID_Field.getText(), i) != 0) {
                        JOptionPane.showMessageDialog(this, "This ID is Already Given!", "Member ID Cross Match", JOptionPane.ERROR_MESSAGE);

                    } else if (name.length() < 3 || name.length() > 20) {
                        JOptionPane.showMessageDialog(this, "Name Order Mismatch!", "Incorrect Name", JOptionPane.ERROR_MESSAGE);
                    } else if (Integer.parseInt(age) < 4 || Integer.parseInt(age) > 30) {
                        JOptionPane.showMessageDialog(this, "Age Order Mismatch!", "Incorrect Age", JOptionPane.ERROR_MESSAGE);
                    } else if (!(Pattern.matches("^[0-9][.]?[0-9]?[0-9]?$", hight))) {
                        JOptionPane.showMessageDialog(this, "Hight Order Mismatch!", "Incorrect Hight", JOptionPane.ERROR_MESSAGE);
                    } else if (!(Pattern.matches("^[0-9][0-9]?[.]?[0-9]?$", weight))) {
                        JOptionPane.showMessageDialog(this, "Weight Order Mismatch!", "Incorrect Weight", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String ImgPath = "C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + member + ".jpg";
                        model.setValueAt(ImgPath, i, 0);
                        model.setValueAt(member, i, 1);
                        model.setValueAt(name, i, 2);
                        model.setValueAt(age, i, 3);
                        model.setValueAt(j_Gender_Combo_Box.getSelectedItem(), i, 4);
                        model.setValueAt(hight, i, 5);
                        model.setValueAt(weight, i, 6);
                        model.setValueAt(j_Language_Combo_Box.getSelectedItem().toString(), i, 7);
                        model.setValueAt(j_Nature_Combo_Box.getSelectedItem().toString(), i, 8);
                        model.setValueAt(j_Holiday_Combo_Box.getSelectedItem().toString(), i, 9);
                        model.setValueAt(available, i, 10);

                        if (validCheck()) {
                            try {

                                try {

                                    j_Actor_Table.getColumn("Image").setCellRenderer(new CellRenderer());

                                    for (int b = 0; b < j_Actor_Table.getRowCount(); b++) {

                                        String fileex = model.getValueAt(b, 1).toString();
                                        String fileex2 = "C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg";

                                        model.setValueAt(fileex2, b, 0);
                                    }
                                } catch (Exception e) {
                                }
                                String temp = "C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\temp\\" + member + ".jpg";

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
                                FileOutputStream out1 = new FileOutputStream("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + member + ".jpg");

                                // Copy the bits from instream to outstream
                                byte[] buf = new byte[1024];
                                int len;
                                while ((len = in1.read(buf)) > 0) {
                                    out1.write(buf, 0, len);
                                }
                                in1.close();
                                out1.close();

                                File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
                                file.delete();
                                file.createNewFile();

                                FileWriter fw = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fw);
                                bw.write("Image\tMember ID\tName\tAge\tGender\tHight (meter)\tWeight (kg)\tLanguage\tNature\tCenter\tAvailability\t\n");
                                for (int a = 0; a < j_Actor_Table.getRowCount(); a++) {
                                    for (int j = 0; j < j_Actor_Table.getColumnCount(); j++) {

                                        bw.write(j_Actor_Table.getValueAt(a, j).toString() + "\t");
                                    }
                                    bw.newLine();
                                }

                                try {
                                    j_Actor_Table.getColumn("Image").setCellRenderer(new CellRenderer());

                                    for (int c = 0; c < j_Actor_Table.getRowCount(); c++) {
                                        JLabel imageLabel = new JLabel();
                                        String fileex = model.getValueAt(c, 1).toString();
                                        ImageIcon imageicon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg");
                                        Image img = imageicon.getImage().getScaledInstance(80, 100, Image.SCALE_SMOOTH);
                                        imageLabel.setIcon(new ImageIcon(img));
                                        model.setValueAt(imageLabel, c, 0);
                                    }
                                } catch (Exception e) {
                                }

                                bw.close();
                                fw.close();

                                ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\update.png");
                                JOptionPane.showMessageDialog(null, "Data has been updated.", "Updated", JOptionPane.PLAIN_MESSAGE, icon);

                                j_Add_Done_Button.setVisible(false);
                                j_Add_Button.setVisible(true);
                                j_Add_Cancel_Button.setEnabled(false);

                                j_Add_Button.setEnabled(true);
                                j_Delete_Button.setEnabled(true);
                                j_Add_Done_Button.setEnabled(false);
                                j_Actor_Table.setEnabled(true);
                                j_Update_Button.setEnabled(true);

                            } catch (Exception awd) {
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Fill with data or delete the field.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "You have not selected any row.", "Unselected Row", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_j_Update_ButtonActionPerformed
    String selectedImagePath = "";

    private int actoridvalidation(String ename) {
        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
        int co = 1;
        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {

                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[1].equals(ename)) {
                    co = 0;
                }

            }
        } catch (Exception e) {
        }

        return co;
    }

    private int rowfilecheack(String ename, int i) {
        File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Adoption List.txt");
        int co = 1;
        int count = 0;
        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                count++;
                String line = scan.nextLine();
                String[] value = line.split("\t");

                if (value[1].equals(ename)) {
                    if (count == (i + 2)) {

                        co = 0;
                    }
                }

            }
        } catch (Exception e) {
        }

        return co;
    }

    public boolean validCheck() {
        if (j_Actor_Table.getCellEditor() != null) {
            j_Actor_Table.getCellEditor().stopCellEditing();
        }
        try {
            for (int i = 0; i < j_Actor_Table.getRowCount(); i++) {
                for (int j = 0; j < j_Actor_Table.getColumnCount(); j++) {

                    String value = j_Actor_Table.getValueAt(i, j).toString().trim();
                    if (value.equals("")) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
        }
        return true;
    }


    private void j_Actor_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_TableMouseClicked

        try {

            // getting table selected data to editable field                                                                                                                                                                                                                                                    Copyright © 2022 by Shourav Dev. All Rights Reserved.
            int selectrow = j_Actor_Table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            String fileex = model.getValueAt(selectrow, 1).toString();

            j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg");
            j_Actor_ID_Field.setText(model.getValueAt(selectrow, 1).toString());
            j_Actor_Name_Field.setText(model.getValueAt(selectrow, 2).toString());
            j_Actor_Age_Field.setText(model.getValueAt(selectrow, 3).toString());

            String Gender_Set = model.getValueAt(selectrow, 4).toString();
            for (int i = 0; i < j_Gender_Combo_Box.getItemCount(); i++) {
                if (j_Gender_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Gender_Set)) {
                    j_Gender_Combo_Box.setSelectedIndex(i);
                }
            }
            j_Actor_Hight_Field.setText(model.getValueAt(selectrow, 5).toString());
            j_Actor_Weight_Field.setText(model.getValueAt(selectrow, 6).toString());
            String Language_Set = model.getValueAt(selectrow, 7).toString();
            for (int i = 0; i < j_Language_Combo_Box.getItemCount(); i++) {
                if (j_Language_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Language_Set)) {
                    j_Language_Combo_Box.setSelectedIndex(i);
                }
            }
            String Nature_set = model.getValueAt(selectrow, 8).toString();
            for (int i = 0; i < j_Nature_Combo_Box.getItemCount(); i++) {
                if (j_Nature_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Nature_set)) {
                    j_Nature_Combo_Box.setSelectedIndex(i);
                }
            }
            String Holiday_set = model.getValueAt(selectrow, 9).toString();
            for (int i = 0; i < j_Holiday_Combo_Box.getItemCount(); i++) {
                if (j_Holiday_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Holiday_set)) {
                    j_Holiday_Combo_Box.setSelectedIndex(i);
                }
            }
            String available_set = model.getValueAt(selectrow, 10).toString();
            if (available_set.equals("Yes")) {
                j_Radio_Available.setSelected(true);
            } else {
                j_Radio_Available.setSelected(false);
            }

            //display image to the jlabel
            ImageIcon ii = new ImageIcon(j_Label_Image.getText());
            Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
            j_Label_Image.setIcon(new ImageIcon(image));

        } catch (Exception e) {
        }


    }//GEN-LAST:event_j_Actor_TableMouseClicked

    private void j_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Add_ButtonActionPerformed

        //adding new row to fill data
        Object[] row = new Object[0];

        DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
        model.addRow(row);
        int i = j_Actor_Table.getRowCount() - 1;
        j_Actor_Table.setRowSelectionInterval(i, i);
        j_Actor_Table.setEnabled(false);

        j_Add_Button.setVisible(false);
        j_Add_Done_Button.setVisible(true);
        j_Add_Done_Button.setEnabled(true);
        j_Add_Cancel_Button.setEnabled(true);
        j_Delete_Button.setEnabled(false);
        j_Add_Button.setEnabled(false);
        j_Update_Button.setEnabled(false);

        j_Label_Image.setText("");
        j_Actor_ID_Field.setText("");
        j_Actor_Name_Field.setText("");
        j_Actor_Age_Field.setText("");
        j_Actor_Hight_Field.setText("");
        j_Actor_Weight_Field.setText("");
        j_Nature_Combo_Box.setSelectedIndex(0);
        j_Language_Combo_Box.setSelectedIndex(0);
        j_Gender_Combo_Box.setSelectedIndex(0);
        j_Holiday_Combo_Box.setSelectedIndex(0);
        j_Radio_Available.setSelected(false);
        ImageIcon ii = new ImageIcon(j_Label_Image.getText());
        Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
        j_Label_Image.setIcon(new ImageIcon(image));


    }//GEN-LAST:event_j_Add_ButtonActionPerformed

    private void j_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Delete_ButtonActionPerformed

        try {/// Deleting a row from table

            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            int row = j_Actor_Table.getSelectedRow();
//jTextField4.setText(String.valueOf(row));
            if (row == 0) {

                JOptionPane.showMessageDialog(null, "Hey, He is mentioned by Author. Don't you know the secret!", "Delete Warning", JOptionPane.ERROR_MESSAGE);
            } else if (row >= 1) {

                int response = JOptionPane.showConfirmDialog(null, "Got Adopted?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    String del_pho = j_Actor_Table.getValueAt(row, 1).toString();
                    Path imagesPath = Paths.get("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + del_pho + ".jpg");
                    Path imagesPath2 = Paths.get("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\temp\\" + del_pho + ".jpg");
                    Files.delete(imagesPath);
                    Files.delete(imagesPath2);
                    model.removeRow(row);
                    j_Actor_Table.setRowSelectionInterval(0, 0);

                    ImageIcon icon2 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\done.png");
                    JOptionPane.showMessageDialog(null, "Data has been Deleted.", "Done", JOptionPane.PLAIN_MESSAGE, icon2);

                    int selectrow = j_Actor_Table.getSelectedRow();
                    String fileex = model.getValueAt(selectrow, 1).toString();

                    j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg");
                    j_Actor_ID_Field.setText(model.getValueAt(selectrow, 1).toString());
                    j_Actor_Name_Field.setText(model.getValueAt(selectrow, 2).toString());
                    j_Actor_Age_Field.setText(model.getValueAt(selectrow, 3).toString());

                    String Gender_Set = model.getValueAt(selectrow, 4).toString();
                    for (int i = 0; i < j_Gender_Combo_Box.getItemCount(); i++) {
                        if (j_Gender_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Gender_Set)) {
                            j_Gender_Combo_Box.setSelectedIndex(i);
                        }
                    }
                    j_Actor_Hight_Field.setText(model.getValueAt(selectrow, 5).toString());
                    j_Actor_Weight_Field.setText(model.getValueAt(selectrow, 6).toString());
                    String Language_Set = model.getValueAt(selectrow, 7).toString();
                    for (int i = 0; i < j_Language_Combo_Box.getItemCount(); i++) {
                        if (j_Language_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Language_Set)) {
                            j_Language_Combo_Box.setSelectedIndex(i);
                        }
                    }
                    String Nature_set = model.getValueAt(selectrow, 8).toString();
                    for (int i = 0; i < j_Nature_Combo_Box.getItemCount(); i++) {
                        if (j_Nature_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Nature_set)) {
                            j_Nature_Combo_Box.setSelectedIndex(i);
                        }
                    }
                    String Holiday_set = model.getValueAt(selectrow, 9).toString();
                    for (int i = 0; i < j_Holiday_Combo_Box.getItemCount(); i++) {
                        if (j_Holiday_Combo_Box.getItemAt(i).toString().equalsIgnoreCase(Holiday_set)) {
                            j_Holiday_Combo_Box.setSelectedIndex(i);
                        }
                    }
                    String available_set = model.getValueAt(selectrow, 10).toString();
                    if (available_set.equals("Yes")) {
                        j_Radio_Available.setSelected(true);
                    } else {
                        j_Radio_Available.setSelected(false);
                    }
                    //display image to the jlabel
                    ImageIcon ii = new ImageIcon(j_Label_Image.getText());
                    Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
                    j_Label_Image.setIcon(new ImageIcon(image));
                    j_Update_ButtonActionPerformed(evt);

                }

            } else {
                JOptionPane.showMessageDialog(null, "You have not selected any row.", "Unselected Row", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_j_Delete_ButtonActionPerformed

    private void j_Actor_ID_FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_Actor_ID_FieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_j_Actor_ID_FieldKeyTyped

    private void j_Actor_Name_FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_Actor_Name_FieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_j_Actor_Name_FieldKeyTyped

    private void j_Actor_Age_FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_Actor_Age_FieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_j_Actor_Age_FieldKeyTyped

    private void j_Actor_Hight_FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_Actor_Hight_FieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && !String.valueOf(c).equals(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_j_Actor_Hight_FieldKeyTyped

    private void j_Actor_Weight_FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_Actor_Weight_FieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && !String.valueOf(c).equals(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_j_Actor_Weight_FieldKeyTyped

    private void j_Actor_ID_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_ID_FieldMouseClicked
        j_Actor_ID_Field.setText("");
    }//GEN-LAST:event_j_Actor_ID_FieldMouseClicked

    private void j_Actor_Name_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_Name_FieldMouseClicked
        j_Actor_Name_Field.setText("");
    }//GEN-LAST:event_j_Actor_Name_FieldMouseClicked

    private void j_Actor_Age_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_Age_FieldMouseClicked
        j_Actor_Age_Field.setText("");
    }//GEN-LAST:event_j_Actor_Age_FieldMouseClicked

    private void j_Actor_Hight_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_Hight_FieldMouseClicked
        j_Actor_Hight_Field.setText("");
    }//GEN-LAST:event_j_Actor_Hight_FieldMouseClicked

    private void j_Actor_Weight_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_Weight_FieldMouseClicked
        j_Actor_Weight_Field.setText("");
    }//GEN-LAST:event_j_Actor_Weight_FieldMouseClicked

    private void j_Pic_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Pic_ButtonActionPerformed
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
                JOptionPane.showMessageDialog(null, "Not a JPG Image. Please use JPG Image.", "Incorrect Image Format", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_j_Pic_ButtonActionPerformed

    private void j_Add_Done_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Add_Done_ButtonActionPerformed

        String change = j_Actor_Name_Field.getText();

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
        j_Actor_Name_Field.setText(change);

        DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
        int rownum = j_Actor_Table.getRowCount();
        int i = j_Actor_Table.getSelectedRow();
        if (rownum == (i + 1)) {

            int response = JOptionPane.showConfirmDialog(null, "All Set To Go!", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    String available;

                    String member = j_Actor_ID_Field.getText();
                    String name = j_Actor_Name_Field.getText();
                    String age = j_Actor_Age_Field.getText();
                    String hight = j_Actor_Hight_Field.getText();
                    String weight = j_Actor_Weight_Field.getText();
                    if (j_Radio_Available.isSelected() == true) {
                        available = "Yes";
                    } else {
                        available = "No";
                    }

                    if (j_Label_Image.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select an Image.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Actor_ID_Field.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select an ID Number.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Actor_Name_Field.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select a Name.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Actor_Age_Field.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select an Age.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Actor_Hight_Field.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select a Hight.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Actor_Weight_Field.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select a Weight.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else if (j_Label_Image.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Forgot to select an Image.", "Field is Empty", JOptionPane.ERROR_MESSAGE);
                    } else {

                        if (member.length() != 5) {
                            JOptionPane.showMessageDialog(null, "Member ID Order Mismatch!", "Member ID", JOptionPane.ERROR_MESSAGE);
                        } else if (actoridvalidation(j_Actor_ID_Field.getText()) == 0 && rowfilecheack(j_Actor_ID_Field.getText(), i) != 0) {
                            JOptionPane.showMessageDialog(this, "This ID is Already Given!", "Member ID Cross Match", JOptionPane.ERROR_MESSAGE);

                        } else if (name.length() < 3 || name.length() > 20) {
                            JOptionPane.showMessageDialog(this, "Name Order Mismatch!", "Incorrect Name", JOptionPane.ERROR_MESSAGE);
                        } else if (Integer.parseInt(age) < 4 || Integer.parseInt(age) > 30) {
                            JOptionPane.showMessageDialog(this, "Age Order Mismatch!", "Incorrect Age", JOptionPane.ERROR_MESSAGE);
                        } else if (!(Pattern.matches("^[0-9][.]?[0-9]?[0-9]?$", hight))) {
                            JOptionPane.showMessageDialog(this, "Hight Order Mismatch!", "Incorrect Hight", JOptionPane.ERROR_MESSAGE);
                        } else if (!(Pattern.matches("^[0-9][0-9]?[0-9]?$", weight))) {
                            JOptionPane.showMessageDialog(this, "Weight Order Mismatch!", "Incorrect Weight", JOptionPane.ERROR_MESSAGE);
                        } else {

                            model.setValueAt(member, i, 1);
                            model.setValueAt(name, i, 2);
                            model.setValueAt(age, i, 3);
                            model.setValueAt(j_Gender_Combo_Box.getSelectedItem(), i, 4);
                            model.setValueAt(hight, i, 5);
                            model.setValueAt(weight, i, 6);
                            model.setValueAt(j_Language_Combo_Box.getSelectedItem().toString(), i, 7);
                            model.setValueAt(j_Nature_Combo_Box.getSelectedItem().toString(), i, 8);
                            model.setValueAt(j_Holiday_Combo_Box.getSelectedItem().toString(), i, 9);
                            model.setValueAt(available, i, 10);

                            j_Add_Done_Button.setEnabled(false);
                            j_Add_Cancel_Button.setEnabled(false);
                            j_Actor_Table.setEnabled(true);
                            j_Update_ButtonActionPerformed(evt);
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select the new added field to verify.", "Field Mismatch", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_j_Add_Done_ButtonActionPerformed

    private void j_Label_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Label_ImageMouseClicked
        String imagepath = j_Label_Image.getText();

        DImageViewer show = new DImageViewer();
        show.j_Label_Image.setText(imagepath);
        show.viewer();
        show.show();
    }//GEN-LAST:event_j_Label_ImageMouseClicked

    private void j_Actor_Name_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_j_Actor_Name_FieldFocusLost

        String change = j_Actor_Name_Field.getText();

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
        j_Actor_Name_Field.setText(change);
    }//GEN-LAST:event_j_Actor_Name_FieldFocusLost

    private void j_Add_Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Add_Cancel_ButtonActionPerformed
        int i = j_Actor_Table.getRowCount() - 1;
        DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
        model.removeRow(i);

        j_Actor_Table.setEnabled(true);

        j_Add_Button.setVisible(true);
        j_Add_Done_Button.setVisible(false);
        j_Add_Done_Button.setEnabled(false);
        j_Add_Cancel_Button.setEnabled(false);
        j_Delete_Button.setEnabled(true);
        j_Add_Button.setEnabled(true);
        j_Update_Button.setEnabled(true);

        j_Label_Image.setText("");
        j_Actor_ID_Field.setText("");
        j_Actor_Name_Field.setText("");
        j_Actor_Age_Field.setText("");
        j_Actor_Hight_Field.setText("");
        j_Actor_Weight_Field.setText("");
        j_Nature_Combo_Box.setSelectedIndex(0);
        j_Language_Combo_Box.setSelectedIndex(0);
        j_Gender_Combo_Box.setSelectedIndex(0);
        j_Holiday_Combo_Box.setSelectedIndex(0);
        j_Radio_Available.setSelected(false);
        ImageIcon ii = new ImageIcon(j_Label_Image.getText());
        Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
        j_Label_Image.setIcon(new ImageIcon(image));


    }//GEN-LAST:event_j_Add_Cancel_ButtonActionPerformed

    /**
     *
     * @author SD
     * @param args
     */
    public static void main(String args[]) {
        /**
         *
         * @author SD
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAdmin_AdoptionData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField j_Actor_Age_Field;
    private javax.swing.JPanel j_Actor_Data;
    private javax.swing.JTextField j_Actor_Hight_Field;
    private javax.swing.JTextField j_Actor_ID_Field;
    private javax.swing.JTextField j_Actor_Name_Field;
    private javax.swing.JTable j_Actor_Table;
    private javax.swing.JScrollPane j_Actor_Table_ScrollPane;
    private javax.swing.JTextField j_Actor_Weight_Field;
    private javax.swing.JButton j_Add_Button;
    private javax.swing.JButton j_Add_Cancel_Button;
    private javax.swing.JButton j_Add_Done_Button;
    private javax.swing.JButton j_Back_Button;
    public javax.swing.JButton j_Delete_Button;
    private javax.swing.JComboBox<String> j_Gender_Combo_Box;
    private javax.swing.JComboBox<String> j_Holiday_Combo_Box;
    private javax.swing.JLabel j_Label_Banner_Logo;
    private javax.swing.JLabel j_Label_Cover;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JComboBox<String> j_Language_Combo_Box;
    private javax.swing.JComboBox<String> j_Nature_Combo_Box;
    private javax.swing.JButton j_Pic_Button;
    private javax.swing.JRadioButton j_Radio_Available;
    private javax.swing.JButton j_Refresh_Button;
    private javax.swing.JButton j_Update_Button;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }

}

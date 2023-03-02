package thefamilyproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
public class DUser_AdoptionList extends javax.swing.JFrame {

    DefaultTableModel dm;

    public DUser_AdoptionList() {
        Seticon();
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        j_Refresh_Button.requestFocus();
        j_Actor_Table.getTableHeader().setBackground(new java.awt.Color(250, 108, 11));
        j_Actor_Table.getTableHeader().setForeground(Color.WHITE);
        j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(160);
        j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(5);
        j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(5).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(6).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(120);
        j_Actor_Table.getColumnModel().getColumn(8).setPreferredWidth(70);
        j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(40);
        j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);
        j_Actor_Table.getTableHeader().setEnabled(false);
        Cover2.requestFocus();
        InputMap im = j_Refresh_Button.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im2 = j_Booking_Rule.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = j_Book.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = j_Back_Button.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j_Actor_Data = new javax.swing.JPanel();
        j_Back_Button = new javax.swing.JButton();
        j_Refresh_Button = new javax.swing.JButton();
        Cover2 = new javax.swing.JLabel();
        j_Label_Banner_Logo = new javax.swing.JLabel();
        j_Label_Banner_Logo1 = new javax.swing.JLabel();
        j_Actor_Table_ScrollPane = new javax.swing.JScrollPane();
        j_Actor_Table = new javax.swing.JTable();
        j_Booking_Rule = new javax.swing.JButton();
        j_Book = new javax.swing.JButton();
        j_Label_Image = new javax.swing.JLabel();
        j_Label_Cover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        j_Actor_Data.setPreferredSize(new java.awt.Dimension(1147, 753));
        j_Actor_Data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_Back_Button.setBackground(new java.awt.Color(250, 128, 11));
        j_Back_Button.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        j_Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        j_Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        j_Back_Button.setText("Adoption Center");
        j_Back_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Back_ButtonActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        j_Refresh_Button.setBackground(new java.awt.Color(255, 102, 0));
        j_Refresh_Button.setFont(new java.awt.Font("Script MT Bold", 1, 16)); // NOI18N
        j_Refresh_Button.setForeground(new java.awt.Color(176, 20, 51));
        j_Refresh_Button.setText("Click & Make Bond");
        j_Refresh_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        j_Actor_Data.add(j_Refresh_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 160, 80));

        Cover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/aa.jpg"))); // NOI18N
        Cover2.setText("jLabel1");
        Cover2.setNextFocusableComponent(j_Refresh_Button);
        Cover2.setPreferredSize(new java.awt.Dimension(1000, 600));
        j_Actor_Data.add(Cover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1120, 770));

        j_Label_Banner_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/image-removebg-preview 0.png"))); // NOI18N
        j_Label_Banner_Logo.setNextFocusableComponent(j_Booking_Rule);
        j_Actor_Data.add(j_Label_Banner_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 130, -1));

        j_Label_Banner_Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/image-removebg-preview (03).png"))); // NOI18N
        j_Actor_Data.add(j_Label_Banner_Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 60));

        j_Actor_Table.setAutoCreateRowSorter(true);
        j_Actor_Table.setBackground(new java.awt.Color(230, 61, 2));
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
        j_Actor_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Actor_Table.setFocusable(false);
        j_Actor_Table.setRowHeight(90);
        j_Actor_Table.setSelectionBackground(new java.awt.Color(226, 108, 68));
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
            j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(35);
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
            j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(110);
            j_Actor_Table.getColumnModel().getColumn(8).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(8).setPreferredWidth(80);
            j_Actor_Table.getColumnModel().getColumn(9).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(10).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);
        }

        j_Actor_Data.add(j_Actor_Table_ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1120, 410));

        j_Booking_Rule.setBackground(new java.awt.Color(253, 1, 48));
        j_Booking_Rule.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 15)); // NOI18N
        j_Booking_Rule.setForeground(new java.awt.Color(255, 255, 255));
        j_Booking_Rule.setText("Rules");
        j_Booking_Rule.setToolTipText("");
        j_Booking_Rule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Booking_Rule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Booking_Rule.setEnabled(false);
        j_Booking_Rule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Booking_RuleActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Booking_Rule, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 160, 30));

        j_Book.setBackground(new java.awt.Color(253, 1, 48));
        j_Book.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 15)); // NOI18N
        j_Book.setForeground(new java.awt.Color(255, 255, 255));
        j_Book.setText("Request");
        j_Book.setToolTipText("");
        j_Book.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Book.setEnabled(false);
        j_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_BookActionPerformed(evt);
            }
        });
        j_Actor_Data.add(j_Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 160, 30));

        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        j_Label_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Label_ImageMouseClicked(evt);
            }
        });
        j_Actor_Data.add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 200, 200));

        j_Label_Cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/aa.jpg"))); // NOI18N
        j_Label_Cover.setPreferredSize(new java.awt.Dimension(1000, 600));
        j_Actor_Data.add(j_Label_Cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1220, 600));

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

        DUser_AdoptionCenter menu = new DUser_AdoptionCenter();
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

    public void click() {
        ActionEvent evt = null;
        j_Refresh_ButtonActionPerformed(evt);
    }
    private void j_Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Refresh_ButtonActionPerformed
        j_Refresh_Button.setEnabled(false);
        Cover2.setVisible(false);
        j_Book.setEnabled(true);
        j_Booking_Rule.setEnabled(true);
        j_Label_Banner_Logo.requestFocus();
        j_Actor_Table.getTableHeader().setEnabled(true);

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
            j_Actor_Table.getColumnModel().getColumn(9).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(10).setPreferredWidth(40);

        } catch (Exception ex) {
            Logger.getLogger(DUser_AdoptionList.class.getName()).log(Level.SEVERE, null, ex);
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
    String selectedImagePath = "";

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

            // getting table selected data to editable field
            int selectrow = j_Actor_Table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            String fileex = model.getValueAt(selectrow, 1).toString();

            j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\AdoptionList\\" + fileex + ".jpg");

            //display image to the jlabel
            ImageIcon ii = new ImageIcon(j_Label_Image.getText());
            Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
            j_Label_Image.setIcon(new ImageIcon(image));

        } catch (Exception e) {
        }


    }//GEN-LAST:event_j_Actor_TableMouseClicked

    private void j_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_BookActionPerformed
        DUser_OrderAdoption menu = new DUser_OrderAdoption();
        menu.show();
        dispose();
    }//GEN-LAST:event_j_BookActionPerformed

    private void j_Booking_RuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Booking_RuleActionPerformed
        DUser_AdoptionBookRule menu = new DUser_AdoptionBookRule();
        menu.show();
        dispose();
    }//GEN-LAST:event_j_Booking_RuleActionPerformed

    private void j_Label_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Label_ImageMouseClicked
        String imagepath = j_Label_Image.getText();

        DImageViewer show = new DImageViewer();
        show.j_Label_Image.setText(imagepath);
        show.viewer();
        show.show();    }//GEN-LAST:event_j_Label_ImageMouseClicked

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
                new DUser_AdoptionList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover2;
    private javax.swing.JPanel j_Actor_Data;
    private javax.swing.JTable j_Actor_Table;
    private javax.swing.JScrollPane j_Actor_Table_ScrollPane;
    private javax.swing.JButton j_Back_Button;
    private javax.swing.JButton j_Book;
    private javax.swing.JButton j_Booking_Rule;
    private javax.swing.JLabel j_Label_Banner_Logo;
    private javax.swing.JLabel j_Label_Banner_Logo1;
    private javax.swing.JLabel j_Label_Cover;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JButton j_Refresh_Button;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }

}

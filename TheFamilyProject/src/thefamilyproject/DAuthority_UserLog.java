package thefamilyproject;

import java.awt.Dimension;
import java.awt.Image;
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
public class DAuthority_UserLog extends javax.swing.JFrame {

    /**
     *
     * @author SD
     */
    public DAuthority_UserLog() {
        initComponents();
        Seticon();
        jTable.getTableHeader().setBackground(new java.awt.Color(82, 53, 32));
        jTable.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        AdminLog.requestFocus();
        jTable.setRowHeight(50);
        output.setVisible(false);
        InputMap im = ja_homeb.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        showclick();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminLog = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ja_homeb = new javax.swing.JButton();
        j_Label_Image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AdminLog.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        AdminLog.setForeground(new java.awt.Color(255, 255, 255));
        AdminLog.setText("User Log Info");
        getContentPane().add(AdminLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 270, 70));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 290, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 310, 20));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBackground(new java.awt.Color(164, 90, 37));
        jTable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Name", "Email"
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
        jTable.setSelectionBackground(new java.awt.Color(156, 109, 75));
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1000, 340));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/author.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

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

        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        j_Label_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Label_ImageMouseClicked(evt);
            }
        });
        getContentPane().add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/andrew-neel-cckf4TsHAuw-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -260, 1090, 730));

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

    public void showclick() {
        ActionEvent evt = null;
        outputActionPerformed(evt);
    }


    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed

        try {
            File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\UserLog.txt");
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

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

        int selectrow = jTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        String fileex = model.getValueAt(selectrow, 0).toString();

        j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + fileex + ".jpg");

        ImageIcon ii = new ImageIcon(j_Label_Image.getText());
        Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
        j_Label_Image.setIcon(new ImageIcon(image));

    }//GEN-LAST:event_jTableMouseClicked

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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DAuthority_UserLog().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JButton ja_homeb;
    private javax.swing.JButton output;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

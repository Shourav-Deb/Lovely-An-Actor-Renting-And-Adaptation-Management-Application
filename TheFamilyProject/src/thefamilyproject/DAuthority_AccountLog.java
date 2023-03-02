package thefamilyproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SD
 */
public class DAuthority_AccountLog extends javax.swing.JFrame {

    
    public DAuthority_AccountLog() {
        Seticon();
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        jLabel4.requestFocus();
        InputMap im4 = ja_homeb.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        j_Actor_Table.getTableHeader().setEnabled(true);
        j_Actor_Table.getTableHeader().setBackground(new java.awt.Color(120, 105, 70));
        j_Actor_Table.getTableHeader().setForeground(Color.WHITE);
        Click();

    }

    public void Click() {
        ActionEvent evt = null;
        jButton1ActionPerformed(evt);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ja_homeb = new javax.swing.JButton();
        j_Actor_Table_ScrollPane = new javax.swing.JScrollPane();
        j_Actor_Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ja_homeb.setBackground(new java.awt.Color(51, 51, 0));
        ja_homeb.setForeground(new java.awt.Color(255, 255, 255));
        ja_homeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        ja_homeb.setText("Auth Center");
        ja_homeb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_homeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_homeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_homebActionPerformed(evt);
            }
        });
        jPanel1.add(ja_homeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 30));

        j_Actor_Table.setAutoCreateRowSorter(true);
        j_Actor_Table.setBackground(new java.awt.Color(64, 60, 22));
        j_Actor_Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Actor_Table.setFont(new java.awt.Font("Utsaah", 3, 15)); // NOI18N
        j_Actor_Table.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Name", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        j_Actor_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Actor_Table.setFocusable(false);
        j_Actor_Table.setGridColor(new java.awt.Color(255, 255, 255));
        j_Actor_Table.setRowHeight(90);
        j_Actor_Table.setSelectionBackground(new java.awt.Color(141, 134, 62));
        j_Actor_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.setShowGrid(true);
        j_Actor_Table_ScrollPane.setViewportView(j_Actor_Table);
        if (j_Actor_Table.getColumnModel().getColumnCount() > 0) {
            j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(15);
            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(210);
        }

        jPanel1.add(j_Actor_Table_ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1000, 360));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Reset Info");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 310, 50));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 340, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 370, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/logo1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -10, 340, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/account log.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1000, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/account log.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 80, 40));

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

    private void ja_homebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_homebActionPerformed

        DAdmin_Authority menu = new DAdmin_Authority();
        menu.show();
        dispose();
    }//GEN-LAST:event_ja_homebActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\Admin\\Account_Reset_Detail.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(filehc));

            String firstLine = br.readLine().trim();
            String[] Cname = firstLine.split("\t");
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            model.setColumnIdentifiers(Cname);
            j_Actor_Table.getTableHeader().setEnabled(true);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model.addRow(dataRow);

            }
            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(200);

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ///* Set the Nimbus look and feel *///                                                                                                                                                                                                                                                    Copyright © 2022 by Shourav Dev. All Rights Reserved.

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
            java.util.logging.Logger.getLogger(DAuthority_AccountLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAuthority_AccountLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAuthority_AccountLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAuthority_AccountLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAuthority_AccountLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable j_Actor_Table;
    private javax.swing.JScrollPane j_Actor_Table_ScrollPane;
    private javax.swing.JButton ja_homeb;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

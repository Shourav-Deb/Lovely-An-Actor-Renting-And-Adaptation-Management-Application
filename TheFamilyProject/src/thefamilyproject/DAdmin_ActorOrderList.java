package thefamilyproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author SD
 */
public class DAdmin_ActorOrderList extends javax.swing.JFrame {

    DefaultTableModel dm;

    /**
     *
     * @author SD
     */
    public DAdmin_ActorOrderList() {
        Seticon();
        initComponents();
        j_Actor_Table.setRowHeight(50);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        j_Actor_Table.getTableHeader().setBackground(Color.blue);
        j_Actor_Table.getTableHeader().setForeground(Color.WHITE);
        j_Radio_Available.setVisible(false);
        j_Actor_Table.setAutoCreateRowSorter(true);
        InputMap im3 = ja_homeb.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im2 = jButton1.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        jButton1.requestFocus();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ja_homeb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cover = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_Actor_Table = new javax.swing.JTable();
        j_Radio_Available = new javax.swing.JRadioButton();
        j_Label_Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/hire (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ja_homeb.setBackground(new java.awt.Color(83, 86, 105));
        ja_homeb.setForeground(new java.awt.Color(255, 255, 255));
        ja_homeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        ja_homeb.setText("Acting Hub :)");
        ja_homeb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ja_homeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ja_homeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_homebActionPerformed(evt);
            }
        });
        jPanel1.add(ja_homeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 210, 20));

        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/dhjgiyhk.png"))); // NOI18N
        cover.setText("jLabel2");
        jPanel1.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -150, 1140, 790));

        j_Actor_Table.setBackground(new java.awt.Color(25, 45, 100));
        j_Actor_Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Actor_Table.setForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actor ID", "User Name", "NID", "Email", "Phone Number", "Day", "TxID", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        j_Actor_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Actor_Table.setFocusable(false);
        j_Actor_Table.setSelectionBackground(new java.awt.Color(102, 102, 255));
        j_Actor_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        j_Actor_Table.getTableHeader().setReorderingAllowed(false);
        j_Actor_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Actor_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_Actor_Table);
        if (j_Actor_Table.getColumnModel().getColumnCount() > 0) {
            j_Actor_Table.getColumnModel().getColumn(0).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(1).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(230);
            j_Actor_Table.getColumnModel().getColumn(2).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(170);
            j_Actor_Table.getColumnModel().getColumn(3).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(200);
            j_Actor_Table.getColumnModel().getColumn(4).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(170);
            j_Actor_Table.getColumnModel().getColumn(5).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(6).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(7).setResizable(false);
            j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(130);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1010, 370));

        j_Radio_Available.setBackground(new java.awt.Color(25, 45, 100));
        j_Radio_Available.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        j_Radio_Available.setForeground(new java.awt.Color(204, 204, 204));
        j_Radio_Available.setText("  Completed");
        j_Radio_Available.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_Radio_Available.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_Radio_Available.setFocusable(false);
        j_Radio_Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_Radio_AvailableActionPerformed(evt);
            }
        });
        jPanel1.add(j_Radio_Available, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 110, 30));

        j_Label_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        j_Label_Image.setFocusable(false);
        j_Label_Image.setNextFocusableComponent(ja_homeb);
        j_Label_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_Label_ImageMouseClicked(evt);
            }
        });
        jPanel1.add(j_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/qedgsad.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setNextFocusableComponent(ja_homeb);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 1140, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ja_homebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_homebActionPerformed

        DAdmin_ActingHub menu = new DAdmin_ActingHub();
        menu.show();
        dispose();

    }//GEN-LAST:event_ja_homebActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setVisible(false);
        cover.setVisible(false);

        j_Actor_Table.getTableHeader().setEnabled(false);
        jLabel2.requestFocus();

        File filehc = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\NewActorOrder.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(filehc));

            String firstLine = br.readLine().trim();
            String[] Cname = firstLine.split("\t");
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            model.setColumnIdentifiers(Cname);

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("\t");
                model.addRow(dataRow);

            }
            j_Actor_Table.getColumnModel().getColumn(0).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(1).setPreferredWidth(200);

            j_Actor_Table.getColumnModel().getColumn(2).setPreferredWidth(60);
            j_Actor_Table.getColumnModel().getColumn(3).setPreferredWidth(140);
            j_Actor_Table.getColumnModel().getColumn(4).setPreferredWidth(60);
            j_Actor_Table.getColumnModel().getColumn(5).setPreferredWidth(40);
            j_Actor_Table.getColumnModel().getColumn(7).setPreferredWidth(60);
            jButton1.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(DAdmin_ActorOrderList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased

        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1MouseReleased

    private void j_Actor_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Actor_TableMouseClicked
        try {

            // getting table selected data to editable field
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            int selectrow = j_Actor_Table.getSelectedRow();
            if (selectrow >= 0) {
                j_Radio_Available.setVisible(true);
            }

            String available_set = model.getValueAt(selectrow, 7).toString();
            if (available_set.equals("Done")) {
                j_Radio_Available.setSelected(true);
            } else {
                j_Radio_Available.setSelected(false);
            }
        } catch (Exception e) {
        }
        try {

            // getting table selected data to editable field
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            int selectrow = j_Actor_Table.getSelectedRow();
            String u_name = model.getValueAt(selectrow, 1).toString();

            j_Label_Image.setText("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\Admin\\UserPhoto\\" + u_name + ".jpg");

            ImageIcon ii = new ImageIcon(j_Label_Image.getText());
            Image image = ii.getImage().getScaledInstance(j_Label_Image.getWidth(), j_Label_Image.getHeight(), Image.SCALE_SMOOTH);
            j_Label_Image.setIcon(new ImageIcon(image));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_j_Actor_TableMouseClicked

    private void j_Radio_AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_Radio_AvailableActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) j_Actor_Table.getModel();
            int i = j_Actor_Table.getSelectedRow();
            if (i >= 0) {
                String available;
                if (j_Radio_Available.isSelected() == true) {
                    available = "Done";
                } else {
                    available = ".....";
                }
                model.setValueAt(available, i, 7);
                try {
                    File file = new File("C:\\TheFamilyProject\\src\\thefamilyproject\\TextFiles\\NewActorOrder.txt");
                    file.delete();
                    file.createNewFile();
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("Actor ID\tUser Name\tNID\tEmail\tPhone Number\tDay\tTxID\tRequest Status\n");
                    for (int a = 0; a < j_Actor_Table.getRowCount(); a++) {
                        for (int j = 0; j < j_Actor_Table.getColumnCount(); j++) {

                            bw.write(j_Actor_Table.getValueAt(a, j).toString() + "\t");
                        }
                        bw.newLine();
                    }
                    bw.close();
                    fw.close();

                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select A Field", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_j_Radio_AvailableActionPerformed

    private void j_Label_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_Label_ImageMouseClicked
        String imagepath = j_Label_Image.getText();

        DImageViewer show = new DImageViewer();
        show.j_Label_Image.setText(imagepath);
        show.viewer();
        show.show();
    }//GEN-LAST:event_j_Label_ImageMouseClicked

    /**
     *
     * @author SD
     * @param args
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DAdmin_ActorOrderList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable j_Actor_Table;
    private javax.swing.JLabel j_Label_Image;
    private javax.swing.JRadioButton j_Radio_Available;
    private javax.swing.JButton ja_homeb;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }

}

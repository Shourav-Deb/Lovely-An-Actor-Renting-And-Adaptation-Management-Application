package thefamilyproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import static javax.swing.JComponent.WHEN_FOCUSED;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author SD
 */
public class DAdmin_ActingHub extends javax.swing.JFrame {

    public DAdmin_ActingHub() {
        initComponents();
        ActorHubText.requestFocus();
        Seticon();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        InputMap im = ActorDatabaseButton.getInputMap(WHEN_FOCUSED);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im2 = Back.getInputMap(WHEN_FOCUSED);
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im3 = jButton1.getInputMap(WHEN_FOCUSED);
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        InputMap im4 = jButton3.getInputMap(WHEN_FOCUSED);
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        im4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ActorHubText = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        ActorDatabaseButton = new javax.swing.JButton();
        Separator2 = new javax.swing.JSeparator();
        Back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ActorHubText.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        ActorHubText.setForeground(new java.awt.Color(255, 255, 255));
        ActorHubText.setText("Acting Hub :)");
        getContentPane().add(ActorHubText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 300, 130));

        Separator1.setBackground(new java.awt.Color(255, 255, 255));
        Separator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 400, 20));

        jButton1.setBackground(new java.awt.Color(55, 92, 95));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Actor Request");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 260, 100));

        ActorDatabaseButton.setBackground(new java.awt.Color(122, 117, 101));
        ActorDatabaseButton.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        ActorDatabaseButton.setForeground(new java.awt.Color(0, 0, 0));
        ActorDatabaseButton.setText("Actor Database");
        ActorDatabaseButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActorDatabaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActorDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActorDatabaseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ActorDatabaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 260, 100));

        Separator2.setBackground(new java.awt.Color(106, 93, 79));
        Separator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 113, 400, 20));

        Back.setBackground(new java.awt.Color(128, 106, 52));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/BackButton25.png"))); // NOI18N
        Back.setText("Menu");
        Back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        jButton3.setBackground(new java.awt.Color(120, 66, 91));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Wanna Be Actor");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 260, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/author.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thefamilyproject/Images/image (14).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActorDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActorDatabaseButtonActionPerformed
        DAdmin_ActorData menu = new DAdmin_ActorData();
        menu.show();
        dispose();
    }//GEN-LAST:event_ActorDatabaseButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        DAdmin_Menu menu = new DAdmin_Menu();
        menu.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DAdmin_ActorOrderList menu = new DAdmin_ActorOrderList();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DAdmin_ActorJoiningRequestList menu = new DAdmin_ActorJoiningRequestList();
        menu.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon icon = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\admin.png");
        JOptionPane.showMessageDialog(this, " Program Created By Shourav Deb \nTalk To Me: heyneeddev@gmail.com", "@author info", JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     *
     * @author SD
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAdmin_ActingHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActorDatabaseButton;
    private javax.swing.JLabel ActorHubText;
    private javax.swing.JButton Back;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        ImageIcon icon1 = new ImageIcon("C:\\TheFamilyProject\\src\\thefamilyproject\\Images\\LOGO.png");
        setIconImage(icon1.getImage());
    }
}

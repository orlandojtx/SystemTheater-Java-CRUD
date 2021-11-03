/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ORLANDO
 */
public class asistencia extends javax.swing.JFrame {

    /**
     * Creates new form asistencia
     */
    
      SQLcon cc=new SQLcon();
      Connection con=cc.conexion();
 
    
    
    public asistencia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Linkedin = new javax.swing.JLabel();
        google = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("reto5");
        setBackground(new java.awt.Color(0, 51, 102));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1400, 1050));
        setPreferredSize(new java.awt.Dimension(1400, 1012));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(51, 0, 0));
        jButton2.setFont(new java.awt.Font("Footlight MT Light", 3, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("START");
        jButton2.setToolTipText("This Botton leads to the attendance table");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusPainted(false);
        jButton2.setName(""); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, 200, 70));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 3, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SystemTheater");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 560, 110));

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("to the");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 560, 110));

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 3, 75)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 560, 110));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Copyright 2021 © All rights Reserved. Design by Orlando Trujillo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 900, 380, -1));

        Linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/sociallinkedin_member_2751 (1).png"))); // NOI18N
        Linkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkedinMouseClicked(evt);
            }
        });
        getContentPane().add(Linkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 920, 50, 60));

        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/social_google_2750.png"))); // NOI18N
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googleMouseClicked(evt);
            }
        });
        google.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                googleKeyPressed(evt);
            }
        });
        getContentPane().add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 920, 50, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/background.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1400, 1140));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    SQLcon cc=new SQLcon();
    Connection con=cc.conexion();
        if (cc.conectar != null ) {
            
//        System.out.println ("Conectado");
JOptionPane.showMessageDialog(null,"Successful connection", "Connection", JOptionPane.INFORMATION_MESSAGE);
        asistencia2 START= new asistencia2();
        START.setVisible(true);
        START.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
      
      
      
    }
         else{
    JOptionPane.showMessageDialog(null,"Failed connnection","Connection", JOptionPane.INFORMATION_MESSAGE);
               
               
               
         }

       



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void LinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkedinMouseClicked
        // linkedin button
        
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.linkedin.com/in/orlandotrujilloflorez/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        
        
        
        
    }//GEN-LAST:event_LinkedinMouseClicked

    private void googleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_googleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_googleKeyPressed

    private void googleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseClicked
        // google button
        
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("mailto:orlando.trujillo123@gmail.com?subject=Contact%20Message"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(asistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_googleMouseClicked

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
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Linkedin;
    private javax.swing.JLabel google;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

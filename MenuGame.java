
package perancanganaplikasi;

import javax.swing.JFrame;

public class MenuGame extends javax.swing.JFrame {

    public MenuGame() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        belajar = new javax.swing.JButton();
        star = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        latar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Huruf Hijaiyah");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 160, 180, 60);

        belajar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        belajar.setText(" Mengenal huruf hijaiyah");
        belajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belajarActionPerformed(evt);
            }
        });
        getContentPane().add(belajar);
        belajar.setBounds(510, 320, 330, 45);

        star.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        star.setText("Star");
        star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starActionPerformed(evt);
            }
        });
        getContentPane().add(star);
        star.setBounds(590, 590, 70, 30);

        cancel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel1.setText("Cancel");
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1);
        cancel1.setBounds(690, 590, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 60, 40, 24);

        latar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perancanganaplikasi/e64ec55537deafc1d062eca2ecd5461c.jpg"))); // NOI18N
        getContentPane().add(latar2);
        latar2.setBounds(90, 40, 1200, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void belajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_belajarActionPerformed

    private void starActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starActionPerformed
        // TODO add your handling code here:
         new Utama().setVisible(true);
          
    }//GEN-LAST:event_starActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
          new Judul().setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton belajar;
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel latar2;
    private javax.swing.JButton star;
    // End of variables declaration//GEN-END:variables
}

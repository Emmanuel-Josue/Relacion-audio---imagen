/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteVentanas;

/**
 *
 * @author user01
 */
public class VentanaUno extends javax.swing.JFrame {

    /**
     * Creates new form VentanaUno
     */
    public VentanaUno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanelUno = new javax.swing.JPanel();
        btnVerbosRegulares = new javax.swing.JButton();
        btnVerbosIregulares = new javax.swing.JButton();
        btnOtrasPalabras = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanelUno.setLayout(new java.awt.GridLayout(3, 1));

        btnVerbosRegulares.setText("Verbos regulares");
        btnVerbosRegulares.setPreferredSize(new java.awt.Dimension(124, 22));
        btnVerbosRegulares.setVerifyInputWhenFocusTarget(false);
        btnVerbosRegulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerbosRegularesActionPerformed(evt);
            }
        });
        jPanelUno.add(btnVerbosRegulares);

        btnVerbosIregulares.setText("Verbos irregulares");
        btnVerbosIregulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerbosIregularesActionPerformed(evt);
            }
        });
        jPanelUno.add(btnVerbosIregulares);

        btnOtrasPalabras.setText("Otras palabras");
        jPanelUno.add(btnOtrasPalabras);

        getContentPane().add(jPanelUno);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerbosIregularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerbosIregularesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerbosIregularesActionPerformed

    private void btnVerbosRegularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerbosRegularesActionPerformed
        VentanaDos ventana = new VentanaDos();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVerbosRegularesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtrasPalabras;
    private javax.swing.JButton btnVerbosIregulares;
    private javax.swing.JButton btnVerbosRegulares;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanelUno;
    // End of variables declaration//GEN-END:variables
}

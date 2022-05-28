/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package traductor;

import Clases.Lexico;
import Clases.Sintactico;
import com.sun.istack.internal.logging.Logger;
import java.io.StringReader;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author EricksonV11
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_espaniol = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_ingles = new javax.swing.JTextPane();
        jB_Traducir = new javax.swing.JButton();
        jB_Borrar = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INGLÉS ");
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ESPAÑOL");
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 14));

        jt_espaniol.setToolTipText("");
        jt_espaniol.setName(""); // NOI18N
        jScrollPane1.setViewportView(jt_espaniol);

        jScrollPane2.setViewportView(jt_ingles);

        jB_Traducir.setBackground(new java.awt.Color(153, 153, 255));
        jB_Traducir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jB_Traducir.setText("Traducir");
        jB_Traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_TraducirActionPerformed(evt);
            }
        });

        jB_Borrar.setBackground(new java.awt.Color(153, 153, 255));
        jB_Borrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jB_Borrar.setText("Limpiar");
        jB_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BorrarActionPerformed(evt);
            }
        });

        jB_salir.setBackground(new java.awt.Color(153, 153, 255));
        jB_salir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jB_salir.setText("Salir");
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jB_Traducir)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jB_Borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_salir)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jB_Traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Borrar)
                    .addComponent(jB_salir))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jB_Borrar.getAccessibleContext().setAccessibleName("Borrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BorrarActionPerformed
        // TODO add your handling code here:
        this.jt_espaniol.setText("");
        this.jt_ingles.setText("");
    }//GEN-LAST:event_jB_BorrarActionPerformed

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro traductor");
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jB_TraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_TraducirActionPerformed
        // TODO add your handling code here:
        String strinToBeParsed = jt_ingles.getText();
        StringReader reade = new StringReader(strinToBeParsed);
        try{
            jt_espaniol.removeAll();
            this.jt_espaniol.setText("");
            Lexico lexer = new Lexico(reade);
            Sintactico anasintac = new Sintactico(lexer);
            anasintac.parse();
            Traducir s = new Traducir();
            String respuesta = "";
            respuesta = s.afirmati;
            jt_espaniol.setText(respuesta);
            respuesta = "";
        }
        catch(Exception ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jB_TraducirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Borrar;
    private javax.swing.JButton jB_Traducir;
    private javax.swing.JButton jB_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jt_espaniol;
    private javax.swing.JTextPane jt_ingles;
    // End of variables declaration//GEN-END:variables
}

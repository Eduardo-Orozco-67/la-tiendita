/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.*;
import java.awt.event.WindowEvent;
import vistas.Control_diario;
import vistas.Control_rango;
import vistas.entradas;
import vistas.salidas;

/**
 *
 * @author Emili
 */
public class reportes extends javax.swing.JFrame {

    /**
     * Creates new form reportes
     */
    public reportes() {
        initComponents();
        this.setResizable(false); 
        this.setLocationRelativeTo(this);
    }
    entradas entr = new entradas();
    salidas sal = new salidas();
    Control_diario controldiario = new Control_diario();
    Control_rango controlrango = new Control_rango();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        entradas = new javax.swing.JButton();
        salidas = new javax.swing.JButton();
        diario = new javax.swing.JButton();
        btrango = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        regresarrep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(229, 227, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(180, 207, 176));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));

        entradas.setText("ENTRADAS");
        entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradasActionPerformed(evt);
            }
        });

        salidas.setText("SALIDAS");
        salidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidasActionPerformed(evt);
            }
        });

        diario.setText("CONTROL DIARIO");
        diario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diarioActionPerformed(evt);
            }
        });

        btrango.setText("CONTROL POR RANGO");
        btrango.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entradas)
                    .addComponent(salidas))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btrango)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(diario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradas)
                    .addComponent(diario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salidas)
                    .addComponent(btrango))
                .addGap(50, 50, 50))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 210));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("REPORTES DE INVENTARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        regresarrep.setText("REGRESAR");
        regresarrep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarrepActionPerformed(evt);
            }
        });
        jPanel1.add(regresarrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarrepActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == regresarrep) 
        {           
            dispose();           
        }
    }//GEN-LAST:event_regresarrepActionPerformed

    private void diarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diarioActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == diario)
        {
            diario.setEnabled(false);
            salidas.setEnabled(false);
            entradas.setEnabled(false);
            btrango.setEnabled(false);
            regresarrep.setEnabled(false);          
            
            controldiario.setVisible(true);            
            
            controldiario.addWindowListener(new WindowAdapter(){ 
               @Override
                public void windowClosing(WindowEvent we){
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
                public void windowClosed(WindowEvent we)
                {
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
            });
        }      
        
    }//GEN-LAST:event_diarioActionPerformed

    private void btrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrangoActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == btrango)
        {
            diario.setEnabled(false);
            salidas.setEnabled(false);
            entradas.setEnabled(false);
            btrango.setEnabled(false);
            regresarrep.setEnabled(false);          
            
            controlrango.setVisible(true);            
            
            controlrango.addWindowListener(new WindowAdapter(){ 
               @Override
                public void windowClosing(WindowEvent we){
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
                public void windowClosed(WindowEvent we)
                {
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
            });
        }        
    }//GEN-LAST:event_btrangoActionPerformed

    private void entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradasActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == entradas)
        {
            diario.setEnabled(false);
            salidas.setEnabled(false);
            entradas.setEnabled(false);
            btrango.setEnabled(false);
            regresarrep.setEnabled(false);          
            
            entr.setVisible(true);            
            
            entr.addWindowListener(new WindowAdapter(){ 
               @Override
                public void windowClosing(WindowEvent we){
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
                public void windowClosed(WindowEvent we)
                {
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
            });
        }
        
    }//GEN-LAST:event_entradasActionPerformed

    private void salidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidasActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == salidas)
        {
            diario.setEnabled(false);
            salidas.setEnabled(false);
            entradas.setEnabled(false);
            btrango.setEnabled(false);
            regresarrep.setEnabled(false);          
            
            sal.setVisible(true);            
            
            sal.addWindowListener(new WindowAdapter(){ 
               @Override
                public void windowClosing(WindowEvent we){
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
                public void windowClosed(WindowEvent we)
                {
                    diario.setEnabled(true);
                    salidas.setEnabled(true);
                    entradas.setEnabled(true);
                    btrango.setEnabled(true);
                    regresarrep.setEnabled(true);
                }
            });
        }
    }//GEN-LAST:event_salidasActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btrango;
    private javax.swing.JButton diario;
    private javax.swing.JButton entradas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresarrep;
    private javax.swing.JButton salidas;
    // End of variables declaration//GEN-END:variables
}

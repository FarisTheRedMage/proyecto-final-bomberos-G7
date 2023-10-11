/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BomberoData;
import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.AccesoADatos.SiniestroData;

/**
 *
 * @author faris
 */
public class disenioGestionBomberosApp extends javax.swing.JFrame {
    
    private final BomberoData bd;
    private final CuartelData cd;
    private final BrigadaData brigd;
    private final SiniestroData sd;

    /**
     * Creates new form disenioGestionBomberosApp
     */
    public disenioGestionBomberosApp() {
        initComponents();
        setTitle("Sistema de gestión de Estaciones de Bomberos de La Punta - San Luis");
        
        bd = new BomberoData();
        cd = new CuartelData();
        brigd = new BrigadaData();
        sd = new SiniestroData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMUnidades = new javax.swing.JMenu();
        JMICargaDePersonal = new javax.swing.JMenuItem();
        JMIGestionDePersonal = new javax.swing.JMenuItem();
        JMCuarteles = new javax.swing.JMenu();
        JMIGestionDeCuarteles = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMBrigadas = new javax.swing.JMenu();
        JMIGestionDeBrigadas = new javax.swing.JMenuItem();
        JMIRevisarBrigadas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMSiniestros = new javax.swing.JMenu();
        JMItemSiniestros = new javax.swing.JMenuItem();
        JMIHistorialDeSiniestros = new javax.swing.JMenuItem();
        JMIAsignacionDeCuarteles = new javax.swing.JMenuItem();
        JMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );

        JMUnidades.setText("Unidades");

        JMICargaDePersonal.setText("Carga De Personal");
        JMUnidades.add(JMICargaDePersonal);

        JMIGestionDePersonal.setText("Gestion De Personal");
        JMUnidades.add(JMIGestionDePersonal);

        jMenuBar1.add(JMUnidades);

        JMCuarteles.setText("Cuarteles");

        JMIGestionDeCuarteles.setText("Gestion de Cuarteles");
        JMCuarteles.add(JMIGestionDeCuarteles);

        jMenuItem2.setText("Informacion De Cuartel");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMCuarteles.add(jMenuItem2);

        jMenuBar1.add(JMCuarteles);

        JMBrigadas.setText("Brigadas");

        JMIGestionDeBrigadas.setText("Modificacion y Busqueda de Brigadas");
        JMIGestionDeBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestionDeBrigadasActionPerformed(evt);
            }
        });
        JMBrigadas.add(JMIGestionDeBrigadas);

        JMIRevisarBrigadas.setText("Revisar Brigadas");
        JMBrigadas.add(JMIRevisarBrigadas);

        jMenuItem1.setText("Personal en Brigadas");
        JMBrigadas.add(jMenuItem1);

        jMenuBar1.add(JMBrigadas);

        JMSiniestros.setText("Siniestros");

        JMItemSiniestros.setText("Siniestros");
        JMItemSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemSiniestrosActionPerformed(evt);
            }
        });
        JMSiniestros.add(JMItemSiniestros);

        JMIHistorialDeSiniestros.setText("Historial de Siniestros");
        JMIHistorialDeSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIHistorialDeSiniestrosActionPerformed(evt);
            }
        });
        JMSiniestros.add(JMIHistorialDeSiniestros);

        JMIAsignacionDeCuarteles.setText("Asignacion de Cuarteles");
        JMSiniestros.add(JMIAsignacionDeCuarteles);

        jMenuBar1.add(JMSiniestros);

        JMSalir.setText("Salir");
        jMenuBar1.add(JMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItemSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemSiniestrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMItemSiniestrosActionPerformed

    private void JMIGestionDeBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestionDeBrigadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIGestionDeBrigadasActionPerformed

    private void JMIHistorialDeSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIHistorialDeSiniestrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMIHistorialDeSiniestrosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(disenioGestionBomberosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(disenioGestionBomberosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(disenioGestionBomberosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(disenioGestionBomberosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new disenioGestionBomberosApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMBrigadas;
    private javax.swing.JMenu JMCuarteles;
    private javax.swing.JMenuItem JMIAsignacionDeCuarteles;
    private javax.swing.JMenuItem JMICargaDePersonal;
    private javax.swing.JMenuItem JMIGestionDeBrigadas;
    private javax.swing.JMenuItem JMIGestionDeCuarteles;
    private javax.swing.JMenuItem JMIGestionDePersonal;
    private javax.swing.JMenuItem JMIHistorialDeSiniestros;
    private javax.swing.JMenuItem JMIRevisarBrigadas;
    private javax.swing.JMenuItem JMItemSiniestros;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JMenu JMSiniestros;
    private javax.swing.JMenu JMUnidades;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}

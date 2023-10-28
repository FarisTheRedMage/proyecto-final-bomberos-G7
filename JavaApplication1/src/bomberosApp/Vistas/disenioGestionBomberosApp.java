package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BomberoData;
import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.AccesoADatos.SiniestroData;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class disenioGestionBomberosApp extends javax.swing.JFrame {

    private final BomberoData bd;
    private final CuartelData cd;
    private final BrigadaData brigd;
    private final SiniestroData sd;

    public disenioGestionBomberosApp() {
        initComponents();
        setTitle("Sistema de gestión de Estaciones de Bomberos de La Punta - San Luis");

        bd = new BomberoData();
        cd = new CuartelData();
        brigd = new BrigadaData();
        sd = new SiniestroData();
        cambiarColor();
        cambiarfondo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        fondito = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMUnidades = new javax.swing.JMenu();
        JMICargaDePersonal = new javax.swing.JMenuItem();
        JMIGestionDePersonal = new javax.swing.JMenuItem();
        JMCuarteles = new javax.swing.JMenu();
        JMIGestionDeCuarteles = new javax.swing.JMenuItem();
        JMIInformacionDeCuartel = new javax.swing.JMenuItem();
        JMBrigadas = new javax.swing.JMenu();
        JMIGestionDeBrigadas = new javax.swing.JMenuItem();
        JMIRevisarBrigadas = new javax.swing.JMenuItem();
        JMIPersonalEnBrigadas = new javax.swing.JMenuItem();
        JMSiniestros = new javax.swing.JMenu();
        JMItemSiniestros = new javax.swing.JMenuItem();
        JMIHistorialDeSiniestros = new javax.swing.JMenuItem();
        JMIAsignacionDeCuarteles = new javax.swing.JMenuItem();
        JMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/fondo.jpg"))); // NOI18N

        escritorio.setLayer(fondito, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(fondito)
                .addGap(0, 182, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(fondito)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        JMUnidades.setText("Unidades");

        JMICargaDePersonal.setText("Carga De Personal");
        JMICargaDePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICargaDePersonalActionPerformed(evt);
            }
        });
        JMUnidades.add(JMICargaDePersonal);

        JMIGestionDePersonal.setText("Gestion De Personal");
        JMIGestionDePersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestionDePersonalActionPerformed(evt);
            }
        });
        JMUnidades.add(JMIGestionDePersonal);

        jMenuBar1.add(JMUnidades);

        JMCuarteles.setText("Cuarteles");

        JMIGestionDeCuarteles.setText("Gestion de Cuarteles");
        JMIGestionDeCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestionDeCuartelesActionPerformed(evt);
            }
        });
        JMCuarteles.add(JMIGestionDeCuarteles);

        JMIInformacionDeCuartel.setText("Informacion De Brigadas En Cuartel");
        JMIInformacionDeCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIInformacionDeCuartelActionPerformed(evt);
            }
        });
        JMCuarteles.add(JMIInformacionDeCuartel);

        jMenuBar1.add(JMCuarteles);

        JMBrigadas.setText("Brigadas");

        JMIGestionDeBrigadas.setText("Busqueda Y Modificacion de Brigadas");
        JMIGestionDeBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIGestionDeBrigadasActionPerformed(evt);
            }
        });
        JMBrigadas.add(JMIGestionDeBrigadas);

        JMIRevisarBrigadas.setText("Revisar Brigadas");
        JMIRevisarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIRevisarBrigadasActionPerformed(evt);
            }
        });
        JMBrigadas.add(JMIRevisarBrigadas);

        JMIPersonalEnBrigadas.setText("Personal en Brigadas");
        JMIPersonalEnBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIPersonalEnBrigadasActionPerformed(evt);
            }
        });
        JMBrigadas.add(JMIPersonalEnBrigadas);

        jMenuBar1.add(JMBrigadas);

        JMSiniestros.setText("Siniestros");

        JMItemSiniestros.setText("Siniestros");
        JMItemSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMItemSiniestrosActionPerformed(evt);
            }
        });
        JMSiniestros.add(JMItemSiniestros);

        JMIHistorialDeSiniestros.setText("Historial de Eventos");
        JMIHistorialDeSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIHistorialDeSiniestrosActionPerformed(evt);
            }
        });
        JMSiniestros.add(JMIHistorialDeSiniestros);

        JMIAsignacionDeCuarteles.setText("Asignacion de Cuarteles");
        JMIAsignacionDeCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAsignacionDeCuartelesActionPerformed(evt);
            }
        });
        JMSiniestros.add(JMIAsignacionDeCuarteles);

        jMenuBar1.add(JMSiniestros);

        JMSalir.setText("Salir");
        JMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItemSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemSiniestrosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        SiniestrosView sv = new SiniestrosView();
        sv.setVisible(true);
        escritorio.add(sv);
        escritorio.moveToFront(sv);
    }//GEN-LAST:event_JMItemSiniestrosActionPerformed

    private void JMIGestionDeBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestionDeBrigadasActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        BusquedaYModificacionDeBrigadasView mybdbv = new BusquedaYModificacionDeBrigadasView();
        mybdbv.setVisible(true);
        escritorio.add(mybdbv);
        escritorio.moveToFront(mybdbv);
    }//GEN-LAST:event_JMIGestionDeBrigadasActionPerformed

    private void JMIHistorialDeSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIHistorialDeSiniestrosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        HistorialDeEventosView hdsv = new HistorialDeEventosView();
        hdsv.setVisible(true);
        escritorio.add(hdsv);
        escritorio.moveToFront(hdsv);
    }//GEN-LAST:event_JMIHistorialDeSiniestrosActionPerformed

    private void JMIInformacionDeCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIInformacionDeCuartelActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        InformacionDeBrigadasEnCuartelView idcv = new InformacionDeBrigadasEnCuartelView();
        idcv.setVisible(true);
        escritorio.add(idcv);
        escritorio.moveToFront(idcv);
    }//GEN-LAST:event_JMIInformacionDeCuartelActionPerformed

    private void JMICargaDePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICargaDePersonalActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        CargaDePersonalView cdpv = new CargaDePersonalView();
        cdpv.setVisible(true);
        escritorio.add(cdpv);
        escritorio.moveToFront(cdpv);
    }//GEN-LAST:event_JMICargaDePersonalActionPerformed

    private void JMIGestionDePersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestionDePersonalActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        GestionDePersonalView gdpv = new GestionDePersonalView();
        gdpv.setVisible(true);
        escritorio.add(gdpv);
        escritorio.moveToFront(gdpv);
    }//GEN-LAST:event_JMIGestionDePersonalActionPerformed

    private void JMIGestionDeCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIGestionDeCuartelesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        GestionDeCuartelesView gdcv = new GestionDeCuartelesView();
        gdcv.setVisible(true);
        escritorio.add(gdcv);
        escritorio.moveToFront(gdcv);
    }//GEN-LAST:event_JMIGestionDeCuartelesActionPerformed

    private void JMIRevisarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIRevisarBrigadasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        RevisarBrigadasView rbv = new RevisarBrigadasView();
        rbv.setVisible(true);
        escritorio.add(rbv);
        escritorio.moveToFront(rbv);
    }//GEN-LAST:event_JMIRevisarBrigadasActionPerformed

    private void JMIPersonalEnBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIPersonalEnBrigadasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        PersonalEnBrigadasView pebv = new PersonalEnBrigadasView();
        pebv.setVisible(true);
        escritorio.add(pebv);
        escritorio.moveToFront(pebv);
    }//GEN-LAST:event_JMIPersonalEnBrigadasActionPerformed

    private void JMIAsignacionDeCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAsignacionDeCuartelesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        cambiarfondo();
        AsignacionDeCuartelesView1 adcv = new AsignacionDeCuartelesView1();
        adcv.setVisible(true);
        escritorio.add(adcv);
        escritorio.moveToFront(adcv);
    }//GEN-LAST:event_JMIAsignacionDeCuartelesActionPerformed

    private void JMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMSalirMouseClicked
        this.dispose();

    }//GEN-LAST:event_JMSalirMouseClicked

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
    private javax.swing.JMenuItem JMIInformacionDeCuartel;
    private javax.swing.JMenuItem JMIPersonalEnBrigadas;
    private javax.swing.JMenuItem JMIRevisarBrigadas;
    private javax.swing.JMenuItem JMItemSiniestros;
    private javax.swing.JMenu JMSalir;
    private javax.swing.JMenu JMSiniestros;
    private javax.swing.JMenu JMUnidades;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel fondito;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void cambiarColor() {

        escritorio.setBackground(new Color(40, 42, 54 ));
//                                  87, 35, 100            188, 146, 248             40, 42, 54           78, 73, 102
    }
    
    private void cambiarfondo(){
        JLayeredPane base = new JLayeredPane();
        base.setBounds(0,0,escritorio.getWidth(), escritorio.getHeight());
        
        fondito.setBounds(0,0, escritorio.getWidth(), escritorio.getHeight());
        fondito.setOpaque(true);
        
        base.add(fondito, Integer.valueOf(0));
        escritorio.add(base);
        
    }

}

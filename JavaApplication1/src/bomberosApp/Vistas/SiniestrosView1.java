/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Siniestro;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class SiniestrosView1 extends javax.swing.JInternalFrame {

    private SiniestroData sd = new SiniestroData();
    private Siniestro siniestro = new Siniestro();
    private List<Siniestro> listarSiniestros = sd.ListarSiniestro();
    
    
    public SiniestrosView1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTCodigo = new javax.swing.JTextField();
        JCBAsignarBrigada = new javax.swing.JComboBox<>();
        JRBEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTDetallesDelSiniestro = new javax.swing.JTextPane();
        JTFCoordX = new javax.swing.JTextField();
        JTFCoordY = new javax.swing.JTextField();
        JDCFechaInicio = new com.toedter.calendar.JDateChooser();
        JDCFechaDeResolucion = new com.toedter.calendar.JDateChooser();
        JBBuscar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JBGuardarNuevoSiniestro = new javax.swing.JButton();
        jCBoxTipoSiniestro = new javax.swing.JComboBox<>();
        JCBCalificacion = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Siniestros");

        jLabel1.setText("Codigo/ID");

        jLabel2.setText("Fecha de Inicio");

        jLabel3.setText("Coordenadas X");

        jLabel4.setText("Tipo De Siniestro");

        jLabel5.setText("Asignar Brigada");

        jLabel7.setText("Fecha de Resolucion");

        jLabel9.setText("Coordenadas Y");

        jLabel10.setText("Calificacion");

        JRBEstado.setText("Marcar si esta en curso");

        jLabel6.setText("Detalles Del Siniestro");

        jScrollPane1.setViewportView(JTDetallesDelSiniestro);

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBGuardarNuevoSiniestro.setText("Guardar nuevo Siniestro");
        JBGuardarNuevoSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarNuevoSiniestroActionPerformed(evt);
            }
        });

        jCBoxTipoSiniestro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Incendio", "Derrumbe", "Rescate en Montaña", "Rescate en Accidente", "Inundación", "Prevención" }));
        jCBoxTipoSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxTipoSiniestroActionPerformed(evt);
            }
        });

        JCBCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCFechaDeResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(JCBCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(JBGuardarNuevoSiniestro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBModificar)
                                .addGap(184, 184, 184)
                                .addComponent(JBSalir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCBoxTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(JRBEstado)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(JBBuscar))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jCBoxTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCBCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JDCFechaDeResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(17, 17, 17)
                .addComponent(JRBEstado)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBModificar)
                    .addComponent(JBGuardarNuevoSiniestro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarNuevoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarNuevoSiniestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBGuardarNuevoSiniestroActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        // TODO add your handling code here:
        try {
            Brigada brigada = new Brigada();
            
            siniestro.setCoord_X(Integer.parseInt(JTFCoordX.getText()));
            siniestro.setCoord_Y(Integer.parseInt(JTFCoordY.getText()));
            siniestro.setFecha_siniestro(JDCFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setTipo((String)jCBoxTipoSiniestro.getSelectedItem());
            siniestro.setDetalles(JTDetallesDelSiniestro.getText());
            brigada.setId_brigada((int)JCBAsignarBrigada.getSelectedItem());                    
            siniestro.setBrigada(brigada);
            siniestro.setFecha_resolucion(JDCFechaDeResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setCalificacion((int)JCBCalificacion.getSelectedItem());
             if (siniestro.isEstado()) {
                    JRBEstado.setSelected(true);
                }
                if (siniestro.isEstado() == false) {
                    JRBEstado.setSelected(false);
                }
                
             sd.ModificarSiniestro(siniestro);
             limpiar();
             
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacios"+ex.getMessage());
            limpiar();
        } catch (NumberFormatException ex2){
            JOptionPane.showMessageDialog(this, "El dni debe ser un numero"+ ex2.getMessage());
            limpiar();
        }
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        // TODO add your handling code here:
       
        try {
            int id = Integer.parseInt(JTCodigo.getText());
            Siniestro sini = sd.BuscarSiniestroPorID(id);
            
            if(sini != null){
                JTFCoordX.setText(String.valueOf(sini.getCoord_X()));
                JTFCoordY.setText(String.valueOf(sini.getCoord_Y()));
                JDCFechaInicio.setDate(Date.from(sini.getFecha_siniestro().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                jCBoxTipoSiniestro.setSelectedItem(sini.getTipo());
                JTDetallesDelSiniestro.setText(sini.getDetalles());
                JCBAsignarBrigada.setSelectedItem(sini.getBrigada()); //REVISAR SI FALTA ID
                
                
                JDCFechaDeResolucion.setDate(Date.from(sini.getFecha_resolucion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                JCBCalificacion.setSelectedItem(sini.getCalificacion());
                
                if (sini.isEstado()) {
                    JRBEstado.setSelected(true);
                }
                if (sini.isEstado() == false) {
                    JRBEstado.setSelected(false);
                }
                
                
            }
            
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacios"+ex.getMessage());
            limpiar();
        } catch (NumberFormatException ex2){
            JOptionPane.showMessageDialog(this, "El dni debe ser un numero"+ ex2.getMessage());
            limpiar();
        }
        
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void jCBoxTipoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxTipoSiniestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxTipoSiniestroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBGuardarNuevoSiniestro;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBAsignarBrigada;
    private javax.swing.JComboBox<String> JCBCalificacion;
    private com.toedter.calendar.JDateChooser JDCFechaDeResolucion;
    private com.toedter.calendar.JDateChooser JDCFechaInicio;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTCodigo;
    private javax.swing.JTextPane JTDetallesDelSiniestro;
    private javax.swing.JTextField JTFCoordX;
    private javax.swing.JTextField JTFCoordY;
    private javax.swing.JComboBox<String> jCBoxTipoSiniestro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
    JTFCoordX.setText("");
    JTFCoordY.setText("");
    JTCodigo.setText("");
    
    
    }

}

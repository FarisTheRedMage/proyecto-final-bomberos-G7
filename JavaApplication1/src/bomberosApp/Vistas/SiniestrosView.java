package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Siniestro;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestrosView extends javax.swing.JInternalFrame {

    private SiniestroData sd = new SiniestroData();
    private Siniestro siniestro;
    private List<Siniestro> listarSiniestros = sd.ListarSiniestro();

    private Brigada brigada = new Brigada();
    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();

    public SiniestrosView() {
        initComponents();
        llenarComboBox();
        siniestro = new Siniestro();
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
        jRadioButton1 = new javax.swing.JRadioButton();

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

        JCBCalificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jRadioButton1.setText("Marcar para NO asignar Brigada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBGuardarNuevoSiniestro)
                        .addGap(99, 99, 99)
                        .addComponent(JBModificar)
                        .addGap(250, 250, 250)
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(JTFCoordY))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBoxTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JDCFechaDeResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JCBCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JRBEstado))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JCBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(JBBuscar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCBoxTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JCBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JDCFechaDeResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JCBCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JRBEstado)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBModificar)
                    .addComponent(JBGuardarNuevoSiniestro))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//funca
    private void JBGuardarNuevoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarNuevoSiniestroActionPerformed

        try {
            Brigada b1 = new Brigada();
            siniestro.setCoord_X(Double.parseDouble(JTFCoordX.getText())); //---
            siniestro.setCoord_Y(Double.parseDouble(JTFCoordY.getText())); //----
            siniestro.setFecha_siniestro(JDCFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setTipo((String) jCBoxTipoSiniestro.getSelectedItem());
            siniestro.setDetalles(JTDetallesDelSiniestro.getText());
            b1.setId_brigada(Integer.parseInt((String) JCBAsignarBrigada.getSelectedItem()));
            siniestro.setBrigada(b1);
            siniestro.setFecha_resolucion(JDCFechaDeResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setCalificacion((int) JCBCalificacion.getSelectedItem());

            if (JRBEstado.isSelected() == true) {
                siniestro.setEstado(true);
            } else {
                siniestro.setEstado(false);
            }

            sd.ModificarSiniestro(siniestro);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos " + e.getMessage());
        }
    }//GEN-LAST:event_JBGuardarNuevoSiniestroActionPerformed
//funca
    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        try {
            // Recopila y asigna datos de la interfaz a la entidad Siniestro.
            siniestro.setId_siniestro(Integer.parseInt(JTCodigo.getText()));

            siniestro.setCoord_X(Double.parseDouble(JTFCoordX.getText())); //---
            siniestro.setCoord_Y(Double.parseDouble(JTFCoordY.getText())); //----

            siniestro.setFecha_siniestro(JDCFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            siniestro.setTipo((String) jCBoxTipoSiniestro.getSelectedItem());
            siniestro.setDetalles(JTDetallesDelSiniestro.getText());
            Brigada brigadaSeleccionada = (Brigada) JCBAsignarBrigada.getSelectedItem();
            siniestro.setBrigada(brigadaSeleccionada);

            if (JDCFechaDeResolucion.getDate() != null) {
                siniestro.setFecha_resolucion(JDCFechaDeResolucion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } else {
                siniestro.setFecha_resolucion(null);  // Permite fecha_resolución como null.
            }

            // Procesa la calificación si se selecciona una Sino null.
            Integer calificacion = null;
            Object selectedCalificacion = JCBCalificacion.getSelectedItem();
            if (selectedCalificacion != null) {
                if (selectedCalificacion instanceof Integer) {
                    calificacion = (Integer) selectedCalificacion;
                } else {
                    calificacion = Integer.parseInt(selectedCalificacion.toString());
                }
            }
            siniestro.setCalificacion(calificacion);
            // Actualiza la fecha de resolución en la interfaz si es null.
            if (siniestro.getFecha_resolucion() == null) {
                JDCFechaDeResolucion.setDate(null);
            } else {
                JDCFechaDeResolucion.setDate(Date.from(siniestro.getFecha_resolucion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
            }
            siniestro.setEstado(JRBEstado.isSelected());

            // Llama al método pa modificar
            sd.ModificarSiniestro(siniestro);
            limpiar();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos" + ex.getMessage());
            limpiar();

//            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El campo debe ser un número");
            limpiar();
//            ex.printStackTrace();
        }
    }//GEN-LAST:event_JBModificarActionPerformed
//funca
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
//funca
    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed

        try {
            int id = Integer.parseInt(JTCodigo.getText());
            Siniestro sini = sd.BuscarSiniestroPorID(id);

            if (sini != null) {
                JTFCoordX.setText(String.valueOf(sini.getCoord_X()));
                JTFCoordY.setText(String.valueOf(sini.getCoord_Y()));
                JDCFechaInicio.setDate(Date.from(sini.getFecha_siniestro().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                jCBoxTipoSiniestro.setSelectedItem(sini.getTipo());
                JTDetallesDelSiniestro.setText(sini.getDetalles());
                JCBAsignarBrigada.setSelectedIndex(sini.getBrigada().getId_brigada()-1); 

                if (sini.getFecha_resolucion() == null) {
                    JDCFechaDeResolucion.setDate(null);
                } else {
                    JDCFechaDeResolucion.setDate(Date.from(sini.getFecha_resolucion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                }
                
                JCBCalificacion.setSelectedIndex(sini.getCalificacion());
                
                if (sini.isEstado()) {
                    JRBEstado.setSelected(true);
                }
                if (!sini.isEstado()) {
                    JRBEstado.setSelected(false);
                }
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacios" + ex.getMessage());
            limpiar();
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(this, "El dni debe ser un numero" + ex2.getMessage());
            limpiar();
        }

    }//GEN-LAST:event_JBBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBGuardarNuevoSiniestro;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Brigada> JCBAsignarBrigada;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        JTCodigo.setText("");
        JTFCoordX.setText("");
        JTFCoordY.setText("");
        JTDetallesDelSiniestro.setText("");
        JRBEstado.setSelected(false);
        jCBoxTipoSiniestro.setSelectedIndex(0);
        JCBAsignarBrigada.setSelectedIndex(0);
        JCBCalificacion.setSelectedIndex(0);

        JDCFechaDeResolucion.setDate(null);//
        JDCFechaInicio.setDate(null);//
    }

    private void llenarComboBox() {
        JCBAsignarBrigada.removeAllItems();
        
        for (Brigada listarBrigada : listarBrigada) {
            JCBAsignarBrigada.addItem(listarBrigada);
           
        }
    }

}

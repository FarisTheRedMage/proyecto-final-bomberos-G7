package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Siniestro;
import java.awt.Color;
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
        cambiarColor();
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
        JRBBrigadaNull = new javax.swing.JRadioButton();
        JRBMostrarBrigadas = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Siniestros");

        jLabel1.setText("Buscar Por Codigo/ID de Siniestro");

        jLabel2.setText("Fecha de Inicio");

        jLabel3.setText("Coordenadas X");

        jLabel4.setText("Tipo De Siniestro");

        jLabel5.setText("Asignar Brigada");

        jLabel7.setText("Fecha de Resolucion");

        jLabel9.setText("Coordenadas Y");

        jLabel10.setText("Calificacion");

        JCBAsignarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAsignarBrigadaActionPerformed(evt);
            }
        });

        JRBEstado.setText("Marcar si esta en curso");

        jLabel6.setText("Detalles Del Siniestro");

        jScrollPane1.setViewportView(JTDetallesDelSiniestro);

        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBSalir.png.png"))); // NOI18N
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

        JRBBrigadaNull.setText("Sin Brigada");

        JRBMostrarBrigadas.setText("Mostrar Brigadas");
        JRBMostrarBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMostrarBrigadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JDCFechaDeResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBGuardarNuevoSiniestro)
                                        .addGap(99, 99, 99)
                                        .addComponent(JBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JRBEstado)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JRBBrigadaNull)
                                .addGap(43, 43, 43)
                                .addComponent(JRBMostrarBrigadas))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBBrigadaNull)
                    .addComponent(JRBMostrarBrigadas))
                .addGap(18, 18, 18)
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
                .addContainerGap(32, Short.MAX_VALUE))
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

            if (JRBBrigadaNull.isSelected()) {
                siniestro.setBrigada(null);
            } else {
                b1 = (Brigada) JCBAsignarBrigada.getSelectedItem();
                siniestro.setBrigada(b1);

            }

            Date fecha = JDCFechaDeResolucion.getDate();
            if (fecha != null) {
                siniestro.setFecha_resolucion(fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } else {
                siniestro.setFecha_resolucion(null);
            }

            if (JCBCalificacion.getSelectedIndex() == 0) {
                siniestro.setCalificacion(0);
            } else {
                siniestro.setCalificacion(Integer.parseInt(JCBCalificacion.getSelectedItem().toString()));
            }

            if (JRBEstado.isSelected() == true) {
                siniestro.setEstado(true);
            } else {
                siniestro.setEstado(false);
            }
            sd.GuardarSiniestro(siniestro);
            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número. " + e.getMessage());
            limpiar();
            e.printStackTrace();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBGuardarNuevoSiniestroActionPerformed
//funca
    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        try {
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

            //VER - PERO FUNCIONA!!!
            Integer calificacion = null;
            Object selectedCalificacion = JCBCalificacion.getSelectedItem();
            if (selectedCalificacion != null) {
                if (selectedCalificacion instanceof Integer) {
                    calificacion = (Integer) selectedCalificacion;
                } else if (selectedCalificacion instanceof String) {
                    String calificacionStr = (String) selectedCalificacion;
                    if (!calificacionStr.isEmpty()) {
                        try {
                            calificacion = Integer.parseInt(calificacionStr);
                        } catch (NumberFormatException ex) {
                            // Manejar la conversión fallida, por ejemplo, mostrando un mensaje de error.
                            JOptionPane.showMessageDialog(this, "Calificación no válida");
                        }
                    }
                }
            }

// Verificar si calificacion es nulo y asignar un valor predeterminado si es necesario
            if (calificacion == null) {
                calificacion = 0; // O cualquier otro valor predeterminado que desees
            }

            siniestro.setCalificacion(calificacion);
            if (siniestro.getFecha_resolucion() == null) {
                JDCFechaDeResolucion.setDate(null);
            } else {
                JDCFechaDeResolucion.setDate(Date.from(siniestro.getFecha_resolucion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
            }
            siniestro.setEstado(JRBEstado.isSelected());

            if (JRBBrigadaNull.isSelected()) {
                siniestro.setBrigada(null);
            } else {
                // Obtiene la brigada seleccionada del JComboBox
                Brigada brigadaSELECT = (Brigada) JCBAsignarBrigada.getSelectedItem();
                siniestro.setBrigada(brigadaSELECT);
            }

            sd.ModificarSiniestro(siniestro);
            limpiar();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos" + ex.getMessage());
            ex.printStackTrace();
            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El campo debe ser un número");
            ex.printStackTrace();
            limpiar();
        }
    }//GEN-LAST:event_JBModificarActionPerformed
//funca
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
//FUNCA!!!!!!!!
    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed

        try {
            Siniestro sini = null;
            int id = Integer.parseInt(JTCodigo.getText());
            sini = sd.BuscarSiniestroPorID(id);//LA SOLUCION ERA USAR EL METODO NUEVO DE ID

            if (sini != null) {
                JTFCoordX.setText(String.valueOf(sini.getCoord_X()));
                JTFCoordY.setText(String.valueOf(sini.getCoord_Y()));
                JDCFechaInicio.setDate(Date.from(sini.getFecha_siniestro().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                jCBoxTipoSiniestro.setSelectedItem(sini.getTipo());
                
                if (sini.getBrigada() != null) {
                    JCBAsignarBrigada.setSelectedItem(sini.getBrigada());
                  
                    JRBBrigadaNull.setSelected(false);
                } else {
                    JCBAsignarBrigada.setSelectedItem(null);
                    
                    JRBBrigadaNull.setSelected(true);
                }

                JTDetallesDelSiniestro.setText(sini.getDetalles());
                llenarComboBox();

                if (sini.getFecha_resolucion() == null) {
                    JDCFechaDeResolucion.setDate(null);
                } else {
                    JDCFechaDeResolucion.setDate(Date.from(sini.getFecha_resolucion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                }

                JCBCalificacion.setSelectedIndex(sini.getCalificacion());

                if (sini.isEstado() != null) {
                    if (sini.isEstado()) {
                        JRBEstado.setSelected(true);
                    } else {
                        JRBEstado.setSelected(false);
                    }
                }
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No deje campos vacios" + ex.getMessage());
            limpiar();
            ex.printStackTrace();
        } catch (NumberFormatException ex2) {
            JOptionPane.showMessageDialog(this, "El dni debe ser un numero" + ex2.getMessage());
            limpiar();
        }
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JCBAsignarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAsignarBrigadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBAsignarBrigadaActionPerformed

    private void JRBMostrarBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMostrarBrigadasActionPerformed
        llenarComboBox();
    }//GEN-LAST:event_JRBMostrarBrigadasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBGuardarNuevoSiniestro;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Brigada> JCBAsignarBrigada;
    private javax.swing.JComboBox<String> JCBCalificacion;
    private com.toedter.calendar.JDateChooser JDCFechaDeResolucion;
    private com.toedter.calendar.JDateChooser JDCFechaInicio;
    private javax.swing.JRadioButton JRBBrigadaNull;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JRadioButton JRBMostrarBrigadas;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        JTCodigo.setText("");
        JTFCoordX.setText("");
        JTFCoordY.setText("");
        JTDetallesDelSiniestro.setText("");
        JRBEstado.setSelected(false);
        JRBBrigadaNull.setSelected(false);
        jCBoxTipoSiniestro.setSelectedIndex(0);
        JCBAsignarBrigada.setSelectedIndex(0);
        JCBCalificacion.setSelectedIndex(0);
        JDCFechaDeResolucion.setDate(null);//
        JDCFechaInicio.setDate(null);//
    }

    private void llenarComboBox() {
        JCBAsignarBrigada.removeAllItems();
        
        if(!JTCodigo.getText().isEmpty()){
            siniestro = sd.BuscarSiniestroPorID(Integer.parseInt(JTCodigo.getText()));
            siniestro.getBrigada();
               if (siniestro.getBrigada() != null && !JRBMostrarBrigadas.isSelected()) {
                JCBAsignarBrigada.addItem(siniestro.getBrigada());
                
            } else {
                for (Brigada brigadas : listarBrigada) {
                    JCBAsignarBrigada.addItem(brigadas);
                }

            }
        } else {
            for (Brigada brigadas : listarBrigada) {
                JCBAsignarBrigada.addItem(brigadas);
            
        
//        if (!JTCodigo.getText().isEmpty()) {
//            int siniestroId = Integer.parseInt(JTCodigo.getText());
//            Siniestro siniestro = sd.BuscarSiniestro_ID_NUEVO(siniestroId); //APARECEN LOS DATOS EN NULL MENOS EL ID_BRIGADA
//
//            if (siniestro.getBrigada() != null) {
//                JCBAsignarBrigada.addItem(siniestro.getBrigada());
//            }
//        } else {
//            List<Brigada> brigadas = listarBrigada;
//            if (brigadas != null) {
//                for (Brigada brigada : brigadas) {
//                    JCBAsignarBrigada.addItem(brigada);
//                }
            }
        }
    }

    
      private void cambiarColor(){
       
          
          
    this.getContentPane().setBackground(new Color(78, 73, 102));
        
        jLabel1.setForeground(new Color(200, 214, 214));
        jLabel2.setForeground(new Color(200, 214, 214));
        jLabel3.setForeground(new Color(200, 214, 214));
        jLabel4.setForeground(new Color(200, 214, 214));
        jLabel5.setForeground(new Color(200, 214, 214));
        jLabel6.setForeground(new Color(200, 214, 214));
        jLabel7.setForeground(new Color(200, 214, 214));
        jLabel9.setForeground(new Color(200, 214, 214));
        jLabel10.setForeground(new Color(200, 214, 214));
        
        
        JBBuscar.setBackground(new Color(50, 47, 65));
        JBBuscar.setForeground(new Color(200, 214, 214));

        JBGuardarNuevoSiniestro.setBackground(new Color(50, 47, 65));
        JBGuardarNuevoSiniestro.setForeground(new Color(200, 214, 214));
        
         JBModificar.setBackground(new Color(50, 47, 65));
        JBModificar.setForeground(new Color(200, 214, 214));
        
         JBSalir.setBackground(new Color(50, 47, 65));
        JBSalir.setForeground(new Color(200, 214, 214));
        
   }
    
    
}

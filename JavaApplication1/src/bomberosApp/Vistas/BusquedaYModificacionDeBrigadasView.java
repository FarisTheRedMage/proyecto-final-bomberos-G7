package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class BusquedaYModificacionDeBrigadasView extends javax.swing.JInternalFrame {

    private Cuartel cuartel = new Cuartel();
    private CuartelData cuartelData = new CuartelData();
    private List<Cuartel> listarCuarteles = cuartelData.ListarCuarteles();

    private Brigada brigada = new Brigada();
    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigadas = brigadaData.ListarBrigada();

    public BusquedaYModificacionDeBrigadasView() {
        initComponents();
        llenarJCBCuartel();
        cambiarColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBBuscar = new javax.swing.JButton();
        JTFNombreBrigada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFidCuartel = new javax.swing.JTextField();
        JTFEspecialidad = new javax.swing.JTextField();
        JRBEstado = new javax.swing.JRadioButton();
        JBModificar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBDisponibilidad = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JBBuscarPorIDCuartel = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JCBCuarteles = new javax.swing.JComboBox<>();
        JBLimpiar = new javax.swing.JButton();
        JRBMostrarCuarteles = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Busqueda Y Modificacion De Brigadas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Codigo/ID Brigada");

        JBBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Nombre Brigada");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Cuartel");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Especialidad");

        JRBEstado.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEstado.setText("Estado");

        JBModificar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBGuardar.jpg"))); // NOI18N
        JBModificar.setText("Guardar Modificaciones");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBSalir.png.png"))); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBDisponibilidad.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBDisponibilidad.setText("Disponibilidad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("ID/ Codigo Cuartel");

        JBBuscarPorIDCuartel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBBuscarPorIDCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBBuscar.jpg"))); // NOI18N
        JBBuscarPorIDCuartel.setText("Buscar");
        JBBuscarPorIDCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorIDCuartelActionPerformed(evt);
            }
        });

        JBNuevo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        jLabel2.setText("*_En caso de crear nueva brigada primero Buscar un Cuartel por ID");

        JBLimpiar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBLimpiar.setText("Limpiar Campos");
        JBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActionPerformed(evt);
            }
        });

        JRBMostrarCuarteles.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBMostrarCuarteles.setText("Mostrar Cuarteles");
        JRBMostrarCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMostrarCuartelesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBModificar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JTFidCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(JBBuscarPorIDCuartel))
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JRBEstado)
                                            .addGap(74, 74, 74)
                                            .addComponent(JRBDisponibilidad)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBMostrarCuarteles)
                            .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar)
                    .addComponent(jLabel6)
                    .addComponent(JTFidCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscarPorIDCuartel))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBEstado)
                    .addComponent(JRBDisponibilidad)
                    .addComponent(JRBMostrarCuarteles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBModificar)
                    .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//funca
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
//funca
    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed

        try {

            int id = Integer.parseInt(JTFCodigo.getText());
            Brigada brigadita = brigadaData.BuscarBrigada(id);

            if (brigadita != null) {

                JTFNombreBrigada.setText(brigadita.getNombre_brigada());
                JTFEspecialidad.setText(brigadita.getEspecialidad());
                JRBEstado.setSelected(brigadita.isEstado());
                JRBDisponibilidad.setSelected(brigadita.isDisponibilidad());
                JTFidCuartel.setText(brigadita.getCuartel().getId_cuartel() + "");
                // Carga el JComboBox de cuarteles con los cuarteles asociados a la brigada
                JCBCuarteles.removeAllItems();
                if (!JTFidCuartel.getText().isEmpty()) {
                    int idCuartel = Integer.parseInt(JTFidCuartel.getText());
                    cuartel = cuartelData.BuscarCuartelPorId(idCuartel);

                    if (cuartel != null) {
                        JCBCuarteles.addItem(cuartel);
                        JCBCuarteles.setSelectedItem(cuartel);
                    }
                }

            } else {

                JOptionPane.showMessageDialog(this, "No se encontró una Brigada con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }


    }//GEN-LAST:event_JBBuscarActionPerformed
//funca
    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed

        try {
            Cuartel c1 = new Cuartel();
            brigada.setId_brigada(Integer.parseInt(JTFCodigo.getText()));
            brigada.setNombre_brigada(JTFNombreBrigada.getText());
            brigada.setEspecialidad(JTFEspecialidad.getText());
            brigada.setEstado(JRBEstado.isSelected());
            brigada.setDisponibilidad(JRBDisponibilidad.isSelected());
            
            Cuartel cuartelSeleccionado = (Cuartel) JCBCuarteles.getSelectedItem();
            brigada.setCuartel(cuartelSeleccionado);

            c1.setId_cuartel(Integer.parseInt(JTFidCuartel.getText()));
            brigada.setCuartel(c1);

            if (JRBEstado.isSelected() == true) {
                brigada.setEstado(true);
            } else {
                brigada.setEstado(false);
            }

            if (JRBDisponibilidad.isSelected() == true) {
                brigada.setDisponibilidad(true);
            } else {
                brigada.setDisponibilidad(false);
            }
            brigadaData.ModificarBrigada(brigada);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos " + e.getMessage());
        }
    }//GEN-LAST:event_JBModificarActionPerformed
//funca-id cuartel
    private void JBBuscarPorIDCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorIDCuartelActionPerformed

        try {
            JCBCuarteles.removeAllItems();
            if (!JTFidCuartel.getText().isEmpty()) {
                int idCuartel = Integer.parseInt(JTFidCuartel.getText());
                cuartel = cuartelData.BuscarCuartelPorId(idCuartel);

                if (cuartel != null) {
                    JCBCuarteles.addItem(cuartel);
                    JCBCuarteles.setSelectedItem(cuartel);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos. " + e.getMessage());
        }
    }//GEN-LAST:event_JBBuscarPorIDCuartelActionPerformed
//funca
    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed

        try {
            Cuartel c1 = new Cuartel();

            brigada.setNombre_brigada(JTFNombreBrigada.getText());
            brigada.setEspecialidad(JTFEspecialidad.getText());

            if (JRBEstado.isSelected() == true) {
                brigada.setEstado(true);
            } else {
                brigada.setEstado(false);
            }

            c1.setId_cuartel(Integer.parseInt(JTFidCuartel.getText()));
            brigada.setCuartel(c1);

            if (JRBDisponibilidad.isSelected() == true) {
                brigada.setDisponibilidad(true);
            } else {
                brigada.setDisponibilidad(false);
            }

            brigada.setNombre_cuartel((String) JCBCuarteles.getSelectedItem());

            brigadaData.GuardarBrigada(brigada);

            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido. " + e.getMessage());
//            e.printStackTrace();

            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos. " + e.getMessage());
            //e.printStackTrace();
        }
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActionPerformed

        limpiar();
        llenarJCBCuartel();
    }//GEN-LAST:event_JBLimpiarActionPerformed

    private void JRBMostrarCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMostrarCuartelesActionPerformed
        llenarJCBCuartel();
    }//GEN-LAST:event_JRBMostrarCuartelesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBBuscarPorIDCuartel;
    private javax.swing.JButton JBLimpiar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Cuartel> JCBCuarteles;
    private javax.swing.JRadioButton JRBDisponibilidad;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JRadioButton JRBMostrarCuarteles;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFEspecialidad;
    private javax.swing.JTextField JTFNombreBrigada;
    private javax.swing.JTextField JTFidCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void llenarJCBCuartel() {
        JCBCuarteles.removeAllItems();

        if (!JTFCodigo.getText().isEmpty()) {
            brigada = brigadaData.BuscarBrigada(Integer.parseInt(JTFCodigo.getText()));
            brigada.getCuartel();
            if (brigada.getCuartel() != null && !JRBMostrarCuarteles.isSelected()) {
                JCBCuarteles.addItem(brigada.getCuartel());

            } else {
                for (Cuartel cuarteles : listarCuarteles) {
                    JCBCuarteles.addItem(cuarteles);
                }

            }
        } else {
            for (Cuartel cuarteles : listarCuarteles) {
                JCBCuarteles.addItem(cuarteles);
            }
        }
    }

    public void limpiar() {
        JTFCodigo.setText("");
        JTFidCuartel.setText("");
        JTFEspecialidad.setText("");
        JTFNombreBrigada.setText("");
        JRBDisponibilidad.setSelected(false);
        JRBEstado.setSelected(false);
    }

    private void cambiarColor() {

        this.getContentPane().setBackground(new Color(78, 73, 102));

        jLabel2.setForeground(new Color(200, 214, 214));
        jLabel1.setForeground(new Color(200, 214, 214));
        jLabel3.setForeground(new Color(200, 214, 214));
        jLabel4.setForeground(new Color(200, 214, 214));
        jLabel5.setForeground(new Color(200, 214, 214));
        jLabel6.setForeground(new Color(200, 214, 214));

        JBBuscar.setBackground(new Color(50, 47, 65));
        JBBuscar.setForeground(new Color(200, 214, 214));

        JBBuscarPorIDCuartel.setBackground(new Color(50, 47, 65));
        JBBuscarPorIDCuartel.setForeground(new Color(200, 214, 214));

        JBModificar.setBackground(new Color(50, 47, 65));
        JBModificar.setForeground(new Color(200, 214, 214));

        JBLimpiar.setBackground(new Color(50, 47, 65));
        JBLimpiar.setForeground(new Color(200, 214, 214));

        JBNuevo.setBackground(new Color(50, 47, 65));
        JBNuevo.setForeground(new Color(200, 214, 214));

        JBSalir.setBackground(new Color(50, 47, 65));
        JBSalir.setForeground(new Color(200, 214, 214));
    }

}

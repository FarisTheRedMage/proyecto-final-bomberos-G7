package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.time.ZoneId;
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
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBDisponibilidad = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JTFCuartelito = new javax.swing.JTextField();
        JBBuscarPorIDCuartel = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Busqueda Y Modificacion De Brigadas");

        jLabel1.setText("Codigo/ID Brigada");

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Brigada");

        jLabel4.setText("Cuartel");

        jLabel5.setText("Especialidad");

        JTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoActionPerformed(evt);
            }
        });

        JTFidCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidCuartelActionPerformed(evt);
            }
        });

        JTFEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEspecialidadActionPerformed(evt);
            }
        });

        JRBEstado.setText("Estado");

        JBGuardar.setText("Guardar Modificaciones");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBDisponibilidad.setText("Disponibilidad");

        jLabel6.setText("ID/ Codigo Cuartel");

        JTFCuartelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCuartelitoActionPerformed(evt);
            }
        });

        JBBuscarPorIDCuartel.setText("Buscar");
        JBBuscarPorIDCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarPorIDCuartelActionPerformed(evt);
            }
        });

        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*_En caso de crear nueva brigada primero Buscar un Cuartel por ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 395, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JRBEstado)
                                .addGap(57, 57, 57)
                                .addComponent(JRBDisponibilidad))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFCuartelito, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFidCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBBuscarPorIDCuartel))
                                    .addComponent(jLabel2))))
                        .addGap(51, 51, 51))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(JTFCuartelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBEstado)
                    .addComponent(JRBDisponibilidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBGuardar)
                    .addComponent(JBNuevo))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                JTFCuartelito.setText(brigadita.getNombre_cuartel());
                JTFidCuartel.setText(String.valueOf(brigadita.getCuartel().getId_cuartel()));

            } else {

                JOptionPane.showMessageDialog(this, "No se encontró una Brigada con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }

    }//GEN-LAST:event_JBBuscarActionPerformed
//funca
    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed

        try {
            Cuartel c1 = new Cuartel();
            brigada.setId_brigada(Integer.parseInt(JTFCodigo.getText()));
            brigada.setNombre_brigada(JTFNombreBrigada.getText());
            brigada.setEspecialidad(JTFEspecialidad.getText());
            brigada.setEstado(JRBEstado.isSelected());
            brigada.setDisponibilidad(JRBDisponibilidad.isSelected());
            brigada.setNombre_cuartel(JTFCuartelito.getText());
            c1.setId_cuartel(Integer.parseInt(JTFidCuartel.getText()));
            brigada.setCuartel(c1);

            if (JRBEstado.isSelected() == true) {
                brigada.setEstado(true);
            } else {
                brigada.setEstado(false);
            }

            if (JRBDisponibilidad.isSelected() == true) {
                brigada.setEstado(true);
            } else {
                brigada.setEstado(false);
            }
            brigadaData.ModificarBrigada(brigada);
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos " + e.getMessage());
        }
    }//GEN-LAST:event_JBGuardarActionPerformed
//funca pero se cambia el valor que le ingresas de 1 a 2.
    private void JBBuscarPorIDCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarPorIDCuartelActionPerformed

        try {
            int id = Integer.parseInt(JTFidCuartel.getText());
            CuartelData cuartelData = new CuartelData();
            Cuartel cuartelito = new Cuartel();
            cuartelito =  cuartelData.BuscarCuartelPorId(id);
              //Brigada brigadita = brigadaData.BuscarBrigada(id);
            if (cuartelito != null) {
                
                JTFidCuartel.setText(String.valueOf(cuartelito.getId_cuartel()));
                JTFCuartelito.setText(cuartelito.getNombre_cuartel());

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
            printStackTrace();
        }

    }//GEN-LAST:event_JBBuscarPorIDCuartelActionPerformed
//
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
            
            brigada.setNombre_cuartel(JTFCuartelito.getText());

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

    private void JTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCodigoActionPerformed

    private void JTFidCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidCuartelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidCuartelActionPerformed

    private void JTFCuartelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCuartelitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCuartelitoActionPerformed

    private void JTFEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEspecialidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBBuscarPorIDCuartel;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBDisponibilidad;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFCuartelito;
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

    public void limpiar() {
        JTFCodigo.setText("");
        JTFidCuartel.setText("");
        JTFEspecialidad.setText("");
        JTFNombreBrigada.setText("");
        JRBDisponibilidad.setSelected(false);
        JRBEstado.setSelected(false);
    }

}

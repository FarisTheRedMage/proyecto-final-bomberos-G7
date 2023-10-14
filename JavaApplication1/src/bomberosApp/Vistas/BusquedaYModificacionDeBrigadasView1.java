
package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import java.util.List;
import javax.swing.JOptionPane;

public class BusquedaYModificacionDeBrigadasView1 extends javax.swing.JInternalFrame {
    
    private Cuartel cuartel = new Cuartel();
    private CuartelData cuartelData = new CuartelData();
    private List<Cuartel> listarCuarteles = cuartelData.ListarCuarteles();
    
 private Brigada brigada = new Brigada();
 private BrigadaData brigadaData = new BrigadaData();
 private List<Brigada> listarBrigadas = brigadaData.ListarBrigada();
    
    public BusquedaYModificacionDeBrigadasView1() {
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
        JTFCuartel = new javax.swing.JTextField();
        JTFEspecialidad = new javax.swing.JTextField();
        JRBEstado = new javax.swing.JRadioButton();
        JBGuardar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBDisponibilidad = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Busqueda Y Modificacion De Brigadas");

        jLabel1.setText("Codigo/ID");

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Brigada");

        jLabel4.setText("Cuartel");

        jLabel5.setText("Especialidad");

        JRBEstado.setText("Estado");

        JBGuardar.setText("Guardar Modificaciones");

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JRBDisponibilidad.setText("Disponibilidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(JBSalir)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFEspecialidad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JRBEstado)
                                .addGap(18, 18, 18)
                                .addComponent(JRBDisponibilidad)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTFNombreBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(JTFCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRBEstado)
                            .addComponent(JRBDisponibilidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBSalir)
                            .addComponent(JBGuardar))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        
         try {
            int id = Integer.parseInt(JTFCodigo.getText());
            Brigada brigadita = brigadaData.BuscarBrigada(id);
            
            
            if (brigadita != null) {
                JTFNombreBrigada.setText(brigadita.getNombre_brigada());
                JTFEspecialidad.setText(String.valueOf(brigadita.getEspecialidad()));
                JRBEstado.setSelected(brigadita.isEstado());
                JTFCuartel.setText(brigadita.getCuartel().getNombre_cuartel());
//                cuartel.setNombre_cuartel((String) JTFCuartel.getText());
//                brigadita.setCuartel(cuartel);
                
//                JTFCuartel.setText(String.valueOf(brigadita.getCuartel().getNombre_cuartel()));
                JRBDisponibilidad.setSelected(brigadita.isDisponibilidad());
           
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Brigada con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBDisponibilidad;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFCuartel;
    private javax.swing.JTextField JTFEspecialidad;
    private javax.swing.JTextField JTFNombreBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

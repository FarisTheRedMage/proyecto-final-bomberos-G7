package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BomberoData;
import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

public class CargaDePersonalView1 extends javax.swing.JInternalFrame {

    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();

    private Bombero bombero = new Bombero();
    private BomberoData bomberoData = new BomberoData();
    private List<Bombero> listarBomberos = bomberoData.ListarBomberos();

    public CargaDePersonalView1() {
        initComponents();
        CargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JRBEstado = new javax.swing.JRadioButton();
        JTFNombre = new javax.swing.JTextField();
        JTFDni = new javax.swing.JTextField();
        JTFApellido = new javax.swing.JTextField();
        JDCFechaNacimiento = new com.toedter.calendar.JDateChooser();
        JTFTelefono = new javax.swing.JTextField();
        JBGuardar = new javax.swing.JButton();
        JCBGrupoSanguineo = new javax.swing.JComboBox<>();
        JCBCodigoDeBrigada = new javax.swing.JComboBox<>();
        JBSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JCBNombreClave = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Carga De Personal");

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre/s");

        jLabel4.setText("Apellido/s");

        jLabel5.setText("Fecha De Nacimiento");

        jLabel6.setText("Grupo Sanguineo");

        jLabel7.setText("Codigo De Brigada");

        jLabel8.setText("Telefono");

        JRBEstado.setText("Estado");

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JCBGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        jLabel10.setText("Asignacion de nombre clave");

        JCBNombreClave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Alfa", "Beta", "Gama", "Omega", "Zetta" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBCodigoDeBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(JCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBSalir)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCBNombreClave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(JRBEstado)))
                                .addGap(57, 57, 57)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(JDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(JCBGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCBCodigoDeBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JCBNombreClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JRBEstado)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBGuardar)
                    .addComponent(JBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try {
            Brigada brigada = new Brigada();
            bombero.setDni(JTFDni.getText());
            bombero.setApellido(JTFApellido.getText());
            bombero.setNombre(JTFNombre.getText());
            bombero.setFecha_nacimiento(JDCFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            brigada.setId_brigada((int) JCBCodigoDeBrigada.getSelectedItem());
            bombero.setBrigada(brigada);
            bombero.setGrupo_sanguineo((String) JCBGrupoSanguineo.getSelectedItem());
            bombero.setNombre_clave((String) JCBNombreClave.getSelectedItem());
            bombero.setCelular(JTFTelefono.getText());

            if (JRBEstado.isSelected() == true) {
                bombero.setEstado(true);
            } else {
                bombero.setEstado(false);
            }
            bomberoData.GuardarBombero(bombero);
            limpiar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " El Dni debe ser un Numero. " + e.getMessage());
            limpiar();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No deje campos Vacios " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Integer> JCBCodigoDeBrigada;
    private javax.swing.JComboBox<String> JCBGrupoSanguineo;
    private javax.swing.JComboBox<String> JCBNombreClave;
    private com.toedter.calendar.JDateChooser JDCFechaNacimiento;
    private javax.swing.JRadioButton JRBEstado;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFDni;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFTelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private void CargarComboBox() {
        JCBCodigoDeBrigada.removeAllItems();

        for (Brigada brigada : listarBrigada) {
            int idBrigada = brigada.getId_brigada();
            JCBCodigoDeBrigada.addItem(idBrigada);
        }
    }

    public void limpiar() {
        JTFApellido.setText("");
        JTFDni.setText("");
        JTFNombre.setText("");
        JTFTelefono.setText("");
        JRBEstado.setSelected(false);
        JCBCodigoDeBrigada.setSelectedIndex(0);
        JCBGrupoSanguineo.setSelectedIndex(0);
        JCBNombreClave.setSelectedIndex(0);
    }

}

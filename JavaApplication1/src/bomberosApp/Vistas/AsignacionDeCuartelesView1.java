package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import bomberosApp.Entidades.Siniestro;
import java.awt.Color;
import java.util.List;

public class AsignacionDeCuartelesView1 extends javax.swing.JInternalFrame {

    private Cuartel cuartelMasCercano = new Cuartel(); //pal metodo
    
    private CuartelData cd = new CuartelData();
    private Cuartel cuartel;
    private List<Cuartel> listarCuarteles = cd.ListarCuarteles();
    
    private SiniestroData sd = new SiniestroData();
    private Siniestro s1;
    private List<Siniestro> listarSiniestros = sd.ListarSiniestro();
    
    private Brigada brigada = new Brigada();
    private BrigadaData brigadaData = new BrigadaData();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();
    
    public AsignacionDeCuartelesView1() {
       
        initComponents();
        llenarComboBoxSiniestro();
        cambiarColor();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBSalir = new javax.swing.JButton();
        JCBSiniestro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JBAsignarBrigada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFCuartelMASCercano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFBrigadaAsignada = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignacion de Cuarteles");

        JBSalir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bomberosApp/Imagenes/JBSalir.png.png"))); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JCBSiniestro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBSiniestroItemStateChanged(evt);
            }
        });
        JCBSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBSiniestroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Elija el Siniestro a Ubicar");

        JBAsignarBrigada.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBAsignarBrigada.setText("Asignar Brigada");
        JBAsignarBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAsignarBrigadaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Cuatel mas cercano");

        JTFCuartelMASCercano.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Brigada asignda");

        JTFBrigadaAsignada.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFBrigadaAsignada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                .addComponent(JTFCuartelMASCercano, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(JBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFCuartelMASCercano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFBrigadaAsignada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAsignarBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//funca!!
    private void JCBSiniestroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBSiniestroItemStateChanged
    }//GEN-LAST:event_JCBSiniestroItemStateChanged

//funca!! - Salir
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed
//funca
    private void JBAsignarBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAsignarBrigadaActionPerformed
        brigadaData.AsignarBrigada(s1);
    }//GEN-LAST:event_JBAsignarBrigadaActionPerformed

    private void JCBSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBSiniestroActionPerformed
         this.s1 = (Siniestro) JCBSiniestro.getSelectedItem();
        designarCuartel();
    }//GEN-LAST:event_JCBSiniestroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAsignarBrigada;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<Siniestro> JCBSiniestro;
    private javax.swing.JTextField JTFBrigadaAsignada;
    private javax.swing.JTextField JTFCuartelMASCercano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBoxSiniestro() {
       
        JCBSiniestro.removeAllItems();
        List<Siniestro> siniestros = sd.ListarSiniestro();

        for (Siniestro siniestro : siniestros) {
            if (siniestro != null && siniestro.getBrigada().getId_brigada() == 0 && !siniestro.isEstado()) {
                JCBSiniestro.addItem(siniestro);
            }
        }
    }
    
    public void designarCuartel() {

        
        //para que funque..
        
// El cuartel debe estar en estado 1.
//La brigada debe estar disponible o sea en 1 .
//La especialidad de la brigada debe ser igual al tipo de siniestro
//id_brigada de siniestro debe estar en null 


        Double distancia1 = null;
        Brigada brigadaAAsignar = new Brigada();
        
        for (Cuartel listarCuartel : listarCuarteles) {
            if (listarCuartel.isEstado()) {
                for (Brigada brigadas : listarBrigada) {
                    if (brigadas.getCuartel().getId_cuartel() == listarCuartel.getId_cuartel() && brigadas.isDisponibilidad() && brigadas.getEspecialidad().equalsIgnoreCase(s1.getTipo())) {
                        distancia1 = Math.sqrt(Math.pow(listarCuartel.getCoord_X() - s1.getCoord_X(), 2) + Math.pow(listarCuartel.getCoord_Y() - s1.getCoord_Y(), 2));
                        break;
                    }
                }
            }
        }
        for (Cuartel listarCuartel : listarCuarteles) {
            if (listarCuartel.isEstado()) {
                for (Brigada brigadas : listarBrigada) {
                    if (brigadas.getCuartel().getId_cuartel() == listarCuartel.getId_cuartel() && brigadas.isDisponibilidad() && brigadas.getEspecialidad().equalsIgnoreCase(s1.getTipo())) {
                        
                        Double distCalculada = Math.sqrt(Math.pow(listarCuartel.getCoord_X() - s1.getCoord_X(), 2) + Math.pow(listarCuartel.getCoord_Y() - s1.getCoord_Y(), 2));
                        if (distCalculada <= distancia1) {
                            cuartelMasCercano = listarCuartel;
                            distancia1 = distCalculada;
                            brigadaAAsignar = brigadas;
                        }
                    }
                }
            }
        }
        JTFCuartelMASCercano.setText(cuartelMasCercano.getNombre_cuartel() +" "+ cuartelMasCercano.getDireccion()+ " "+ cuartelMasCercano.getTelefono());
        JTFBrigadaAsignada.setText(brigadaAAsignar.getNombre_brigada()+" "+brigadaAAsignar.getEspecialidad());
        s1.setBrigada(brigadaAAsignar);

    }
    
     private void cambiarColor(){
       
    
    this.getContentPane().setBackground(new Color(74, 84, 89));

        jLabel2.setForeground(new Color(200, 214, 214));
        jLabel1.setForeground(new Color(200, 214, 214));
        jLabel7.setForeground(new Color(200, 214, 214));
       
        

        JBAsignarBrigada.setBackground(new Color(74, 84, 89));
        JBAsignarBrigada.setForeground(new Color(200, 214, 214));

        JBSalir.setBackground(new Color(74, 84, 89));
        JBSalir.setForeground(new Color(200, 214, 214));
        
      
   }
    
}

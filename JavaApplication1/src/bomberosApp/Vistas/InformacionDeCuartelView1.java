package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.BrigadaData;
import bomberosApp.AccesoADatos.CuartelData;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InformacionDeCuartelView1 extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private Cuartel cuartel = new Cuartel();
    private CuartelData cuartelData = new CuartelData();
    private List<Cuartel> listarCuarteles = cuartelData.ListarCuarteles();
    
    private BrigadaData brigadaData = new BrigadaData();
    private Brigada brigada = new Brigada();
    private List<Brigada> listarBrigada = brigadaData.ListarBrigada();
    
    public InformacionDeCuartelView1() {
        initComponents();
        armarCabeceras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBBuscar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaBrigadasEnCuartel = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Informacion de Cuartel");

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

        jLabel1.setText("Codigo/ID Cuartel");

        JTablaBrigadasEnCuartel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTablaBrigadasEnCuartel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JBBuscar))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(JBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalir)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed

        int id = Integer.parseInt(JTFCodigo.getText());
        Brigada brigadita = (Brigada) brigadaData.ListarBrigadaPorCuartel(id);
        
        
        try {
            JTFCodigo.getText();
            
            if (brigadita != null) {
                
                
                DefaultTableModel model = (DefaultTableModel) JTablaBrigadasEnCuartel.getModel(); 
                model.setRowCount(0); 
                model.addRow(new Object[]{brigadita.getId_brigada()}); 
                
                
                
                

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un Cuartel con este ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JBBuscarActionPerformed
//Funca
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTable JTablaBrigadasEnCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceras() {
        modelo.addColumn("ID Brigada");
        modelo.addColumn("Nombre de la Brigada");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        modelo.addColumn("ID Cuartel");
        modelo.addColumn("Disponibiblidad");

        JTablaBrigadasEnCuartel.setModel(modelo);
    }

}

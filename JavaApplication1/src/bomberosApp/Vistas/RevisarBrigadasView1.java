package bomberosApp.Vistas;

import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class RevisarBrigadasView1 extends javax.swing.JInternalFrame {

    public RevisarBrigadasView1() {
        initComponents();
        armarCabeceras();
        unirBotones();
    }

    private DefaultTableModel modelo = new DefaultTableModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        JBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JRBBrigadasNODisponibles = new javax.swing.JRadioButton();
        JRBBrigadasDisponibles = new javax.swing.JRadioButton();
        JBDisponibleOEnLabor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaBrigadas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Revisar Brigadas");

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecciona una opcion para ver las Brigadas Activas e Inactivas ");

        JRBBrigadasNODisponibles.setText("Brigadas En Labor");

        JRBBrigadasDisponibles.setText("Brigadas Disponibles");

        JBDisponibleOEnLabor.setText("Cambiar Disponible/En Labor");
        JBDisponibleOEnLabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDisponibleOEnLaborActionPerformed(evt);
            }
        });

        JTablaBrigadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Brigada", "Nombre de la Brigada", "Especialidad", "Estado", "Id Cuartel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablaBrigadas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBDisponibleOEnLabor)
                        .addGap(100, 100, 100)
                        .addComponent(JBSalir))
                    .addComponent(jLabel1)
                    .addComponent(JRBBrigadasNODisponibles)
                    .addComponent(JRBBrigadasDisponibles)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(JRBBrigadasDisponibles)
                .addGap(18, 18, 18)
                .addComponent(JRBBrigadasNODisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBDisponibleOEnLabor))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBDisponibleOEnLaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDisponibleOEnLaborActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_JBDisponibleOEnLaborActionPerformed
//funca =)
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDisponibleOEnLabor;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBBrigadasDisponibles;
    private javax.swing.JRadioButton JRBBrigadasNODisponibles;
    private javax.swing.JTable JTablaBrigadas;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private void armarCabeceras() {
        modelo.addColumn("ID Brigada");
        modelo.addColumn("Nombre de la Brigada");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        modelo.addColumn("ID Cuartel");
        

        JTablaBrigadas.setModel(modelo);
    }
    

   private void unirBotones(){
       ButtonGroup grupoDeBotones = new ButtonGroup();
       grupoDeBotones.add(JRBBrigadasDisponibles);
       grupoDeBotones.add(JRBBrigadasNODisponibles);
      
   }


}

package bomberosApp.Vistas;

import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Siniestro;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistorialDeEventosView extends javax.swing.JInternalFrame {

    private Siniestro siniestro = new Siniestro();
    private SiniestroData siniestroData = new SiniestroData();
    private List<Siniestro> listarSiniestros = siniestroData.ListarSiniestro();

    private DefaultTableModel modelo = new DefaultTableModel();

    public HistorialDeEventosView() {
        initComponents();
        armarCabeceras();
        unirBotones();
        cambiarColor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTablaHistorial = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JBListar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        JRBEventosDeAyer = new javax.swing.JRadioButton();
        JRBEventosDeHoy = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Historial de Eventos");

        JTTablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Siniestro", "Coordenada X", "Coordenada Y", "Fecha Siniestro", "Tipo", "Detalles", "ID Brigada", "Fecha Resolucion", "Calificacion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTTablaHistorial);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Historial de Eventos");

        JBListar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBListar.setText("Listar");
        JBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListarActionPerformed(evt);
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

        JRBEventosDeAyer.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEventosDeAyer.setText("Eventos de Ayer");

        JRBEventosDeHoy.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JRBEventosDeHoy.setText("Eventos de Hoy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(JRBEventosDeAyer)
                        .addGap(80, 80, 80)
                        .addComponent(JRBEventosDeHoy)
                        .addGap(49, 49, 49)
                        .addComponent(JBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JRBEventosDeHoy)
                        .addComponent(JRBEventosDeAyer)
                        .addComponent(JBListar))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBSalir)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
// Obtén la fecha actual
        LocalDate fechaActual = LocalDate.now();
// Calcula la fecha del día anterior
        LocalDate fechaAyer = fechaActual.minusDays(1);
        try {
            if (JRBEventosDeAyer.isSelected()) {
                List<Siniestro> siniestrosDeAyer = new ArrayList<>();

                for (Siniestro siniestro : siniestroData.ListarSiniestro()) {
                    LocalDate fechaSiniestro = siniestro.getFecha_siniestro();
                    if (fechaSiniestro.isEqual(fechaAyer)) {
                        siniestrosDeAyer.add(siniestro);
                    }
                }
                borrarFilasTabla();
                for (Siniestro siniestro : siniestrosDeAyer) {

                    modelo.addRow(new Object[]{siniestro.getId_siniestro(),
                        siniestro.getCoord_X(),
                        siniestro.getCoord_Y(),
                        siniestro.getFecha_siniestro(),
                        siniestro.getTipo(),
                        siniestro.getDetalles(),
                        siniestro.getBrigada().getId_brigada(),
                        siniestro.getFecha_resolucion(),
                        siniestro.getCalificacion(),
                        siniestro.isEstado()
                    });
                }
            }
            if (JRBEventosDeHoy.isSelected()) {
                List<Siniestro> siniestrosDelDia = new ArrayList<>();

                for (Siniestro siniestro : siniestroData.ListarSiniestro()) {
                    LocalDate fechaSiniestro = siniestro.getFecha_siniestro();
                    if (fechaSiniestro.isEqual(fechaActual)) {
                        siniestrosDelDia.add(siniestro);
                    }
//                System.out.println(siniestrosDelDia);                    
                }
                borrarFilasTabla();
                for (Siniestro siniestro : siniestrosDelDia) {

                    modelo.addRow(new Object[]{siniestro.getId_siniestro(),
                        siniestro.getCoord_X(),
                        siniestro.getCoord_Y(),
                        siniestro.getFecha_siniestro(),
                        siniestro.getTipo(),
                        siniestro.getDetalles(),
                        siniestro.getBrigada().getId_brigada(),
                        siniestro.getFecha_resolucion(),
                        siniestro.getCalificacion(),
                        siniestro.isEstado()
                    });
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID: " + e.getMessage());
        }

    }//GEN-LAST:event_JBListarActionPerformed
//funca
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBEventosDeAyer;
    private javax.swing.JRadioButton JRBEventosDeHoy;
    private javax.swing.JTable JTTablaHistorial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceras() {
        modelo.addColumn("ID Siniestro");
        modelo.addColumn("Coordenada X");
        modelo.addColumn("Coordenada Y");
        modelo.addColumn("Fecha Siniestro");
        modelo.addColumn("Tipo");
        modelo.addColumn("Detalles");
        modelo.addColumn("ID Brigada");
        modelo.addColumn("Fecha Resolucion");
        modelo.addColumn("Calificacion");
        modelo.addColumn("Estado");

        JTTablaHistorial.setModel(modelo);
    }

    private void unirBotones() {
        ButtonGroup grupoDeBotones = new ButtonGroup();
        grupoDeBotones.add(JRBEventosDeAyer);
        grupoDeBotones.add(JRBEventosDeHoy);

    }

    public void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;
            if (modelo.getRowCount() > 0) {
                for (int i = a; i >= 0; i--) {
                    modelo.removeRow(i);
                }
            }
        }

    }
    
    private void cambiarColor(){
       
          
          
    this.getContentPane().setBackground(new Color(78, 73, 102));
        
        
        jLabel2.setForeground(new Color(200, 214, 214));
       
        
        
        JBListar.setBackground(new Color(50, 47, 65));
        JBListar.setForeground(new Color(200, 214, 214));

       
        
         JBSalir.setBackground(new Color(50, 47, 65));
        JBSalir.setForeground(new Color(200, 214, 214));
        
   }
    
    
}

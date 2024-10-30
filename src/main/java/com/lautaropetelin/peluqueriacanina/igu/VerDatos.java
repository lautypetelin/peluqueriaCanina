package com.lautaropetelin.peluqueriacanina.igu;

import com.lautaropetelin.peluqueriacanina.logica.Controladora;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    Principal principal = null;
    
    public VerDatos() {
        this.control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTitulo2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(890, 600));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("VISUALIZACIÓN DE DATOS");

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTitulo2.setText("Datos de mascotas:");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit32x32.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete32x32.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMascotas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTitulo2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnVolver)))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){
            
            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){
                
                // Obtener ID de la mascota a eliminar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                
                if(JOptionPane.showConfirmDialog(this, "¿Desea realmente eliminar este registro?", "Confirmación para eliminar mascota", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                    // Buscar la mascota por ID
                    Mascota mascota = control.traerMascota(idMascota);
                    
                    // Llamar al método borrar
                    control.borrarMascota(mascota.getIdCliente());
                    control.borrarDuenio(mascota.getDuenio().getIdDuenio());
                    
                    // Avisar al usuario que borró correctamente
                    JOptionPane.showMessageDialog(this, "La mascota ha sido eliminada correctamente.", "Borrado de mascota", JOptionPane.INFORMATION_MESSAGE);

                    // Volver a cargar la tabla.
                    cargarTabla();
                }else{
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para eliminar.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){
            
            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){
                
                // Cerrar ventana para ver datos
                this.dispose();
                
                // Obtener ID de la mascota a editar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                
                ModificarDatos modificarDatos = new ModificarDatos(idMascota);
                modificarDatos.setVisible(true);
                modificarDatos.setLocationRelativeTo(null);
                modificarDatos.setResizable(false);
                
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Información", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para editar.", "Información", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        this.principal = new Principal();
        this.principal.setVisible(true);
        this.principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        // Setear que no se puedan cambiar de lugar las columnas
//        tblMascotas.getTableHeader().setReorderingAllowed(false); 

        // Definir el modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel(){
            
            // Definir que las celdas no sean editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        // Establecer los nombres de las columnas
        String titulos[] = {"ID", "Nombre", "Raza", "Color", "Alérgico", "At. esp.", "Dueño", "Dirección", "Celular", "Observaciones"};
        modelo.setColumnIdentifiers(titulos);
        
        // Obtener la lista de mascotas desde la BD
        List<Mascota> listaMascotas = control.traerMascotas();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if(!listaMascotas.isEmpty()){
            for(Mascota masco: listaMascotas){
                Object registro[] = {masco.getIdCliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico(), masco.getAtencionEspecial(),
                                   masco.getDuenio().getNombre(), masco.getDuenio().getDireccion(), masco.getDuenio().getCelular(), masco.getObservaciones()};
                modelo.addRow(registro);
            }
        }
        
        // Asignar el modelo a la tabla
        tblMascotas.setModel(modelo);
    }   
}
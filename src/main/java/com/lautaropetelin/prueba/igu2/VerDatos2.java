package com.lautaropetelin.prueba.igu2;

import com.lautaropetelin.peluqueriacanina.logica.Controladora;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos2 extends javax.swing.JPanel {

    Controladora control = null;
    
    public VerDatos2() {
        this.control = new Controladora();
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("VISUALIZACIÓN DE DATOS");

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

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit32x32.png"))); // NOI18N
        btnEditar.setText("Modificar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete32x32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){

            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){

                // Obtener ID de la mascota a editar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));

                ModificarDatos2 modificarDatos = new ModificarDatos2(idMascota);
                modificarDatos.setSize(710,600);
                modificarDatos.setLocation(0,0);
                
                this.removeAll();
                this.add(modificarDatos, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();

            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Información", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para editar.", "Información", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        // Setear que no se puedan cambiar de lugar las columnas
        tblMascotas.getTableHeader().setReorderingAllowed(false); 

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
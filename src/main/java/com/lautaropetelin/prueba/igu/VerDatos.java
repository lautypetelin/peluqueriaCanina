package com.lautaropetelin.prueba.igu;

import com.lautaropetelin.peluqueriacanina.logica.Controladora;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JPanel {

    private Controladora control = null;
    
    public VerDatos() {
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
        datos = new javax.swing.JPanel();
        jlDatosMascota = new javax.swing.JLabel();
        jlNombreMascota = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        jlRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jlAlergico = new javax.swing.JLabel();
        txtAlergico = new javax.swing.JTextField();
        jlAtencionEspecial = new javax.swing.JLabel();
        txtAtencionEspecial = new javax.swing.JTextField();
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminarMascota = new javax.swing.JButton();
        btnEliminarDuenio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlDatosDuenio = new javax.swing.JLabel();
        jlNombreDuenio = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jlCelular = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("VISUALIZACIÓN DE DATOS");

        tblMascotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        tblMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMascotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMascotas);

        jlDatosMascota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosMascota.setText("Mascota");

        jlNombreMascota.setText("Nombre:");

        txtNombreMascota.setEditable(false);

        jlRaza.setText("Raza:");

        txtRaza.setEditable(false);

        jlColor.setText("Color:");

        txtColor.setEditable(false);

        jlAlergico.setText("Alérgico:");

        txtAlergico.setEditable(false);

        jlAtencionEspecial.setText("At. especial:");

        txtAtencionEspecial.setEditable(false);

        jlObservaciones.setText("Observaciones:");

        txtObservaciones.setEditable(false);
        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtObservaciones);

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRaza)
                            .addComponent(jlColor)
                            .addComponent(jlNombreMascota))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlDatosMascota)
                            .addGroup(datosLayout.createSequentialGroup()
                                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtRaza))
                                .addGap(18, 18, 18)
                                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlAlergico)
                                    .addComponent(jlAtencionEspecial))
                                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(datosLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(datosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlObservaciones))
                .addContainerGap())
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombreMascota))
                        .addGap(18, 18, 18)
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlRaza)))
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlergico)
                            .addComponent(txtAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAtencionEspecial)
                            .addComponent(txtAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlColor))
                .addGap(21, 21, 21)
                .addComponent(jlObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit32x32.png"))); // NOI18N
        btnEditar.setText("Modificar registro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminarMascota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete32x32.png"))); // NOI18N
        btnEliminarMascota.setText("Eliminar mascota");
        btnEliminarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMascotaActionPerformed(evt);
            }
        });

        btnEliminarDuenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete32x32.png"))); // NOI18N
        btnEliminarDuenio.setText("Eliminar dueño");
        btnEliminarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDuenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlDatosDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosDuenio.setText("Dueño");

        jlNombreDuenio.setText("Nombre:");

        jlDireccion.setText("Dirección:");

        txtDireccion.setEditable(false);

        txtCelular.setEditable(false);

        jlCelular.setText("Celular:");

        txtNombreDuenio.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombreDuenio)
                    .addComponent(jlDireccion)
                    .addComponent(jlCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDatosDuenio)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosDuenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreDuenio)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){

            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){

                // Obtener ID de la mascota a editar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));

                ModificarDatos modificarDatos = new ModificarDatos(idMascota);
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

    private void btnEliminarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMascotaActionPerformed

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

                    // Avisar al usuario que borró correctamente
                    JOptionPane.showMessageDialog(this, "La mascota ha sido eliminada correctamente.", "Borrado de mascota", JOptionPane.INFORMATION_MESSAGE);

                    // Volver a cargar la tabla.
                    cargarTabla();
                    limpiarCampos();
                }else{
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para eliminar.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMascotaActionPerformed

    private void tblMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMascotasMouseClicked
        
        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){

            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){

                // Obtener ID de la mascota a eliminar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));

                // Buscar la mascota por ID
                Mascota mascota = control.traerMascota(idMascota);

                // Setear los campos con la información de la mascto
                txtNombreMascota.setText(mascota.getNombre());
                txtRaza.setText(mascota.getRaza());
                txtColor.setText(mascota.getColor());
                txtAlergico.setText(mascota.getAlergico());
                txtAtencionEspecial.setText(mascota.getAtencionEspecial());
                txtNombreDuenio.setText(mascota.getDuenio().getNombre());
                txtDireccion.setText(mascota.getDuenio().getDireccion());
                txtCelular.setText(mascota.getDuenio().getCelular());
                txtObservaciones.setText(mascota.getObservaciones());
            }
        }
    }//GEN-LAST:event_tblMascotasMouseClicked

    private void btnEliminarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDuenioActionPerformed
        
        // Controlar que la tabla no esté vacía
        if(tblMascotas.getRowCount() > 0){

            // Controlar que se haya seleccionado un registro
            if(tblMascotas.getSelectedRow() != -1){

                // Obtener ID del dueño a eliminar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                int idDuenio = control.traerMascota(idMascota).getDuenio().getIdDuenio();

                if(JOptionPane.showConfirmDialog(this, "Si elimina este dueño, se eliminaran todas las mascotas asociadas.\n¿Desea realmente eliminar este registro?", "Confirmación para eliminar mascota", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                    // Llamar al método borrar
                    control.borrarDuenio(idDuenio);

                    // Avisar al usuario que borró correctamente
                    JOptionPane.showMessageDialog(this, "El dueño ha sido eliminado correctamente junto a sus mascotas asociadas.", "Borrado de dueño", JOptionPane.INFORMATION_MESSAGE);

                    // Volver a cargar la tabla.
                    cargarTabla();
                    limpiarCampos();
                }else{
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ningún registro.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para eliminar.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarDuenioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarDuenio;
    private javax.swing.JButton btnEliminarMascota;
    private javax.swing.JPanel datos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlAlergico;
    private javax.swing.JLabel jlAtencionEspecial;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlDatosDuenio;
    private javax.swing.JLabel jlDatosMascota;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombreDuenio;
    private javax.swing.JLabel jlNombreMascota;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlRaza;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtAlergico;
    private javax.swing.JTextField txtAtencionEspecial;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
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
        String titulos[] = {"ID", "Dueño", "Mascota"};
        modelo.setColumnIdentifiers(titulos);
        
        // Obtener la lista de mascotas desde la BD
        List<Mascota> listaMascotas = control.traerMascotas();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if(!listaMascotas.isEmpty()){
            for(Mascota masco: listaMascotas){
                Object registro[] = {masco.getIdCliente(), masco.getDuenio().getNombre(), masco.getNombre()};
                modelo.addRow(registro);
            }
        }
        
        // Asignar el modelo a la tabla
        tblMascotas.setModel(modelo);
    }  

    private void limpiarCampos() {
        
        txtNombreMascota.setText(null);
        txtRaza.setText(null);
        txtColor.setText(null);
        txtAlergico.setText(null);
        txtAtencionEspecial.setText(null);
        txtNombreDuenio.setText(null);
        txtDireccion.setText(null);
        txtCelular.setText(null);
        txtObservaciones.setText(null);
    }
}
package com.lautaropetelin.prueba.igu;

import com.lautaropetelin.peluqueriacanina.logica.Controladora;
import com.lautaropetelin.peluqueriacanina.logica.Duenio;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JPanel {

    private Controladora control = null;
    private Mascota mascota = null;
    
    public ModificarDatos(int idMascota) {
        control = new Controladora();
        initComponents();
        cargarDatos(idMascota);
        cargarComboDuenios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlDatosMascota = new javax.swing.JLabel();
        jlNombreMascota = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        jlRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jlAlergico = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        jlAtencionEspecial = new javax.swing.JLabel();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        jlDatosDuenio = new javax.swing.JLabel();
        jlNombreDuenio = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jlCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jlDueño = new javax.swing.JLabel();
        cmbDuenios = new javax.swing.JComboBox<>();
        jlTitulo = new javax.swing.JLabel();
        btnModificarDuenio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(710, 600));

        jlDatosMascota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosMascota.setText("Mascota");

        jlNombreMascota.setText("Nombre:");

        jlRaza.setText("Raza:");

        jlColor.setText("Color:");

        jlAlergico.setText("Alérgico:");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlAtencionEspecial.setText("Atención especial:");

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlDatosDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosDuenio.setText("Dueño");

        jlNombreDuenio.setText("Nombre:");

        jlDireccion.setText("Dirección:");

        jlCelular.setText("Celular:");

        jlObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jlDueño.setText("Dueño:");

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("MODIFICACIÓN DE DATOS");

        btnModificarDuenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave32x32.png"))); // NOI18N
        btnModificarDuenio.setText("Modificar dueño");
        btnModificarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDuenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreMascota)
                                    .addComponent(jlColor)
                                    .addComponent(jlAlergico)
                                    .addComponent(jlAtencionEspecial)
                                    .addComponent(jlRaza))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jlDatosMascota)
                                        .addGap(288, 288, 288)
                                        .addComponent(jlDatosDuenio))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtColor)
                                                .addComponent(txtRaza)
                                                .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jlDireccion)
                                                    .addComponent(jlCelular)
                                                    .addComponent(jlNombreDuenio))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(btnModificarDuenio))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlObservaciones)
                                    .addComponent(jlDueño))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(cmbDuenios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDatosMascota)
                    .addComponent(jlDatosDuenio))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombreMascota)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlNombreDuenio)
                        .addGap(18, 18, 18)
                        .addComponent(jlDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(jlCelular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlergico)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAtencionEspecial)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnModificarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDueño)
                    .addComponent(cmbDuenios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave32x32.png"))); // NOI18N
        btnModificar.setText(" Guardar cambios");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconClean32x32.png"))); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String duenioString = cmbDuenios.getSelectedItem().toString();
        if(duenioString.equalsIgnoreCase("Responsables registrados")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un dueño en la lista desplegable.", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        
        // Datos de la mascota
        String nombreMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = (String)cmbAlergico.getSelectedItem();
        String atencionEspecial = (String)cmbAtencionEspecial.getSelectedItem();
        String observaciones = txtObservaciones.getText();
        
        // Datos del dueño
        Duenio duenio = (Duenio)cmbDuenios.getSelectedItem();
        
        if(JOptionPane.showConfirmDialog(this, "¿Desea realmente editar este registro?", "Confirmación para editar mascota", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            control.modificarMascota(this.mascota, nombreMascota, raza, color, alergico, atencionEspecial, observaciones, duenio);

            // Mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Datos modificados correctamente.", "Edición correcta", JOptionPane.INFORMATION_MESSAGE);
            
            // Mostrar nuevamente el panel para ver los datos
            VerDatos verDatos = new VerDatos();
            verDatos.setSize(710,600);
            verDatos.setLocation(0,0);

            this.removeAll();
            this.add(verDatos, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();

        }else{
            return;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreMascota.setText(null);
        txtRaza.setText(null);
        txtColor.setText(null);
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText(null);
        txtDireccion.setText(null);
        txtCelular.setText(null);
        txtObservaciones.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDuenioActionPerformed

        String duenioString = cmbDuenios.getSelectedItem().toString();
        if(duenioString.equalsIgnoreCase("Responsables registrados")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar el dueño a modificar en la lista desplegable.", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        
        Duenio duenio = (Duenio)cmbDuenios.getSelectedItem();
        int id = duenio.getIdDuenio();
        
        if(validar()){
            return;
        }
        
        String nombre = txtNombreDuenio.getText();
        String direccion = txtDireccion.getText();
        String celular = txtCelular.getText();
        List<Mascota> listaMascotas = duenio.getMascotas();

        control.modificarDuenio(id, nombre, direccion, celular, listaMascotas);

        JOptionPane.showMessageDialog(this, "Dueño modificado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

        cargarComboDuenios();
        limpiarCamposDuenio();
    }//GEN-LAST:event_btnModificarDuenioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarDuenio;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JComboBox<String> cmbDuenios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAlergico;
    private javax.swing.JLabel jlAtencionEspecial;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlDatosDuenio;
    private javax.swing.JLabel jlDatosMascota;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDueño;
    private javax.swing.JLabel jlNombreDuenio;
    private javax.swing.JLabel jlNombreMascota;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlRaza;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idMascota) {
        
        this.mascota = control.traerMascota(idMascota);
        
        txtNombreMascota.setText(mascota.getNombre());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        switch (mascota.getAlergico()) {
            case "-":
                cmbAlergico.setSelectedIndex(0);
                break;
            case "Si":
                cmbAlergico.setSelectedIndex(1);
                break;
            case "No":
                cmbAlergico.setSelectedIndex(2);
                break;
        }
        switch (mascota.getAtencionEspecial()) {
            case "-":
                cmbAtencionEspecial.setSelectedIndex(0);
                break;
            case "Si":
                cmbAtencionEspecial.setSelectedIndex(1);
                break;
            case "No":
                cmbAtencionEspecial.setSelectedIndex(2);
                break;
        }
        txtObservaciones.setText(mascota.getObservaciones());
        
        txtNombreDuenio.setText(mascota.getDuenio().getNombre());
        txtDireccion.setText(mascota.getDuenio().getDireccion());
        txtCelular.setText(mascota.getDuenio().getCelular());
    }
    
    private void cargarComboDuenios() {
        
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        
        List<Duenio> listaDuenios = control.traerDuenios();
        
        modeloCombo.addElement("Responsables registrados");
        
        if(listaDuenios.size() > 0){
            for(Duenio duenio: listaDuenios){
                modeloCombo.addElement(duenio);
            }
        }
        
        cmbDuenios.setModel(modeloCombo);
    }
    
    private boolean validar() {
    
        if(txtNombreDuenio.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCelular.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos \'Nombre\', \'Dirección\' y \'celular\'.", "Error al registrar dueño", JOptionPane.ERROR_MESSAGE);
            return true;
        }
    
        return false;
    }
    
    private void limpiarCamposDuenio(){
        
        txtNombreDuenio.setText(null);
        txtDireccion.setText(null);
        txtCelular.setText(null);
    }
}
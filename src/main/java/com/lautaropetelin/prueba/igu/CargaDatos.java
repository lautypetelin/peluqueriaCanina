package com.lautaropetelin.prueba.igu;

import com.lautaropetelin.peluqueriacanina.logica.Controladora;
import javax.swing.JOptionPane;
import com.lautaropetelin.peluqueriacanina.logica.Duenio;
import javax.swing.DefaultComboBoxModel;
import java.util.List;

public class CargaDatos extends javax.swing.JPanel {

    private Controladora control = null;
    
    public CargaDatos() {
        control = new Controladora();
        initComponents();
        cargarComboDuenios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
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
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jlDatosDuenio = new javax.swing.JLabel();
        jlNombreDuenio = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jlCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnGuardarDuenio = new javax.swing.JButton();
        jlDatosDuenio1 = new javax.swing.JLabel();
        cmbDuenios = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnGuardarMascota = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(710, 600));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("CARGA DE DATOS");

        jlDatosMascota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosMascota.setText("Mascota");

        jlNombreMascota.setText("Nombre:");

        jlRaza.setText("Raza:");

        jlColor.setText("Color:");

        jlAlergico.setText("Alérgico:");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlAtencionEspecial.setText("Atención especial:");

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlObservaciones.setText("Observaciones:");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        jlDatosDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosDuenio.setText("Dueño");

        jlNombreDuenio.setText("Nombre:");

        jlDireccion.setText("Dirección:");

        jlCelular.setText("Celular:");

        btnGuardarDuenio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave32x32.png"))); // NOI18N
        btnGuardarDuenio.setText("Registrar dueño");
        btnGuardarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDuenioActionPerformed(evt);
            }
        });

        jlDatosDuenio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDatosDuenio1.setText("Seleccione el dueño:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addGap(1, 1, 1)
                                        .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtColor)
                                        .addComponent(txtRaza)
                                        .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlDatosMascota)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlObservaciones)
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbDuenios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlNombreDuenio)
                                                .addComponent(jlDireccion)
                                                .addComponent(jlCelular))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlDatosDuenio)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jlDatosDuenio1))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardarDuenio)
                                .addGap(61, 61, 61))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlDatosDuenio)
                        .addGap(18, 18, 18)
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
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlDatosMascota)
                        .addGap(18, 18, 18)
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
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlergico)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAtencionEspecial)
                            .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jlDatosDuenio1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDuenios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        btnGuardarMascota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave32x32.png"))); // NOI18N
        btnGuardarMascota.setText(" Guardar");
        btnGuardarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMascotaActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnGuardarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMascotaActionPerformed

        if(validarCamposMascota()){
            return;
        };
        
        String duenioString = cmbDuenios.getSelectedItem().toString();
        if(duenioString.equalsIgnoreCase("Responsables registrados")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un dueño en la lista desplegable.", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        
        String nombreMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = (String)cmbAlergico.getSelectedItem();
        String atencionEspecial = (String)cmbAtencionEspecial.getSelectedItem();
        String observaciones = txtObservaciones.getText();

        Duenio duenio = (Duenio)cmbDuenios.getSelectedItem();
        
        control.guardarMascota(nombreMascota, raza, color, alergico, atencionEspecial, observaciones, duenio);

        JOptionPane.showMessageDialog(this, "Mascota cargada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarMascotaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtNombreMascota.setText(null);
        txtRaza.setText(null);
        txtColor.setText(null);
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtObservaciones.setText(null);
        
        txtNombreDuenio.setText(null);
        txtDireccion.setText(null);
        txtCelular.setText(null);
        cmbDuenios.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDuenioActionPerformed
        
        if(validarDuenio()){
            return;
        }
        
        String nombreDuenio = txtNombreDuenio.getText();
        String direccion = txtDireccion.getText();
        String celular = txtCelular.getText();
        
        control.guardarDuenio(nombreDuenio, direccion, celular);
        
        JOptionPane.showMessageDialog(this, "Dueño agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        
        cargarComboDuenios();
        limpiarCamposDuenio();
    }//GEN-LAST:event_btnGuardarDuenioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDuenio;
    private javax.swing.JButton btnGuardarMascota;
    private javax.swing.JButton btnLimpiar;
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
    private javax.swing.JLabel jlDatosDuenio1;
    private javax.swing.JLabel jlDatosMascota;
    private javax.swing.JLabel jlDireccion;
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

    private boolean validarCamposMascota() {
        
        if(txtNombreMascota.getText().isEmpty() || txtRaza.getText().isEmpty() || txtColor.getText().isEmpty() || (cmbAlergico.getSelectedIndex() == 0) || cmbAtencionEspecial.getSelectedIndex() == 0 || txtObservaciones.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos \'Nombre\', \'Raza\', \'Color\', \'Observaciones\' y seleccionar algún valor en las listas desplegables \'Alérgico\' y \'Atención especial\'.", "Error al registrar mascota", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        
        return false;
    }
    
    private boolean validarDuenio() {
    
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
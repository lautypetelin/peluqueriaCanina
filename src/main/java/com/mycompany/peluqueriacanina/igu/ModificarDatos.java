package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JFrame {

    //Atributos
    Controladora control = null;
    int idMascota;
    Mascota masco = null;
    
    public ModificarDatos(int idMascota) {
        control = new Controladora();
//        this.idMascota = idMascota;
        initComponents();
        cargarDatos(idMascota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlNombreMascota = new javax.swing.JLabel();
        jtfNombreMascota = new javax.swing.JTextField();
        jlRaza = new javax.swing.JLabel();
        jtfRaza = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        jtfColor = new javax.swing.JTextField();
        jlAlergico = new javax.swing.JLabel();
        jcbAlergico = new javax.swing.JComboBox<>();
        jlAtencionEspecial = new javax.swing.JLabel();
        jcbAtencionEspecial = new javax.swing.JComboBox<>();
        jlNombreDuenio = new javax.swing.JLabel();
        jtfNombreDuenio = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jlCelular = new javax.swing.JLabel();
        jtfCelular = new javax.swing.JTextField();
        jlObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaObservaciones = new javax.swing.JTextArea();
        jbLimpiar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Modificación de Datos");

        jlNombreMascota.setText("Nombre:");

        jlRaza.setText("Raza:");

        jlColor.setText("Color:");

        jlAlergico.setText("Alérgico:");

        jcbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlAtencionEspecial.setText("Atención especial:");

        jcbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jlNombreDuenio.setText("Nombre del dueño:");

        jlDireccion.setText("Dirección:");

        jlCelular.setText("Celular:");

        jlObservaciones.setText("Observaciones:");

        jtaObservaciones.setColumns(20);
        jtaObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtaObservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreMascota)
                            .addComponent(jlColor)
                            .addComponent(jlAlergico)
                            .addComponent(jlAtencionEspecial)
                            .addComponent(jlRaza))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombreMascota)
                                    .addComponent(jtfRaza)
                                    .addComponent(jtfColor)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jcbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jcbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlNombreDuenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDireccion)
                            .addComponent(jlCelular)
                            .addComponent(jlObservaciones))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCelular)
                            .addComponent(jtfDireccion)
                            .addComponent(jScrollPane1))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreMascota)
                    .addComponent(jtfNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRaza)
                    .addComponent(jtfRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlColor)
                    .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlergico)
                    .addComponent(jcbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAtencionEspecial)
                    .addComponent(jcbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreDuenio)
                    .addComponent(jtfNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCelular)
                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jbLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconClean.png"))); // NOI18N
        jbLimpiar.setText(" Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSave.png"))); // NOI18N
        jbModificar.setText(" Guardar cambios");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoPeluqueria.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jbModificar)
                                .addGap(28, 28, 28)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        
        jtfNombreMascota.setText(null);
        jtfRaza.setText(null);
        jtfColor.setText(null);
        jcbAlergico.setSelectedIndex(0);
        jcbAtencionEspecial.setSelectedIndex(0);
        jtfNombreDuenio.setText(null);
        jtfDireccion.setText(null);
        jtfCelular.setText(null);
        jtaObservaciones.setText(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        //Datos de la mascota.
        String nombreMascota = jtfNombreMascota.getText();
        String raza = jtfRaza.getText();
        String color = jtfColor.getText();
        String alergico = (String)jcbAlergico.getSelectedItem();
        String atencionEspecial = (String)jcbAtencionEspecial.getSelectedItem();
        
        //Datos del dueño.
        String nombreDuenio = jtfNombreDuenio.getText();
        String direccion = jtfDireccion.getText();
        String celular = jtfCelular.getText();
        String observaciones = jtaObservaciones.getText();
        
        control.modificarMascota(this.masco, nombreMascota, raza, color, alergico, atencionEspecial, nombreDuenio, direccion, celular, observaciones);
        
        //Mensaje de confirmación.
        JOptionPane.showMessageDialog(this, "Datos modificados correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        
        //Mostramos nuevamente los datos.
        VerDatos verDatos = new VerDatos();
        verDatos.setVisible(true);
        verDatos.setLocationRelativeTo(null);
        
        //Cerramos ventana de edición.
        this.dispose();
    }//GEN-LAST:event_jbModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbAlergico;
    private javax.swing.JComboBox<String> jcbAtencionEspecial;
    private javax.swing.JLabel jlAlergico;
    private javax.swing.JLabel jlAtencionEspecial;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombreDuenio;
    private javax.swing.JLabel jlNombreMascota;
    private javax.swing.JLabel jlObservaciones;
    private javax.swing.JLabel jlRaza;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtaObservaciones;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombreDuenio;
    private javax.swing.JTextField jtfNombreMascota;
    private javax.swing.JTextField jtfRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idMascota) {
        
        this.masco = control.traerMascota(idMascota);
        
        jtfNombreMascota.setText(masco.getNombre());
        jtfRaza.setText(masco.getRaza());
        jtfColor.setText(masco.getColor());
        switch (masco.getAlergico()) {
            case "-":
                jcbAlergico.setSelectedIndex(0);
                break;
            case "Si":
                jcbAlergico.setSelectedIndex(1);
                break;
            case "No":
                jcbAlergico.setSelectedIndex(2);
                break;
        }
        switch (masco.getAtencionEspecial()) {
            case "-":
                jcbAtencionEspecial.setSelectedIndex(0);
                break;
            case "Si":
                jcbAtencionEspecial.setSelectedIndex(1);
                break;
            case "No":
                jcbAtencionEspecial.setSelectedIndex(2);
                break;
        }
        jtfNombreDuenio.setText(masco.getDuenio().getNombre());
        jtfDireccion.setText(masco.getDuenio().getDireccion());
        jtfCelular.setText(masco.getDuenio().getCelular());
        jtaObservaciones.setText(masco.getObservaciones());
    }
}
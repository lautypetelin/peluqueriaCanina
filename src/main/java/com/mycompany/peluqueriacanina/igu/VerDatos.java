package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    //Atributos
    Controladora control = null;
    
    public VerDatos() {
        this.control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascotas = new javax.swing.JTable();
        jTitulo2 = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(890, 600));

        jlTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaMascotas);

        jTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTitulo2.setText("Datos de mascotas:");

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEdit.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconDelete.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

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
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar))
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
                            .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jlTitulo)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        //Controlo que la tabla no esté vacía.
        if(TablaMascotas.getRowCount() > 0){
            
            //Controlo que se haya seleccionado un registro.
            if(TablaMascotas.getSelectedRow() != -1){
                
                //Obtengo ID de la mascota a eliminar.
                int idMascota = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0)));
                
                //Llamo al método borrar.
                control.borrarMascota(idMascota);
                
                //Aviso al usuario que borró correctamente.
                JOptionPane.showMessageDialog(this, "La mascota ha sido eliminada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                
                //Volvemos a cargar la tabla.
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Información", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ninguna mascota para eliminar de la tabla.", "Información", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        
        //Controlo que la tabla no esté vacía.
        if(TablaMascotas.getRowCount() > 0){
            
            //Controlo que se haya seleccionado un registro.
            if(TablaMascotas.getSelectedRow() != -1){
                
                //Obtengo ID de la mascota a editar.
                int idMascota = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos modificarDatos = new ModificarDatos(idMascota);
                modificarDatos.setVisible(true);
                modificarDatos.setLocationRelativeTo(null);
                modificarDatos.setResizable(false);
                
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ninguna mascota.", "Información", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ninguna mascota para eliminar de la tabla.", "Información", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMascotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        TablaMascotas.getTableHeader().setReorderingAllowed(false);
        
        //Definir el modelo para la tabla.
        DefaultTableModel modelo = new DefaultTableModel(){
            
            //Que fila y columna no sean editables.
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas.
        String titulos[] = {"ID", "Nombre", "Raza", "Color", "Alérgico", "Atención especial", "Dueño", "Dirección", "Celular", "Observaciones"};
        
        //Seteamos los nombres de cada columna al modelo.
        modelo.setColumnIdentifiers(titulos);
        
        //Carga de datos desde la BD
        List<Mascota> listaMascotas = control.traerMascotas();
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla.
        if(listaMascotas != null){
            for(Mascota masco: listaMascotas){
                Object objeto[] = {masco.getIdCliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico(), masco.getAtencionEspecial(),
                                   masco.getDuenio().getNombre(), masco.getDuenio().getDireccion(), masco.getDuenio().getCelular(), masco.getObservaciones()};
                modelo.addRow(objeto);
            }
        }
        
        //Asignamos el modelo a la tabla.
        TablaMascotas.setModel(modelo);
    }   
}
package com.mycompany.peluqueriacanina.igu;

import java.awt.Color;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jpCargarDatos = new javax.swing.JPanel();
        jlCargarDatos = new javax.swing.JLabel();
        jpVerDatos = new javax.swing.JPanel();
        jlVerDatos = new javax.swing.JLabel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 51, 51));

        jpCargarDatos.setBackground(new java.awt.Color(255, 51, 51));
        jpCargarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCargarDatos.setFont(new java.awt.Font("Roboto Condensed", 0, 20)); // NOI18N
        jlCargarDatos.setForeground(new java.awt.Color(0, 0, 0));
        jlCargarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCargarDatos.setText("CARGAR DATOS");
        jlCargarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCargarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCargarDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCargarDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCargarDatosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpCargarDatosLayout = new javax.swing.GroupLayout(jpCargarDatos);
        jpCargarDatos.setLayout(jpCargarDatosLayout);
        jpCargarDatosLayout.setHorizontalGroup(
            jpCargarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCargarDatosLayout.createSequentialGroup()
                .addComponent(jlCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCargarDatosLayout.setVerticalGroup(
            jpCargarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jpVerDatos.setBackground(new java.awt.Color(255, 51, 51));
        jpVerDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlVerDatos.setFont(new java.awt.Font("Roboto Condensed", 0, 20)); // NOI18N
        jlVerDatos.setForeground(new java.awt.Color(0, 0, 0));
        jlVerDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVerDatos.setText("VER DATOS");
        jlVerDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlVerDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVerDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlVerDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlVerDatosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpVerDatosLayout = new javax.swing.GroupLayout(jpVerDatos);
        jpVerDatos.setLayout(jpVerDatosLayout);
        jpVerDatosLayout.setHorizontalGroup(
            jpVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpVerDatosLayout.setVerticalGroup(
            jpVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jpSalir.setBackground(new java.awt.Color(255, 51, 51));
        jpSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlSalir.setFont(new java.awt.Font("Roboto Condensed", 0, 20)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(0, 0, 0));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("SALIR");
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpSalirLayout = new javax.swing.GroupLayout(jpSalir);
        jpSalir.setLayout(jpSalirLayout);
        jpSalirLayout.setHorizontalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpSalirLayout.setVerticalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpVerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jpCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoPeluqueria.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Peluquería Canina");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered
        
        int red = 255;
        int green = 0;
        int blue = 0;
        
        Color color = new Color(red, green, blue);
        
        jpSalir.setBackground(color);
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlVerDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVerDatosMouseClicked
        
        VerDatos verDatos = new VerDatos();
        verDatos.setVisible(true);
        verDatos.setLocationRelativeTo(null);
    }//GEN-LAST:event_jlVerDatosMouseClicked

    private void jlVerDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVerDatosMouseEntered
        
        int red = 255;
        int green = 0;
        int blue = 0;
        
        Color color = new Color(red, green, blue);
        
        jpVerDatos.setBackground(color);
    }//GEN-LAST:event_jlVerDatosMouseEntered

    private void jlVerDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVerDatosMouseExited
        
        int red = 255;
        int green = 51;
        int blue = 51;
        
        Color color = new Color(red, green, blue);
        
        jpVerDatos.setBackground(color);
    }//GEN-LAST:event_jlVerDatosMouseExited

    private void jlCargarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCargarDatosMouseClicked
        
        CargaDatos cargaDatos = new CargaDatos();
        cargaDatos.setVisible(true);
        cargaDatos.setLocationRelativeTo(null);
    }//GEN-LAST:event_jlCargarDatosMouseClicked

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited
        
        int red = 255;
        int green = 51;
        int blue = 51;
        
        Color color = new Color(red, green, blue);
        
        jpSalir.setBackground(color);
    }//GEN-LAST:event_jlSalirMouseExited

    private void jlCargarDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCargarDatosMouseEntered
        
        int red = 255;
        int green = 0;
        int blue = 0;
        
        Color color = new Color(red, green, blue);
        
        jpCargarDatos.setBackground(color);
    }//GEN-LAST:event_jlCargarDatosMouseEntered

    private void jlCargarDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCargarDatosMouseExited
        
        int red = 255;
        int green = 51;
        int blue = 51;
        
        Color color = new Color(red, green, blue);
        
        jpCargarDatos.setBackground(color);
    }//GEN-LAST:event_jlCargarDatosMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jlCargarDatos;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JLabel jlVerDatos;
    private javax.swing.JPanel jpCargarDatos;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JPanel jpVerDatos;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
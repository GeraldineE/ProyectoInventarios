
package Formularios;

import proyectoiventarios.DesktopConFondo;


public class frmVentanaPrincipal extends javax.swing.JFrame {


    public frmVentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        Bienvenido = new javax.swing.JLabel();
        LbUsuario = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Escritorio = new DesktopConFondo();
        jMenuBar1 = new javax.swing.JMenuBar();
        Soporte = new javax.swing.JMenu();
        SoporteUsuarios = new javax.swing.JMenuItem();
        SoporteClientes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        SoporteReporteContabilidad = new javax.swing.JMenuItem();
        SoporteProveedores = new javax.swing.JMenuItem();
        SoportePedidos = new javax.swing.JMenuItem();
        Perfil = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Contabilidad = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Administrativo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Bienvenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(0, 0, 153));
        Bienvenido.setText("Bienvenido...!!!");

        LbUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbUsuario.setText("JaderDiaz");

        Salir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        Escritorio.setBackground(new java.awt.Color(239, 239, 239));

        Soporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Soporte.png"))); // NOI18N
        Soporte.setText("Soporte");

        SoporteUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        SoporteUsuarios.setText("Usuarios");
        SoporteUsuarios.setToolTipText("");
        SoporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoporteUsuariosActionPerformed(evt);
            }
        });
        Soporte.add(SoporteUsuarios);

        SoporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        SoporteClientes.setText("Clientes");
        SoporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoporteClientesActionPerformed(evt);
            }
        });
        Soporte.add(SoporteClientes);
        Soporte.add(jSeparator2);

        SoporteReporteContabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReponteCont.png"))); // NOI18N
        SoporteReporteContabilidad.setText("Reporte Contabilidad");
        SoporteReporteContabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoporteReporteContabilidadActionPerformed(evt);
            }
        });
        Soporte.add(SoporteReporteContabilidad);

        SoporteProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores2.png"))); // NOI18N
        SoporteProveedores.setText("Proveedores");
        SoporteProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoporteProveedoresActionPerformed(evt);
            }
        });
        Soporte.add(SoporteProveedores);

        SoportePedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedidos2.png"))); // NOI18N
        SoportePedidos.setText("Pedidos");
        SoportePedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoportePedidosActionPerformed(evt);
            }
        });
        Soporte.add(SoportePedidos);

        jMenuBar1.add(Soporte);

        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Perfil.png"))); // NOI18N
        Perfil.setText("Perfil");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MisDatos.png"))); // NOI18N
        jMenuItem5.setText("Mis Datos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Perfil.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CambioUser.png"))); // NOI18N
        jMenuItem6.setText("Cambio Usuario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Perfil.add(jMenuItem6);

        jMenuBar1.add(Perfil);

        Contabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contable.png"))); // NOI18N
        Contabilidad.setText("Contabilidad");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaFactura.png"))); // NOI18N
        jMenuItem7.setText("Nueva Factura");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Contabilidad.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevoProducto.png"))); // NOI18N
        jMenuItem8.setText("Nuevo Producto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Contabilidad.add(jMenuItem8);

        jMenuBar1.add(Contabilidad);

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda3.png"))); // NOI18N
        Ayuda.setText("Ayuda");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Acercade.png"))); // NOI18N
        jMenuItem10.setText("Acerca de");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Ayuda.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda2.png"))); // NOI18N
        jMenuItem11.setText("Ayuda");
        Ayuda.add(jMenuItem11);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(628, Short.MAX_VALUE)
                .addComponent(Bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbUsuario)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addGap(19, 19, 19))
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bienvenido)
                    .addComponent(LbUsuario)
                    .addComponent(Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SoporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoporteUsuariosActionPerformed

        frmUsuarios misUsuarios = new frmUsuarios();
        Escritorio.add(misUsuarios);
        misUsuarios.show();

    }//GEN-LAST:event_SoporteUsuariosActionPerformed

    private void SoporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoporteClientesActionPerformed

        frmCliente miCliente = new frmCliente();
        Escritorio.add(miCliente);
        miCliente.show();

    }//GEN-LAST:event_SoporteClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        ((DesktopConFondo) Escritorio).setImagen("/Imagenes/Fondo3.jpg");

    }//GEN-LAST:event_formWindowOpened

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

    frmAcercade miAcerca = new frmAcercade();
    Escritorio.add(miAcerca);
    miAcerca.show();


}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    frmLogin volver = new frmLogin();
    volver.setVisible(true);
    volver.setLocationRelativeTo(null);
    this.dispose();
}//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        frmMisdatos misDatos = new frmMisdatos();
        Escritorio.add(misDatos);
        misDatos.Nombre(LbUsuario.getText());
        misDatos.show();

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        frmNewFactura mifactura = new frmNewFactura();
        Escritorio.add(mifactura);
        mifactura.show();


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        frmNewProduct miProducto = new frmNewProduct();
        Escritorio.add(miProducto);
        miProducto.show();



    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void SoportePedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoportePedidosActionPerformed
        frmPedidos miPedido = new frmPedidos();
        Escritorio.add(miPedido);
        miPedido.show();
    }//GEN-LAST:event_SoportePedidosActionPerformed

    private void SoporteReporteContabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoporteReporteContabilidadActionPerformed
       
        frmReportes miReporte = new frmReportes();
        Escritorio.add(miReporte);
        miReporte.show();
        
    }//GEN-LAST:event_SoporteReporteContabilidadActionPerformed

    private void SoporteProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoporteProveedoresActionPerformed
     
        frmProveedores misProveedores = new frmProveedores();
        Escritorio.add(misProveedores);
        misProveedores.show();
        
        
    }//GEN-LAST:event_SoporteProveedoresActionPerformed


    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmVentanaPrincipal().setVisible(true);
            }
        });
    }

    public void Bienvenida(String User) {
        LbUsuario.setText(User);
    }

    public void Permisos(String perfil) {
        if (perfil.equals("Empleado")) {
            Soporte.setEnabled(false);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JMenu Contabilidad;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel LbUsuario;
    private javax.swing.JMenu Perfil;
    private javax.swing.JLabel Salir;
    private javax.swing.JMenu Soporte;
    private javax.swing.JMenuItem SoporteClientes;
    private javax.swing.JMenuItem SoportePedidos;
    private javax.swing.JMenuItem SoporteProveedores;
    private javax.swing.JMenuItem SoporteReporteContabilidad;
    private javax.swing.JMenuItem SoporteUsuarios;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

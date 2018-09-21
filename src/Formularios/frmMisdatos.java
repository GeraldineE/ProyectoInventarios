package Formularios;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import proyectoiventarios.Datos;

public class frmMisdatos extends javax.swing.JInternalFrame {

    Datos misDatos = new Datos();
    boolean DatosU = true;

    public frmMisdatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        txtIdUser = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        txtConfirmacion = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditUser = new javax.swing.JButton();
        btnEditClave = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mis Datos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID Usuario:");

        jLabel2.setText("Nombre(s):");

        jLabel3.setText("Apellido(s):");

        txtApellido.setEnabled(false);

        txtIdUser.setEnabled(false);

        txtNombre.setEnabled(false);

        jLabel4.setText("Clave:");

        jLabel5.setText("Confirmación:");

        txtClave.setEnabled(false);

        txtConfirmacion.setEnabled(false);

        btnEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditUser.setToolTipText("Editar datos personales");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnEditClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditClave.setToolTipText("Editar mi clave");
        btnEditClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditClaveActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar cambios");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar2.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar mi usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditClave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 204, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(btnEditUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEditClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnEditUser.setEnabled(false);
        btnEditClave.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);

        // ::::::::: VARIABLE DE CONTROL DE DADOS :::::::::: //
        DatosU = true;


    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnEditClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditClaveActionPerformed

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnEditClave.setEnabled(false);
        btnEditUser.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);


        // ::::::::: VARIABLE DE CONTROL DE DATOS :::::::::: //
        DatosU = false;

    }//GEN-LAST:event_btnEditClaveActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        LLenarDatos();

    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnEditClave.setEnabled(true);
        btnEditUser.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // ::::::::: ACTUALIZO DATOS :::::::::: //
        LLenarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String Clave = new String(txtClave.getPassword());
        String Confirmacion = new String(txtConfirmacion.getPassword());

        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar un Usuario.");
            txtNombre.requestFocusInWindow();
            return;
        }
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar un Apellido.");
            txtApellido.requestFocusInWindow();
            return;
        }

        if (Clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar una Clave.");
            txtClave.requestFocusInWindow();
            return;
        }

        if (Confirmacion.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar una Confirmacion.");
            txtConfirmacion.requestFocusInWindow();
            return;
        }

        if (!Clave.equals(Confirmacion)) {
            JOptionPane.showMessageDialog(rootPane, "La clave y la confirmacion no coinciden.");
            txtClave.requestFocusInWindow();
            return;
        }

        if (DatosU) {

            if (misDatos.udtDatosUtser(txtNombre.getText(), txtApellido.getText(), txtIdUser.getText())) {
                // ::::::::: HABILITACION CAMPOS :::::::::: //

                txtNombre.setEnabled(false);
                txtApellido.setEnabled(false);
                txtClave.setEnabled(false);
                txtConfirmacion.setEnabled(false);

                // ::::::::: HABILITACION BOTONNES :::::::::: //

                btnEditClave.setEnabled(true);
                btnEditUser.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);

                // ::::::::: ACTUALIZO DATOS :::::::::: //
                LLenarDatos();

                JOptionPane.showMessageDialog(rootPane, "Datos actualizados correctamente.");
                JOptionPane.showMessageDialog(rootPane, "Reinicie la aplicacion para terminar de guardar los cambios.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error de Actualizacion de datos.");
            }
        } else {

            if (misDatos.udtClave(Clave, txtIdUser.getText())) {

                // ::::::::: HABILITACION CAMPOS :::::::::: //

                txtNombre.setEnabled(false);
                txtApellido.setEnabled(false);
                txtClave.setEnabled(false);
                txtConfirmacion.setEnabled(false);

                // ::::::::: HABILITACION BOTONNES :::::::::: //

                btnEditClave.setEnabled(true);
                btnEditUser.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnCancelar.setEnabled(false);

                // ::::::::: ACTUALIZO DATOS :::::::::: //

                LLenarDatos();

                JOptionPane.showMessageDialog(rootPane, "Datos actualizados correctamente.");
                JOptionPane.showMessageDialog(rootPane, "Reinicie la aplicacion para terminar de guardar los cambios.");
            }
        }



    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int H;
        H = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que desea eliminar al puto de " + txtNombre.getText());

        if (H == 0) {


            if (misDatos.DeleteUser(txtIdUser.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Usuario eliminado correctamente...");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al intentar eliminar el usuario.");
            }


        }



    }//GEN-LAST:event_btnEliminarActionPerformed

    private void LLenarDatos() {

        String Name = txtNombre.getText();

        try {
            ResultSet rs = misDatos.tblUser();

            while (rs.next()) {
                if (rs.getString("Nombre").equals(Name)) {
                    txtIdUser.setText(rs.getString("ID_Usuario"));
                    txtNombre.setText(rs.getString("Nombre"));
                    txtApellido.setText(rs.getString("Apellido"));
                    txtClave.setText(rs.getString("Clave"));
                    txtConfirmacion.setText(rs.getString("Clave"));
                }

            }

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla usuarios " + e);
        }

    }

    public void Nombre(String User) {
        txtNombre.setText(User);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditClave;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

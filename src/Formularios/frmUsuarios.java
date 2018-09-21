package Formularios;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoiventarios.Datos;

public class frmUsuarios extends javax.swing.JInternalFrame {

    Datos misDatos = new Datos();
    private DefaultTableModel miTabla;
    private int Poderosa = 0;

    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        txtConfirmacion = new javax.swing.JPasswordField();
        cmbPerfil = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("ID Usuario:");

        jLabel2.setText("Nombre(s):");

        jLabel3.setText("Apellido(s):");

        jLabel4.setText("Confirmacion:");

        jLabel5.setText("Clave:");

        jLabel6.setText("Perfil:");

        txtIdUsuario.setEnabled(false);

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtClave.setEnabled(false);

        txtConfirmacion.setEnabled(false);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un perfil", "Administrador", "Empleado" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Crear un Nuevo Usuario.");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar Cambios.");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar2.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar.");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar usuario actual.");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tablas.setEnabled(false);
        jScrollPane1.setViewportView(Tablas);

        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Todos los campos son obligatorios...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtConfirmacion)))
                            .addComponent(txtNombre)
                            .addComponent(txtApellido))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtIdUsuario.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtClave.setEnabled(true);
        txtConfirmacion.setEnabled(true);
        cmbPerfil.setEnabled(true);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        // ::::::::: LIMPIAR CAMPOS :::::::::: //

        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        cmbPerfil.setSelectedIndex(0);

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtIdUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        cmbPerfil.setEnabled(false);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        // ::::::::: COMPROBACIONES :::::::::: //

        if (txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar un ID Usuario.");
            txtIdUsuario.requestFocusInWindow();
            return;
        }
        if (!datoNum(txtIdUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "El ID Usuario no es de tipo numerico");
            txtIdUsuario.setText("");
            txtIdUsuario.requestFocusInWindow();
            return;
        }

        if (cmbPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un Perfil");
            cmbPerfil.requestFocusInWindow();
            return;
        }

        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar un Nombre(s).");
            txtNombre.requestFocusInWindow();
            return;
        }

        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar un Apellido(s).");
            txtApellido.requestFocusInWindow();
            return;
        }

        String Clave = new String(txtClave.getPassword());
        String Confir = new String(txtConfirmacion.getPassword());

        if (Clave.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar una Clave.");
            txtClave.requestFocusInWindow();
            return;
        }

        if (Confir.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar una Confirmacion.");
            txtConfirmacion.requestFocusInWindow();
            return;
        }

        if (!Clave.equals(Confir)) {
            JOptionPane.showMessageDialog(null, "La Clave y la Confirmacion no son iguales.");
            txtClave.setText("");
            txtConfirmacion.setText("");
            txtClave.requestFocusInWindow();
            return;
        }


        if (misDatos.CompUsuario(txtIdUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "El ID de usuario ya esta registrado.");
            txtIdUsuario.setText("");
            txtIdUsuario.requestFocusInWindow();
            return;
        }

        // ::::::::: REGUISTRO DE USUARIO :::::::::: //

        String Perfil = cmbPerfil.getSelectedIndex() + "";

        if (misDatos.RegistrarUsuario(
                txtIdUsuario.getText(),
                txtNombre.getText(),
                txtApellido.getText(),
                Clave,
                Perfil)) {
            JOptionPane.showMessageDialog(null, "Usuario registrado Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario intentelo de nuevo.");
            return;
        }

        // ::::::::: LIMPIAR CAMPOS :::::::::: //

        txtIdUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtConfirmacion.setText("");
        cmbPerfil.setSelectedIndex(0);

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtIdUsuario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtClave.setEnabled(false);
        txtConfirmacion.setEnabled(false);
        cmbPerfil.setEnabled(false);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);


        // ::::::::: ACTUALIZAR DATOS DE TABLA:::::::::: //
        llenarTabla();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        llenarTabla();

        // String x = miTabla.getValueAt(0,1).toString();
        // JOptionPane.showMessageDialog(rootPane, x );
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String DeleteUser = JOptionPane.showInputDialog("Ingrese ID de usuario a eliminar.");

        if (DeleteUser.equals("")) {
            return;
        }


        if (Poderosa <= 1) {
            try {
                ResultSet RX = misDatos.tblUser();
                while (RX.next()) {
                    if (RX.getString("ID_Usuario").equals(DeleteUser)) {
                        if (RX.getString("Perfil").equals("1")) {
                            JOptionPane.showMessageDialog(null, "Solo queda 1 administrador.");
                            return;
                        }
                    }
                }
            } catch (SQLException | HeadlessException e) {
                System.out.println("Error consulta de usuario a eliminar" + e);
            }
        }
        
        boolean Encontrar=false;

        try {
            ResultSet Rl = misDatos.tblUser();
            while (Rl.next()) {
                if (Rl.getString("ID_Usuario").equals(DeleteUser)) {
                    Encontrar = true;
                    break;
                }else{
                    Encontrar = false;
                }
            }   
        } catch (SQLException | HeadlessException e) {
            System.out.println("Error consulta de usuario a eliminar" + e);
        }
        
        if (Encontrar) {
                if (misDatos.DeleteUser(DeleteUser)) {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar usario. Contacte a JOHN JAIRO!!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }


        
        

        // ::::::::: ACTUALIZAR DATOS DE TABLA:::::::::: //
        llenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void llenarTabla() {
        try {

            Poderosa = 0;

            String titulos[] = {"ID Usuario", "Nombre", "Apellido", "Perfil"};
            String Regisgtros[] = new String[4];
            miTabla = new DefaultTableModel(null, titulos);

            ResultSet rs = misDatos.tblUser();
            while (rs.next()) {

                Regisgtros[0] = rs.getString("ID_Usuario");
                Regisgtros[1] = rs.getString("Nombre");
                Regisgtros[2] = rs.getString("Apellido");
                Regisgtros[3] = misDatos.ConsPerfil(rs.getString("Nombre"));
                miTabla.addRow(Regisgtros);

                if (misDatos.ConsPerfil(rs.getString("Nombre")).equals("Administrador")) {
                    Poderosa++;
                }
            }
            Tablas.setModel(miTabla);
        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla usuarios " + e);
        }

    }

    private boolean datoNum(String num) {

        try {
            Long numero = Long.parseLong(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablas;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirmacion;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

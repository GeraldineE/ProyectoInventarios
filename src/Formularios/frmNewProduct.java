package Formularios;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoiventarios.Datos;

public class frmNewProduct extends javax.swing.JInternalFrame {

    Datos miProducto = new Datos();
    DefaultTableModel miModelo;

    public frmNewProduct() {
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
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbCategoria = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnNewProducto = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nuevo Producto");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NUEVO PRODUCTO");

        jLabel2.setText("NIT:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Precio:");

        txtPrecio.setEnabled(false);

        jLabel6.setText("Cantidad:");

        txtID.setEnabled(false);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Categoria", "PC", "PS2", "PS3", "PS4", "X360", "Wii", "DvD" }));
        cmbCategoria.setEnabled(false);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNewProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNewProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductoActionPerformed(evt);
            }
        });

        txtName.setEnabled(false);

        txtCantidad.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("Todos los camon son obligatorios.");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaProductos.setColumnSelectionAllowed(true);
        TablaProductos.setEnabled(false);
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNewProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNewProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductoActionPerformed
        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtID.setEnabled(true);
        txtName.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtPrecio.setEnabled(true);
        cmbCategoria.setEnabled(true);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnNewProductoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
// ::::::::: COMPROBACIONES :::::::::: //

        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar un ID Producto.");
            txtID.requestFocusInWindow();
            return;
        }
        if (!datoNum(txtID.getText())) {
            JOptionPane.showMessageDialog(null, "El ID Producto no es de tipo numerico");
            txtID.setText("");
            txtID.requestFocusInWindow();
            return;
        }

        if (cmbCategoria.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un Perfil");
            cmbCategoria.requestFocusInWindow();
            return;
        }

        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar un Nombre(s).");
            txtName.requestFocusInWindow();
            return;
        }

        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar La cantidad(s).");
            txtCantidad.requestFocusInWindow();
            return;
        }


        if (txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digitar el Precio.");
            txtPrecio.requestFocusInWindow();
            return;
        }
        
        if (!datoNum(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "El Precio no es de tipo numerico");
            txtPrecio.setText("");
            txtPrecio.requestFocusInWindow();
            return;
        }


        ///::::REGISTRAR:::::////


        String Categoria = cmbCategoria.getSelectedItem().toString();
        
        if (miProducto.RegistrarProducto(
                txtID.getText(),
                txtName.getText(),
                Categoria,
                txtPrecio.getText(),
                txtCantidad.getText())) {
            JOptionPane.showMessageDialog(null, "Producto Guardado Exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error Guardar el Producto, intentelo de nuevo.");
            return;
        }
        
        
        // ::::::::: LIMPIAR CAMPOS :::::::::: //

        txtID.setText("");
        txtName.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cmbCategoria.setSelectedIndex(0);

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtID.setEnabled(false);
        txtName.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtPrecio.setEnabled(false);
        cmbCategoria.setEnabled(false);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        
        
        // ::::::::: ACTUALIZAR TABLA :::::::::: //
        
        
        LlenarTabala();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String DeleteProducto = JOptionPane.showInputDialog("Ingrese NIT del producto a eliminar.");

        if (DeleteProducto.equals("")) {
            return;
        }

        if (miProducto.DeleteProducto(DeleteProducto)) {
            JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el Producto");
        }
        
        // ::::::::::::: ACTUALIZAR TABLA :::::::::: //
        LlenarTabala();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       LlenarTabala();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // ::::::::: LIMPIAR CAMPOS :::::::::: //

        txtID.setText("");
        txtName.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cmbCategoria.setSelectedIndex(0);

        // ::::::::: HABILITACION CAMPOS :::::::::: //

        txtID.setEnabled(false);
        txtName.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtPrecio.setEnabled(false);
        cmbCategoria.setEnabled(false);

        // ::::::::: HABILITACION BOTONNES :::::::::: //

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private boolean datoNum(String num) {

        try {
            Long numero = Long.parseLong(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void LlenarTabala(){
        
        try{
            
            String Titulos[] = {"ID Producto","Nombre","Categoria","Precio","Cantidad"};
            String Registros[]= new String[5];
            
            miModelo = new DefaultTableModel(null, Titulos);
            
            ResultSet rs = miProducto.tblProducto();
            while(rs.next()){
                Registros[0] = rs.getString("ID_Producto");
                Registros[1] = rs.getString("Nombre");
                Registros[2] = rs.getString("Categoria");
                Registros[3] = rs.getString("PrecioU");
                Registros[4] = rs.getString("Cantidad");
                miModelo.addRow(Registros);
            }
            
            TablaProductos.setModel(miModelo);
            TablaProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
            
        }catch(Exception x){
            System.out.println("Error al llenado de tabla "+x);
        }       
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewProducto;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

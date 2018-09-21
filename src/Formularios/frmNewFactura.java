package Formularios;

import java.sql.ResultSet;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoiventarios.Datos;

public class frmNewFactura extends javax.swing.JInternalFrame {
    
    DefaultTableModel miModelo;
    Datos misDatos = new Datos();
    private static Date utilDate = new Date();
    java.sql.Date FechaAct = new java.sql.Date(utilDate.getTime());
    Time TimeAct = new java.sql.Time(utilDate.getTime());
    Timestamp FechaTimeAct = new java.sql.Timestamp(utilDate.getTime());

    public frmNewFactura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        btnNewVenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVenta = new javax.swing.JTextField();
        ReconoceUsuario = new javax.swing.JLabel();
        ReconoceProducto = new javax.swing.JLabel();
        ReconoceCliente = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nueva Factura");
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Generar nueva venta.");

        jLabel2.setText("ID Producto:");

        jLabel3.setText("ID Cliente:");

        jLabel4.setText("ID Usuario:");

        txtProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductoFocusLost(evt);
            }
        });

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        txtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClienteFocusLost(evt);
            }
        });

        btnNewVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.png"))); // NOI18N
        btnNewVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewVentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad:");

        jLabel6.setText("ID_Ventas:");

        txtVenta.setEnabled(false);

        ReconoceUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif"))); // NOI18N

        ReconoceProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif"))); // NOI18N

        ReconoceCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif"))); // NOI18N

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jToggleButton1.setToolTipText("Seleccione");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jToggleButton3.setToolTipText("Seleccione");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        jToggleButton2.setToolTipText("Seleccione");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReconoceUsuario)
                            .addComponent(ReconoceProducto)
                            .addComponent(ReconoceCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNewVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReconoceUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNewVenta)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ReconoceProducto)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(ReconoceCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewVentaActionPerformed


        // :::::::::: VALIDAR DATOS ::::::::: //

        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar un ID Usuario.");
            txtUsuario.requestFocusInWindow();
            return;
        }

        if (txtCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar un ID Cliente.");
            txtCliente.requestFocusInWindow();
            return;
        }

        if (txtProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar un ID Producto.");
            txtProducto.requestFocusInWindow();
            return;
        }

        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor digitar una Cantidad.");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
        if (txtCantidad.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "No puedes vender 0 Productos intentelo nuevamente");
            txtCantidad.requestFocusInWindow();
            return;
        }
        
         // ::::::::: PREVENTA PARA VALIDAR LA CANTIDAD DE PRODUCTO ::::::::::: //
        
        try {

            int Num1 = 0, Total;
            int Num2 = Integer.parseInt(txtCantidad.getText());
            ResultSet rs = misDatos.tblProducto();
            while (rs.next()) {
                if (rs.getString("ID_Producto").equals(txtProducto.getText())) {
                    Num1 = Integer.parseInt(rs.getString("Cantidad"));
                }
            }

            Total = Num1 - Num2;

            if (Total < 0) {
                JOptionPane.showMessageDialog(rootPane, "El Numero de productos exede la cantidad disponible");
                txtCantidad.requestFocusInWindow();
                return;
            }

        } catch (Exception e) {
            System.out.println("Error Validando la cantidad de Productos " + e);
        }

        


        // ::::::::: INSERTAR DATOS ::::::::::: //
        
        boolean Controlador = true;

        if (misDatos.NewVentas(txtVenta.getText(), txtUsuario.getText(), txtCliente.getText(), txtProducto.getText(), txtCantidad.getText(), FechaTimeAct)) {

            if (misDatos.UdtNewProducto(txtProducto.getText(), txtCantidad.getText(), Controlador)) {
                JOptionPane.showMessageDialog(rootPane, "Nuevo Registro ingresado Correctamente.");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al descontar el producto..");
                return;
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al intentar ingresar el registro.");
            return;
        }

        // :::::::::::: LIMPIANDO CAMPOS ::::::::::: //
        
        
        txtUsuario.setText("");
        txtCliente.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");

    }//GEN-LAST:event_btnNewVentaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        // ::::::::::: INGRESA EL NUMERO DE NUEVA FACTURA :::::::::::: //

        int pos = misDatos.NumVentas();
        String txt = Integer.toString(pos);
        txtVenta.setText(txt);



    }//GEN-LAST:event_formInternalFrameActivated

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost


        // :::::::::: COMPRUEBA SI EL DATO EXIXTE Y COAMBIA EL ICOMO :::::::::: //

        if (misDatos.CompUsuario(txtUsuario.getText())) {
            ReconoceUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/True.gif")));
        } else {
            ReconoceUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif")));
        }

    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusLost

        if (misDatos.CompCliente(txtCliente.getText())) {
            ReconoceCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/True.gif")));
        } else {
            ReconoceCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif")));
        }

    }//GEN-LAST:event_txtClienteFocusLost

    private void txtProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductoFocusLost

        if (misDatos.CompProducto(txtProducto.getText())) {
            ReconoceProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/True.gif")));
        } else {
            ReconoceProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/False.gif")));
        }

    }//GEN-LAST:event_txtProductoFocusLost

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            String titulos[] = {"ID Usuario", "Nombre", "Apellido", "Perfil"};
            String Regisgtros[] = new String[4];
            miModelo = new DefaultTableModel(null, titulos);

            ResultSet rs = misDatos.tblUser();
            while (rs.next()) {

                Regisgtros[0] = rs.getString("ID_Usuario");
                Regisgtros[1] = rs.getString("Nombre");
                Regisgtros[2] = rs.getString("Apellido");
                Regisgtros[3] = misDatos.ConsPerfil(rs.getString("Nombre"));
                miModelo.addRow(Regisgtros);

            }
            table.setModel(miModelo);

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla usuarios " + e);
        }

        table.setVisible(true);

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed

        try {

            String titulos[] = {"ID Cliente", "Nombre", "Apellido", "Telefono", "Celular", "Email"}; // crear los titulos
            String Regisgtros[] = new String[6];

            miModelo = new DefaultTableModel(null, titulos); // agrega los titulos a la tabla

            ResultSet rs = misDatos.tblCliente();
            while (rs.next()) {

                Regisgtros[0] = rs.getString("ID_Cliente");
                Regisgtros[1] = rs.getString("Nombre");
                Regisgtros[2] = rs.getString("Apellido");
                Regisgtros[3] = rs.getString("Telefono");
                Regisgtros[4] = rs.getString("Celular");
                Regisgtros[5] = rs.getString("e_mail");
                miModelo.addRow(Regisgtros);

            }
            table.setModel(miModelo);
        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla de Clientes " + e);
        }

        table.setVisible(true);

    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        try{

            String Titulos[] = {"ID Producto","Nombre","Categoria","Precio","Cantidad"};
            String Registros[]= new String[5];

            miModelo = new DefaultTableModel(null, Titulos);

            ResultSet rs = misDatos.tblProducto();
            while(rs.next()){
                Registros[0] = rs.getString("ID_Producto");
                Registros[1] = rs.getString("Nombre");
                Registros[2] = rs.getString("Categoria");
                Registros[3] = rs.getString("PrecioU");
                Registros[4] = rs.getString("Cantidad");
                miModelo.addRow(Registros);
            }

            table.setModel(miModelo);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);

        }catch(Exception x){
            System.out.println("Error al llenado de tabla "+x);
        }

        table.setVisible(true);

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ReconoceCliente;
    private javax.swing.JLabel ReconoceProducto;
    private javax.swing.JLabel ReconoceUsuario;
    private javax.swing.JButton btnNewVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}

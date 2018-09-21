package proyectoiventarios;

import java.sql.*;

public class Datos {

    Connection Conexion;
    PreparedStatement Login, ingreso, producto, ComUser, tblUser, delUser, delClient,
            conperfil, regCliente, tblCliente, udtDatosUser, udtClave, delProducto,
            NewVenta, NumVentas, ComClien, ComProd, tblProductos, udtVentaPro, tblVentas, ediCliente, Pedidos, ConsPedidos,
            tblProveedores, newProveedor,delProveedor;
    ResultSet rsLogin, rsComUser, rsComClien, rsComProd, rsconperfil, rsNumVentas;

    public Datos() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/SistemaInventario", "root", "a856e875c0a3");
            Login = Conexion.prepareStatement("select * from Usuarios where Nombre=? and Clave=?");
            ingreso = Conexion.prepareStatement("insert into  Usuarios values(?,?,?,?,?)");
            ComUser = Conexion.prepareStatement("select * from Usuarios where ID_Usuario=?");
            ComClien = Conexion.prepareStatement("select * from Clientes where ID_Cliente=?");
            ComProd = Conexion.prepareStatement("select * from Productos where ID_Producto=?");
            tblUser = Conexion.prepareStatement("select * from Usuarios");
            delUser = Conexion.prepareStatement("delete from Usuarios where ID_Usuario=?");
            delClient = Conexion.prepareStatement("delete from Clientes where ID_Cliente=?");
            conperfil = Conexion.prepareStatement("select * from Usuarios where Nombre=? and Perfil=?");
            regCliente = Conexion.prepareStatement("insert into  Clientes values(?,?,?,?,?,?)");
            tblCliente = Conexion.prepareStatement("select * from Clientes");
            udtDatosUser = Conexion.prepareStatement("Update usuarios Set Nombre=?, Apellido=? where ID_Usuario=?");
            udtClave = Conexion.prepareStatement("Update usuarios Set Clave=? where ID_Usuario=?");
            producto = Conexion.prepareStatement("insert into  productos values(?,?,?,?,?)");
            delProducto = Conexion.prepareStatement("delete from productos where ID_Producto=?");
            NewVenta = Conexion.prepareStatement("insert into ventas Value (?,?,?,?,?,?)");
            NumVentas = Conexion.prepareStatement("select count(*) from ventas");
            tblProductos = Conexion.prepareStatement("select * from Productos");
            tblVentas = Conexion.prepareStatement("select * from Ventas");
            udtVentaPro = Conexion.prepareStatement("Update productos Set Cantidad=? where ID_Producto=?");
            ediCliente = Conexion.prepareStatement("Update clientes Set Nombre=?, Apellido=?,Telefono=?,Celular=?,e_mail=? where ID_Cliente=? ");
            Pedidos = Conexion.prepareStatement("insert into pedidos values(?,?,?,?) ");
            ConsPedidos = Conexion.prepareStatement("select * from pedidos");
            tblProveedores = Conexion.prepareStatement("select * from Proveedores");
            newProveedor = Conexion.prepareStatement("insert into Proveedores Value (?,?,?)");
            delProveedor = Conexion.prepareStatement("delete from Proveedores where ID_Proveedor=?");


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexion a la Base de Datos. " + e);
        }
    }

    public boolean RegistrarProducto(String ID_Producto, String Nombre, String Categoria, String PrecioU, String Cantidad) {

        try {
            producto.setString(1, ID_Producto);
            producto.setString(2, Nombre);
            producto.setString(3, Categoria);
            producto.setString(4, PrecioU);
            producto.setString(5, Cantidad);

            producto.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error de Registro Producto " + e);
            return false;
        }

    }

    public boolean RegistrarPedido(String id_pedido, String id_producto, String id_provedor, String num) {


        try {
            Pedidos.setString(1, id_pedido);
            Pedidos.setString(2, id_producto);
            Pedidos.setString(3, id_provedor);
            Pedidos.setString(4, num);

            Pedidos.executeUpdate();
            return true;

        } catch (Exception e) {

            System.out.println("Error de Registro de Pedidos" + e);
            return false;
        }

    }

    public boolean ValidarUsuario(String User, String Clave) {

        try {
            Login.setString(1, User);
            Login.setString(2, Clave);
            rsLogin = Login.executeQuery();
            if (rsLogin.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al validar el usuario " + e);
            return false;
        }
    }

    public boolean DeleteProducto(String ID_Producto) {

        try {

            delProducto.setString(1, ID_Producto);

            delProducto.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el Producto " + e);
            return false;
        }
    }

    public boolean RegistrarUsuario(String id_User, String nom, String Apellido, String Clave, String Perfil) {

        try {
            ingreso.setString(1, id_User);
            ingreso.setString(2, nom);
            ingreso.setString(3, Apellido);
            ingreso.setString(4, Clave);
            ingreso.setString(5, Perfil);

            ingreso.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error de Registro " + e);
            return false;
        }

    }

    public boolean CompUsuario(String idUser) {

        try {

            ComUser.setString(1, idUser);

            rsComUser = ComUser.executeQuery();
            if (rsComUser.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al comprobar el usuario " + e);
            return false;
        }
    }

    public ResultSet tblUser() {

        try {
            return tblUser.executeQuery();

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla usuarios " + e);
            return null;
        }
    }

    public boolean DeleteUser(String IDUser) {

        try {

            delUser.setString(1, IDUser);

            delUser.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario " + e);
            return false;
        }
    }

    public boolean DeleteClient(String IDClien) {

        try {

            delClient.setString(1, IDClien);

            delClient.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el Cliente " + e);
            return false;
        }
    }

    public String ConsPerfil(String User) {

        try {


            conperfil.setString(1, User);
            conperfil.setString(2, "1");

            rsconperfil = conperfil.executeQuery();
            if (rsconperfil.next()) {
                return "Administrador";
            } else {

                conperfil.setString(1, User);
                conperfil.setString(2, "2");

                rsconperfil = conperfil.executeQuery();
                if (rsconperfil.next()) {
                    return "Empleado";
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error al consultar el usuario " + e);
            return null;
        }
    }

    public boolean RegistroCliente(String IdUser, String Name, String Apellido, String Telefono, String Celular, String Email) {

        try {
            regCliente.setString(1, IdUser);
            regCliente.setString(2, Name);
            regCliente.setString(3, Apellido);
            regCliente.setString(4, Telefono);
            regCliente.setString(5, Celular);
            regCliente.setString(6, Email);

            regCliente.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println("Error de Registro cliente" + e);
            return false;
        }


    }

    public boolean EditarCliente(String Id_cliente, String Nombre, String Apellido, String tel, String celu, String correo) {

        try {

            ediCliente.setString(6, Id_cliente);
            ediCliente.setString(1, Nombre);
            ediCliente.setString(2, Apellido);
            ediCliente.setString(3, tel);
            ediCliente.setString(4, celu);
            ediCliente.setString(5, correo);

            ediCliente.executeUpdate();

            return true;
        } catch (Exception e) {
            System.out.println("Error al Modificar Cliente" + e);
            return false;
        }

    }

    public ResultSet tblCliente() {

        try {


            return tblCliente.executeQuery();

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla Clientes " + e);
            return null;
        }
    }

    public boolean udtDatosUtser(String Nombre, String Aellido, String ID_User) {

        try {
            udtDatosUser.setString(1, Nombre);
            udtDatosUser.setString(2, Aellido);
            udtDatosUser.setString(3, ID_User);

            udtDatosUser.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error Actualizacion de usuario " + e);
            return false;
        }
    }

    public boolean udtClave(String Clave, String ID_User) {

        try {
            udtClave.setString(1, Clave);
            udtClave.setString(2, ID_User);

            udtClave.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error de Actualizacion de clave " + e);
            return false;
        }
    }

    public boolean NewVentas(String ID_Venta, String ID_Usuario, String ID_Cliente, String ID_Producto, String CantidadP, Timestamp Fecha) {

        try {
            NewVenta.setString(1, ID_Venta);
            NewVenta.setString(2, ID_Usuario);
            NewVenta.setString(3, ID_Cliente);
            NewVenta.setString(4, ID_Producto);
            NewVenta.setString(5, CantidadP);
            NewVenta.setTimestamp(6, Fecha);

            NewVenta.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error de ingreso de nueva venta " + e);
            return false;
        }
    }

    public int NumVentas() {
        try {

            int H = 1001;

            rsNumVentas = NumVentas.executeQuery();

            while (rsNumVentas.next()) {
                H += rsNumVentas.getInt(1);
            }
            return H;
        } catch (Exception e) {
            System.out.println("Error de consulta de numero de ventas " + e);
            return -1;
        }
    }

    public boolean CompCliente(String idClient) {

        try {

            ComClien.setString(1, idClient);

            rsComClien = ComClien.executeQuery();
            if (rsComClien.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al comprobar el cliente " + e);
            return false;
        }
    }

    public boolean CompProducto(String idProd) {

        try {

            ComProd.setString(1, idProd);

            rsComProd = ComProd.executeQuery();
            if (rsComProd.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al comprobar el usuario " + e);
            return false;
        }
    }

    public ResultSet tblProducto() {

        try {

            return tblProductos.executeQuery();

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla en la  Productos " + e);
            return null;
        }
    }

    public ResultSet ConsPedidos() {
        try {
            return ConsPedidos.executeQuery();


        } catch (Exception e) {
            System.out.println("Error busqueda de datos en la tabla Pedidos" + e);
            return null;
        }

    }

    public boolean UdtNewProducto(String IdProd, String Cantidad,boolean Controlador) {
        try {

            ResultSet rs1 = tblProductos.executeQuery();
            int Numero1, Total = 0;
            int Numero2 = Integer.parseInt(Cantidad);
            String Dato;

            while (rs1.next()) {

                if (Controlador) {
                    if (rs1.getString("ID_Producto").equals(IdProd)) {
                        Numero1 = Integer.parseInt(rs1.getString("Cantidad"));
                        Total = Numero1 - Numero2;
                    }
                } else {
                    if (rs1.getString("ID_Producto").equals(IdProd)) {
                        Numero1 = Integer.parseInt(rs1.getString("Cantidad"));
                        Total = Numero1 + Numero2;
                    }
                }

            }
            Dato = Integer.toString(Total);

            udtVentaPro.setString(1, Dato);
            udtVentaPro.setString(2, IdProd);

            udtVentaPro.executeUpdate();
            return true;

        } catch (SQLException | NumberFormatException x) {
            System.out.println("Error busqueda de datos tabla Productos " + x);
            return false;
        }
    }

    public ResultSet tblVentas() {

        try {

            return tblVentas.executeQuery();

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla Ventas " + e);
            return null;
        }
    }

    public ResultSet tblProveedores() {

        try {

            return tblProveedores.executeQuery();

        } catch (Exception e) {
            System.out.println("Error busqueda de datos tabla Proveedores " + e);
            return null;
        }
    }

    public boolean newProveedor(String IdProv, String Name, String TipoP) {
        try {
            newProveedor.setString(1, IdProv);
            newProveedor.setString(2, Name);
            newProveedor.setString(3, TipoP);
            newProveedor.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error de Registro cliente" + e);
            return false;
        }
    }
    
    public boolean DeleteProveedor(String IDProve) {

        try {

            delProveedor.setString(1, IDProve);

            delProveedor.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el Proveedor " + e);
            return false;
        }
    }
    
}

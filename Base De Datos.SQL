SET FOREIGN_KEY_CHECKS=0;




CREATE TABLE Clientes
(
	ID_Cliente VARCHAR(20) NOT NULL,
	Nombre VARCHAR(20),
	Apellido VARCHAR(20),
	Telefono VARCHAR(20),
	Celular VARCHAR(20),
	e_mail VARCHAR(40),
	PRIMARY KEY (ID_Cliente)
) 
;


CREATE TABLE Pedidos
(
	ID_Pedido VARCHAR(20) NOT NULL,
	ID_Producto VARCHAR(20),
	ID_Proveedor VARCHAR(20),
	NumPedidos VARCHAR(20),
	PRIMARY KEY (ID_Pedido),
	KEY (ID_Producto),
	KEY (ID_Proveedor)
) 
;


CREATE TABLE Productos
(
	ID_Producto VARCHAR(20) NOT NULL,
	Nombre VARCHAR(40),
	Categoria VARCHAR(20),
	PrecioU VARCHAR(20),
	Cantidad VARCHAR(5),
	PRIMARY KEY (ID_Producto)
) 
;


CREATE TABLE Proveedores
(
	ID_Proveedor VARCHAR(20) NOT NULL,
	Nombre VARCHAR(20),
	TipoProducto VARCHAR(20),
	PRIMARY KEY (ID_Proveedor)
) 
;


CREATE TABLE Usuarios
(
	ID_Usuario VARCHAR(20) NOT NULL,
	Nombre VARCHAR(20),
	Apellido VARCHAR(20),
	Clave VARCHAR(20),
	Perfil VARCHAR(5),
	PRIMARY KEY (ID_Usuario)
) 
;


CREATE TABLE Ventas
(
	ID_Venta VARCHAR(20) NOT NULL,
	ID_Usuario VARCHAR(20),
	ID_Cliente VARCHAR(20),
	ID_Producto VARCHAR(20),
	CantidadP VARCHAR(10),
	Fecha TIMESTAMP,
	PRIMARY KEY (ID_Venta),
	KEY (ID_Cliente),
	KEY (ID_Producto),
	KEY (ID_Usuario)
) 
;



SET FOREIGN_KEY_CHECKS=1;


ALTER TABLE Pedidos ADD CONSTRAINT FK_Pedidos_Productos 
	FOREIGN KEY (ID_Producto) REFERENCES Productos (ID_Producto)
;

ALTER TABLE Pedidos ADD CONSTRAINT FK_Pedidos_Proveedores 
	FOREIGN KEY (ID_Proveedor) REFERENCES Proveedores (ID_Proveedor)
;

ALTER TABLE Ventas ADD CONSTRAINT FK_Ventas_Clientes 
	FOREIGN KEY (ID_Cliente) REFERENCES Clientes (ID_Cliente)
;

ALTER TABLE Ventas ADD CONSTRAINT FK_Ventas_Productos 
	FOREIGN KEY (ID_Producto) REFERENCES Productos (ID_Producto)
;

ALTER TABLE Ventas ADD CONSTRAINT FK_Ventas_Usuarios 
	FOREIGN KEY (ID_Usuario) REFERENCES Usuarios (ID_Usuario)
;

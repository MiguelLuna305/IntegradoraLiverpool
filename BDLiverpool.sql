CREATE DATABASE IntegradoraLiverpool;
GO

use IntegradoraLiverpool;
GO

CREATE TABLE Tipo(
idTipo INT IDENTITY (0,1),
tipoNombre VARCHAR (15), 
PRIMARY KEY (idTipo)
);

GO
create table Departamento(
idDepartamento int IDENTITY (0,1),
nombre varchar(15),
estado varchar(5) not null default 'true',
primary key(idDepartamento)
);

GO
CREATE TABLE Usuario (
idUsuario INT IDENTITY (0,1),
nombre VARCHAR(25),
apellidoP VARCHAR (20),
apellidoM VARCHAR (20),
fechaNacimiento DATE,
direccion VARCHAR(45),
correo VARCHAR(45) UNIQUE,
contraseña VARCHAR(45),
nombreUser VARCHAR(45) UNIQUE,
estado varchar(5) not null default 'true',
idTipo INT,
idDepartamento INT,
PRIMARY KEY (idUsuario),
FOREIGN KEY (idTipo) REFERENCES Tipo ,
FOREIGN KEY (idDepartamento) REFERENCES Departamento
);	
go

create table Categoria(
idCategoria int identity(0,1),
nombre varchar(15),
estado varchar(5) not null default 'true',
IdDepartamento int,
primary key (idCategoria),
FOREIGN KEY (departamentoIdDEpartamento) REFERENCES Departamento
);

GO
CREATE TABLE Venta(
idVentas INT IDENTITY(0,1),
fecha DATE,
estado varchar(5) not null default 'true',	
PRIMARY KEY (idVentas)
);

go

CREATE TABLE Producto(
idProducto int identity(0,1),
codigo int,
nombre varchar(15),
precioVenta MONEY,
precioCompra MONEY,
existencias int,
imagen VARCHAR(50),
estado varchar(5) not null default 'true',
stock int,
marca Varchar(45),
IdCategoria int,
primary key (codigo),
foreign key (categoriaIdCategoria) references Categoria,
);

GO
CREATE TABLE DetalleVenta(
idDetalle int identity(0,1),
idVenta INT,	
costo float,
idProducto int,
PRIMARY KEY (idDetalle),
FOREIGN KEY (idVenta) REFERENCES Venta,
FOREIGN KEY (idProducto) REFERENCES Producto
);


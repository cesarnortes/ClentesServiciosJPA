# Clientes y Servicios con Spring JPA

Desarrollo de la capa de acceso a datos con Spring JPA e Hibernate como herramienta de ORM.

Es importante observar la fecha de modificación de los archivos del proyecto.

Según vaya desarrollando y explicando en comentarios el código iré haciendo commits sobre el proyecto para que esté actualizado.

El script de la base de datos con la que vamos a trabajar es :

```sql
CREATE DATABASE BServicios;
USE BServicios;

CREATE TABLE TClientes  (
IdCliente   INT PRIMARY KEY AUTO_INCREMENT,
Nombre      VARCHAR(20)   NOT NULL,
Telefono    VARCHAR(12)
);

CREATE TABLE TServicios  (
IdServicio   INT PRIMARY KEY AUTO_INCREMENT,
IdCliente INT NOT NULL,
Fecha      DATE NOT NULL,
Descripcion VARCHAR(100),
FOREIGN KEY (IdCliente) REFERENCES TClientes (IdCliente)
);
```

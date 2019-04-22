package dao;

 import java.util.List;

import dominio.Cliente;
import dominio.Servicio;

public interface IModelo {
	
	//la Clase ModeloDao tiene que tener una interfaz donde implemente todos los metodos necesarios
	//para trabajar con la base de datos y los demas Dao
	

	void alta(Cliente cliente);
	void modificacion(Cliente cliente);
	void baja(Cliente cliente);
	Servicio consultaId(Cliente cliente);
	List<Cliente> ConsultaAllServicios();
	
	void alta(Servicio servicio);
	void modificacion(Servicio servicio);
	void baja(Servicio servicio);
	Servicio consultaId(Servicio servicio);
	List<Servicio> ConsultaAllClientes();
	
	
}

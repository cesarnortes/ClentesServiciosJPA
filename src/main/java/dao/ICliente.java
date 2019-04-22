package dao;

 import java.util.List;

import dominio.Cliente;
 
public interface ICliente {

	void alta(Cliente cliente);
	void modificacion(Cliente cliente);
	void baja(Cliente cliente);
	Cliente consultaId(Cliente cliente);
	List<Cliente> ConsultaAll();
	
}

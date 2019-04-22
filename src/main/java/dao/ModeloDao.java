package dao;

 import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import dominio.Cliente;
import dominio.Servicio;


@Transactional
public class ModeloDao implements IModelo {
	
	IServicio servicioDao;
	ICliente clienteDao;
	
	
 

	public ModeloDao() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Es importante darse cuenta del uso de la inyección a interfaz de Spring
		this.servicioDao = (IServicio) context.getBean("servicioDao");
		this.clienteDao = (ICliente) context.getBean("clienteDao");

	}

	public IServicio getServicioDao() {
		return servicioDao;
	}

	public void setServicioDao(ServicioDao servicioDao) {
		this.servicioDao = servicioDao;
	}

	public ICliente getClienteDao() {
		return clienteDao;
	}

	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	
	
	
	////////////////////////////////////////////////////////////////////////////////
	
	
	public void alta(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	public void modificacion(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	public void baja(Cliente cliente) {
		// TODO Auto-generated method stub

	}

 	public Servicio consultaId(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

 	public  List<Cliente> ConsultaAllServicios() {
		// TODO Auto-generated method stub
		return null;
	}

	public void alta(Servicio servicio) {
		// TODO Auto-generated method stub

	}

	public void modificacion(Servicio servicio) {
		// TODO Auto-generated method stub

	}

	public void baja(Servicio servicio) {
		// TODO Auto-generated method stub

	}

	public Servicio consultaId(Servicio servicio) {
		// TODO Auto-generated method stub
		return null;
	}

	public  List<Servicio> ConsultaAllClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}

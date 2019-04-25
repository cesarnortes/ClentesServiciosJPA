package dao;

import java.util.ArrayList;
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

		// Es importante darse cuenta del uso de la inyección a interfaz de Spring
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

	// Ahora desarrollariamos la lógica de las operaciónes con la base de datos,
	// apoyandonos en los dao y no en una sola variable entityManager,
	// esto nos permite trabajar con independencia a la tecnologia de acceso a datos
	// con la que están desarrollados los DAO
	// de manera que podriamos tener esta clase modelo y mañana cambiar los DAO a
	// springJDBC o de gestor de base de datos
	// y la aplicación seguiria funcionando con una modificación lo mas minima en el
	// código de la aplicacion

	public void alta(Cliente cliente) {
		// TODO Auto-generated method stub

		this.clienteDao.alta(cliente);

	}

	public void modificacion(Cliente cliente) {
		// TODO Auto-generated method stub

		this.clienteDao.modificacion(cliente);

	}

	public void baja(Cliente cliente) {
		// TODO Auto-generated method stub

		if (cliente.getServicios().size() > 0) {
			System.out.println("Dentro del if");
			
			for (Servicio servicio : cliente.getServicios()) {
				this.servicioDao.baja(servicio);
			}
			
			cliente.setServicios(new ArrayList<Servicio>());
			this.clienteDao.baja(cliente);


		} else {

			cliente.setServicios(new ArrayList<Servicio>());
			System.out.println("fuera del if");
			this.clienteDao.baja(cliente);

		}


	}

	public Cliente consultaIdCliente(int idCliente) {
		// TODO Auto-generated method stub

		return this.clienteDao.consultaId(idCliente);

	}

	public List<Cliente> ConsultaAllClientes() {
		// TODO Auto-generated method stub

		return this.clienteDao.ConsultaAll();

	}

	////////////////////////////////////////////////////

	public void alta(Servicio servicio) {
		// TODO Auto-generated method stub

		this.servicioDao.alta(servicio);

	}

	public void modificacion(Servicio servicio) {
		// TODO Auto-generated method stub

		this.servicioDao.modificacion(servicio);

	}

	public void baja(Servicio servicio) {
		// TODO Auto-generated method stub

		this.servicioDao.baja(servicio);

	}

	public Servicio consultaIdServicio(int idServicio) {
		// TODO Auto-generated method stub

		return this.servicioDao.consultaId(idServicio);

	}

	public List<Servicio> ConsultaAllServicios() {
		// TODO Auto-generated method stub

		return this.servicioDao.ConsultaAll();

	}

}

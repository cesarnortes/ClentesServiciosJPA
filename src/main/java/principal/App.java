package principal;

import java.util.ArrayList;
import java.util.List;

import dao.ModeloDao;
import dominio.Cliente;
import dominio.Servicio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		// Obtención de la fecha actual
		java.util.Date now = new java.util.Date();
		java.sql.Date datesql = new java.sql.Date(now.getTime());
		
		
		
		
		
		
		//El principal o he usado como pruebas sucias y no es muy legible, la capa de acceso a datos funciona
		// es recomendaber que escribas el codigo de cero respetando la lógica de la integridad de la base de datos 
		// como dar de alta primero entidades que no dependan de otras como clientes y despues las entidades débiles como servicios
		//para asi evitar las excepciones
		
		
		
		
		
		
		//usando el diseño del modelo podemos usar toda la funcionalidad de la capa de acceso a datos desde una sola variable
		// haciendo mas sencillo y limpio el codigo en las llamadas a los DAO
    	ModeloDao modeloDao = new ModeloDao();

    	
    	
    	
    	Cliente cliente1 = new Cliente();
    	cliente1.setNombre("Juan");
    	cliente1.setTelefono("6165854623");
    	
    	Cliente cliente2 = new Cliente();
    	cliente2.setNombre("Carlos");
    	cliente2.setTelefono("956857451");
    
    	Cliente cliente3 = new Cliente();
    	cliente3.setNombre("Cesar");
    	cliente3.setTelefono("616487511");
    	
    	Cliente cliente4 = new Cliente();
    	cliente4.setNombre("maribel");
    	cliente4.setTelefono("652652698");
    	
    	Cliente cliente5 = new Cliente();
    	cliente5.setNombre("carmen");
    	cliente5.setTelefono("789562341");
    	
    	
    	Servicio servicio1 = new Servicio();
    	servicio1.setDescripcion("Servicio 1");
    	servicio1.setFecha(datesql);
    	
    	Servicio servicio2 = new Servicio();
    	servicio2.setDescripcion("Servicio 4");
    	servicio2.setFecha(datesql);
    	
    	List<Servicio> listaServicioCliente1= new ArrayList<Servicio>();
    	listaServicioCliente1.add(servicio1);
    	listaServicioCliente1.add(servicio2);
    	cliente1.setServicios(listaServicioCliente1);
    	System.out.println(cliente1.getServicios().get(0).getDescripcion());

    	
    	
    	Servicio servicio3 = new Servicio();
    	servicio3.setDescripcion("Servicio 3");
    	servicio3.setFecha(datesql);
    	
    	Servicio servicio4 = new Servicio();
    	servicio4.setDescripcion("Servicio 4");
    	servicio4.setFecha(datesql);
    	
    	Servicio servicio5 = new Servicio();
    	servicio5.setDescripcion("Servicio 5");
    	servicio5.setFecha(datesql);
    	
    	Servicio servicio6 = new Servicio();
    	servicio6.setDescripcion("Servicio 6");
    	servicio6.setFecha(datesql);
    	
    	List<Servicio> listaServicioCliente2= new ArrayList<Servicio>();
    	listaServicioCliente2.add(servicio3);
    	listaServicioCliente2.add(servicio4);
    	listaServicioCliente2.add(servicio5);
    	listaServicioCliente2.add(servicio6);
    	cliente2.setServicios(listaServicioCliente2);

    	//damos de alta los clientes con sus servicios seguido sus servicios

    	servicio6.setCliente(modeloDao.consultaIdCliente(6));
    	servicio5.setCliente(modeloDao.consultaIdCliente(6));
    	servicio4.setCliente(modeloDao.consultaIdCliente(8));
    	servicio3.setCliente(modeloDao.consultaIdCliente(9));
    	servicio2.setCliente(modeloDao.consultaIdCliente(9));
    	servicio1.setCliente(modeloDao.consultaIdCliente(9));


    	//modeloDao.alta(cliente4);
    	//modeloDao.alta(cliente5);
    	

    /*	modeloDao.alta(servicio1);
    	modeloDao.alta(servicio2);
    	modeloDao.alta(servicio3);
    	modeloDao.alta(servicio4);
    	modeloDao.alta(servicio5);
    	modeloDao.alta(servicio6);*/

    	
  
    	
    	
    	
    	
    	//modificamos los clientes y los nuevos servicios
    	
    	/*
    	Servicio serviciosmodServicio = modeloDao.consultaIdServicio(2);
    	
    	serviciosmodServicio.setDescripcion("Servicios 2");
    	
    	modeloDao.modificacion(serviciosmodServicio);
    	
    	Cliente clienteModificadoCliente = modeloDao.consultaIdCliente(7);
    	
    	clienteModificadoCliente.setNombre("Frachesco");
    	
    	modeloDao.modificacion(clienteModificadoCliente);
*/
    	
    	
    	
    	
    //Cliente clienteBorradoCliente = modeloDao.consultaIdCliente(5);
    //	System.out.println(clienteBorradoCliente.getIdCliente());

    	//modeloDao.baja(clienteBorradoCliente);
    //	modeloDao.baja(modeloDao.consultaIdCliente(4));
    	
    	//System.out.println(cliente1.getNombre());
    	//System.out.println(cliente1.getServicios().get(0).getDescripcion());
    	
    	//cliente1 = modeloDao.consultaIdCliente(1);
    	//cliente1.setNombre("Juanito");
    	//modeloDao.modificacion(cliente1);
    	
    	//System.out.println(cliente1.getNombre());
    	//System.out.println(cliente1.getServicios().get(0).getDescripcion());
    	
    	//System.out.println("-----------------------------");
     	

    	
    	
    	//eliminamos un cliente y listamos todos los clientes
    	
    	//Servicio servicioABorrarServicio = modeloDao.consultaIdServicio(5);
    	
		//System.out.println("Borrando servicio");
		
/*		System.out.println("Id Servicio: "+servicioABorrarServicio.getIdServicio()+" - Descripción: "+servicioABorrarServicio.getDescripcion() +
				" Nombre Cliente: " + servicioABorrarServicio.getCliente().getNombre());
	*/	
    	//modeloDao.baja(servicioABorrarServicio);
    	

    	
 /*   	for(Cliente cliente : modeloDao.ConsultaAllClientes()) {
    		System.out.println();
    		System.out.println("Id Cliente: "+cliente.getIdCliente()+" Nombre Cliente: "+cliente.getNombre() +
    				" Telefono: " + cliente.getTelefono());
    		System.out.println("Servicios: ");
    		
    		for(Servicio servicio : cliente.getServicios()) {
    			System.out.println("Id Servicio: "+servicio.getIdServicio());
    			System.out.println("Descripcion Servicio: "+servicio.getDescripcion());
    			System.out.println("Fecha Servicio: "+servicio.getFecha());

    		}
    	}
*/
    	
    	//Servicio serviciosfranServicio = modeloDao.consultaIdServicio(6);
		//System.out.println(serviciosfranServicio.getIdServicio());

    	//Cliente clienteFranCliente = modeloDao.consultaIdCliente(4);
		//System.out.println(clienteFranCliente.getIdCliente());

    	
    	
    	
		//System.out.println("borrando servicio");

		//modeloDao.baja(serviciosfranServicio);
 
		//System.out.println("borrando array de servicios del cliente");

		//clienteFranCliente.setServicios(new ArrayList<Servicio>());
		
		//System.out.println("borrando Cliente");
		//modeloDao.baja(clienteFranCliente);

    	
    	//consultamos los clientes y comoribamos que extrae los datos derivado de las otras tablas como los servicios
    	
		System.out.println("Consulta All de clientes");

    	
    	for(Cliente cliente : modeloDao.ConsultaAllClientes()) {
    		System.out.println();
    		System.out.println("Id Cliente: "+cliente.getIdCliente()+" Nombre Cliente: "+cliente.getNombre() +
    				" Telefono: " + cliente.getTelefono());
    		System.out.println("Servicios: ");
    		
    		for(Servicio servicio : cliente.getServicios()) {
    			System.out.println("Id Servicio: "+servicio.getIdServicio());
    			System.out.println("Descripcion Servicio: "+servicio.getDescripcion());
    			System.out.println("Fecha Servicio: "+servicio.getFecha());

    		}
    	}
		System.out.println( );
		System.out.println( );

		System.out.println("Consulta Id de cliente");
		Cliente clienteid = modeloDao.consultaIdCliente(9);
		System.out.println();
		System.out.println("Id Cliente: "+clienteid.getIdCliente()+" Nombre Cliente: "+clienteid.getNombre() +
				" Telefono: " + clienteid.getTelefono());
		System.out.println("Servicios: ");
		
		for(Servicio servicio : clienteid.getServicios()) {
			System.out.println("Id Servicio: "+servicio.getIdServicio());
			System.out.println("Descripcion Servicio: "+servicio.getDescripcion());
			System.out.println("Fecha Servicio: "+servicio.getFecha());

		}
		
		System.out.println( );
		System.out.println( );

		System.out.println("Consulta all de Servicios");
		
    	for(Servicio servicio : modeloDao.ConsultaAllServicios()) {

			System.out.println("Id Servicio: "+servicio.getIdServicio());
			System.out.println("Descripcion Servicio: "+servicio.getDescripcion());
			System.out.println("Fecha Servicio: "+servicio.getFecha());
			
    	}
		
		System.out.println( );
		System.out.println( );

		System.out.println("Consulta Id de Servicio");
		
		Servicio ServicioId = modeloDao.consultaIdServicio(7);

			System.out.println("Id Servicio: "+ServicioId.getIdServicio());
			System.out.println("Descripcion Servicio: "+ServicioId.getDescripcion());
			System.out.println("Fecha Servicio: "+ServicioId.getFecha());
			System.out.println("Cliente nombre Servicio: "+ServicioId.getCliente().getNombre());
			System.out.println("Cliente Id Servicio: "+ServicioId.getCliente().getIdCliente());

    	
    	
    }
}

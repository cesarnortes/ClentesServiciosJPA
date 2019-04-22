package repaso.ClentesServiciosJPA;

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

    	ModeloDao modeloDao = new ModeloDao();
    	
    	
    	Cliente cliente1 = new Cliente();
    	cliente1.setNombre("Juan");
    	cliente1.setTelefono("6165854623");
    	
    	Cliente cliente2 = new Cliente();
    	cliente2.setNombre("Carlos");
    	cliente2.setTelefono("956857451");
    
    	
    	Servicio servicio1 = new Servicio();
    	servicio1.setDescripcion("Servicio 1");
    	servicio1.setFecha(datesql);
    	
    	Servicio servicio2 = new Servicio();
    	servicio2.setDescripcion("Servicio 4");
    	servicio2.setFecha(datesql);
    	
    	
    	
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
    	
    	
    	//damos de alta los clientes y seguido sus servicios
    	
    	
    	
    	
    	//consultamos los clientes y comoribamos que extrae los datos derivado de las otras tablas como los servicios
    	
    	
    	
    	
    	//modificamos los clientes y los servicios
    	
    	
    	
    	
    	
    	//eliminamos un cliente y listamos todos los clientes

    	
    	
    	
    	
    	
    }
}

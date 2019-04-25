package dao;

 import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dominio.Cliente;
  
@Repository
@Transactional
public class ClienteDao implements ICliente {

	
	@PersistenceContext
	EntityManager em;
	
	
	
	public ClienteDao() {}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	
	/////////////////////////////////////////////////////////
	
	
	public void alta(Cliente cliente) {
		// TODO Auto-generated method stub
		
		em.persist(cliente);

	}

	public void modificacion(Cliente cliente) {
		// TODO Auto-generated method stub
		
		em.merge(cliente);

	}

	
	public void baja(Cliente cliente) {
		// TODO Auto-generated method stub
		//Esta instruccion la pongo de esta forma debido a que tuve un error al eliminar el cliente
		//no se muy bien cual fue el error pero creo que tiene que ver a la hora de la instancia de la sesión
		// de persistencia con la instancia del ciente, de este modo comprueba si el cliente que le pasamos está en
		// un registro de la base de datos y por algun motivo que desconozco no lo encuantra la entidad o no puede borrarla
		// y lo que hace es un merge de la entidad "actualización" y el metodo merge devuelve una instancia actual de la entidad, al no cambiar los valores
		// de la entidad no cambia ningun registro y solo devuelve la instancia actual en la sesion de persistencia y funciona, sea como sea 
		// desconozco el error y asi funciona, MEJOR NO TOCAR XD..
		em.remove(em.contains(cliente) ? cliente : em.merge(cliente));

	}
	
	@Transactional(readOnly = true)
	public Cliente consultaId(int idCliente) {
		// TODO Auto-generated method stub
		
		return (Cliente) em.find(Cliente.class, idCliente);
	}
	
	@Transactional(readOnly = true)
	public List<Cliente> ConsultaAll() {

		Query queryJPQL = em.createQuery("SELECT c FROM Cliente c");//lenguaje JPQL
		
		//o bien hacer una consulta en lenguaje SQL nativo
		
		// Query querySQL = em.createNamedQuery("SELECT * FROM tclientes");

		List<Cliente> listaClientes = (List<Cliente>) queryJPQL.getResultList();
		
		return listaClientes;
	}

}

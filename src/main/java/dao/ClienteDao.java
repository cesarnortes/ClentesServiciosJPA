package dao;

 import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dominio2.Cliente;
  
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

	@Transactional
	public void baja(Cliente cliente) {
		// TODO Auto-generated method stub
		
	//if(em.contains(cliente))
		
		//em.createNativeQuery("DELETE FROM tclientes WHERE id=" + cliente.getIdCliente());
		
		em.remove(em.contains(cliente) ? cliente : em.merge(cliente));
/*
		try {
		em.remove(cliente);
		}catch (DataAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		} */
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

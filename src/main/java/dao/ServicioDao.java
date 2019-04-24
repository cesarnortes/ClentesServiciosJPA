package dao;

 import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dominio2.Servicio;

@Repository
@Transactional
public class ServicioDao implements IServicio {

	
	@PersistenceContext
	EntityManager em;
	
	
	
	public ServicioDao() {}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void alta(Servicio servicio) {
		// TODO Auto-generated method stub
		
		em.persist(servicio);

	}

	public void modificacion(Servicio servicio) {
		// TODO Auto-generated method stub
		
		em.merge(servicio);

	}

	public void baja(Servicio servicio) {
		// TODO Auto-generated method stub


		em.remove(em.contains(servicio) ? servicio : em.merge(servicio));

		
	//	em.remove(servicio);

	}
	
	
	@Transactional(readOnly = true)
	public Servicio consultaId(int idServicio) {
		// TODO Auto-generated method stub
		
		return (Servicio) em.find(Servicio.class, idServicio);
	
	}
	
	@Transactional(readOnly = true)
	public List<Servicio> ConsultaAll() {
		// TODO Auto-generated method stub
		
		Query queryJPQL = em.createQuery("SELECT s FROM Servicio s");//lenguaje JPQL
		
		//o bien hacer una consulta en lenguaje SQL nativo
		
		// Query querySQL = em.createNamedQuery("SELECT * FROM tservicios");

		List<Servicio> listaServicio = (List<Servicio>) queryJPQL.getResultList();
		
		return listaServicio;
	}

}

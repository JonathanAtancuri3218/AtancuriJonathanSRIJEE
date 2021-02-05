package ec.ups.edu.g1.dao;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.g1.modelo.Recarga;

@Stateless
public class RecargaDAO {
	@Inject
	private EntityManager em;

	@Inject
	private Connection con;

	public boolean insert(Recarga entity) {
		em.persist(entity);
		return true;
	}
	public boolean update(Recarga entity) {
		em.merge(entity);
		return true;
	}
	public Recarga read(int id) {
		Recarga entity=em.find(Recarga.class, id);		
		return entity;
	}
	
	public boolean delete(int id) {
		Recarga entity=this.read(id);
		em.remove(entity);
		return true;
	}
	public List<Recarga> getList(){
		String jpql="SELECT t FROM Recarga t";
		
		Query q= em.createQuery(jpql, Recarga.class);
		//q.setParameter(1,1);

		return (List<Recarga>) q.getResultList();
		
	}
	

}

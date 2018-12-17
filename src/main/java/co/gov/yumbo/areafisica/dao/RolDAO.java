package co.gov.yumbo.areafisica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gov.yumbo.areafisica.modelo.Role;

@Repository
@Transactional
public class RolDAO implements IRolDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Role getRolById(Long id) {
		return entityManager.find(Role.class, id);
	}

	@Override
	public List<Role> getAllRols() {
		String hql = "FROM Role order by name asc";
		return (List<Role>)entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Role getRolByName(String name) {
		
		return (Role) entityManager.createQuery("FROM Role r where r.name = ?1  ")
				.setParameter(1, name).getSingleResult();

	}	
}

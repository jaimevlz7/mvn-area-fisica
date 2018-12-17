package co.gov.yumbo.areafisica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gov.yumbo.areafisica.modelo.Grupo;
import co.gov.yumbo.areafisica.modelo.Licencia;

@Repository
@Transactional
public class GrupoDAO  implements IGrupoDAO {
	

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void crearGrupo(Grupo grupo) {
		entityManager.persist(grupo);	
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Grupo> getGrupos() {
		String hql = "FROM Grupo";
		return (List<Grupo>)entityManager.createQuery(hql).getResultList();
	}
	
	
	
	
}

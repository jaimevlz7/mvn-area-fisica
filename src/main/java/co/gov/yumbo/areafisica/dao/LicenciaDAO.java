package co.gov.yumbo.areafisica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gov.yumbo.areafisica.modelo.Licencia;

@Repository
@Transactional
public class LicenciaDAO  implements ILicenciaDAO {
	

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearLicencia(Licencia licencia) {
		entityManager.persist(licencia);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Licencia> getLicencias() {
		
		String hql = "FROM Licencia";
		return (List<Licencia>)entityManager.createQuery(hql).getResultList();
	}
	
	
	
	
}

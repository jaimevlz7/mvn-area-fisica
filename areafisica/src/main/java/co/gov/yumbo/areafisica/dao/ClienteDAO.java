package co.gov.yumbo.areafisica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Licencia;

@Repository
@Transactional
public class ClienteDAO  implements IClienteDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearCliente(Cliente cliente) {
		entityManager.persist(cliente);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> getCliente() {
		
		String hql = "FROM Cliente";
		return (List<Cliente>)entityManager.createQuery(hql).getResultList();
		}
	
	
	

}

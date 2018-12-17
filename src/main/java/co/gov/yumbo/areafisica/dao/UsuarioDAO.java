package co.gov.yumbo.areafisica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gov.yumbo.areafisica.modelo.User;

@Repository
@Transactional
public class UsuarioDAO  implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;	

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getAllUsuarios() {
		String hql = "FROM User order by username desc";
		return (List<User>)entityManager.createQuery(hql).getResultList();
	}

	@Override
	public User createUser(User user) {
		entityManager.persist(user);
		return getUsuarioById(user.getId());
	}

	@Override
	public void deleteUsuario(Long id) {
		
	}

	@Override
	public void updateUsuario(User user) {
	   entityManager.merge(user);
	}

	@Override
	public User getUsuarioByUsername(String username) {
		
		User usuario = null;
		try {
			usuario = (User) entityManager.createQuery("FROM User u where u.username = ?1  ")
					.setParameter(1, username).getSingleResult();
			return usuario;
		} catch (Exception e) {
			return usuario;
		}
		

	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<UsuarioRolDTO> getAllUsuariosRolDTO() {
//		// el orden depende del constructor que esta en el DTO
//		String hql = "SELECT  distinct  new co.gov.yumbo.reporter.app.dto.UsuarioRolDTO(u.id , u.username , u.descripcion , r.id , r.name , r.description) FROM User u, Role r "
//				+ " Where "
//				+ "u.role.id =  r.id";
//		return (List<UsuarioRolDTO>)entityManager.createQuery(hql).getResultList();
//	}

	@Override
	public User getUsuarioById(Long id) {
		return entityManager.find(User.class, id);
	}

}

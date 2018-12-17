package co.gov.yumbo.areafisica.dao;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Role;

public interface IRolDAO {
	Role getRolById(Long id);
	Role getRolByName(String name);
	List<Role> getAllRols();
}

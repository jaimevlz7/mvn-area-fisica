package co.gov.yumbo.areafisica.dao;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Grupo;
import co.gov.yumbo.areafisica.modelo.Licencia;

public interface IGrupoDAO {
	
	void crearGrupo(Grupo grupo);
	List<Grupo> getGrupos();

}

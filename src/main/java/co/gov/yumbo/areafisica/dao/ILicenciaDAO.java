package co.gov.yumbo.areafisica.dao;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Licencia;

public interface ILicenciaDAO {
	
	void crearLicencia(Licencia licencia);
	List<Licencia> getLicencias();

}

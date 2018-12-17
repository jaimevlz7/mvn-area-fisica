package co.gov.yumbo.areafisica.service;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Licencia;

public interface ILicenciaService {

	
	void crearLicencia(Licencia licencia);
	List<Licencia> getLicencias();
}

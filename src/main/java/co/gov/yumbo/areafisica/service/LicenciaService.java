package co.gov.yumbo.areafisica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.yumbo.areafisica.dao.ILicenciaDAO;
import co.gov.yumbo.areafisica.modelo.Licencia;

@Service
public class LicenciaService implements ILicenciaService {
	
	@Autowired
	private ILicenciaDAO licenciaDao;

	@Override
	public void crearLicencia(Licencia licencia)  {
		licenciaDao.crearLicencia(licencia);
		
	}

	@Override
	public List<Licencia> getLicencias() {
		return licenciaDao.getLicencias();
	}

}

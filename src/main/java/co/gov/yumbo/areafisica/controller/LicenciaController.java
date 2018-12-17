package co.gov.yumbo.areafisica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.yumbo.areafisica.modelo.Licencia;
import co.gov.yumbo.areafisica.service.ILicenciaService;

@RestController
@RequestMapping("/licencia")
@CrossOrigin(origins = {"http://192.168.8.50:4200", "http://localhost:4200"})
public class LicenciaController {
	
	@Autowired
	private ILicenciaService licenciaService;
	
	
	@PostMapping("/crear")
	public String crearLicencia(@RequestBody Licencia licencia) {
		
		licenciaService.crearLicencia(licencia);
		return null;
		
	}
	
	@GetMapping("/licencias")
	public List<Licencia> obtenerLicencias(){
		return licenciaService.getLicencias();
	}

	
}

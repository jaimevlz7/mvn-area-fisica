package co.gov.yumbo.areafisica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Grupo;
import co.gov.yumbo.areafisica.modelo.Licencia;
import co.gov.yumbo.areafisica.service.IClienteService;
import co.gov.yumbo.areafisica.service.IGrupoService;
import co.gov.yumbo.areafisica.service.ILicenciaService;

@RestController
@RequestMapping("/grupo")
@CrossOrigin(origins = {"http://192.168.8.50:4200", "http://localhost:4200"})
public class GrupoController {
	
	@Autowired
	private IGrupoService grupoService;
	
	
	@PostMapping("/crear")
	public String crearGrupo(@RequestBody Grupo grupo) {
		grupoService.crearGrupo(grupo);	
		return null;
	}
	
	@GetMapping("/grupos")
	public List<Grupo> obtenerGrupos(){
		return grupoService.getGrupos();
	}
	


}

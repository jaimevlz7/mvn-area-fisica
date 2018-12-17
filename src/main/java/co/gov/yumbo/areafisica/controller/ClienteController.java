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
import co.gov.yumbo.areafisica.modelo.Licencia;
import co.gov.yumbo.areafisica.service.IClienteService;
import co.gov.yumbo.areafisica.service.ILicenciaService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = {"http://192.168.8.50:4200", "http://localhost:4200"})
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	
	@PostMapping("/crear")
	public String crearCliente(@RequestBody Cliente cliente) {
		
		clienteService.crearCliente(cliente);
		return null;
		
	}
	
	@GetMapping("/clientes")
	public List<Cliente> obtenerClientes(){
		return clienteService.getClientes();
	}
	
	@GetMapping("/cliente-by-docu/{tipoDocu}/{numeroDoc}")
	public Cliente getClienteByTipoNumeDocu(@PathVariable String tipoDocu, @PathVariable String numeroDoc){
		return clienteService.getClienteByDocumento(tipoDocu, numeroDoc);
	}

}

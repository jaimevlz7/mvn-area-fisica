package co.gov.yumbo.areafisica.service;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Licencia;

public interface IClienteService {

	void crearCliente(Cliente cliente);

	List<Cliente> getClientes();

}

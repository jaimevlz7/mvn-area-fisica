package co.gov.yumbo.areafisica.dao;

import java.util.List;

import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Licencia;

public interface IClienteDAO {
	
	void crearCliente(Cliente cliente);
	List<Cliente> getCliente();
	Cliente getClienteByDocumento(String tipoDocu, String numeroDoc);

}

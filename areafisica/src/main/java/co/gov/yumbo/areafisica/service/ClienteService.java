package co.gov.yumbo.areafisica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.gov.yumbo.areafisica.dao.IClienteDAO;
import co.gov.yumbo.areafisica.modelo.Cliente;
import co.gov.yumbo.areafisica.modelo.Licencia;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private IClienteDAO clienteDao;
	
	@Override
	public void crearCliente(Cliente cliente)  {
		clienteDao.crearCliente(cliente);
		
	}

	@Override
	public List<Cliente> getClientes() {
		return clienteDao.getCliente();
	}

	
	

}

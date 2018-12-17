package co.gov.yumbo.areafisica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.gov.yumbo.areafisica.dao.IGrupoDAO;
import co.gov.yumbo.areafisica.modelo.Grupo;

public class GrupoService implements IGrupoService{

	@Autowired
	private IGrupoDAO grupoDAO;
	
	@Override
	public void crearGrupo(Grupo grupo) {
		grupoDAO.crearGrupo(grupo);
	}

	@Override
	public List<Grupo> getGrupos() {
		return grupoDAO.getGrupos();
	}

}

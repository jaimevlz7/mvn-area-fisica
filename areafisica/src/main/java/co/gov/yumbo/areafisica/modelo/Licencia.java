package co.gov.yumbo.areafisica.modelo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="licencia")
public class Licencia {
	
	@Id
	@SequenceGenerator(name = "licencia_seq_gen", sequenceName = "licencia_seq", initialValue = 1,  allocationSize=1)
	@GeneratedValue(generator= "licencia_seq_gen")
	@Column(name="licencia_id")
	private Long licenciaId;
	
	@NotNull
	@Column(name="codigo_sac")
    private String codigoSac;
	

	@NotNull()
	@Column(name="nombre")
    private String nombre;
	

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	
	@Column(name="matricula_inmobiliaria")
	private String matriculaInmobiliaria;
	
	public String getCodigoSac() {
		return codigoSac;
	}

	public void setCodigoSac(String prueba) {
		this.codigoSac = prueba;
	}

	public Long getLicenciaId() {
		return licenciaId;
	}

	public void setLicenciaId(Long licenciaId) {
		this.licenciaId = licenciaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}

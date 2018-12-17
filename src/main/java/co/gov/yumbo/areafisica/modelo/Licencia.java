package co.gov.yumbo.areafisica.modelo;

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
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	@NotNull
	@Column(name="codigo_sac")
    private String codigoSac;
	
	@NotNull()
	@Column(name="nombre")
    private String nombre;
	
	@Column(name="observacion_paraque")
	private String observacionParaque;
	
	@Column(name="observacion_adicional")
	private String observacionAdicional;
	
	@Column(name="tipo_tramite")
	private String tipoTramite;
	
	@Column(name="modalidad_licencia")
	private String modalidadLicencia;
	
	@Column(name="modalidad_construccion")
	private String modalidadConstruccion;
	
	@Column(name="interes_social")
	private String interesSocial ;
	
	@Column(name="objeto_tramite")
	private String objetoTramite;
	
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
	
	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public String getObservacionParaque() {
		return observacionParaque;
	}

	public void setObservacionParaque(String observacionParaque) {
		this.observacionParaque = observacionParaque;
	}

	public String getObservacionAdicional() {
		return observacionAdicional;
	}

	public void setObservacionAdicional(String observacionAdicional) {
		this.observacionAdicional = observacionAdicional;
	}

	public String getModalidadLicencia() {
		return modalidadLicencia;
	}

	public void setModalidadLicencia(String modalidadLicencia) {
		this.modalidadLicencia = modalidadLicencia;
	}

	public String getModalidadConstruccion() {
		return modalidadConstruccion;
	}

	public void setModalidadConstruccion(String modalidadConstruccion) {
		this.modalidadConstruccion = modalidadConstruccion;
	}

	public String getInteresSocial() {
		return interesSocial;
	}

	public void setInteresSocial(String interesSocial) {
		this.interesSocial = interesSocial;
	}

	public String getObjetoTramite() {
		return objetoTramite;
	}

	public void setObjetoTramite(String objetoTramite) {
		this.objetoTramite = objetoTramite;
	}

	
}

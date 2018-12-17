package co.gov.yumbo.areafisica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name = "cliente_seq_gen", sequenceName = "cliente_seq", initialValue = 1,  allocationSize=1)
	@GeneratedValue(generator= "cliente_seq_gen")
	@Column(name="cliente_id")
	private Long clienteId;
	
	@Column(name="nombre")
    private String nombre;
	
	@Column(name="apellido")
    private String apellido;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="tipoDocumento")
	private String tipoDocumento;
	
	@Column(name="numeroDocumento")
    private String numeroDocumento;


	@Column(name="observacion")
    private String observacion;
	
	
	@Column(name="telefono")
    private String telefono;
	
	
	@Column(name="celular")
    private String celular;
	
	@Column(name="direccion")
    private String direccion;
	
	@Column(name="departamento")
    private String municipio;
	
	@Column(name="barrio")
    private String barrio;
	

	
	
	
	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	

}

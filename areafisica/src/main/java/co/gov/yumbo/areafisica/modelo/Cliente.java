package co.gov.yumbo.areafisica.modelo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	
	
	@Column(name="cedula")
    private String cedula;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	

}

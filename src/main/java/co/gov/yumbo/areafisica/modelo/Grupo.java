package co.gov.yumbo.areafisica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="grupo")
public class Grupo {
	
	@Id
	@SequenceGenerator(name = "grupo_seq_gen", sequenceName = "grupo_seq", initialValue = 1,  allocationSize=1)
	@GeneratedValue(generator= "grupo_seq_gen")
	@Column(name="grupo_id")
	private Long grupoId;
	
	@Column(name="nombre")
	private String nombre;
	
	
	

}

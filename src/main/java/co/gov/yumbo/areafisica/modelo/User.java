package co.gov.yumbo.areafisica.modelo;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="usuario")
@Entity
public class User {

    @Id
    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq", initialValue = 10, allocationSize = 10)
    @GeneratedValue(generator = "usuario_seq")
    private long id;
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="username")
    private String username;
    
    @JsonIgnore
    @Column(name="password")
    private String password;
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="nombre")
    private String nombre;
    
    @OneToOne()
   	@JoinColumn(name = "rol_id")
       private Role rol; 
       
    
    
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "grupo_usuario",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "grupo_id") })
  private Set<Grupo> grupo = new HashSet<>();





	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Role getRol() {
		return rol;
	}

	public void setRol(Role rol) {
		this.rol = rol;
	}

	public Set<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(Set<Grupo> grupo) {
		this.grupo = grupo;
	}

    



}

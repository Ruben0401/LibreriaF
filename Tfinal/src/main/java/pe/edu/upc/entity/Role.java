package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	
	@Column(name = "nameCategory", nullable = false, length = 45)
	private String NameRole;

	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Role(int idRole, String nameRole) {
		super();
		this.idRole = idRole;
		NameRole = nameRole;
	}


	//get set
	public int getIdRole() {
		return idRole;
	}


	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}


	public String getNameRole() {
		return NameRole;
	}


	public void setNameRole(String nameRole) {
		NameRole = nameRole;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}

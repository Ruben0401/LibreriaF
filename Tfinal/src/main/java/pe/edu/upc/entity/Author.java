package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Author")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAuthor;
	
	@Column(name = "nameCategory", nullable = false, length = 45)
	private String NameAuthor;
	
	@Column(name = "nameCategory", nullable = false, length = 45)
	private String LastNameAuthor;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int idAuthor, String nameAuthor, String lastNameAuthor) {
		super();
		this.idAuthor = idAuthor;
		NameAuthor = nameAuthor;
		LastNameAuthor = lastNameAuthor;
	}
	
	
	//get set
	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public String getNameAuthor() {
		return NameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		NameAuthor = nameAuthor;
	}

	public String getLastNameAuthor() {
		return LastNameAuthor;
	}

	public void setLastNameAuthor(String lastNameAuthor) {
		LastNameAuthor = lastNameAuthor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

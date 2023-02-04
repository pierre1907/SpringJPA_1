package sn.ism.domaine;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employes")
public class Employe implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matr;
	@Column(length=25, nullable=false)
	private String nom;
	@Column(length=25, nullable=false)
	private String prenom;
	@Column(length=25, nullable=false, unique=true)
	private String email;
	@Column(length=25, nullable=false)
	private Integer salaire;
	
	public Employe()
	{
		
	}

	public Integer getMatr() {
		return matr;
	}

	public void setMatr(Integer matr) {
		this.matr = matr;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSalaire() {
		return salaire;
	}

	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}
	
}

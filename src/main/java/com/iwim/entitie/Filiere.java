package com.iwim.entitie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filiere implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFiliere;
	private String nomFiliere ;
	
	
	@OneToMany(mappedBy="filiere")
	private List<Personne> personnes;

	@ManyToOne
	@JoinColumn(name="idEcole")
	private Ecole ecole;
	
	
	public int getIdFiliere() {
		return idFiliere;
	}

	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	public String getNomFiliere() {
		return nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}

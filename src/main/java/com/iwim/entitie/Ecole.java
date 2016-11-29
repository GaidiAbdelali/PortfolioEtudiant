package com.iwim.entitie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ecole implements Serializable {
	@Id
	private int idEcole;
	private String nomEcole;
	
	@OneToMany(mappedBy="ecole")
	private List<Filiere> filieres;
	
	
	public Ecole() {
		}
	
	public int getIdEcole() {
		return idEcole;
	}

	public void setIdEcole(int idEcole) {
		this.idEcole = idEcole;
	}

	public String getNomEcole() {
		return nomEcole;
	}
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}
	
	
	

}

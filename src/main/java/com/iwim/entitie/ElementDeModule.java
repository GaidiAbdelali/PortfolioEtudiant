package com.iwim.entitie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ElementDeModule implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idElementDeModule;
	private String nomElementDEModule;
	private int nombreHeure ;
	
	@ManyToOne
	@JoinColumn(name="idModule")
	private Module module;
	
	
	public ElementDeModule() {
	}
	public Long getIdElementDeModule() {
		return idElementDeModule;
	}
	public void setIdElementDeModule(Long idElementDeModule) {
		this.idElementDeModule = idElementDeModule;
	}
	public String getNomElementDEModule() {
		return nomElementDEModule;
	}
	public void setNomElementDEModule(String nomElementDEModule) {
		this.nomElementDEModule = nomElementDEModule;
	}
	public int getNombreHeure() {
		return nombreHeure;
	}
	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}
	
	
	

}

package com.iwim.entitie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Module implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idModule ;
	private String nomDeModule;
	
	@OneToMany(mappedBy="module")
	private List<Evaluation> evaluations;
	
	@OneToMany(mappedBy="module")
	private List<ElementDeModule> elementDeModules;
	
		
	public Module() {
	}
	public Long getIdModule() {
		return idModule;
	}
	public void setIdModule(Long idModule) {
		this.idModule = idModule;
	}
	public String getNomDeModule() {
		return nomDeModule;
	}
	public void setNomDeModule(String nomDeModule) {
		this.nomDeModule = nomDeModule;
	}
	
	

}

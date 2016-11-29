package com.iwim.entitie;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("projetAcademique")
public class ProjetAcademique extends ComposantProfil {
	
	private String semestre ;
	private Date annee;
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public ProjetAcademique() {
	}
	
	

}

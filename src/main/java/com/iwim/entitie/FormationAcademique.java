package com.iwim.entitie;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FormationAcademique")
public class FormationAcademique extends ComposantProfil {
	
	
	private String nomEtablessement;
	private Date dateEntree;
	private Date dateSortie;
	private String ville;
	
	public FormationAcademique() {
		
	}

	public String getNomEtablessement() {
		return nomEtablessement;
	}

	public void setNomEtablessement(String nomEtablessement) {
		this.nomEtablessement = nomEtablessement;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
	

}

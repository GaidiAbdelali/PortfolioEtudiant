package com.iwim.entitie;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire  implements Serializable{
	
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO )
	private Long id ;
	
	@Column
	private String titreCommentaire;
	
	@Column
	private String contenu ;
	@Column
	private Date dateEcriture ;
	
	@Column
	private Date dateDerniereModification;

	
	public Commentaire() {
			
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitreCommentaire() {
		return titreCommentaire;
	}

	public void setTitreCommentaire(String titreCommentaire) {
		this.titreCommentaire = titreCommentaire;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(Date dateEcriture) {
		this.dateEcriture = dateEcriture;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	

}

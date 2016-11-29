package com.iwim.entitie;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("composant")
public class ComposantProfil implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idComposantProfil ;
	private String titre ;
	private String resume;
	
	
	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;
	
	
	public ComposantProfil() {
		
	}

	public Long getIdComposantProfil() {
		return idComposantProfil;
	}



	public void setIdComposantProfil(Long idComposantProfil) {
		this.idComposantProfil = idComposantProfil;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	

	
}

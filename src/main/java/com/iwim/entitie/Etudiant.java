package com.iwim.entitie;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("etudiant")
public class Etudiant extends Personne {

	@OneToMany(mappedBy="etudiant")
	private List<ComposantProfil> composantProfils;
	
	public Etudiant() {
		
		
	}

	
}

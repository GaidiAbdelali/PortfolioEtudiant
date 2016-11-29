package com.iwim.entitie;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("experienceProfessionnelle")
public class ExperienceProfessionnelle extends ComposantProfil {
	
	private Date dateEntree;
	private Date dateSortie;
	private String entreprise;
	

}

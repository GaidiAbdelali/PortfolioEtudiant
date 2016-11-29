package com.iwim.entitie;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("competenceTechnique")
public class CompetenceTechnique extends ComposantProfil{
	
	private String domine ;
	
	
	
	public CompetenceTechnique() {}

	public String getDomine() {
		return domine;
	}
	public void setDomine(String domine) {
		this.domine = domine;
	}
	
	
	
	
	
	

}

package com.iwim.entitie;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("prof")
public class Prof  extends Personne{

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

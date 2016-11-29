package com.iwim.entitie;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("document")
public class Document extends ComposantProfil {
	
	
	private String genreDoc ;
	
	public String getGenreDoc() {
		return genreDoc;
	}
	public void setGenreDoc(String genreDoc) {
		this.genreDoc = genreDoc;
	}

	public Document() {
		super();
		
	}
	
	

}

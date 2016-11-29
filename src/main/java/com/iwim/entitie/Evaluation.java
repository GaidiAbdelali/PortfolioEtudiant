package com.iwim.entitie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation implements Serializable {

	@Id
	private Long idEvalation;
	@Column
	private double note;
	@Column
	private String remarque ;
	
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Personne personne;
	
	@ManyToOne
	@JoinColumn(name="idModule")
	private Module module;
	public Long getIdEvalation() {
		return idEvalation;
	}

	public void setIdEvalation(Long idEvalation) {
		this.idEvalation = idEvalation;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public Evaluation() {
		
	}
	
	
}

package com.iwim.entitie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Coordonnee implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCoordonnee;
	private String address;
	private String ville;
	private String pays ;
	private String telephone;
	private String email;
	
	@OneToOne
	@JoinColumn(name="idPersonne")
	private Personne personne;
		
	
	public Coordonnee() {
	}
	public Long getIdCoordonnee() {
		return idCoordonnee;
	}
	public void setIdCoordonnee(Long idCoordonnee) {
		this.idCoordonnee = idCoordonnee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

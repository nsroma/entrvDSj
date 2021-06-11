package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="acteur")
public class Acteur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_acteur")
	private long acteurId;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
		
	public long getActeurId() {
		return acteurId;
	}
	public void setActeurId(long acteurId) {
		this.acteurId = acteurId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}

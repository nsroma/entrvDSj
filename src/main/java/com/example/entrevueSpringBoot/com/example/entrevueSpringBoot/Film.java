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
@Table(name="film")
public class Film {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_film")
	private long filmId;
	@Column(name="titre")
	private String titre;
	@Column(name="description")
	private String description;
	@OneToMany(mappedBy="film",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Acteur> listeActeurs;
	
	public long getFilmId() {
		return filmId;
	}
	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Acteur> getListeActeurs() {
		return listeActeurs;
	}
	public void setListeActeurs(List<Acteur> listeActeurs) {
		this.listeActeurs = listeActeurs;
	}
}

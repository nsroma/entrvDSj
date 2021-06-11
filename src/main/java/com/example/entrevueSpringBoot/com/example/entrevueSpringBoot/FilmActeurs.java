package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="film_acteurs")
public class FilmActeurs {
	
	 @EmbeddedId
	    @AttributeOverrides({
	        @AttributeOverride(name = "acteurId", column = @Column(name = "acteur_id", nullable = false)),
	        @AttributeOverride(name = "filmId", column = @Column(name = "film_id", nullable = false))
	    })
	private FilmActeurMappeur filmActeurIds;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="film_id", insertable=false, updatable=false)
	private long filmId;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="acteur_id", insertable=false, updatable=false)
	private long acteurId;
	
	public FilmActeurMappeur getFilmActeurIds() {
		return filmActeurIds;
	}
	public void setFilmActeurIds(FilmActeurMappeur filmActeurIds) {
		this.filmActeurIds = filmActeurIds;
	}
	public long getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public long getActeurId() {
		return acteurId;
	}
	public void setActeurId(int acteurId) {
		this.acteurId = acteurId;
	}
}

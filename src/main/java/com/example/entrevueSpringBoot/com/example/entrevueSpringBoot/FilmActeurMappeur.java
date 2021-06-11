package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class FilmActeurMappeur implements Serializable{
	
	 private static final long serialVersionUID = 1L;

	    @Column(name = "acteur_id", nullable = false)
	    private short acteurId;

	    @Column(name = "film_id", nullable = false)
	    private short filmId;
}

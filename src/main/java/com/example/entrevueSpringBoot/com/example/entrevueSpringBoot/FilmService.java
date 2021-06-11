package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

public interface FilmService {

	List<Film> getAllFilms();
	Optional<Film> getFilmById(long id);
	ResponseEntity<Film> addFilm(String titre,String description,Collection<Acteur> acteurs);	
}

package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmActeursRepository extends JpaRepository<FilmActeurs, Long> {

	List<FilmActeurs> findAllActeursByIdfilm(long idFilm); 
	void saveFilmActeurs(long filmId, long acteurId);
}

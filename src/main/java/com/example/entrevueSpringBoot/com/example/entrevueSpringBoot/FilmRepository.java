package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface FilmRepository extends JpaRepository<Film,Long>{
	ResponseEntity<Film> saveFilm(String titre,String description);
}

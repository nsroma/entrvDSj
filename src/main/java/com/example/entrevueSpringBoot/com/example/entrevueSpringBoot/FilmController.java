package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/api")
public class FilmController {

	@Autowired 
	private FilmService filmService;
	
	@GetMapping("/film/{id}")
	public Optional<Film> getFilmById(@PathVariable long id){
		return filmService.getFilmById(id);		
	}
	@GetMapping("/films")
	public List<Film> getAllFilms(){
		List<Film> films=filmService.getAllFilms();		
		return films;		
	}
	
	@PostMapping("/film")
	public ResponseEntity<Object> creeFilm(@RequestBody String titre,@RequestBody String description,@RequestBody List<Acteur> listeActeurs) {
		filmService.addFilm(titre, description, listeActeurs);
		
		return null;
		
	}
	
}

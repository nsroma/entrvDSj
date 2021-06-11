package com.example.entrevueSpringBoot.com.example.entrevueSpringBoot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import ch.qos.logback.core.status.Status;

public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ActeurRepository acteurRepository;
	@Autowired
	private FilmActeursRepository filmActeursRepository;
	
	@Override
	public List<Film> getAllFilms() {
		List<Film> listFilms=filmRepository.findAll();
		return listFilms;
	}

	@Override
	@Transactional
	public Optional<Film> getFilmById(long id) {
		Optional<Film> film=filmRepository.findById(id);
		List<FilmActeurs> filmActeurs= filmActeursRepository.findAllActeursByIdfilm(id);
		List<Acteur> listeActeurs= new ArrayList<Acteur>();
//		if(film.isEmpty()) {
//			 throw new ClassNotFoundException("Le film avec le id indique n'existe pas");
//		}
		for (FilmActeurs filmActeur : filmActeurs) {
			listeActeurs.add(acteurRepository.findById(filmActeur.getActeurId()).get());
		}
		film.get().setListeActeurs(listeActeurs);
		return film;
	}

	@Override
	@Transactional
	public ResponseEntity<Film> addFilm(String titre, String description, Collection<Acteur> acteurs) {
		ResponseEntity<Film> filmResponse =filmRepository.saveFilm(titre, description);
		for (Acteur acteur : acteurs) {
			Acteur acteurWithId= acteurRepository.save(acteur);
			filmActeursRepository.saveFilmActeurs(filmResponse.getBody().getFilmId(), acteurWithId.getActeurId());		
		}
		return new ResponseEntity<Film>(HttpStatus.OK);
	}

}

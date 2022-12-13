package com.souhail.acteurs.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souhail.acteurs.entities.Film;
import com.souhail.acteurs.repos.FilmRepository;

@RestController
@RequestMapping("/api/film")
@CrossOrigin("*")
public class FilmRESTController {
	@Autowired
	FilmRepository filmRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Film getFilmById(@PathVariable("id") Long id) {
		return filmRepository.findById(id).get();
	}
}
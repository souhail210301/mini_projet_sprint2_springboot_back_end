package com.souhail.acteurs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souhail.acteurs.entities.Acteur;
import com.souhail.acteurs.entities.Film;
import com.souhail.acteurs.repos.ActeurRepository;

@Service
public class ActeurServiceImpl implements ActeurService {
	@Autowired
	ActeurRepository acteurRepository;

	@Override
	public List<Acteur> findByNomActeur(String nom) {
		return acteurRepository.findByNomActeur(nom);
	}

	@Override
	public List<Acteur> findByNomActeurContains(String nom) {
		return acteurRepository.findByNomActeurContains(nom);
	}

	@Override
	public List<Acteur> findByNomSalaire(String nom, Double salaire) {
		return acteurRepository.findByNomSalaire(nom, salaire);
	}

	@Override
	public List<Acteur> findByFilm(Film film) {
		return acteurRepository.findByFilm(film);
	}

	@Override
	public List<Acteur> findByFilmIdFilm(Long id) {
		return acteurRepository.findByFilmIdFilm(id);
	}

	@Override
	public List<Acteur> findByOrderByNomActeurAsc() {
		return acteurRepository.findByOrderByNomActeurAsc();
	}

	@Override
	public List<Acteur> trierActeursNomsSalaire() {
		return acteurRepository.trierActeursNomsSalaire();
	}

	@Override
	public Acteur saveActeur(Acteur a) {
		return acteurRepository.save(a);
	}

	@Override
	public Acteur updateActeur(Acteur a) {
		return acteurRepository.save(a);
	}

	@Override
	public void deleteActeur(Acteur a) {
		acteurRepository.delete(a);
	}

	@Override
	public void deleteActeurById(Long id) {
		acteurRepository.deleteById(id);
	}

	@Override
	public Acteur getActeur(Long id) {
		return acteurRepository.findById(id).get();
	}

	@Override
	public List<Acteur> getAllActeurs() {
		return acteurRepository.findAll();
	}
}
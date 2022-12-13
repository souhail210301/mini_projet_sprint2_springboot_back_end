package com.souhail.acteurs.service;

import java.util.List;

import com.souhail.acteurs.entities.Acteur;
import com.souhail.acteurs.entities.Film;

public interface ActeurService {
Acteur saveActeur(Acteur a);
Acteur updateActeur(Acteur a);
void deleteActeur(Acteur a);
void deleteActeurById(Long id);
Acteur getActeur(Long id);

List<Acteur> getAllActeurs();
List<Acteur> findByNomActeur(String nom);
List<Acteur> findByNomActeurContains(String nom);
List<Acteur> findByNomSalaire (String nom, Double salaire);
List<Acteur> findByFilm (Film film);
List<Acteur> findByOrderByNomActeurAsc();
List<Acteur> trierActeursNomsSalaire();
List<Acteur> findByFilmIdFilm(Long id);
}

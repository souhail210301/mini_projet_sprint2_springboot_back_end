package com.souhail.acteurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.souhail.acteurs.entities.Film;
import com.souhail.acteurs.repos.ActeurRepository;
import com.souhail.acteurs.entities.Acteur;

@SpringBootTest
class ActeursApplicationTests {
	@Autowired
	private ActeurRepository acteurRepository;

	@Test
	public void testCreateActeur() {
		Acteur acteur = new Acteur("Robert de Niro", 100000.000, new Date());
		acteurRepository.save(acteur);
	}

	@Test
	public void testFindActeur() {
		Acteur a = acteurRepository.findById(1L).get();
		System.out.println(a);
	}

	@Test
	public void testUpdateActeur() {
		Acteur a = acteurRepository.findById(1L).get();
		a.setSalaireActeur(150000.0);
		acteurRepository.save(a);
	}

	@Test
	public void testDeleteActeur() {
		acteurRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousActeurs() {
		List<Acteur> acteurs = acteurRepository.findAll();
		for (Acteur a : acteurs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomActeur() {
		List<Acteur> acteurs = acteurRepository.findByNomActeur("Robert de Niro");
		for (Acteur a : acteurs) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomActeurContains() {
		List<Acteur> acteurs = acteurRepository.findByNomActeurContains("Al Pacino");
		for (Acteur a : acteurs) {
			System.out.println(a);
		}
	}
	/*@Test
	public void testfindByFilm()
	{
	Film film = new Film();
	film.setIdFilm(1L);
	List<Acteur> acteurs = acteurRepository.findByFilm(film);
	for (Acteur a : acteurs)
	{
	System.out.println(a);
	}
	}*/

	@Test
	public void testfindByNomSalaire() {
		List<Acteur> acteurs = acteurRepository.findByNomSalaire("Alpacino", 150000.5);
		for (Acteur a : acteurs) {
			System.out.println(a);
		}
		
	
	}
	
	@Test
	public void findByFilmIdFilm()
	{
	List<Acteur> acteurs = acteurRepository.findByFilmIdFilm(1L);
	for (Acteur a : acteurs)
	{
	System.out.println(a);
	}
	 }
	
	@Test
	public void testfindByOrderByNomActeurAsc()
	{
	List<Acteur> acteurs =
	acteurRepository.findByOrderByNomActeurAsc();
	for (Acteur a : acteurs)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testTrierActeursNomsSalaire()
	{
	List<Acteur> acteurs = acteurRepository.trierActeursNomsSalaire();
	for (Acteur a : acteurs)
	{
	System.out.println(a);
	}
	}
}

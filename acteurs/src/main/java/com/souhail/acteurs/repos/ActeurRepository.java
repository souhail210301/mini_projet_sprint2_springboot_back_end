package com.souhail.acteurs.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.souhail.acteurs.entities.Film;
import com.souhail.acteurs.entities.Acteur;

@RepositoryRestResource(path = "rest")
public interface ActeurRepository extends JpaRepository<Acteur, Long> {
	
	List<Acteur> findByNomActeur(String nom);
	List<Acteur> findByNomActeurContains(String nom);
	List<Acteur> findByFilmIdFilm(Long id);
	List<Acteur> findByOrderByNomActeurAsc();
	@Query("select a from Acteur a order by a.nomActeur ASC, a.salaireActeur DESC")
	List<Acteur> trierActeursNomsSalaire();

	
	/*@Query("select a from Acteur a where a.nomActeur like %?1 and a.salaireActeur > ?2")
	List<Acteur> findByNomPrix (String nom, Double salaire);*/
	
	@Query("select a from Acteur a where a.nomActeur like %:nom and a.salaireActeur > :salaire")
	List<Acteur> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	
	@Query("select a from Acteur a where a.film = ?1")
	List<Acteur> findByFilm (Film film);


}
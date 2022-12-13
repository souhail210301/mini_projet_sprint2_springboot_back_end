package com.souhail.acteurs.repos;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.souhail.acteurs.entities.Film;


@RepositoryRestResource(path = "film")
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser angular
public interface FilmRepository extends JpaRepository<Film, Long> {
}

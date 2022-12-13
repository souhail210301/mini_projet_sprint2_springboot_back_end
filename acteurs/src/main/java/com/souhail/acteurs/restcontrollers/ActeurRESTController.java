package com.souhail.acteurs.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.souhail.acteurs.entities.Acteur;
import com.souhail.acteurs.service.ActeurService;

@RestController
@RequestMapping("/api")
@CrossOrigin (origins="*")
public class ActeurRESTController {
	@Autowired
	ActeurService acteurService;

	@RequestMapping(path="/all", method = RequestMethod.GET)
	public List<Acteur> getAllActeurs() {
		return acteurService.getAllActeurs();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Acteur getActeurById(@PathVariable("id") Long id) {
		return acteurService.getActeur(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Acteur createActeur(@RequestBody Acteur acteur) {
		return acteurService.saveActeur(acteur);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Acteur updateActeur(@RequestBody Acteur acteur) {
		return acteurService.updateActeur(acteur);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteActeur(@PathVariable("id") Long id) {
		acteurService.deleteActeurById(id);
	}

	@RequestMapping(value = "/actsfilm/{idFilm}", method = RequestMethod.GET)
	public List<Acteur> getActeursById(@PathVariable("idFilm") Long idFilm) {
		return acteurService.findByFilmIdFilm(idFilm);
	}
	
	@RequestMapping(value="/actsByName/{nom}",method = RequestMethod.GET)
	public List<Acteur> findByNomActeurContains(@PathVariable("nom") String nom) {
	return acteurService.findByNomActeurContains(nom);
	}

}
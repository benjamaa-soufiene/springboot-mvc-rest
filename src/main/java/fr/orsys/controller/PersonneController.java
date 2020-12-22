package fr.orsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.orsys.dao.AdresseRepository;
import fr.orsys.dao.PersonneRepository;
import fr.orsys.model.Adresse;
import fr.orsys.model.Personne;
import lombok.var;

@RestController
public class PersonneController {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;

	@GetMapping("/personnes")
	public List<Personne> getPersonnes() {
		return personneRepository.findAll();
	}

	/*
	 * @GetMapping("/personnes/{id}") public Personne
	 * getPersonne(@PathVariable("id") long id) { var personne =
	 * personneRepository.findById(id).orElse(null); if (personne == null) throw new
	 * PersonneNotFoundException(); return personne; }
	 */
	@GetMapping("/personnes/{id}")
	public Personne getPersonne(@PathVariable("id") long id) {
		var personne = personneRepository.findById(id).orElse(null);
		if (personne == null)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Personne	avec id = " + id + " est introuvable");
		return personne;
	}

	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody Personne personne) {
		System.out.println(personne);
		List<Adresse> adresses = personne.getAdresses();
		for (Adresse adresse : adresses) {
			Adresse adr = null;
			if (adresse.getId() != null) {
				adr = adresseRepository.findById(adresse.getId()).orElse(null);
				adresses.set(adresses.indexOf(adresse), adr);
			} else {
				adr = adresseRepository.save(adresse);
			}
		}
		return personneRepository.saveAndFlush(personne);
	}

	@PutMapping("/personnes")
	public Personne updatePersonne(@RequestBody Personne personne) {
		return personneRepository.save(personne);
	}

	@DeleteMapping("/personnes")
	public void deletePersonne(@RequestBody Personne personne) {
		personneRepository.delete(personne);
	}
}

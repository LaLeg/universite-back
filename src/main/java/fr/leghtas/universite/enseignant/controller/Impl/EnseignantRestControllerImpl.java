package fr.leghtas.universite.enseignant.controller.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.leghtas.universite.enseignant.buisiness.IEnseignantBuisiness;
import fr.leghtas.universite.enseignant.controller.IEnseignantController;
import fr.leghtas.universite.enseignant.domain.Enseignant;

@RestController
public class EnseignantRestControllerImpl implements IEnseignantController {

	private static final Logger log = LoggerFactory.getLogger(EnseignantRestControllerImpl.class);
	@Autowired
	private IEnseignantBuisiness enseignatBuisiness;

	@Override
	@GetMapping("/enseignants/{id}")

	public Enseignant getEnseigantById(@PathVariable Integer id) {
		log.info("Methode getEnseignantByID avec l'id {}", id);
		Enseignant en = enseignatBuisiness.getEnseigantById(id);

		return en;
	}

	@Override
	@GetMapping("/enseignants")
	public List<Enseignant> getAllEnseignants() {
		List<Enseignant> listeEnseignants = enseignatBuisiness.getAllEnseignants();

		return listeEnseignants;
	}

	@Override
	@PostMapping("/enseignants")
	public Enseignant saveEnseignant(@RequestBody Enseignant enseignant) {
		Enseignant en = enseignatBuisiness.saveEnseigant(enseignant);

		return en;
	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant modifierEnseignant(@RequestBody Enseignant enseignant, @PathVariable Integer id) {
		enseignant.setId(id);
		Enseignant en = enseignatBuisiness.saveEnseigant(enseignant);

		return en;
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public void suprimerEnseignant(@PathVariable Integer id) {
		enseignatBuisiness.supprimerEnseignant(id);

	}

}

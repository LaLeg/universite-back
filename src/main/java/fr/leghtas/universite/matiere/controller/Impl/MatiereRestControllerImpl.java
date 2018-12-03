package fr.leghtas.universite.matiere.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.leghtas.universite.matiere.buisiness.IMatiereBuisiness;
import fr.leghtas.universite.matiere.controller.IMatiereController;
import fr.leghtas.universite.matiere.domain.Matiere;

@RestController

public class MatiereRestControllerImpl implements IMatiereController {
	@Autowired
	private IMatiereBuisiness matiereBuisiness;

	@Override
	@GetMapping("/matieres")
	public List<Matiere> getMatieres() {

		List<Matiere> listeMatieres = matiereBuisiness.getMatieres();

		return listeMatieres;
	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere getMatiereById(@PathVariable Integer id) {

		Matiere matiere = matiereBuisiness.getMatiereById(id);

		return matiere;
	}

	@Override
	@PostMapping("/matieres")
	public Matiere ajoutMatriere(@RequestBody Matiere matiere) {

		Matiere mat = matiereBuisiness.ajoutMatiere(matiere);

		return mat;
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere modifierMatiere(@RequestBody Matiere matiere, @PathVariable Integer id) {
		matiere.setId(id);
		Matiere mat = matiereBuisiness.modifierMatiere(matiere, id);
		return mat;
	}

	@Override
	@DeleteMapping("/matieres/{id}")

	public void supprimerMatiere(@PathVariable Integer id) {
		matiereBuisiness.supprimerMatiere(id);

	}

}

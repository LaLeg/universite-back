package fr.leghtas.universite.etudiant.controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.leghtas.universite.etudiant.buisiness.IEtudiantBuisiness;
import fr.leghtas.universite.etudiant.controller.IEtudiantController;
import fr.leghtas.universite.etudiant.domain.Etudiant;

@RestController
public class EtudiantRestControllerImpl implements IEtudiantController {

	@Autowired
	private IEtudiantBuisiness etudiantBuisiness;

	@Override

	@GetMapping("/etudiants")
	public List<Etudiant> getAllEtudiants() {

		List<Etudiant> listeEtudiants = etudiantBuisiness.getEtudiants();

		return listeEtudiants;
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant getEtudiantById(@PathVariable Integer id) {

		Etudiant etudiant = etudiantBuisiness.getEtudiant(id);

		return etudiant;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
		Etudiant et = etudiantBuisiness.saveEtudiant(etudiant);
		return et;
	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiant modifierEtudiant(@RequestBody Etudiant etudiant, @PathVariable Integer id) {
		etudiant.setId(id);
		Etudiant et = etudiantBuisiness.updateEtudiant(etudiant, id);

		return et;
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void supprimerEtudiant(@PathVariable Integer id) {
		etudiantBuisiness.supprimerEtudiant(id);

	}

}

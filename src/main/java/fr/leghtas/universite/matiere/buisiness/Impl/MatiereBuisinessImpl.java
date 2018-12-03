package fr.leghtas.universite.matiere.buisiness.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.matiere.buisiness.IMatiereBuisiness;
import fr.leghtas.universite.matiere.domain.Matiere;
import fr.leghtas.universite.matiere.repository.IMatiereRepository;

@Service
public class MatiereBuisinessImpl implements IMatiereBuisiness {
	@Autowired
	private IMatiereRepository matieresRepository;

	@Override
	public List<Matiere> getMatieres() {

		List<Matiere> matieres = matieresRepository.findAll();

		return matieres;
	}

	@Override
	public Matiere getMatiereById(Integer id) {

		Matiere matiere = matieresRepository.getOne(id);

		return matiere;
	}

	@Override
	public Matiere ajoutMatiere(Matiere matiere) {

		Matiere mat = matieresRepository.save(matiere);

		return mat;
	}

	@Override
	public Matiere modifierMatiere(Matiere matiere, Integer id) {
		Matiere mat = matieresRepository.save(matiere);
		return mat;
	}

	@Override
	public void supprimerMatiere(Integer id) {
		matieresRepository.deleteById(id);

	}

}

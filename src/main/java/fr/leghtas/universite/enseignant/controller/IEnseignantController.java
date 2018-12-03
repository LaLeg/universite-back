package fr.leghtas.universite.enseignant.controller;

import java.util.List;

import fr.leghtas.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public Enseignant getEnseigantById(Integer id);

	public List<Enseignant> getAllEnseignants();

	public Enseignant saveEnseignant(Enseignant enseignant);

	public Enseignant modifierEnseignant(Enseignant enseignant, Integer id);

	public void suprimerEnseignant(Integer id);
}

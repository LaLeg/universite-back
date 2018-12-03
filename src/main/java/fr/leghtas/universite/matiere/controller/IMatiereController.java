package fr.leghtas.universite.matiere.controller;

import java.util.List;

import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereController {

	public List<Matiere> getMatieres();

	public Matiere getMatiereById(Integer id);

	public Matiere ajoutMatriere(Matiere matiere);

	public Matiere modifierMatiere(Matiere matiere, Integer id);

	public void supprimerMatiere(Integer id);

}

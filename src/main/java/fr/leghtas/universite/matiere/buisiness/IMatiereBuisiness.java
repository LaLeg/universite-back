package fr.leghtas.universite.matiere.buisiness;

import java.util.List;

import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereBuisiness {

	public List<Matiere> getMatieres();

	public Matiere getMatiereById(Integer id);

	public Matiere ajoutMatiere(Matiere matiere);

	public Matiere modifierMatiere(Matiere matiere, Integer id);

	public void supprimerMatiere(Integer id);

}

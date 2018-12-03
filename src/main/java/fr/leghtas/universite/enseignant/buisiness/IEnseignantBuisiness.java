package fr.leghtas.universite.enseignant.buisiness;

import java.util.List;

import fr.leghtas.universite.enseignant.domain.Enseignant;

public interface IEnseignantBuisiness {
	public Enseignant getEnseigantById(Integer id);

	public List<Enseignant> getAllEnseignants();

	public Enseignant saveEnseigant(Enseignant enseignant);

	public Enseignant updateEnseigant(Enseignant enseignant, Integer id);

	public void supprimerEnseignant(Integer id);

}

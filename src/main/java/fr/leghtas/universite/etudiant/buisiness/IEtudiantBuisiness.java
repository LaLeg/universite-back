package fr.leghtas.universite.etudiant.buisiness;

import java.util.List;

import fr.leghtas.universite.etudiant.domain.Etudiant;

public interface IEtudiantBuisiness {
	public List<Etudiant> getEtudiants();

	public Etudiant getEtudiant(Integer id);

	public Etudiant updateEtudiant(Etudiant etudiant, Integer id);

	public void supprimerEtudiant(Integer id);

	public Etudiant saveEtudiant(Etudiant etudiant);
}

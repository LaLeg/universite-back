package fr.leghtas.universite.etudiant.controller;

import java.util.List;

import fr.leghtas.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {

	public List<Etudiant> getAllEtudiants();

	public Etudiant getEtudiantById(Integer id);

	public Etudiant saveEtudiant(Etudiant etudiant);

	public Etudiant modifierEtudiant(Etudiant etudiant, Integer id);

	public void supprimerEtudiant(Integer id);

}

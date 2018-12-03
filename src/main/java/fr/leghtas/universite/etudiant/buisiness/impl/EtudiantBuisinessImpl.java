package fr.leghtas.universite.etudiant.buisiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.leghtas.universite.etudiant.buisiness.IEtudiantBuisiness;
import fr.leghtas.universite.etudiant.domain.Etudiant;
import fr.leghtas.universite.etudiant.repository.IEtudiantRepository;

@Service
public class EtudiantBuisinessImpl implements IEtudiantBuisiness {
	@Autowired
	private IEtudiantRepository etudiantRepository;

	@Override
	public List<Etudiant> getEtudiants() {
		List<Etudiant> listeEtudiants = etudiantRepository.findAll();

		return listeEtudiants;
	}

	@Override
	public Etudiant getEtudiant(Integer id) {
		Etudiant e = etudiantRepository.getOne(id);

		return e;
	}

	@Override
	public Etudiant saveEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);

	}

	@Override
	public void supprimerEtudiant(Integer id) {

		etudiantRepository.deleteById(id);

		// TODO Auto-generated method stub

	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant, Integer id) {
		etudiant.setId(id);
		return etudiantRepository.save(etudiant);
	}

}

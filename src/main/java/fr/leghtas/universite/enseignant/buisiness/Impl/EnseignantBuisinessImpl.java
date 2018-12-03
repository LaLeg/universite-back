package fr.leghtas.universite.enseignant.buisiness.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import fr.leghtas.universite.enseignant.buisiness.IEnseignantBuisiness;
import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.enseignant.repository.IEnseignantRepository;

@Service
public class EnseignantBuisinessImpl implements IEnseignantBuisiness {
	@Autowired
	private IEnseignantRepository enseignantRepository;

	@Override
	public Enseignant getEnseigantById(@RequestParam Integer id) {

		Enseignant en = enseignantRepository.getOne(id);
		// TODO Auto-generated method stub
		return en;
	}

	@Override
	public List<Enseignant> getAllEnseignants() {
		List<Enseignant> listeE = enseignantRepository.findAll();
		return listeE;
	}

	@Override
	public Enseignant saveEnseigant(Enseignant enseignant) {
		Enseignant en = enseignantRepository.save(enseignant);
		return en;
	}

	@Override
	public void supprimerEnseignant(Integer id) {
		enseignantRepository.deleteById(id);

	}

	@Override
	public Enseignant updateEnseigant(Enseignant enseignant, Integer id) {
		enseignant.setId(id);
		return enseignantRepository.save(enseignant);
	}

}

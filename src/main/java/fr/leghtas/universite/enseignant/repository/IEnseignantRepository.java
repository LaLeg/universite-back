package fr.leghtas.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.leghtas.universite.enseignant.domain.Enseignant;

public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {

}

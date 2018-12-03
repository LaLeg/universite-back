package fr.leghtas.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.leghtas.universite.etudiant.domain.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {

}

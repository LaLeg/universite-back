package fr.leghtas.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.leghtas.universite.matiere.domain.Matiere;

public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

}

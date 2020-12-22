package fr.orsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsys.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
package fr.orsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.orsys.model.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}
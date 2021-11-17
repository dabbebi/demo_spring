package org.demo.demo_spring.repositories;

import org.demo.demo_spring.enitities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}

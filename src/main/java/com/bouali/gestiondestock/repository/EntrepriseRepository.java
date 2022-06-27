package com.moazmar.stocksphere.repository;

import com.moazmar.stocksphere.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}

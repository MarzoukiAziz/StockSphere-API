package com.moazmar.stocksphere.repository;

import com.moazmar.stocksphere.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}

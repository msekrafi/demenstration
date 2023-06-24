package com.fr.demenstration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.demenstration.domain.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}

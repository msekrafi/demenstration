package com.fr.demenstration.service;

import java.util.List;

import com.fr.demenstration.domain.entity.Personne;

public interface PersonneService {
   Personne enregistrementPersonne(Personne personne);
   List<Personne> listPersonneSorted();
}

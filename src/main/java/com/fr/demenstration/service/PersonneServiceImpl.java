package com.fr.demenstration.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fr.demenstration.domain.entity.Personne;
import com.fr.demenstration.repository.PersonneRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PersonneServiceImpl implements PersonneService {
	private final PersonneRepository personneRepository;

	@Override
	@Transactional
	public Personne enregistrementPersonne(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> listPersonneSorted() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

}

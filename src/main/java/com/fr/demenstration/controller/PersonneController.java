package com.fr.demenstration.controller;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.demenstration.domain.dto.PersonneRequest;
import com.fr.demenstration.domain.entity.Personne;
import com.fr.demenstration.service.PersonneService;
import com.fr.demenstration.utils.DateConverter;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PersonneController {
	private final PersonneService personneService;

	@PostMapping("/personnes")
	public Personne enregistrementPersonne(@RequestBody PersonneRequest personneRequest) {
		System.out.println("---"+personneRequest);
		Date dateNaissance=DateConverter.getDateFromString(personneRequest.getDatenaissance());
		Personne person=Personne.builder()
				.dateNaissance(dateNaissance)
				.nom(personneRequest.getNom())
				.prenom(personneRequest.getPrenom())
				.build();
		return personneService.enregistrementPersonne(person);
	}
   @GetMapping("/personnes")
	public List<Personne> listPersonneSorted() {
		return personneService.listPersonneSorted();
	}

}

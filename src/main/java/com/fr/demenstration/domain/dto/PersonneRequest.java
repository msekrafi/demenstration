package com.fr.demenstration.domain.dto;

import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class PersonneRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3585869657225989884L;
	private String nom;
	private String prenom;
	private String datenaissance;

}

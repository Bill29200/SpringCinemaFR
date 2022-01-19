package fr.formation.cinema.bo;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reserver {
	@Id
	@GeneratedValue	
	private Integer idReserver;
	
	//@NotBlank(message = "la date de début de la séance est obligatoire")
	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	
	//@NotBlank(message = "la date de début de la séance est obligatoire")
	@ManyToOne(cascade = CascadeType.ALL)
	private Seance seance;

	public Reserver(Client client, Seance seance) {
		super();
		this.client = client;
		this.seance = seance;
	}

	
}

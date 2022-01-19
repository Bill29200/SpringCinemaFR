package fr.formation.cinema.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Salle {
	

	@Id
	@GeneratedValue
	private Integer IdSalle;
	
	@NotBlank(message = "Le nom de la salle est obligatoire")
	private String nomSalle;
	private String typeSalle;
	private int capacite;
	
	
	public Salle(String nomSalle, String typeSalle, int capacite) {
		
		this.nomSalle = nomSalle;
		this.typeSalle = typeSalle;
		this.capacite = capacite;
	}
	
	

}

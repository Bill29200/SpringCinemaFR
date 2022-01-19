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
public class Film {
	
	@Id
	@GeneratedValue
	private Integer idFilm;
	
//	@NotBlank(message = "Le titre est obligatoire")
	private String titre;
	private String typeFilm;
	private String realisateur;
	
	
	public Film(String titre, String typeFilm, String realisateur) {
		super();
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.realisateur = realisateur;
	}
	
	
	

}

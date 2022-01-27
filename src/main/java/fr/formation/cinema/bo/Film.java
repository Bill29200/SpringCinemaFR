package fr.formation.cinema.bo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	//@NotBlank(message = "Le titre est obligatoire")
	private String titre;
	private String typeFilm;
	private int annee;
	private String realisateur;
	private int duree;
	private String description;
	private String poster;

	
	
	public Film(String titre, String typeFilm, int annee, String realisateur, int duree, String description,
			String poster)
	{
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.annee = annee;
		this.realisateur = realisateur;
		this.duree = duree;
		this.description = description;
		this.poster = poster;
		
	}
	
	
	
}

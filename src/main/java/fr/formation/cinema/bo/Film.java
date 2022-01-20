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
	private String realisateur;
	private int duree;
	private String description;
	
	
	
	public Film(String titre, String typeFilm, String realisateur,
			int duree, String description) {
		super();
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.realisateur = realisateur;
		this.duree = duree;
		this.description = description;
	}

	public Integer getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(Integer idFilm) {
		this.idFilm = idFilm;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTypeFilm() {
		return typeFilm;
	}

	public void setTypeFilm(String typeFilm) {
		this.typeFilm = typeFilm;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", titre=" + titre + ", typeFilm=" + typeFilm + ", realisateur=" + realisateur
				+ ", duree=" + duree + ", description=" + description + "]";
	}
}

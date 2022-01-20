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

public class Salle {
	

	@Id
	@GeneratedValue
	private Integer IdSalle;
	
	//@NotBlank(message = "Le nom de la salle est obligatoire")
	private String nomSalle;
	private String typeSalle;
	private int capacite;
	
	
	
	public Salle(String nomSalle, String typeSalle, int capacite) {
		
		this.nomSalle = nomSalle;
		this.typeSalle = typeSalle;
		this.capacite = capacite;
	}

	public Integer getIdSalle() {
		return IdSalle;
	}
	

	public void setIdSalle(Integer idSalle) {
		IdSalle = idSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "Salle [IdSalle=" + IdSalle + ", nomSalle=" + nomSalle + ", typeSalle=" + typeSalle + ", capacite="
				+ capacite + "]";
	}

}

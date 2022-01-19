package fr.formation.cinema.bo;

import java.time.LocalDate;

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
public class Seance {
	
		@Id
		@GeneratedValue
		private Integer IdSeance;
		
		@NotBlank(message = "la date de début de la séance est obligatoire")
		private LocalDate dateSeanceD;
		private LocalDate dateSeanceF;
		private double prixSeance;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Film film;
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Salle salle;

		public Seance(LocalDate dateSeanceD, LocalDate dateSeanceF, double prixSeance, Film film, Salle salle) {
			super();
			this.dateSeanceD = dateSeanceD;
			this.dateSeanceF = dateSeanceF;
			this.prixSeance = prixSeance;
			this.film = film;
			this.salle = salle;
		}
		
		

}

package fr.formation.cinema.bo;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

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
		private Integer idSeance;
		
		//@NotBlank(message = "la date de début de la séance est obligatoire")
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private LocalDate dateSeance;
		private LocalTime heureDebut;
		private LocalTime heureFin;
		private double prixSeance;
		
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Film film;
		
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Salle salle;

		
		
		public Seance( LocalDate dateSeance,
				LocalTime heureDebut, LocalTime heureFin, double prixSeance, Film film, Salle salle) {
			super();
			this.dateSeance = dateSeance;
			this.heureDebut = heureDebut;
			this.heureFin = heureFin;
			this.prixSeance = prixSeance;
			this.film = film;
			this.salle = salle;
		}

		public Integer getIdSeance() {
			return idSeance;
		}

		public void setIdSeance(Integer idSeance) {
			this.idSeance = idSeance;
		}

		public LocalDate getDateSeance() {
			return dateSeance;
		}

		public void setDateSeance(LocalDate dateSeance) {
			this.dateSeance = dateSeance;
		}

		public LocalTime getHeureDebut() {
			return heureDebut;
		}

		public void setHeureDebut(LocalTime heureDebut) {
			this.heureDebut = heureDebut;
		}

		public LocalTime getHeureFin() {
			return heureFin;
		}

		public void setHeureFin(LocalTime heureFin) {
			this.heureFin = heureFin;
		}

		public double getPrixSeance() {
			return prixSeance;
		}

		public void setPrixSeance(double prixSeance) {
			this.prixSeance = prixSeance;
		}

		public Film getFilm() {
			return film;
		}

		public void setFilm(Film film) {
			this.film = film;
		}

		public Salle getSalle() {
			return salle;
		}

		public void setSalle(Salle salle) {
			this.salle = salle;
		}

		@Override
		public String toString() {
			return "Seance [IdSeance=" + idSeance + ", dateSeance=" + dateSeance + ", heureDebut=" + heureDebut
					+ ", heureFin=" + heureFin + ", prixSeance=" + prixSeance + ", film=" + film + ", salle=" + salle
					+ "]";
		}

}

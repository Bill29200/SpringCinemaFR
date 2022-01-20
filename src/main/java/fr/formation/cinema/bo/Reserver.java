package fr.formation.cinema.bo;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Client client;
	
	//@NotBlank(message = "la date de début de la séance est obligatoire")
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Seance seance;

	
	
	public Reserver(Client client, Seance seance) {
		super();
		this.client = client;
		this.seance = seance;
	}

	public Integer getIdReserver() {
		return idReserver;
	}

	public void setIdReserver(Integer idReserver) {
		this.idReserver = idReserver;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	@Override
	public String toString() {
		return "Reserver [idReserver=" + idReserver + ", client=" + client + ", seance=" + seance + "]";
	}
	
}

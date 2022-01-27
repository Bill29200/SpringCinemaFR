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
public class Client {
	
	@Id
	@GeneratedValue
	private Integer idClient;
	
	@NotBlank(message = "Le titre est obligatoire")
	private String nomClient;
	private String prenomClient;
	private String telephone;
	private boolean inBlacklist;
	
	
	
	public Client(String nomClient, String prenomClient, String telephone) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telephone = telephone;
		this.inBlacklist = false;
	}
	


}

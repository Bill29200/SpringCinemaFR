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
public class Client {
	
	@Id
	@GeneratedValue
	private Integer idClient;
	
//	@NotBlank(message = "Le titre est obligatoire")
	private String nomClient;
	private String prenomClient;
	private String telephone;
	
	
	
	public Client(String nomClient, String prenomClient, String telephone) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telephone = telephone;
	}


	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Client [nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", telephone=" + telephone + "]";
	}
	
    
}

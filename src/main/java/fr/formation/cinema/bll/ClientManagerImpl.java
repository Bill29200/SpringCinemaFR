package fr.formation.cinema.bll;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.cinema.bo.Client;
import fr.formation.cinema.dal.ClientDAO;

@Service
public class ClientManagerImpl implements ClientManager {
	
	@Autowired
	private ClientDAO clientDAO; 

	@Override
	@Transactional
	public void add(Client client) {
		clientDAO.save(client);

	}

	@Override
	@Transactional
	public void modify(Client client) {
		clientDAO.save(client);

	}

	@Override
	@Transactional
	public void delete(Client client) {
		clientDAO.delete(client);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		clientDAO.deleteById(id);

	}

	@Override
	public Client getById(Integer id) {
		
		return clientDAO.findById(id).orElse(null);
	}

	@Override
	public List<Client> getAll() {
		
		return (List<Client>) clientDAO.findAll();
	}

}

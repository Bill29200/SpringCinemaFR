package fr.formation.cinema.bll;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.cinema.bo.Reserver;
import fr.formation.cinema.dal.ReserverDAO;

@Service
public class ReserverManagerImpl implements ReserverManager {
	
	@Autowired
	private ReserverDAO reserverDAO;

	@Override
	@Transactional
	public void add(Reserver reserver) {
		/*
		 * if (reserver.getClient().isInBlacklist()) { throw new
		 * RuntimeException("le Client : "+reserver.getClient().getNomClient()
		 * +" est interdit au cinema");
		 * 
		 * }
		 */
		reserverDAO.save(reserver);
	}

	@Override
	@Transactional
	public void modify(Reserver reserver) {
		reserverDAO.save(reserver);

	}

	@Override
	@Transactional
	public void delete(Reserver reserver) {
		reserverDAO.delete(reserver);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		reserverDAO.deleteById(id);

	}

	@Override
	public Reserver getById(Integer id) {
		
		return reserverDAO.findById(id).orElse(null);
	}

	@Override
	public List<Reserver> getAll() {
		
		return (List<Reserver>) reserverDAO.findAll();
	}

}

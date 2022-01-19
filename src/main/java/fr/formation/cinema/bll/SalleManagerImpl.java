package fr.formation.cinema.bll;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.cinema.bo.Salle;
import fr.formation.cinema.dal.SalleDAO;

@Service
public class SalleManagerImpl implements SalleManager {

	@Autowired
	private SalleDAO salleDAO;
	
	@Override
	@Transactional
	public void add(Salle salle) {
		salleDAO.save(salle);

	}

	@Override
	@Transactional
	public void modify(Salle salle) {
		salleDAO.save(salle);

	}

	@Override
	@Transactional
	public void delete(Salle salle) {
		salleDAO.delete(salle);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		salleDAO.deleteById(id);

	}

	@Override
	public Salle getById(Integer id) {
		
		return salleDAO.findById(id).orElse(null);
	}

	@Override
	public List<Salle> getAll() {
		
		return (List<Salle>) salleDAO.findAll();
	}

}

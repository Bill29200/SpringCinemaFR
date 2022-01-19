package fr.formation.cinema.bll;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.cinema.bo.Seance;
import fr.formation.cinema.dal.SeanceDAO;

@Service
public class SeanceManagerImpl implements SeanceManager {

	@Autowired
	private SeanceDAO seanceDAO;
	
	@Override
	@Transactional
	public void add(Seance seance) {
		seanceDAO.save(seance);

	}

	@Override
	@Transactional
	public void modify(Seance seance) {
		seanceDAO.save(seance);

	}

	@Override
	@Transactional
	public void delete(Seance seance) {
		seanceDAO.delete(seance);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		seanceDAO.deleteById(id);

	}

	@Override
	public Seance getById(Integer id) {
		return seanceDAO.findById(id).orElse(null);
	}

	@Override
	public List<Seance> getAll() {
		return (List<Seance>) seanceDAO.findAll();
	}

}

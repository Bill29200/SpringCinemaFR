package fr.formation.cinema.bll;

import java.util.List;

public interface CRUDManager <C> {
	
	public void add(C item);
	public void modify(C item);
	public void delete(C item);
	public void deleteById(Integer id);
	public C getById(Integer id);
	public List<C> getAll();

}

package fr.formation.cinema.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.formation.cinema.bo.Seance;


public interface SeanceDAO extends CrudRepository<Seance, Integer> {
	
/*	
	@Query("SELECT pl.legume.nom FROM Plantation pl WHERE pl.carre.potager=:potager")
	List<String> findLegumesFromPotager(@Param("potager") Potager p);

	@Query("SELECT pl.carre.potager FROM Plantation pl WHERE pl.legume=:legume")
	List<Potager> findPotagersFromLegume(@Param("legume") Legume l);
	*/

}

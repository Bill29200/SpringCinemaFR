package fr.formation.cinema;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.cinema.bll.ClientManager;
import fr.formation.cinema.bll.FilmManager;
import fr.formation.cinema.bll.ReserverManager;
import fr.formation.cinema.bll.SalleManager;
import fr.formation.cinema.bll.SeanceManager;
import fr.formation.cinema.bo.Client;
import fr.formation.cinema.bo.Film;
import fr.formation.cinema.bo.Reserver;
import fr.formation.cinema.bo.Salle;
import fr.formation.cinema.bo.Seance;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner{

	@Autowired
	private FilmManager filmManager;
	
	@Autowired
	private SalleManager salleManager;
	
	@Autowired
	private SeanceManager seanceManager;
	
	@Autowired
	private ClientManager clientManager;
	
	@Autowired
	private ReserverManager reserverManager;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		
		  System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££");
		 
		  Film f1 = new Film("Training day", "Policier", "Denzel washigton", 180,
					"C'est film d'un nouveau policier avec un ancien policier traitre complisse avec une bande de drogue ");
			filmManager.add(f1);
			Film f2 = new Film("Brave Heart", "Historique", "Mel Gibson", 200,
					"Un film qui raconte l'histoire de l'icosse avec la grande bretagne et represente l'hero William Wallas ");
			Film f3 = new Film("Titanic", "Romantique", "Cameroon", 180,
					"l'histoire de la fin d'un grand bateau qui vas traverser l'atlantique de l'angleterre vers l'amerique ");
			filmManager.add(f1);
			filmManager.add(f2);
			filmManager.add(f3);
		  
		  //............................................
		  
			
			  Salle s1= new Salle("Grande Salle", "Adult", 400); salleManager.add(s1);
			  Salle s2= new Salle("La centrale", "Jeune", 500); salleManager.add(s2); Salle
			  s3= new Salle("SalleToons", "Enfant", 100); salleManager.add(s3);
			 
		  
		  //............................................
		  
			
			  Seance se1 = new Seance(LocalDate.of(2022, 12, 12),LocalTime.of(12, 10),LocalTime.of(12, 10),12.0,f1, s1);seanceManager.add(se1);
			  Seance se2 = new Seance(null,null,null,20,f2, s2);seanceManager.add(se2);
			  Seance se3 = new Seance(null,null,null,20,f1,s3);seanceManager.add(se3);
			  Seance se4 = new Seance(null,null,null,20,f2, s3);seanceManager.add(se4);
			 
		  
		  //............................................
		  
			
			  Client c1 = new Client("Mohamad","Ali","0784512698"); clientManager.add(c1);
			  Client c2 = new Client("Mike","Tysson","0654978102"); clientManager.add(c2);
			  Client c3 = new Client("Fatima","Sabri","0521369874"); clientManager.add(c3);
			  System.out.println(clientManager.getAll());			 
		  //............................................
		  
			
			
			  Reserver r1 = new Reserver(c1, se1); reserverManager.add(r1); 
			  Reserver r2 = new Reserver(c1, se2); reserverManager.add(r2); 
			  Reserver r3 = new Reserver(c2, se1); reserverManager.add(r3); 
			  Reserver r4 = new Reserver(c2, se2); reserverManager.add(r4); 
			  Reserver r5 = new Reserver(c3, se3); reserverManager.add(r5); 
			  Reserver r6 = new Reserver(c3, se4); reserverManager.add(r6);
			 
			 
		  
		  System.out.println("£££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££££"
		  );
		 
	}

}

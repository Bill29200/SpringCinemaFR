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
		 
		  Film f1 = new Film("Training day", "Crime, Drama, Thriller", 2001, "David Ayer", 122, "A rookie cop spends his first day as a Los Angeles narcotics officer with a rogue detective who isn't what he appears to be.",
				  "https://m.media-amazon.com/images/M/MV5BMDZkMTUxYWEtMDY5NS00ZTA5LTg3MTItNTlkZWE1YWRjYjMwL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg");
				  
				  
			filmManager.add(f1);
			Film f2 = new Film("Troy", "Drama, History", 2004, "Wolfgang Petersen", 163, "An adaptation of Homer's great epic, the film follows the assault on Troy by the united Greek forces and chronicles the fates of the men involved.",
					  "https://m.media-amazon.com/images/M/MV5BMTk5MzU1MDMwMF5BMl5BanBnXkFtZTcwNjczODMzMw@@._V1_SX300.jpg");
			Film f3 = new Film("Fast & Furious 6", "Action",2002, "Justin Lin", 180,
					"l'histoire de la fin d'un grand bateau qui vas traverser l'atlantique de l'angleterre vers l'amerique ",
					"https://m.media-amazon.com/images/M/MV5BMTM3NTg2NDQzOF5BMl5BanBnXkFtZTcwNjc2NzQzOQ@@._V1_SX300.jpg");
			
			Film f4 = new Film("The Last Samurai", "Action, Drama",2003, "Edward Zwick", 154,
					"An American military advisor embraces the Samurai culture he was hired to destroy after he is captured in battle. ",
					"https://m.media-amazon.com/images/M/MV5BMzkyNzQ1Mzc0NV5BMl5BanBnXkFtZTcwODg3MzUzMw@@._V1_SX300.jpg");
			
			Film f5 = new Film("Panda kung fu", "movie",2008, "Edward Zwick", 154,
					"An American military advisor embraces the Samurai culture he was hired to destroy after he is captured in battle. ",
					"https://m.media-amazon.com/images/M/MV5BODJkZTZhMWItMDI3Yy00ZWZlLTk4NjQtOTI1ZjU5NjBjZTVjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg");
			Film f6 = new Film("Titanic", "Drama, Romance",1997, "James Cameron", 194 ,
					"A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic. ",
					"https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg");
			Film f7 = new Film("The Lord of the Rings", "Action, Adventure, Drama",2001, "Peter Jackson", 178  ,
					"A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron. ",
					"https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg");
			Film f8 = new Film("Ice Age", "Animation, Adventure, Comedy",2002, "Chris Wedge, Carlos Saldanha", 81  ,
					"The story revolves around sub-zero heroes: a woolly mammoth, a saber-toothed tiger, a sloth and a prehistoric combination of a squirrel and rat, known as Scrat.",
					"https://m.media-amazon.com/images/M/MV5BMmYxZWY2NzgtYzJjZC00MDFmLTgxZTctMjRiYjdjY2FhODg3XkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_SX300.jpg");
			
			filmManager.add(f1);
			filmManager.add(f2);
			filmManager.add(f3);
			filmManager.add(f4);
			filmManager.add(f5);
			filmManager.add(f6);
			filmManager.add(f7);
			filmManager.add(f8);
			
		  
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
		  
			
			  Client c1 = new Client("Ali","Ali","0784512698"); 
			      clientManager.add(c1);
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

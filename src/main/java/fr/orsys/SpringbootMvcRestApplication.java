package fr.orsys;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootMvcRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcRestApplication.class, args);
	}

	/*
	 * public static void main(String[] args) { ApplicationContext ctx =
	 * SpringApplication.run(SpringbootMvcRestApplication.class, args);
	 * PersonneRepository personneRepository =
	 * ctx.getBean(PersonneRepository.class); AdresseRepository adresseRepository =
	 * ctx.getBean(AdresseRepository.class); Adresse ad1 = new Adresse(null,
	 * "Place de l'Hôtel de Ville", "75000", "Paris"); Adresse ad2 = new
	 * Adresse(null, "75 rue Bataille", "69008", "Lyon"); Adresse ad3 = new
	 * Adresse(null, "55 Rue Jean Jaurès", "59000 ", "Lille");
	 * adresseRepository.save(ad1); adresseRepository.save(ad2);
	 * adresseRepository.save(ad3); List<Adresse> lst1 = new ArrayList<Adresse>();
	 * lst1.add(ad1); lst1.add(ad2); List<Adresse> lst2 = new ArrayList<Adresse>();
	 * lst2.add(ad2); lst2.add(ad3); List<Adresse> lst3 = new ArrayList<Adresse>();
	 * lst3.add(ad1); lst3.add(ad3); Personne p1 = new Personne(null, "Mustermann",
	 * "Max", 1800, lst1); Personne p2 = new Personne(null, "Wick", "John", 2500,
	 * lst2); Personne p3 = new Personne(null, "Muller", "Kate", 1700, lst3);
	 * Personne p4 = new Personne(null, "Willis", "Bruce", 3500, lst2); Personne p5
	 * = new Personne(null, "Wilson", "Jack", 2500, lst1); Personne p6 = new
	 * Personne(null, "Smith", "Carol", 2000, lst3); personneRepository.save(p1);
	 * personneRepository.save(p2); personneRepository.save(p3);
	 * personneRepository.save(p4); personneRepository.save(p5);
	 * personneRepository.save(p6); personneRepository.findAll().forEach(p ->
	 * System.out.println(p.getPrenom())); }
	 */

}

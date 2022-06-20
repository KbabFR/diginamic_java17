package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.PersonneServices;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppOptional {

	public static void main(String[] args) {

		List<Personne> lp = new ArrayList<>();
		lp.add(new Facteur("Jolie","Sylvie",Genre.Femme, 35));
		lp.add(new Facteur("Morand","Yassine",Genre.NonBinaire, 26));
		lp.add(new Facteur("Dutour","Jean",Genre.Homme, 90));
		
		Optional<Personne> op = PersonneServices.findByNamePersonne(lp, "jOlIE");
		if(op.isEmpty())
			System.out.println("Personne non trouv�e");
		if(op.isPresent())
			System.out.println("Personne trouv�e : " + op.get());
	}

}

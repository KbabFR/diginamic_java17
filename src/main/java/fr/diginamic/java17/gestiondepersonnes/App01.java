package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.java17.gestiondepersonnes.classes.Facteur;
import fr.diginamic.java17.gestiondepersonnes.classes.Personne;
import fr.diginamic.java17.gestiondepersonnes.classes.Vehicule;
import fr.diginamic.java17.gestiondepersonnes.classes.Voiture;
import fr.diginamic.java17.gestiondepersonnes.classes.VoiturePoste;
import fr.diginamic.java17.gestiondepersonnes.enums.Genre;
import fr.diginamic.java17.gestiondepersonnes.interfaces.Ifacteur;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * On va gérer des Personnes et des Vehicules
		 * On va creer des Facteurs et des Voitures pour la Poste
		 * On va gérer ces créations dans des Lists
		 * On va les trier, filtrer ...
		 */
		
		Personne p1 = new Facteur("Germain","Christophe",Genre.Homme);
		Facteur f1 = new Facteur("Justine", "Brun", Genre.Femme);
		Object o1 = new Facteur("Aurélie","Vignozzi",Genre.Trap);
		Vehicule v1 = new VoiturePoste("413-XAN-753");
		Voiture vt1 = new VoiturePoste("1337");
		VoiturePoste vp1 = new VoiturePoste("VER-071");
		Ifacteur ivp1 = new VoiturePoste("R1J4N");
		
		List<Personne> lp = new ArrayList<>();
		List<Facteur> lf = new ArrayList<>();
		List<Object> lo = new ArrayList<>();
		List<Ifacteur> ilf = new ArrayList<>();
		
		/**
		 * Liste d'objets
		 */
		lo.add(o1);
		lo.add(p1);
		lo.add(f1);
		lo.add(new String());
		//Lambda expression
		lo.forEach( o -> System.out.println(o));
		
		lp.add(p1);
		lp.add(f1);
		
		lp.forEach( o -> System.out.println(o));
		
		lf.add(f1);
		
		lf.forEach( o -> System.out.println(o));
		

	}

}

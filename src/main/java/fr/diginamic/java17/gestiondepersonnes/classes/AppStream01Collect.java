package fr.diginamic.java17.gestiondepersonnes.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppStream01Collect {

	public static void main(String[] args) {

		List<Personne> lp  = new ArrayList<>();
		lp.add(new Facteur("Fact01","Jean", Genre.Homme, 11));
		lp.add(new Facteur("Fact02","Martine", Genre.Femme, 53));
		lp.add(new Facteur("Fact03","Frederic", Genre.NonBinaire, 98));
		lp.add(new Facteur("Fact04","Paul", Genre.Homme, 236));
		
		/**
		 * 1 Récuperer la liste des noms des Facteurs
		 * 2 récuperer les noms des facteurs dans une chaine (sans séparateur explicite)
		 * 3 récuperer les noms des facteurs dans une chaine (avec séparateur ; )
		 */
		
		// 1
		List<String> lnoms = lp.stream().map(p -> p.getNom()).collect(Collectors.toList());

		lnoms.forEach(System.out::println);
		
		// 2
		String nomDesPersonnes = lp.stream().map(p->p.getNom()).collect(Collectors.joining());
		
		System.out.println(nomDesPersonnes);
		
		// 3
		String nomDesPersonnesSep = lp.stream().map(p->p.getNom()).collect(Collectors.joining(";"));
		
		System.out.println(nomDesPersonnesSep);
	}

}

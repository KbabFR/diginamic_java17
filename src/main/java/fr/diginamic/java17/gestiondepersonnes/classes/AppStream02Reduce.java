package fr.diginamic.java17.gestiondepersonnes.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public class AppStream02Reduce {

	public static void main(String[] args) {

		List<Personne> lp  = new ArrayList<>();
		lp.add(new Facteur("Fact01","Jean", Genre.Homme, 20));
		lp.add(new Facteur("Fact02","Martine", Genre.Femme, 50));
		lp.add(new Facteur("Fact03","Frederic", Genre.NonBinaire, 30));
		lp.add(new Facteur("Fact04","Paul", Genre.Homme, 55));
		
		/**
		* 1 Cumul de tous les âges de la liste de Personne
		* 2 Cumul des âges pour les Genre.MME de la liste de Personne
		* 3 Cumul des âges pour âges >= 50 de la liste de Personne
		* 4 Nombre des âges pour âges >= 50 de la liste de Personne
		* 5 Count des Genre.MR de la liste de Personne
		*/
		
		// 1
		int cumul1 = lp.stream().map(p -> p.getAge()).reduce((a1,a2) -> a1 + a2).get();
		
		System.out.println(cumul1);
		
		// 2
		int cumul2 = lp.stream().filter(p -> p.getGenre()==Genre.Femme).map(p -> p.getAge()).reduce((a1,a2) -> a1 + a2).get();
		
		System.out.println(cumul2);
		
		// 3
		int cumul3 = lp.stream().map(p -> p.getAge()).filter(a -> a >= 50).reduce((a1,a2) -> a1 + a2).get();
		
		System.out.println(cumul3);
		
		// 4
		long count1 = lp.stream().filter(p -> p.getAge() >= 50).count();
		
		System.out.println(count1);
		
		// 5
		long count2 = lp.stream().filter(p -> p.getGenre() == Genre.Homme).count();
		
		System.out.println(count2);
		
		// moyenne d'age
		double moyenneAgeCollect = lp.stream().collect(Collectors.averagingDouble(p -> p.getAge()));
		
		System.out.println(moyenneAgeCollect);
		
	}

}

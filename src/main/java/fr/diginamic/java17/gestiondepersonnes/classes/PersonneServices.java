package fr.diginamic.java17.gestiondepersonnes.classes;

import java.util.List;
import java.util.Optional;

public class PersonneServices {

	public static Optional<Personne> findByNamePersonne(List<Personne> lp, String nom) {
		for(Personne p : lp) {
			if(p.getNom().equalsIgnoreCase(nom))
				return Optional.of(p);
		}
		return Optional.empty();
	}

}

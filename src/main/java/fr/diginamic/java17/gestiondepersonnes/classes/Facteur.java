package fr.diginamic.java17.gestiondepersonnes.classes;

import fr.diginamic.java17.gestiondepersonnes.enums.Genre;
import fr.diginamic.java17.gestiondepersonnes.interfaces.Ifacteur;

public class Facteur extends Personne implements Ifacteur {

	public Facteur(String nom, String prenom, Genre genre) {
		super(nom, prenom, genre);
	}

	@Override
	public Object distribuer() {
		// TODO Auto-generated method stub
		return null;
	}

}

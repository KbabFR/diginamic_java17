package fr.diginamic.java17.gestiondepersonnes.interfaces;

public interface Ifacteur {
	
	/**
	 * Depuis Java 11 on peut mettre un comportement par défaut dans une interface sans que la classe qui l'implemente la surcharge
	 * 
	 * -> On doit surcharger les méthodes d'une interface quand elle est implémenté dans une classe implements
	 */
	default void trier() {
		System.out.println("Je trie par défaut !");
	}
	
	/**
	 * Doit être surchargée @Override
	 */
	Object distribuer();
}

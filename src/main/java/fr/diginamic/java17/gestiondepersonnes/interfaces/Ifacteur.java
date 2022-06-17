package fr.diginamic.java17.gestiondepersonnes.interfaces;

public interface Ifacteur {
	
	/**
	 * Depuis Java 11 on peut mettre un comportement par d�faut dans une interface sans que la classe qui l'implemente la surcharge
	 * 
	 * -> On doit surcharger les m�thodes d'une interface quand elle est impl�ment� dans une classe implements
	 */
	default void trier() {
		System.out.println("Je trie par d�faut !");
	}
	
	/**
	 * Doit �tre surcharg�e @Override
	 */
	Object distribuer();
}

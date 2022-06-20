package fr.diginamic.java17.gestiondepersonnes.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class VoitureServices {
	
	public static Optional<Voiture> findByImmatVoiture(List<Voiture> lv, String immat) {
		for(Voiture v : lv) {
			if(v.getImmatriculation().equalsIgnoreCase(immat))
				return Optional.of(v);
		}
		return Optional.empty();
	}
	
	/**
	 * WORK IN PROGRESS
	 * @param lv
	 * @param partialImmat
	 * @return
	 */
	public static Optional<List<Voiture>> findsByPartialImmatVoiture(List<Voiture> lv, String partialImmat) {
		List<Voiture> lvi = new ArrayList<>();
		for(Voiture v : lv) {
			String[] immat = v.getImmatriculation().split("");
			for (String imt : immat) {
				if(!imt.equals("-"));
			}
			System.out.println();
		}
		if(lvi.isEmpty())
			return Optional.empty();
		return Optional.of(lvi);
	}

}

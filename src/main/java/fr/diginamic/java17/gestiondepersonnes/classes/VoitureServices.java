package fr.diginamic.java17.gestiondepersonnes.classes;

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

}

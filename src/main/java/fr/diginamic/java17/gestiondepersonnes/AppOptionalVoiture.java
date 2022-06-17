package fr.diginamic.java17.gestiondepersonnes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.diginamic.java17.gestiondepersonnes.classes.Voiture;
import fr.diginamic.java17.gestiondepersonnes.classes.VoiturePoste;
import fr.diginamic.java17.gestiondepersonnes.classes.VoitureServices;

public class AppOptionalVoiture {

	public static void main(String[] args) {

		List<Voiture> lv = new ArrayList<>();
		lv.add(new VoiturePoste("123-456-789"));
		lv.add(new VoiturePoste("987-654-321"));
		lv.add(new VoiturePoste("147-258-369"));
		lv.add(new VoiturePoste("963-852-741"));
		lv.add(new VoiturePoste("789-456-123"));
		
		Optional<Voiture> op = VoitureServices.findByImmatVoiture(lv, "963-852-741");
		if(op.isEmpty())
			System.out.println("Personne non trouvée");
		if(op.isPresent())
			System.out.println("Personne trouvée : " + op.get());

	}

}

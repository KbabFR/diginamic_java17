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
		
		Optional<Voiture> opv = VoitureServices.findByImmatVoiture(lv, "963-852-741");
		if(opv.isEmpty())
			System.out.println("Voiture non trouvée");
		if(opv.isPresent())
			System.out.println("Voiture trouvée : " + opv.get());
		
		Optional<List<Voiture>> oplv = VoitureServices.findsByPartialImmatVoiture(lv, "123");
		if(oplv.isEmpty())
			System.out.println("Voiture non trouvée");
		if(oplv.isPresent())
			System.out.println("Voiture trouvée : " + oplv.get());

	}

}

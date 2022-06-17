package fr.diginamic.java17.gestiondepersonnes.classes;

import fr.diginamic.java17.gestiondepersonnes.interfaces.Ifacteur;

public class VoiturePoste extends Voiture implements Ifacteur{

	public VoiturePoste(String immatriculation) {
		super(immatriculation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object distribuer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void trier() {
		// TODO Auto-generated method stub
		Ifacteur.super.trier();
	}

}

package fr.diginamic.java17.gestiondepersonnes.classes;

public abstract class Vehicule {
	private String immatriculation;

	public Vehicule(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + "]";
	}


}

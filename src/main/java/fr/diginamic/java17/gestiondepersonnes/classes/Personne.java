package fr.diginamic.java17.gestiondepersonnes.classes;

import fr.diginamic.java17.gestiondepersonnes.enums.Genre;

public abstract class Personne {
	private String nom;
	private String prenom;
	private Genre genre;
	private int age;
	
	public Personne(String nom, String prenom, Genre genre, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", age=" + age + "]";
	}
	
	



}

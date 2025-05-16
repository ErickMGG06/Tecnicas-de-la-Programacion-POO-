package Hijos;

import Padres.Felino;

public class Tigre extends Felino{
	private String especieTigre;

	public Tigre(String habitat, String nomCien, double altura, double largo, double peso, double tamañoGarras,
			int velocidad, String especieTigre) {
		super(habitat, nomCien, altura, largo, peso, tamañoGarras, velocidad);
		this.especieTigre = especieTigre;
	}

	public String getEspecieTigre() {
		return especieTigre;
	}

	public void setEspecieTigre(String especieTigre) {
		this.especieTigre = especieTigre;
	}

	public String Comer() {
		return "El tigre come en su hábitat: "+habitat;
	}

	public String Domri() {
		return "El tigre de especie: "+especieTigre+" duerme en áreas tranquilas";
	}
	public String Correr() {
		return "El tigre corre a una velocidad de : "+velocidad+ " km";
	}

	public String Comunicarse() {
		return "El nombre cientifico del tigre es: "+nomCien+" y se comunica mediante señales visuales, visuales y olfativas";
	}
	
}

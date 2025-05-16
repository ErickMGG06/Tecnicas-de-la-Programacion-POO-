package Hijos;

import Padres.Canino;

public class Perro extends Canino{
	private int fuerzamordida;

	public Perro(String habitat, String nomCien, double altura, double largo, double peso, String color,
			double tamañoColmillos, int fuerzamordida) {
		super(habitat, nomCien, altura, largo, peso, color, tamañoColmillos);
		this.fuerzamordida = fuerzamordida;
	}

	public int getFuerzamordida() {
		return fuerzamordida;
	}

	public void setFuerzamordida(int fuerzamordida) {
		this.fuerzamordida = fuerzamordida;
	}

	public String Comer() {
		return "Los perros salvajes africanos comen en su habitat: "+habitat;
	}

	public String Domri() {
		return "Los perros salvajes africanos con un tamaño de colmillos de: "+tamañoColmillos+"duermen entre los 12 y 14 horas al día";
	}

	public String Correr() {
		return "Los perros salvajes africanos pueden correr a una gran velocidad con un peso de: "+peso;
	}

	public String Comunicarse() {
		return "Los perros salvajes africanos se comunican mediantes ladridos y pueden tener  un fuerza de mordidad de: "+fuerzamordida;
	}
	
}

package Padres;

import Abuelo.Mamifero;

public abstract class Felino extends Mamifero {
	protected double tamañoGarras;
	protected int velocidad;
	public Felino(String habitat, String nomCien, double altura, double largo, double peso, double tamañoGarras,
			int velocidad) {
		super(habitat, nomCien, altura, largo, peso);
		this.tamañoGarras = tamañoGarras;
		this.velocidad = velocidad;
	}
	public double getTamañoGarras() {
		return tamañoGarras;
	}
	public void setTamañoGarras(double tamañoGarras) {
		this.tamañoGarras = tamañoGarras;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}

package Padres;

import Abuelo.Mamifero;

public abstract class Canino extends Mamifero {
	protected String color;
	protected double tamañoColmillos;
	public Canino(String habitat, String nomCien, double altura, double largo, double peso, String color,
			double tamañoColmillos) {
		super(habitat, nomCien, altura, largo, peso);
		this.color = color;
		this.tamañoColmillos = tamañoColmillos;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getTamañoColmillos() {
		return tamañoColmillos;
	}
	public void setTamañoColmillos(double tamañoColmillos) {
		this.tamañoColmillos = tamañoColmillos;
	}
	
}

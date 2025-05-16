package Hijos;

import Padres.Felino;

public class Guepardo extends Felino{

	public Guepardo(String habitat, String nomCien, double altura, double largo, double peso, double tamañoGarras,
			int velocidad) {
		super(habitat, nomCien, altura, largo, peso, tamañoGarras, velocidad);
	}

	public String Comer() {
		return "El guepardo come en su habitat: "+habitat;
	}

	public String Domri() {
		return "El guerpardo duerme en su habitat: "+habitat;
	}

	public String Correr() {
		return "El guerpardo corre con una velocidad de: "+velocidad;
	}

	public String Comunicarse() {
		return "El guerpardo con nombre cientifico: "+nomCien+" se comunica mediante chillidos";
	}
	
}

package Hijos;

import Padres.Felino;

public class Leon extends Felino {
	private int numManada;
	private double potenciaRugidoDecibel;
	public Leon(String habitat, String nomCien, double altura, double largo, double peso, double tamañoGarras,
			int velocidad, int numManada, double potenciaRugidoDecibel) {
		super(habitat, nomCien, altura, largo, peso, tamañoGarras, velocidad);
		this.numManada = numManada;
		this.potenciaRugidoDecibel = potenciaRugidoDecibel;
	}
	public int getNumManada() {
		return numManada;
	}
	public void setNumManada(int numManada) {
		this.numManada = numManada;
	}
	public double getPotenciaRugidoDecibel() {
		return potenciaRugidoDecibel;
	}
	public void setPotenciaRugidoDecibel(double potenciaRugidoDecibel) {
		this.potenciaRugidoDecibel = potenciaRugidoDecibel;
	}
	public String Comer() {
		return "El león come en su habitad: "+habitat;
	}
	public String Domri() {
		return "El león duerme en manadas de "+numManada;
	}
	public String Correr() {
		return "El corre a una velocidad de "+velocidad;
	}
	public String Comunicarse() {
		return "El león con el nombre cientifico"+nomCien+" se comunica mediante rugidos con potencia de: "+potenciaRugidoDecibel +"dB";
	}
	
}

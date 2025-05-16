package Hijos;

import Padres.Canino;

public class Lobo extends Canino{
	private int numCamada;
	private String especieLobo;
	public Lobo(String habitat, String nomCien, double altura, double largo, double peso, String color,
			double tamañoColmillos, int numCamada, String especieLobo) {
		super(habitat, nomCien, altura, largo, peso, color, tamañoColmillos);
		this.numCamada = numCamada;
		this.especieLobo = especieLobo;
	}
	public int getNumCamada() {
		return numCamada;
	}
	public void setNumCamada(int numCamada) {
		this.numCamada = numCamada;
	}
	public String getEspecieLobo() {
		return especieLobo;
	}
	public void setEspecieLobo(String especieLobo) {
		this.especieLobo = especieLobo;
	}
	public String Comer() {
		return "El lobo come carne y tiene un peso de "+peso;
	}
	public String Domri() {
		return "El lobo duerme con sus "+numCamada+"lobeznos";
	}
	public String Correr() {
		return "El lobo corre a 60 km/h y con un tamaño de colmillos: "+tamañoColmillos;
	}
	public String Comunicarse() {
		return "EL lobo de especie:"+especieLobo+"se comunica mediante aullidos y gruñidos";
	}
	
}

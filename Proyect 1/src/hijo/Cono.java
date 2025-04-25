package hijo;

import padre.Circulo;

public class Cono extends Circulo {
	private double altura;
	private double generatriz;
	public Cono(double radio, double altura, double generatriz) {
		super(radio);
		this.altura = altura;
		this.generatriz = generatriz;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getGeneratriz() {
		return generatriz;
	}
	public void setGeneratriz(double generatriz) {
		this.generatriz = generatriz;
	}
	
	public double AreaTotal() {
		return 3.1416+radio*radio+3.1416*radio+generatriz;
	}
	public double Volumen() {
		return 3.1416*radio*radio*altura/3;
	}
	public String Mensaje() {
		return "Soy Conito";
	}
}

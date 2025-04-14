package Caso1;

public class Triangulo {
	private double base, algura;

	public Triangulo(double base, double algura) {
		this.base = base;
		this.algura = algura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlgura() {
		return algura;
	}

	public void setAlgura(double algura) {
		this.algura = algura;
	}
	public double Área() {
		return base*algura/2;
	}

}

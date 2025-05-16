package Caso1_FiguraGeometrica;

public class Rectangulo extends Figura {
private double base, altura;

public Rectangulo(double base, double altura) {
	super();
	this.base = base;
	this.altura = altura;
	
}
public double CalcularArea() {
	return base*altura;
}
}

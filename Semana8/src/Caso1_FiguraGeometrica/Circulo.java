package Caso1_FiguraGeometrica;

public class Circulo extends Figura{
private double radio;

public Circulo(double radio) {
	super();
	this.radio = radio;
}
public double CalcularArea() {
	return 3.1416*radio*radio;
}
}


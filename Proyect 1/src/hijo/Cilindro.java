package hijo;

import padre.Circulo;

public class Cilindro extends Circulo{ 		//extends Es para que al Cilindro le digan que Circulo es su "Padre"
	private double altura;

	public Cilindro(double radio, double altura) {
		super(radio);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String Mensaje() {
		return "Soy Cilindro";
	}
	public double Area() {
		return 2*3.1416*radio*radio + 2*3.1416*radio*altura;
	}
	public double Volumen() {
		return 3.1416*radio*radio+altura;	
	}
}

package padre;

public class Circulo {
protected double radio;

public Circulo(double radio) {
	this.radio = radio;
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}
public double Area() {
	return 3.1416*radio*radio;
}
public double Longitud() {
	return 2*3.1416*radio;
}
public String Mensaje() {
	return "Soy Circulo";
}
}

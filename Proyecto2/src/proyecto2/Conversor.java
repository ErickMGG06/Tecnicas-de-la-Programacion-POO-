package proyecto2;

public class Conversor {
private double celsius;
private int km, seg;

public Conversor(double celsius) {
	this.celsius = celsius;
}
public Conversor(int km) {
	this.km = km;
}
public Conversor(int seg, boolean flag) {
	this.seg = seg;
}

public double Convertir(double celsius) {
	return celsius*9/5 + 32 ;
}
public double Convertir(int km) {
	return km*0.621371;
}
public String Convertir(int seg, boolean anc) {
	int min= seg/60; // minutos
	int residuo = seg%60; //segundos
	return min + "minuto(s)"+ "y" + residuo+"segundos";
}

}

/*Ejercicio: Crea una clase Conversor con un método convertir sobrecargado para:
• Convertir grados Celsius a Fahrenheit.
• Convertir kilómetros a millas.
• Convertir segundos a minutos y segundos.*/
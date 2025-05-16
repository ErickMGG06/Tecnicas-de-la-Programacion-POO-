package Abuelo;

public abstract class Mamifero {
protected String habitat, nomCien;
protected double altura, largo, peso;
public Mamifero(String habitat, String nomCien, double altura, double largo, double peso) {
	this.habitat = habitat;
	this.nomCien = nomCien;
	this.altura = altura;
	this.largo = largo;
	this.peso = peso;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getNomCien() {
	return nomCien;
}
public void setNomCien(String nomCien) {
	this.nomCien = nomCien;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getLargo() {
	return largo;
}
public void setLargo(double largo) {
	this.largo = largo;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}

public abstract String Comer();
public abstract String Domri();
public abstract String Correr();
public abstract String Comunicarse();
}

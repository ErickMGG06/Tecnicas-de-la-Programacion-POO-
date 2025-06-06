package clases;

public class Facultad {
private int codFacultad;
private String nomFacultad;
public Facultad(int codFacultad, String nomFacultad) {
	this.codFacultad = codFacultad;
	this.nomFacultad = nomFacultad;
	
}

public Facultad() {
	codFacultad=0;
	nomFacultad=null;
}

public int getCodFacultad() {
	return codFacultad;
}
public void setCodFacultad(int codFacultad) {
	this.codFacultad = codFacultad;
}
public String getNomFacultad() {
	return nomFacultad;
}
public void setNomFacultad(String nomFacultad) {
	this.nomFacultad = nomFacultad;
}

}

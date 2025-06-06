package clases;

public class Estudiante {
private int codEstudiante;
private String nomEstudiante;
public Estudiante(int codEstudiante, String nomEstudiante) {
	this.codEstudiante = codEstudiante;
	this.nomEstudiante = nomEstudiante;
	
}
public int getCodEstudiante() {
	return codEstudiante;
}
public void setCodEstudiante(int codEstudiante) {
	this.codEstudiante = codEstudiante;
}
public String getNomEstudiante() {
	return nomEstudiante;
}
public void setNomEstudiante(String nomEstudiante) {
	this.nomEstudiante = nomEstudiante;
}


}

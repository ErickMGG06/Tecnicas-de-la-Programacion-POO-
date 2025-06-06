package clases;

public class Universidad {
private int codUniversidad;
private String nomUniversidad;
private Estudiante estu; //Agregación
private Facultad facu;	//Composición

public Universidad(int codUniversidad, String nomUniversidad, Facultad facu) {
	this.codUniversidad = codUniversidad;
	this.nomUniversidad = nomUniversidad;
	this.facu = facu;
}

public Universidad() {
	codUniversidad =0;
	nomUniversidad =null;
	facu = new Facultad();
}

public Facultad getFacu() {
	return facu;
}

public void setFacu(Facultad facu) {
	this.facu = facu;
}

public int getCodUniversidad() {
	return codUniversidad;
}
public void setCodUniversidad(int codUniversidad) {
	this.codUniversidad = codUniversidad;
}
public String getNomUniversidad() {
	return nomUniversidad;
}
public void setNomUniversidad(String nomUniversidad) {
	this.nomUniversidad = nomUniversidad;
}

}

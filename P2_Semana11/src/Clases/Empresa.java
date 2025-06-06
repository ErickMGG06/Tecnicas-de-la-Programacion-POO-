package Clases;

public class Empresa {
private int codEmpresa;
private String nomEmpresa;
private int rucEmpresa;
private Cliente cli;
private DptoConta dpto;
public Empresa(int codEmpresa, String nomEmpresa, int rucEmpresa, DptoConta dpto) {
	this.codEmpresa = codEmpresa;
	this.nomEmpresa = nomEmpresa;
	this.rucEmpresa = rucEmpresa;
	this.dpto = dpto;
}

public Empresa() {
	codEmpresa = 0;
	nomEmpresa = null;
	dpto = new DptoConta();
}

public int getCodEmpresa() {
	return codEmpresa;
}
public void setCodEmpresa(int codEmpresa) {
	this.codEmpresa = codEmpresa;
}
public String getNomEmpresa() {
	return nomEmpresa;
}
public void setNomEmpresa(String nomEmpresa) {
	this.nomEmpresa = nomEmpresa;
}
public int getRucEmpresa() {
	return rucEmpresa;
}
public void setRucEmpresa(int rucEmpresa) {
	this.rucEmpresa = rucEmpresa;
}
public DptoConta getDpto() {
	return dpto;
}
public void setDpto(DptoConta dpto) {
	this.dpto = dpto;
}

}

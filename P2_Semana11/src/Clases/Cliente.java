package Clases;

public class Cliente {
private int codCliente;
private String nomCliente;
private String dirCliente;
public Cliente(int codCliente, String nomCliente, String dirCliente) {
	this.codCliente = codCliente;
	this.nomCliente = nomCliente;
	this.dirCliente = dirCliente;
}
public int getCodCliente() {
	return codCliente;
}
public void setCodCliente(int codCliente) {
	this.codCliente = codCliente;
}
public String getNomCliente() {
	return nomCliente;
}
public void setNomCliente(String nomCliente) {
	this.nomCliente = nomCliente;
}
public String getDirCliente() {
	return dirCliente;
}
public void setDirCliente(String dirCliente) {
	this.dirCliente = dirCliente;
}

}

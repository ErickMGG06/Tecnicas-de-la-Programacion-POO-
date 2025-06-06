package Clases;

public class DptoConta {
private int codDpto;
private int cantPersonalDpto;
public DptoConta(int codDpto, int cantPersonalDpto) {
	this.codDpto = codDpto;
	this.cantPersonalDpto = cantPersonalDpto;
}

public DptoConta() {
	codDpto = 0;
	cantPersonalDpto =0;
}

public int getCodDpto() {
	return codDpto;
}
public void setCodDpto(int codDpto) {
	this.codDpto = codDpto;
}
public int getCantPersonalDpto() {
	return cantPersonalDpto;
}
public void setCantPersonalDpto(int cantPersonalDpto) {
	this.cantPersonalDpto = cantPersonalDpto;
}

}

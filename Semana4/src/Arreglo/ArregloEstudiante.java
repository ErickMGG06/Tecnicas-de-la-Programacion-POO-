package Arreglo;

import java.util.ArrayList;

import Clase.Estudiante;

public class ArregloEstudiante {
	private ArrayList<Estudiante>estu;
	public ArregloEstudiante() {
		estu = new ArrayList<Estudiante>();
		Adicionar(new Estudiante(1020, "Anita", 12.5, 13.5, 10));
		Adicionar(new Estudiante(3040, "Luis", 14, 13, 13));
		Adicionar(new Estudiante(5060, "Rosita", 10, 8, 15));
	}
	public void Adicionar(Estudiante x) {
		estu.add(x);
	}
	public int Tamaño() {//3 registros
		return estu.size();
	}
	public Estudiante Obtener(int x) {
		return estu.get(x);
	}
	public double PromedioGeneral() {
		double suma=0.0;
		for(int i=0;i<Tamaño();i++) {
			suma+=Obtener(i).Promedio();
		}
		return suma/Tamaño();
	}
	public Estudiante Buscar(int cod) {
		for (int i = 0; i < Tamaño(); i++) {
			if(Obtener(i).getCod()==cod) return Obtener(i);
		}
		return null;
	}
	public void Eliminar(Estudiante x) {
		estu.remove(x);
	}

}

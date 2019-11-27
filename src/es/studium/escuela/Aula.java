package es.studium.escuela;

public class Aula {
	private String nombre;
	private int numeroAlumnos;
	
	public Aula() {
		nombre = "";
		numeroAlumnos = 0;
	}
	
	public Aula (String n, int a) {
		nombre = n;
		numeroAlumnos = a;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String n) {
		nombre = n;
	}
	
	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}
	public void setNumeroAlumnos (int a) {
		numeroAlumnos = a;
	}
}

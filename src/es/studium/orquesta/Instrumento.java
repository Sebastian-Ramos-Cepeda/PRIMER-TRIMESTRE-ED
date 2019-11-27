package es.studium.orquesta;

public class Instrumento {
	private String nombre;
	private char afinacion;

	public Instrumento() {
		nombre = "";
		afinacion = ' ';
	}

	public Instrumento(String n, char a) {
		nombre = n;
		afinacion = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public char getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(char a) {
		afinacion = a;
	}
}
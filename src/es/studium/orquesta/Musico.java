package es.studium.orquesta;

public class Musico {
	private String nombre;
	private char sexo;
	
	public Musico () {
		nombre = "";
		sexo = ' ';
	}
	
	public Musico (String n, char s) {
		nombre = n;
		sexo = s;
	}
	
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String n) {
		nombre = n;
	}
	
	public char getSexo () {
		return sexo;
	}
	public void setSexo (char s) {
		sexo = s;
	}
}

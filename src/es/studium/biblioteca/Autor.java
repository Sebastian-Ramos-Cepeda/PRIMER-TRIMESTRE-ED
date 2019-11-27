package es.studium.biblioteca;

public class Autor {
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	
	public Autor() {
		nombre = "";
		apellidos = "";
		nacionalidad = "";
	}
	
	public Autor (String n, String a, String m) {
		nombre = n;
		apellidos = a;
		nacionalidad = m;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String a) {
		apellidos = a;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacioalidad(String m) {
		nacionalidad = m;
	}
}


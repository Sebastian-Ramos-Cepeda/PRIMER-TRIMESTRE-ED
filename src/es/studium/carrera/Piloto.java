package es.studium.carrera;

public class Piloto {
	private String nombre;
	private String nacionalidad;

	public Piloto() {
		nombre = "";
		nacionalidad = "";
	}

	public Piloto(String n, String a) {
		nombre = n;
		nacionalidad = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String a) {
		nacionalidad = a;
	}
}

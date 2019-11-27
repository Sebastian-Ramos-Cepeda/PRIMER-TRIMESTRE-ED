package es.studium.escuela;

public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	private Aula aula;

	public Alumno() {
		nombre = "";
		apellido = "";
		edad = 0;
		haPagado = false;
		aula = new Aula();
	}

	public Alumno(String n, String a, int e, boolean h, Aula au) {
		nombre = n;
		apellido = a;
		edad = e;
		haPagado = h;
		aula = au;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String a) {
		apellido = a;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) {
		edad = e;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean h) {
		haPagado = h;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula au) {
		aula = au;
	}
}

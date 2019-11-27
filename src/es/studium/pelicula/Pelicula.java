package es.studium.pelicula;

public class Pelicula {
	private String titulo;
	private int ano;
	private int duracion;

	public Pelicula() {
		titulo = "";
		ano = 0;
		duracion = 0;
	}

	public Pelicula(String t, int a, int d) {
		titulo = t;
		ano = a;
		duracion = d;
	}

	public String getTitulo () {
		return titulo;
	}
	public void setTitulo (String t) {
		titulo = t;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno (int a) {
		ano = a;
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion (int d) {
		duracion = d;
	}
}

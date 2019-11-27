package es.studium.biblioteca;

public class Libro {
	private String titulo;
	private Autor autor;
	private int anoPublicacion;
	private String editorial;
	private int numeroPaginas;
	
	public Libro() {
		titulo = "";
		autor = new Autor();
		anoPublicacion = 0;
		editorial = "";
		numeroPaginas = 0;
	}
	
	public Libro (String t, Autor a, int p, String e, int n) {
		titulo = t;
		autor = a;
		anoPublicacion = p;
		editorial = e;
		numeroPaginas = n;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor a) {
		autor = a;
	}
	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(int p) {
		anoPublicacion = p;
	}
	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String e) {
		editorial = e;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int n) {
		numeroPaginas = n;
	}
}

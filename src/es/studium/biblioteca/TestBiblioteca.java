package es.studium.biblioteca;

public class TestBiblioteca 
{
	public static void main(String[] args) 
	{
		Autor a1 = new Autor ("Charles", "Dickens", "Británica");
		Autor a2 = new Autor ("Miguell","de Cervantes","Española");
		Libro l1 = new Libro ("Historia de dos ciudades", a1, 1859, "Chapman & Hall", 300);
		Libro l2 = new Libro ("Don Quijote de la Mancha", a2, 1605, "Planeta", 400);
		
		System.out.println(l1.getTitulo() + " tiene " + l1.getNumeroPaginas() + " páginas.");
		System.out.println(l2.getTitulo() + " tiene " + l2.getNumeroPaginas() + " páginas.");
		
	}
}

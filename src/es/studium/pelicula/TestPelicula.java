package es.studium.pelicula;

public class TestPelicula 
{

	public static void main(String[] args) 
	{
		Pelicula p1 = new Pelicula ("Deadpool 2", 2018, 135);
		Pelicula p2 = new Pelicula ("El francotirador", 2015, 140);
		Pelicula p3 = new Pelicula ("John Wick 1", 2016, 138);
		Pelicula p4 = new Pelicula ("John Wick 2", 2017, 136);
		Pelicula p5 = new Pelicula ("John Wick 3", 2018, 130);
		
		System.out.println(p1.getTitulo());
		System.out.println(p2.getAno());
		System.out.println(p3.getDuracion());
		System.out.println(p4.getTitulo());
		System.out.println(p5.getTitulo());
	}
	
	

}

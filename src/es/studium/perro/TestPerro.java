package es.studium.perro;

public class TestPerro 
{

	public static void main(String[] args) 
	{
		Perro p1 = new Perro ("Gran dan�s", "grande", 4, "negro");
		Perro p2 = new Perro ("Caniche", "peque�o", 1, "marr�n");
		Perro p3 = new Perro ("Rottweiller", "mediano", 2, "negro");
		
		System.out.println(p1.getRaza());
		System.out.println(p2.getEdad());
		System.out.println(p3.getColor());
	}
	
}

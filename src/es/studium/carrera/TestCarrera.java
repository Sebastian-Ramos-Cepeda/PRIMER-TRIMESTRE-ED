package es.studium.carrera;

public class TestCarrera 
{
	public static void main(String[] args) 
	{
		Coche c1 = new Coche ("BMW", "Q3", 2018, false);
		Coche c2 = new Coche ("Mercedes Benz", "Clase A", 2018, true);
		
		Piloto p1 = new Piloto ("Fernando Alonso", "Español");
		Piloto p2 = new Piloto ("Louis Hamilton", "Inglés");
		
		System.out.println(c1.getFabricante() + " " + c1.getModelo());
		System.out.println(c2.getFabricante() + " " + c2.getModelo());
		
		System.out.println("Hola, me llamo " + p1.getNombre() );
		System.out.println("Hola, me llamo " + p2.getNombre() );
	}
}

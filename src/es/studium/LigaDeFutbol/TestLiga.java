package es.studium.LigaDeFutbol;

public class TestLiga 
{
	public static void main(String[] args) 
	{
		Equipo e1 = new Equipo("Betis", 1907, 50373);
		Equipo e2 = new Equipo("Sevilla", 1905, 42000);
		
		Futbolista f1 = new Futbolista("Joaquin", "Sánchez", true, e1);
		Futbolista f2 = new Futbolista("Borja", "Iglesias", true, e1);
		Futbolista f3 = new Futbolista("Alejandro", "Pozo", true, e2);
		Futbolista f4 = new Futbolista("Jesús", "Navas", true, e2);
		
	
		System.out.println(f1.getNombre() + " " + f1.getApellido() + " juega en el " + f1.getEquipo().getNombre());
		System.out.println(f2.getNombre() + " " + f2.getApellido() + " juega en el " + f2.getEquipo().getNombre());
		System.out.println(f3.getNombre() + " " + f3.getApellido() + " juega en el " + f3.getEquipo().getNombre());
		System.out.println(f4.getNombre() + " " + f4.getApellido() + " juega en el " + f4.getEquipo().getNombre());
	}
}

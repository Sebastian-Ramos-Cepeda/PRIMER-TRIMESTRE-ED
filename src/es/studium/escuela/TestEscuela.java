package es.studium.escuela;

public class TestEscuela 
{
	
	public static void main(String[] args) 
	{
		Aula c1 = new Aula("Aula 1", 25);
		Aula c2 = new Aula("Aula 2", 26);
		
		Alumno a1 = new Alumno("Pedro", "Pérez", 16, true, c1);
		Alumno a2 = new Alumno("Claudia", "Fernández", 15, true, c2);
		Alumno a3 = new Alumno("Manuel", "García", 17, true, c2);
		
		System.out.println(a1.getApellido() + " estudia en el " + c1.getNombre());
		System.out.println(a2.getApellido() + " estudia en el " + c2.getNombre());
		System.out.println(a3.getApellido() + " estudia en el " + c2.getNombre());
	}
	
}

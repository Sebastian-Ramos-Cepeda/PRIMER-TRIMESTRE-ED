package es.studium.practica;

public class TestColegio 
{
	Centros c1 = new Centros(1, "Escuela de ingl�s", "Reyes Cat�licos, 14");
	Centros c2 = new Centros(2, "Escuela de franc�s", "Crist�bal Col�n, 92");
	
	Asignatura as1 = new Asignatura(1, "Ingl�s B1", 7, 5);
	Asignatura as2 = new Asignatura(2, "Ingl�s B2", 7, 5);
	Asignatura as3 = new Asignatura(3, "Franc�s B1", 7, 5);
	Asignatura as4 = new Asignatura(4, "Franc�s A2", 7, 5);
	
	Alumno a1 = new Alumno(1, "Ana Abel", "Paseo de Am�rica, 15", as1, c1);
	Alumno a2 = new Alumno(2, "Benito Bueno", "Reyes Cat�licos, 16", as2, c1);
	Alumno a3 = new Alumno(3, "Carmen Cano", "Reyes Cat�licos, 2", as1, c1);
	Alumno a4 = new Alumno(4, "Esteban Escalera", "Isabel la Cat�lica, 28", as3, c2);
	Alumno a5 = new Alumno(5, "Francisco Farf�n", "Crist�bal Col�n, s/n", as4, c2);
}

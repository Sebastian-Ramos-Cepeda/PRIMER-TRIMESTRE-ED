package es.studium.practica;

public class TestColegio 
{
	Centros c1 = new Centros(1, "Escuela de inglés", "Reyes Católicos, 14");
	Centros c2 = new Centros(2, "Escuela de francés", "Cristóbal Colón, 92");
	
	Asignatura as1 = new Asignatura(1, "Inglés B1", 7, 5);
	Asignatura as2 = new Asignatura(2, "Inglés B2", 7, 5);
	Asignatura as3 = new Asignatura(3, "Francés B1", 7, 5);
	Asignatura as4 = new Asignatura(4, "Francés A2", 7, 5);
	
	Alumno a1 = new Alumno(1, "Ana Abel", "Paseo de América, 15", as1, c1);
	Alumno a2 = new Alumno(2, "Benito Bueno", "Reyes Católicos, 16", as2, c1);
	Alumno a3 = new Alumno(3, "Carmen Cano", "Reyes Católicos, 2", as1, c1);
	Alumno a4 = new Alumno(4, "Esteban Escalera", "Isabel la Católica, 28", as3, c2);
	Alumno a5 = new Alumno(5, "Francisco Farfán", "Cristóbal Colón, s/n", as4, c2);
}

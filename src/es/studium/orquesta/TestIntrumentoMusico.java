package es.studium.orquesta;

public class TestIntrumentoMusico 
{

	public static void main(String[] args) 
	{
		Instrumento i1 = new Instrumento ("Trompeta", 'd');
		Musico m1 = new Musico ("Pedro", 'M');
		
		System.out.println("Hola me llamo " + m1.getNombre() + " y toco la " + i1.getNombre());
	}

}

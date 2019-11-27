package es.studium.banco;

public class Banco 
{
	public static void main(String[] args) 
	{
		Cliente Antonio = new Cliente ("12345678N", "Antonio", "Sierpes");
		Cliente Beatriz = new Cliente ("87654321S", "Beatriz", "Torneo");
		
		Cuenta c1 = new Cuenta (1, 200.00, Beatriz);
		Cuenta c2 = new Cuenta (2, -50.00, Antonio);
		
		System.out.println("El saldo de la cuenta de Beatriz es: " + c1.getSaldo());
		
		c1.setSaldo(c1.getSaldo() - 50.0);
		
	}
}
package es.studium.banco;

public class Cuenta 
{
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta()
	{
		this.numero = 0;
		this.saldo = 0.0;
		this.cliente = new Cliente();
	}
	
	public Cuenta(int numero, double saldo, Cliente cliente)
	{
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public int getNumero()
	{
		return numero;
	}
	public void setNumero (int numero)
	{
		this.numero = numero;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo (double saldo)
	{
		this.saldo = saldo;
	}
	
	public Cliente getCliente()
	{
		return cliente;
	}
	public void setCliente (Cliente cliente)
	{
		this.cliente = cliente;
	}
}

package es.studium.LigaDeFutbol;

public class Equipo 
{
	private String nombre;
	private int anyoFundacion;
	private int numeroSocios;

	public Equipo () 
	{
		nombre = "";
		anyoFundacion = 0;
		numeroSocios = 0;
	}
	
	public Equipo (String n, int a, int nu) 
	{
		nombre = n;
		anyoFundacion = a;
		numeroSocios = nu;
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String n) 
	{
		nombre = n;
	}
	
	public int getAnyoFundacion() 
	{
		return anyoFundacion;
	}

	public void setAnyoFundacion(int a) 
	{
		anyoFundacion = a;
	}
	
	public int getNumeroSocios() 
	{
		return numeroSocios;
	}

	public void setNumeroSocios(int nu) 
	{
		numeroSocios = nu;
	}

}

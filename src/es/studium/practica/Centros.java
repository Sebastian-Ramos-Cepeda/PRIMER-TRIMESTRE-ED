package es.studium.practica;

public class Centros 
{
	private int codigo;
	private String nombre;
	private String direccion;
	
	public Centros ()
	{
		codigo = 0;
		nombre = "";
		direccion = "";
	}
	
	public Centros (int c, String n, String d)
	{
		codigo = c;
		nombre = n;
		direccion = d;
	}
	
	public int getCodigo()
	{
		return codigo;
	}
	
	public void setCodigo (int c)
	{
		codigo = c;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre (String n)
	{
		nombre = n;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion (String d)
	{
		direccion = d;
	}
}


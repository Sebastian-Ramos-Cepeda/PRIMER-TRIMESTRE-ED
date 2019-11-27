package es.studium.banco;

public class Cliente 
{
	private String DNI;
	private String nombre;
	private String direccion;
	
	public Cliente() 
	{
		DNI = "";
		nombre = "";
		direccion = "";
	}
	
	public Cliente (String DNI, String nombre, String direccion) 
	{
		this.DNI = DNI;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getDNI()
	{
		return DNI;
	}
	public void setDNI (String DNI)
	{
		this.DNI = DNI;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre (String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion (String direccion)
	{
		this.direccion = direccion;
	}
}

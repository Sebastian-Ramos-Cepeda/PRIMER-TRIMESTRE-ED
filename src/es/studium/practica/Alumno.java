package es.studium.practica;

public class Alumno 
{
	private int matricula;
	private String nombre;
	private String direccion;
	private Asignatura asignatura;
	private Centros centros;
	
	public Alumno ()
	{
		matricula = 0;
		nombre = "";
		direccion = "";
		asignatura = new Asignatura();
		centros = new Centros();
	}
	
	public Alumno (int m, String n, String d, Asignatura a, Centros c)
	{
		matricula = m;
		nombre = n;
		direccion = d;
		asignatura = a;
		centros = c;
	}
	
	public int getMatricula()
	{
		return matricula;
	}
	
	public void setMatricula (int m)
	{
		matricula = m;
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
	
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	public void setAsignatura (Asignatura a)
	{
		asignatura = a;
	}
	
	public Centros getCentro()
	{
		return centros;
	}
	public void setCentro (Centros c)
	{
		centros = c;
	}
	
}

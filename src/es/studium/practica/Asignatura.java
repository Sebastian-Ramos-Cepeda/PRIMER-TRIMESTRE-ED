package es.studium.practica;

public class Asignatura 
{
	private int codigo;
	private String nombre;
	private int nota;
	private int horas;
	
	public Asignatura() 
	{
		codigo = 0;
		nombre = "";
		nota = 0;
		horas = 0;
	}
	
	public Asignatura (int c, String n, int no, int h) 
	{
		codigo = c;
		nombre = n;
		nota = no;
		horas = h;
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
	
	public int getNota()
	{
		return nota;
	}
	
	public void setNota (int no)
	{
		nota = no;
	}
	
	public int getHoras()
	{
		return horas;
	}
	
	public void setHoras (int h)
	{
		horas = h;
	}
}

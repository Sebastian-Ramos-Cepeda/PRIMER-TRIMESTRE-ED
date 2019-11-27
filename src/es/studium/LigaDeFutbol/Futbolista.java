package es.studium.LigaDeFutbol;

public class Futbolista 
{
		private String nombre;
		private String apellido;
		private boolean comunitario;
		private Equipo equipo;

		public Futbolista () 
		{
			nombre = "";
			apellido = "";
			comunitario = false;
			equipo = new Equipo();
		}
		
		public Futbolista (String n, String a, boolean c, Equipo e) 
		{
			nombre = n;
			apellido = a;
			comunitario = c;
			equipo = e;
		}
		
		public String getNombre() 
		{
			return nombre;
		}

		public void setNombre(String n) 
		{
			nombre = n;
		}
		
		public String getApellido() 
		{
			return apellido;
		}

		public void setApellido(String a) 
		{
			apellido = a;
		}
		
		public boolean getComunitario() 
		{
			return comunitario;
		}

		public void setComunitario(boolean c) 
		{
			comunitario = c;
		}
		
		public Equipo getEquipo() 
		{
			return equipo;
		}

		public void setEquipo(Equipo e) 
		{
			equipo = e;
		}
}


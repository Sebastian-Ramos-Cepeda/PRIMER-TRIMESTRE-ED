package es.studium.carrera;

public class Coche {
	private String fabricante;
	private String modelo;
	private int ano_fabricacion;
	private boolean esGasolina;

	public Coche() {
		fabricante = "";
		modelo = "";
		ano_fabricacion = 0;
		esGasolina = false;
	}

	public Coche(String f, String m, int a, boolean g) {
		fabricante = f;
		modelo = m;
		ano_fabricacion = a;
		esGasolina = g;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String f) {
		fabricante = f;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String m) {
		modelo = m;
	}

	public int getAno_Fabricacion() {
		return ano_fabricacion;
	}

	public void setAno_Fabricacion(int a) {
		ano_fabricacion = a;
	}

	public boolean getEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean g) {
		esGasolina = g;
	}

}
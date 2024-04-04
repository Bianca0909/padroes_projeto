package formas.geometricas;

public class Quadrado implements FormaGeometrica {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}

package formas.geometricas;

public class Circulo implements FormaGeometrica {

	private double raio;
	private double pi = 3.14;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return (raio * raio) * pi;
	}
}

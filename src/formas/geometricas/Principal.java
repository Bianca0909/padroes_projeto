package formas.geometricas;

public class Principal {

	public static void main(String[] args) {
		FormaGeometrica circulo = new Circulo(5);
		final double areaCirculo = circulo.calculaArea();
		
		FormaGeometrica quadrado = new Quadrado(2);
		final double areaQuadrado = quadrado.calculaArea();
		
		System.out.println("Círculo: " + areaCirculo + "Quadrado: " + areaQuadrado);
	}
}

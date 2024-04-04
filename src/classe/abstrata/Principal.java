package classe.abstrata;

public class Principal {

	public static void main(String[] args) {
		
		Trabalhador trabalhador = new Trabalhador("Maria", "Feminino");
		
		System.out.println("Nome atual: " + trabalhador.getNome() + "\nSexo: " + trabalhador.getSexo());
		
		trabalhador.alteraNome("Bianca");
		
		System.out.println("Nome atual: " + trabalhador.getNome());
	}
	
	
}

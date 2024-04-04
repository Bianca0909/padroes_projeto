package classe.abstrata;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa t = new Trabalhador("Maria", "Feminino", 123);
		Pessoa s = new Trabalhador("Mario", "Masculino", 0);
		
		System.out.println(t.toString());
		t.alteraNome("Bianca");
		System.out.println(s.toString());
		s.trabalha();
		s.alteraNome("Mario Gomes");
		
		System.out.println(s.toString());
	}
	
	
}

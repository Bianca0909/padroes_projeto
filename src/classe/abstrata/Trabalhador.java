package classe.abstrata;

public class Trabalhador extends Pessoa {

	private int empresaId;
	
	public Trabalhador(String nome, String sexo, int empresaId) {
		super(nome, sexo);
		this.empresaId = empresaId;
	}

	public int getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	@Override
	public void trabalha() {
		if (empresaId > 0) {
			System.out.println("Empregado");
		} else {
			System.out.println("Desempregado");
		}
	}
}

package classe.abstrata;

public class Trabalhador extends Pessoa {

	private int empresaId;
	
	public Trabalhador(String nome, String sexo) {
		super(nome, sexo);
	}

	public int getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(int empresaId) {
		this.empresaId = empresaId;
	}

	@Override
	public void trabalha() {
		
	}
	

}

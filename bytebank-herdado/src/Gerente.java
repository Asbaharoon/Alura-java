
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	//reutilizando métodos da classe pai
	//referenciamos com a palavra super
	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;;
	}
}


public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Gerente () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//reutilizando métodos da classe pai
	//referenciamos com a palavra super
	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		//delegamos a chamada para o util
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}

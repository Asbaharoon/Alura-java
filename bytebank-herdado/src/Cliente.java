
public class Cliente implements Autenticavel{

//	private int senha;
//	
	private AutenticacaoUtil autenticador;
	
	
	//obs -> estudar e revisar
	public Cliente() {
		//Relacionamento de composicao
		//Quando criamos um cliente criamos tambem um autenticador
		//"Cliente tem um autenticador"
		this.autenticador = new AutenticacaoUtil();
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

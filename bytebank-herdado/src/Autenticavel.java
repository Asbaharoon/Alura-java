
//Contrato autenticavel
	//quem assina esse contrato, precisa implementar os metodos
public abstract interface Autenticavel{

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
}

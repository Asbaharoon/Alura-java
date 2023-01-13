
public class Gerente extends Funcionario{
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	//reutilizando métodos da classe pai
	//referenciamos com a palavra super
	@Override
	public double getBonificacao() {
		
		System.out.println("Chamando o metodo do gerente");
		return super.getBonificacao() + super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}

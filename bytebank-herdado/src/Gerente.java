
public class Gerente extends FuncionarioAutenticavel{

	//reutilizando m�todos da classe pai
	//referenciamos com a palavra super
	public double getBonificacao() {
		System.out.println("Chamando o metodo do gerente");
		return super.getSalario();
	}
}

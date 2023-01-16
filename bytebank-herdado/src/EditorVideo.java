
public class EditorVideo extends Funcionario{
	//reutilizando métodos da classe pai
	//referenciamos com a palavra super
	public double getBonificacao() {
		
		System.out.println("chamando o metodo do editor");
		return 150;
	}
}

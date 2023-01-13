
public class ControleBonificacao {

	private double soma;

	//Mesmo que eu chame a ref generica
	//Sempre sera chamado o metodo especifico
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}

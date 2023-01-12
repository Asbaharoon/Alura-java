
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
	
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora com duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador java");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}

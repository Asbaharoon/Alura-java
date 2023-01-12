
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		
		System.out.println(Conta.getTotal());
		
	}
}

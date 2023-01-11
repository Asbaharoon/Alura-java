
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		//conta2.transfere(300, conta);
		if(conta2.transfere(300, conta)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(conta.saldo);
		System.out.println(conta2.saldo);
		
		conta.titular = "Claudio jin";
		System.out.println(conta.titular);
	}
}

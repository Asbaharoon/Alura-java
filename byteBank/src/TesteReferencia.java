
public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
	
		System.out.println("saldo da primeira" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
	
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
	
		System.out.println(primeiraConta.saldo);
		
		//possuem a mesma referencia
		if(primeiraConta == segundaConta)  {
			System.out.println("Sao a mesma conta");
		}
		
		System.out.println(primeiraConta);
	}
}

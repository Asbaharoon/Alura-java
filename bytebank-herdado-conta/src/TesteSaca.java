
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 132);
		
		conta.deposita(200.0);
		
		try {			
			conta.saca(190.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}

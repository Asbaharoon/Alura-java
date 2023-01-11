
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.pegaSaldo());
		
		System.out.println(contaDaMarcela);
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}

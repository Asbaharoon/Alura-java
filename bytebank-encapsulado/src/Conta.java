public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//atributo compartilhado
	//atributo da classe
	
	//O static faz com que o atributo seja da classe, 
	//e não mais do objeto.
	//Com isso, todo o objeto conta possui acesso a um único total.
	private static int total;
	
	public Conta() {}
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//ou total++;
		System.out.println("o total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			 System.out.println("nao pode valor menor ou igual a 0");
			 return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}

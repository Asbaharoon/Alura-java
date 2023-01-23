package br.com.bytebank.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoivre] = ref;
		this.posicaoivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}

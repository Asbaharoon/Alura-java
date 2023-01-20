package br.com.bytebank.banco.teste;

import br.com.bytebank.modelo.CalculadoraDeImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}
}

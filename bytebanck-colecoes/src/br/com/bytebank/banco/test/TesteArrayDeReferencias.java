package br.com.bytebank.banco.test;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[0] = cc1;
		contas[1] = cc2;
		
		
		//System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
	
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		//outra forma de se incializar um array
		//ja sao declarados
		int[] refs = {1,2,3,4,5};
	
	
	}
}

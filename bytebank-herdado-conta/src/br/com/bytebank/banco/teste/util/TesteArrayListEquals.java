package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		// generics
		//List -> interface
		List<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		//Modificamos o .equals na classe conta
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);
		
//		for (Conta conta : lista) {
//			if(conta.equals(cc3)) {
//				System.out.println("Já tenho essa conta");
//			}
//		}
		
		// forEach
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}
}

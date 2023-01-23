package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		

		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);
				
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("--------------");
		
		
		//forEach
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}
}

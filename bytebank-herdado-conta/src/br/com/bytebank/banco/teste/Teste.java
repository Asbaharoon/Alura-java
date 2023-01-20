package br.com.bytebank.banco.teste;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
	
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		
		System.out.println(cc);
		System.out.println(cp);
	
	}
	
	//sobrecarga
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	static void println(boolean valor) {
		
	}
	static void println(Object referencia) {
		
	}
}

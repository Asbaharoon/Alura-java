package br.com.alura.bytebank;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

//para utilizar o arquivo jar devemos add na libs
//e add ao build path
public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.0);
		
		System.out.println(c.getSaldo());
	}
}

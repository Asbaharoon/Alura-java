package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

//wrapper
public class TesteWrapperInteger {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int idade = 29;//Integer
		//Integer idadeREf = new Integer(29); deprecated
		//autoboxing
		Integer idadeRef = Integer.valueOf(29); //pega o valor primitivo e joga no integer
		//unboxing
		int valor = idadeRef.intValue();//devolve um inteiro
		
		
		//para mandar valores no args
		//run configurations
		String s = args[0]; //"10"

		int numero = Integer.parseInt(s);
		
		//Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		
		//autoboxing
		//java automatica transforma um primitivo para objeto
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//transformacao automatica
		
		
	}
}

package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestePerformance {

	public static void main(String[] args) {

//        Collection<Integer> numeros = new ArrayList<Integer>();

		/*
		 * No caso do ArrayList, a inserção é bem rápida e a busca muito lenta!
		 * 
		 * No caso do HashSet, a inserção ainda é rápida, embora um pouco mais lenta do
		 * que a das listas. Mas a busca é muito rápida!
		 */
		Collection<Integer> numeros = new ArrayList<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto: " + tempoDeExecucao);

	}
}

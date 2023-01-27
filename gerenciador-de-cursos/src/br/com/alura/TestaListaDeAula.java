package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as Arrayists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);

		Collections.sort(aulas);

		String s1 = "paulo";
		String s2 = "silveira";
		int resultado = s1.compareTo(s2);

		System.out.println(resultado);

		System.out.println(aulas);

		// 1 versao
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

		System.out.println(aulas);

		// 2 versao
		aulas.sort(Comparator.comparing(Aula::getTempo));

	}
}

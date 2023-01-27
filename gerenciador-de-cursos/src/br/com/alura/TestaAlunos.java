package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		/*
		 * No conjunto set, voce nao tem garantia da ordem dos elementos usa quando nao
		 * precisa de ordem dos objetos
		 * 
		 * metodo .get nao tem em set
		 * 
		 * para buscas o set compensa mais
		 * ja que o contains e o remove agem de forma mais rapida
		 * 
		 * 
		 */

		//Set<String> alunos = new HashSet<String>();
		
		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		/*
		 * Não permite elementos repetidos dentro do conjunto
		 * 
		 */

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		alunos.remove("Sergio Lopes");
		
		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		/*
		 * compartilhando listas onde podemos usar metodos diferentes
		 */
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}
}

package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		// referencia para atributo aulas
//        List<Aula> aulas = javaColecoes.getAulas();   
//        
//        System.out.println(aulas);

		// aulas.add(new Aula("Trabalhando com Arraylist", 21));

//		System.out.println(aulas);
//		
//		System.out.println(javaColecoes.getAulas());
//		
//		System.out.println(aulas == javaColecoes.getAulas());
//		
		/*
		 * 1 versao nao funciona quando colocamos o metodo unmodifiable collections
		 */
		// javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));

		/*
		 * 2 versao
		 */
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));

		javaColecoes.adiciona(new Aula("Criando uma aula", 20));

		javaColecoes.adiciona(new Aula("Modelando Colecoes", 22));

		/*
		 * listas muito longas para percorrer-> arraylist é melhor alteracao frequente
		 * no comeco ou fim da lista -> linked list
		 * 
		 */
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		//cria uma nova lista com as aulas(mutavel)
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println();
		
	}
}

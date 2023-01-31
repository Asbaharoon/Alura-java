package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));

		javaColecoes.adiciona(new Aula("Criando uma aula", 20));

		javaColecoes.adiciona(new Aula("Modelando Colecoes", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);

		javaColecoes.matricula(a2);

		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		/*
		 * Treeset pode ordenar elementos na hora da insercao
		 * e pode ser definido atraves de um comparator
		 * 
		 */
		
		
		/*
		 * todas as colecoes tem o metodo iterator
		 * o antigo metodo de percorrer um conjunto
		 * era utilizando o iterator que devolve um objeto do 
		 * tipo iterator
		 * 
		 * o tipo iterator possui o metodos hasNext-> verifica se possui
		 * outro objeto
		 * 
		 * metodo next -> devolve o objeto
		 */
		Iterator<Aluno> iterador =  alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		//Para sistemas legados
		//ThreadSafe
		Vector<Aluno> vetor = new Vector<>();
		
		
		
		//novo metodo
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse turini esta martriculado?");
		//String nome = "Rodrigo Turini";
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		// Obrigratoriamente o seguinte é true:
		
		//Estudar mais sobre o hashcode
		System.out.println(a1.hashCode() == turini.hashCode());

		
	}

}

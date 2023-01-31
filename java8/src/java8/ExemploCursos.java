package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));

		/*
		 * stream devolve um fluxo de objetos devolve um stream de cursos
		 * 
		 * tudo que é feito no stream, nao impacta a colecao utilizada
		 * 
		 * 
		 */
//		cursos.stream()
//				.filter(c -> c.getAlunos() >= 100)
//				.map(c -> c.getAlunos())
//				.forEach(total -> System.out.println(total));
//				//.forEach(c -> System.out.println(c.getNome()));

		IntStream stream = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos);
	
	
	
	}
}

package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Curso2 {
	private String nome;
	private int alunos;

	public Curso2(String nome, int alunos) {
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

public class ExemploCursos2 {

	public static void main(String[] args) {
		List<Curso2> cursos = new ArrayList<Curso2>();
		cursos.add(new Curso2("Python", 45));
		cursos.add(new Curso2("JavaScript", 150));
		cursos.add(new Curso2("Java 8", 113));
		cursos.add(new Curso2("C", 55));

		cursos.sort(Comparator.comparing(Curso2::getAlunos));

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

		int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso2::getAlunos)
				.sum();
	
		System.out.println(sum);
	
		//devolve um optional
		/*
		 * 
		 */
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		
//		Curso2 curso = optionalCurso.orElse(null);
//		
//		System.out.println(curso.getNome());
		//optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
	
		
		/*
		 * collect -> factory methods
		 * 
		 */
		
		List<Curso2> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		
		cursos.stream()
			.forEach(c -> System.out.println(c.getNome()));
		
		//ou
		//map - chave e valor
		//procurar parallelStream
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			//dado um curso, devolve um mapa q a chave seja um nome
			.collect(Collectors.toMap(
					c -> c.getNome(),
					c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

	}
}

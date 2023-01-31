package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorDeStringPorTamanho();

		// Collections.sort(palavras, comparador);
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		palavras.sort((s1, s2) -> 
			Integer.compare(s1.length(), s2.length())
		);
		
		palavras.sort((Comparator.comparing(s -> s.length())));
		
		//Method references
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		
		System.out.println(palavras);

		for (String p : palavras) {
			System.out.println(p);
		}

		//interface funcional
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);

		/*
		 * invoca o print ln do system out
		 * tenta converter para um consumer
		 * 
		 * para casos mais curtos
		 */
		Consumer<String> impressor2 = System.out::println;
		
		// lambda
		palavras.forEach(s -> System.out.println(s));

	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
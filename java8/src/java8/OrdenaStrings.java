package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
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
		

		System.out.println(palavras);

		for (String p : palavras) {
			System.out.println(p);
		}

		//interface funcional
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);

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
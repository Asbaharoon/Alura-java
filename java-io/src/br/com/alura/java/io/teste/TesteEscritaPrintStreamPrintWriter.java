package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com Arquivo
		
		//stream quando se trabalha com imagens
		//reader quando se trabalha com caracteres
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		PrintStream ps = new PrintStream("lorem2.txt");
		
		//metodos de mais alto nivel (sistema operacional)
		PrintWriter ps = new PrintWriter("lorem.txt");
		
		ps.println("linha escrita");
		ps.println();
		ps.println("Segunda linha escritaa");
		
		ps.close();
	}
}

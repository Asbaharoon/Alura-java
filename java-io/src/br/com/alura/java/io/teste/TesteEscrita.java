package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com Arquivo
		
		//stream quando se trabalha com imagens
		//reader quando se trabalha com caracteres
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("linha escrita");
		bw.newLine();
		bw.newLine();
		bw.write("Segunda linha escritaa");
		
		bw.close();
	}
}

package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//String outro = new String("Alura");
		String nome = "Alura";
		
		nome.replace("A", "a");
		
		//nome.toLowerCase();
		
		System.out.println(nome);
		//toda String é imutavel, nao pode mudar
		
		//Para modificar, temos que criar uma nova String
		String nomeNovo = nome.replace("A", "a");
		System.out.println(nomeNovo);
		
		//char c = 'A';
		
		char letra = nome.charAt(2);
	
		System.out.println(letra);
	
		int pos = nome.indexOf("ur");
	
		System.out.println(pos);
	
		String sub = nome.substring(1);
		
		System.out.println(sub);
		
		System.out.println(nome.length());
	
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		String outroVazio = vazio.trim(); //tira os espaços
		System.out.println(outroVazio);
		
		System.out.println(vazio.contains("Alu"));
		
	}
}

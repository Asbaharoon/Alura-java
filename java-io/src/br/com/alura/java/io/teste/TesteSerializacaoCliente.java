package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//String nome = "Nico";
		
		//serializa um objeto
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//	
//		oos.writeObject(nome);
//		oos.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject(); //realizamos um cast, pois read object devolve um objeto mais generico possivel
		
		ois.close();
		System.out.println(nome);
	}
}

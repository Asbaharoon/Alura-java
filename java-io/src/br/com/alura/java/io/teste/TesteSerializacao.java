package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//        cliente.setNome("Nico");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("23413131");
//		
//		//String nome = "Nico";
//		
//		//serializa um objeto
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//	
//		oos.writeObject(cliente);
//		oos.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject(); //realizamos um cast, pois read object devolve um objeto mais generico possivel
		
		ois.close();
		System.out.println(cliente);
	}
}

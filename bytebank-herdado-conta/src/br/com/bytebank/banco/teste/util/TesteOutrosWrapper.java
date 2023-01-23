package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

//wrapper
public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(22);
		
		//lista que recebe qualquer numer(double, int, float)
		List<Number> lista = new ArrayList<>();
	}
}

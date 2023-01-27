package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	
	/**
	 * normalmente usamos o list para diminuir o acoplamento entre os objetos, pois
	 * assim podemos criar uma uma linked ou arraylist
	 * 
	 * -> Polimorfismo
	 */
	private List<Aula> aulas = new ArrayList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	
	//um metodo do collections que devolve uma lista
	//que nao pode ser modificada
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }
}

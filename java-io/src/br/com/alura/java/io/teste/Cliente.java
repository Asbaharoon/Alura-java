package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */

public class Cliente implements Serializable{

	/**
	 * Quando mudamos algo da estrutura da classe como os
	 * atributos, devemos trocar o serial version para
	 * que possa assinar uma nova serialização nos dados 
	 * que serão gravados
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}

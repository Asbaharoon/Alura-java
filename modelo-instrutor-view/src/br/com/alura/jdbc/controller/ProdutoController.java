package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {
	
	private ProdutoDAO dao;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.dao = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		this.dao.deletar(id);
	}

	public void salvar(Produto produto) {
		this.dao.salvar(produto);
	}

	public List<Produto> listar() {
		return this.dao.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.dao.alterar(nome, descricao, id);
	}
}

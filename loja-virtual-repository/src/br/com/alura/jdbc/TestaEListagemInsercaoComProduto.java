package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaEListagemInsercaoComProduto {

	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("Comoda", "comoda vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO dao = new ProdutoDAO(connection);
			
			dao.salvar(comoda);
			
			List<Produto> listaDeProdutos = dao.listar();
		
			listaDeProdutos.forEach(p -> System.out.println(p));
		}
	}
}

package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategorias = categoriaDAO.listar();
			/*
			 * queries n+1
			 * quando listamos dados dentro de outra listagem
			 * não é perfomatico
			 */
			listaDeCategorias.stream().forEach(c -> {
				System.out.println(c.getNome());
				try {
					for(Produto produto : new ProdutoDAO(connection).buscar(c)) {
						System.out.println(c.getNome() + " - " + produto.getNome());
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		}
	}
}

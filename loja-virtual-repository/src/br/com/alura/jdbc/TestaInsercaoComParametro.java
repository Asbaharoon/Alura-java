package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		
		String nome = "GELADEIRA";
		String descricao = "GELADEIRA SAMSUNG";
		
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
	
		PreparedStatement stm = 
				connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
		/*
		 * ASPAS simples usando no sql
		 * com statement corremos o risco de sql injection
		 */
//		statement.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('" + nome + "', '" + descricao + "')"
//				, Statement.RETURN_GENERATED_KEYS);
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
	
	}
}

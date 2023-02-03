package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
	
		Statement statement = connection.createStatement();
		/*
		 * Statement.RETURN_GENERATED_KEYS
		 * apos executar essa clausula, retorna a chave gerada
		 */
		statement.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('mouse', 'Mouse sem fio')"
				, Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rst = statement.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
	
	}
}

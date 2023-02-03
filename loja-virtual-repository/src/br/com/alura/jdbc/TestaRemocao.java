package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();
		
		Statement stm = con.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		/*
		 * retorna quantas linhas modificadas
		 * 
		 */
		Integer linhasModificadas = stm.getUpdateCount();
	
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
	}
}

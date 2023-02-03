package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro2 {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		/*
		 * depois que setamos o autoCommit para false,
		 * nenhum dado sera salvo no banco, nós que assumimos o controle
		 * 
		 * 
		 */
		connection.setAutoCommit(false);
		
		/*
		 * quando assumimos o controle da inserção de dados no banco
		 * podemos lidar com os commits e os rollbacks
		 * 
		 * ou adiciona todos ou não adiciona ninguém
		 */
		try {
			PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			adicionarVariavel("Smart tv", "45 polegadas", stm);
			adicionarVariavel("radio", "radio de bateria", stm);
			
			connection.commit();
			
			stm.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ROLLBAKC EXECUTADO");
			connection.rollback();
		}
		
		connection.close();
		
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
//		if(nome.equals("radio")) {
//			throw new RuntimeException("Não foi possível adicionar o produto");
//		}

		stm.execute();

		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}

		rst.close();
	}
}

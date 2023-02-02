import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "rootcj");
	
		
		/*
		 * O .execute devolve um booleano
		 * e para pegar o conteudo usamos o resultSet
		 *  
		 */
		Statement stm = connection.createStatement();
		
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		ResultSet rst = stm.getResultSet();
		
		/*
		 * com o get int podemos pegar a coluna referente
		 * ao index ou ao nome
		 */
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
		}
		
		
		connection.close();
	}
}

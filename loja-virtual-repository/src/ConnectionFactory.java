import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * factory methods -> padrao
 * 
 */
public class ConnectionFactory {

	public Connection recuperarConexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "rootcj");
	
	}
}

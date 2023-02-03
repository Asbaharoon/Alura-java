import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * factory methods -> padrao
 * 
 */
public class ConnectionFactory {
	
	/*
	 * gerencia o pool
	 */
	public DataSource dataSource;
	
	
	/*
	 * criando um pool de conexoes
	 * quando criamos um pool de conexoes podemos limitar
	 * um maximo de conexoes abertas no banco
	 * evitando que sejam criadas novas conexoes simultaneamente
	 * 
	 */
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("rootcj");
		
		this.dataSource = comboPooledDataSource;
		
	}
	

	public Connection recuperarConexao() throws SQLException {
		return this.dataSource.getConnection();
	}
}

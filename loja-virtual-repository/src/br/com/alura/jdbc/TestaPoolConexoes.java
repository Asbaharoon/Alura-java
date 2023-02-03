package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		/*
		 * caso tenha mais conexoes do que a quantidade maxima
		 * estabelecida,a proxima requisicao só sera processada
		 * quando uma das conexoes forem disponibilizadas
		 */
		for(int i = 0; i < 20; i++) {
			factory.recuperarConexao();
			System.out.println("Conexao de numero: " + i);
		}
	}
}

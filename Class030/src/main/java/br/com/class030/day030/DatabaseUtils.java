package br.com.class030.day030;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtils {

	private static final String USER = "postgres";
	private static final String PASSWORD = "admin";
	private static final String URL = "jdbc:postgresql://localhost:5433/curso";
	private static Connection connection;
	{// Coment�rios
		// Utlizado em vers�es mais antigas para for�as o carregamento de uma
		// classe, neste caso o driver jdbc do postgres
		//	static {
		//		try {
		//			Class.forName("org.postgressql.Driver");
		//		} catch (Exception e) {
		//			System.out.println("N�o foi poss�vel carregar o driver do bando de dados");
		//		}
		//	}
	}

	public static Connection getConnection() throws SQLException {
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			}
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel criar uma conex�o com o banco de dados");
			throw e;
		}
		return connection;
	}

	public static ResultSet executeSelect(String sql) throws SQLException {
		Connection connection = getConnection();
		PreparedStatement comand = connection.prepareStatement(sql);
		return comand.executeQuery();
	}

	public static void main(String[] args) throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			System.out.println("Teste de conex�o realizado com sucesso!");
		} else {
			System.out.println("N�o foi poss�vel realizar a conex�o com o banco!");
		}
	}
}

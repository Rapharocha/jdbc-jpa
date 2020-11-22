package com.curso.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	//Construtor declarado como privado. Evitando assim criar instâncias da fábrica.
	private ConnectionFactory() { throw new UnsupportedOperationException();}
	
	public static Connection getConnection() throws SQLException {
		
		Connection connection = null;
		
		String url = "jdbc:postgresql://localhost:5432/bancojdbc";
		
		try {
			connection = DriverManager.getConnection(url, "postgres", "admadm");
			
		} catch (SQLException e) {
	
			System.out.println("Falha ao tentar criar conexão");
			
		} 
		return connection;
	}
	
	
	
}

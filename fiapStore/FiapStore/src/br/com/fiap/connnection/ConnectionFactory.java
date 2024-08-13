package br.com.fiap.connnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String ORACLE = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	
	public Connection conectar() {
		try { 
			return DriverManager.getConnection(ORACLE,"rm99831","080705");
		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}

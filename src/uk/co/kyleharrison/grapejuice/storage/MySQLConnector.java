package uk.co.kyleharrison.grapejuice.storage;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MySQLConnector {
	protected Connection connection = null;
	private Statement statement = null;
	//private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private DataSource datasource;
	private String database_name = "comicdb";

	public MySQLConnector() {
		System.out.println("MySQL Connection Opened : " +new Date().toString());
		try {
			/*datasource = (DataSource) new InitialContext()
					.lookup("java:/comp/env/jdbc/" + database_name);*/
			
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
			String url = "jdbc:mysql://localhost:3306/comicdb";
			connection = DriverManager.getConnection(url, "root", "hellokitty1");
			//connection = datasource.getConnection();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("SQL Exception in DatabaseConnector.java");
			e.printStackTrace();
		} 
	}

	public boolean checkConnection() {
		try {
			connection.close();
			connection = DriverManager.getConnection("jdbc:mysql://localhost/comicdb", "root", "hellokitty1");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				//System.out.println("Connection Closed");
				connection.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}

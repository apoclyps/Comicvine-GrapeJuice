package uk.co.kyleharrison.grapejuice.cassandra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CassandraConnector {

	protected Connection connection = null;

	private String database = "PIM";
	private String connectionString = "jdbc:cassandra://localhost:9160/PIM";

	public CassandraConnector() {
		try {
			Class.forName("org.apache.cassandra.cql.jdbc.CassandraDriver");
			connection = DriverManager.getConnection(connectionString);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean checkConnection() {
		try {
			connection.close();
			connection = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void close() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public boolean createColumnFamily() {
		String statement = "CREATE columnfamily comicvinevolumes (key int primary key, category text , linkcounts int ,url text)";
		try {
			Statement st = this.connection.createStatement();
			return st.execute(statement);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean dropColumnFamily(String name) {
		String data = "drop columnfamily " + name + ";";
		Statement st;
		try {
			st = this.connection.createStatement();
			return st.execute(data);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
}

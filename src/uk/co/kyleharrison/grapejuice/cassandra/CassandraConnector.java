package uk.co.kyleharrison.grapejuice.cassandra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;

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
		String statement = "CREATE columnfamily comicvinevolumes (key int primary key, name text , issue_count, int year)";
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
	
	public int insertComicVineVolumes(ArrayList<ComicVineVolume> volumeList) throws SQLException {
		String data = "BEGIN BATCH \n";
		
		int count =0;
		for(ComicVineVolume cvv : volumeList){
			data +=  "insert into comicvinevolumes (key, name, issue_count,year) values ("+cvv.getId()+",'"+cvv.getName().replaceAll("'", " ")
					+"',"+cvv.getCount_of_issues()+","+ cvv.getStart_year() +") \n";
			
		}
		data += "APPLY BATCH;";
		
		Statement st = this.connection.createStatement();
		return st.executeUpdate(data);
	}
}

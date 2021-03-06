package uk.co.kyleharrison.grapejuice.storage;

import java.sql.SQLException;

public class MySQLFacade implements MySQLInterface {

	private MySQLDAO connection;

	public MySQLFacade() {
		super();
		this.setNewConnection();
	}

	public boolean insertVolume(int volumeID, String volumeName) {
		
		try {
			connection.insertVolume(volumeID,volumeName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public MySQLDAO getConnection() {
		return connection;
	}

	public void setNewConnection() {
		/*try {
			connection.close();
		} catch (NullPointerException e) {
			System.out.println("No connection to close | Connection closing problem");
		}*/
		this.connection = new MySQLDAO();
	}

	public void closeConnection() {
		this.connection.close();
	}

	public boolean removeVolume(int volumeID, String volumeName) {
		try {
			connection.removeVolume(volumeID,volumeName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

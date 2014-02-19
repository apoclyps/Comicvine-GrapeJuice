package uk.co.kyleharrison.grapejuice.storage;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLDAO extends MySQLConnector {

	private PreparedStatement preparedStatement = null;

	public MySQLDAO() {
		super();
	}

	public void insertVolume(int volumeID, String volumeName) throws SQLException {
		if (this.checkConnection()) {
			preparedStatement = connection
					.prepareStatement("insert into comicdb.volumes"
							+ "(volumeID,volumeName)"
							+ " values  (?,?)");

			preparedStatement.setInt(1, volumeID);
			preparedStatement.setString(2, volumeName);

			preparedStatement.executeUpdate();
		} else {
			System.out.println("MYSQLDOA : Insert Channel : Connection Failed");
		}
		if (connection != null) {
			connection.close();
		}
	}

	public void removeVolume(int volumeID, String volumeName) throws SQLException {
		if (this.checkConnection()) {
			preparedStatement = connection
					.prepareStatement("DELETE FROM comicdb.volumes WHERE volumeID = ? AND volumeName = ?;");

			preparedStatement.setInt(1, volumeID);
			preparedStatement.setString(2, volumeName);

			preparedStatement.execute();
		} else {
			System.out.println("MYSQLDOA : Insert Channel : Connection Failed");
		}
		if (connection != null) {
			connection.close();
		}
	}
	
}

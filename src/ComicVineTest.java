import java.sql.SQLException;
import java.util.ArrayList;

import uk.co.kyleharrison.grapejuice.cassandra.CassandraConnector;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.facade.GrapeVineFacade;
import uk.co.kyleharrison.grapejuice.storage.MySQLFacade;

public class ComicVineTest {

	private MySQLFacade mysqlFacade;
	private static GrapeVineFacade grapeVineFacade;

	public static void main(String[] arguments) {
		String query = "X-men";
		String resources = "name,id,first_issue,last_issue,count_of_issues";
		String queryRequest = "http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
				+ "&format=json&field_list="+resources+"&resources=volume&query=";

		// Returns First / last issue of series as a volume
		// http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816&format=json&query=X-men&page=1&resources=volume
		grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery(queryRequest + query);
		ArrayList<ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();

		// OUTPUT
		int remainder = (int) (grapeVineFacade.getNumber_of_total_results() / 100);

		int page = 2;
		while (page != (remainder + 2)) {
			grapeVineFacade.PreformQuery(queryRequest + query + "&page=" + page);

			if (grapeVineFacade.getNumber_of_page_result() != 0) {
				cvv.addAll(grapeVineFacade.getComicVineVolumes());
				page++;
				//grapeVineFacade.setNumber_of_page_result(0);
				//break;
			}
		}
		System.out.println("Expected Size = "
				+ grapeVineFacade.getNumber_of_total_results());
		System.out.println("Actual Size = " + cvv.size());
		System.out.println("Expected Pages = " + (remainder + 1));
		
		CassandraConnector cc = new CassandraConnector();
		cc.checkConnection();
		//cc.dropColumnFamily("comicVineVolumes");
	//	cc.createColumnFamily();
		try {
			cc.insertComicVineVolumes(cvv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void preformQuery(String queryRequest) {
		grapeVineFacade.PreformQuery(queryRequest);
	}

	public void databaseInsert(GrapeVineFacade grapeVineFacade) {
		mysqlFacade = new MySQLFacade();
		// mysqlFacade.insertVolume(grapeVineFacade.getComicVineVolumes().get(0).getId(),
		// grapeVineFacade.getComicVineVolumes().get(0).getName());
		mysqlFacade.insertVolume(1,
				"Uncanny X-Men: The Complete Collection By Matt Fraction");
	}
	
	public void cassandraInsert(ArrayList<ComicVineVolume> cvv){
		CassandraConnector cc = new CassandraConnector();
		cc.checkConnection();
		//cc.dropColumnFamily("comicVineVolume");
		//cc.createColumnFamily();
		try {
			cc.insertComicVineVolumes(cvv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void defaultQuery(String query) {
		GrapeVineFacade grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery("http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
						+ "&format=json&field_list=name,id&query=" + query);
	}

}

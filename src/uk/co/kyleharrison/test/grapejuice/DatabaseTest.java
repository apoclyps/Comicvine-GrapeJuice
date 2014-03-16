package uk.co.kyleharrison.test.grapejuice;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.facade.GrapeVineFacade;
import uk.co.kyleharrison.grapejuice.storage.MySQLFacade;

public class DatabaseTest {

	private MySQLFacade mysqlFacade;
	private GrapeVineFacade grapeVineFacade;
	
	@Before
	public void setUp() throws Exception {
		mysqlFacade = new MySQLFacade();
		grapeVineFacade = new GrapeVineFacade();
		defaultQuery("Batman");
	}
	
	@Test
	public void testGenerateContent(){
		
	}
	
	public void defaultQuery(String query){
		grapeVineFacade.PreformQuery("http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
						+ "&format=json&field_list=name,id&query=" + query);
		ArrayList <ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();
		assert(cvv.isEmpty()==false);
	}

	@Test
	public void testDatabaseSetup(){
		mysqlFacade = new MySQLFacade();
	}
	
	@Test
	public void testDatabaseConnection(){
		assert(!mysqlFacade.getConnection().equals(null));
	}
	
	@Test
	public void testDatabaseInsert(){
		assert(!grapeVineFacade.equals(null));
		//databaseInsert(this.grapeVineFacade);
	}
	
	public void databaseInsert(GrapeVineFacade grapeVineFacade){
		mysqlFacade.insertVolume(grapeVineFacade.getComicVineVolumes().get(0).getId(), grapeVineFacade.getComicVineVolumes().get(0).getName());
		boolean success = mysqlFacade.insertVolume(1,"Uncanny X-Men: The Complete Collection By Matt Fraction");
		assert(success);
	}
	
	@Test
	public void testDatabaseInsertQuery(){
		assert(!grapeVineFacade.equals(null));
		databaseInsertQuery(this.grapeVineFacade);
	}
	
	public void databaseInsertQuery(GrapeVineFacade grapeVineFacade){
		ArrayList <ComicVineVolume> cvv = this.grapeVineFacade.getComicVineVolumes();
		System.out.println(cvv.size());
		if(cvv.get(0).equals(null)){
			System.out.println("ID = null");
		}
		System.out.println(cvv.get(0).getId() + " : " + cvv.get(0).getName().toString());
		boolean success = mysqlFacade.insertVolume(1457 , "Batman: Arkham City Gameplay Trailer");
		//boolean success = mysqlFacade.insertVolume(1,"Uncanny X-Men: The Complete Collection By Matt Fraction");
		assert(success);
	}
	
	@Test
	public void testDatabaseRemoveQuery(){
		assert(!grapeVineFacade.equals(null));
		databaseRemoveQuery(this.grapeVineFacade);
	}
	
	public void databaseRemoveQuery(GrapeVineFacade grapeVineFacade){
		//ArrayList <ComicVineVolume> cvv = this.grapeVineFacade.getComicVineVolumes();
		boolean success = mysqlFacade.removeVolume(1457, "Batman: Arkham City Gameplay Trailer");
		//boolean success = mysqlFacade.insertVolume(1,"Uncanny X-Men: The Complete Collection By Matt Fraction");
		assert(success);
	}
	
	

}

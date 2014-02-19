package uk.co.kyleharrison.test.grapejuice;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.facade.GrapeVineFacade;

public class ComicVineTest {

	private GrapeVineFacade grapeVineFacade;
	
	@Before
	public void setUp() throws Exception {
		grapeVineFacade = new GrapeVineFacade();
	}
	
	public void testQuery(){
		String query="X-men";
		String queryRequest = "http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
				+ "&format=json&field_list=name,id&resources=volume&query=";
				
		// Returns First / last issue of series as a volume
		//http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816&format=json&query=X-men&page=1&resources=volume
		grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery(queryRequest+ query);
		ArrayList <ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();
		
		//OUTPUT
		//System.out.println("\n new data "+grapeVineFacade.getComicVineVolumes().get(0).getName());
		int remainder = (int) (grapeVineFacade.getNumber_of_total_results() / 100);
		System.out.println("Results = " + grapeVineFacade.getNumber_of_total_results());
		System.out.println("Number of Pages = "+remainder);
		
		int page = 2;
		while(page != (remainder+2))
		{
		grapeVineFacade.PreformQuery(queryRequest+query+"&page="+page);
		
		if(grapeVineFacade.getNumber_of_page_result()!=0){
			cvv.addAll(grapeVineFacade.getComicVineVolumes());
			page++;
		}else{
			break;
		}
		}
		System.out.println(cvv.size());
	}

	public void preformQuery(String queryRequest){
		grapeVineFacade.PreformQuery(queryRequest);
	}
	
	@Test
	public void testDefaultQuery(){
		defaultQuery("Batman");
	}
	
	public void defaultQuery(String query){
		GrapeVineFacade grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery("http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
						+ "&format=json&field_list=name,id&query=" + query);
		ArrayList <ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();
		assert(cvv.isEmpty()==false);
	}
	
}

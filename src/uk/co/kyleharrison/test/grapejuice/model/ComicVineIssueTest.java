package uk.co.kyleharrison.test.grapejuice.model;

import java.util.ArrayList;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineIssue;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.facade.GrapeVineFacade;

public class ComicVineIssueTest {

	@Test
	public void comicVineIssueConstructor() {
		ComicVineIssue cvi = new ComicVineIssue();
		assert(!cvi.equals(null));
	}
	
	@Test
	public void testImagesHashMap(){
		GrapeVineFacade grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery("http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
						+ "&format=json&limit=1&resources=volume&field_list=name,id,first_issue&query=" + "batman");
		ArrayList <ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();
		
		ComicVineIssue cvi = cvv.get(0).getFirst_issue();
		assert(cvi!=null);
		
		try{
			cvi.getCassandraMap();
		}catch(Exception e){
			System.out.println("Exception e");
		}
		System.out.println(cvi.getComicvineIssue().toString());
		
		assert(!cvv.get(0).getFirst_issue().getComicvineIssue().equals(null));
		
	}


}

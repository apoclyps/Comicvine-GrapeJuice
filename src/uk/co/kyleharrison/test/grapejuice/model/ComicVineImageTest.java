package uk.co.kyleharrison.test.grapejuice.model;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.facade.GrapeVineFacade;

public class ComicVineImageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testImagesHashMap(){
		GrapeVineFacade grapeVineFacade = new GrapeVineFacade();
		grapeVineFacade.PreformQuery("http://www.comicvine.com/api/search/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
						+ "&format=json&field_list=name,id,image&query=" + "batman");
		ArrayList <ComicVineVolume> cvv = grapeVineFacade.getComicVineVolumes();
		
		cvv.get(0).getImage().setComicVineImages();
		System.out.println(cvv.get(0).getImage().getComicVineImages().toString());
		System.out.println(cvv.get(0).getImage().getCassandraMap());
		assert(!cvv.get(0).getImage().getComicVineImages().equals(null));
	}

}

package uk.co.kyleharrison.test.grapejuice.model;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineBase;

public class ComicVineBaseTest {

	@Test
	public void comicVineBaseConstructor() {
		ComicVineBase cvb = new ComicVineBase();
		assert(!cvb.equals(null));
	}
	
	@Test
	public void comicVineBaseConstructorResourceType() {
		ComicVineBase cvb = new ComicVineBase("volume");
		assert(cvb.getResource_type()=="volume");
	}
	

}

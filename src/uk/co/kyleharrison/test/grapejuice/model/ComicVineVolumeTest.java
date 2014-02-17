package uk.co.kyleharrison.test.grapejuice.model;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;

public class ComicVineVolumeTest {

	@Test
	public void ComicVineVolumeConstructor() {
		ComicVineVolume cvv = new ComicVineVolume();
		assert(cvv!=null);
	}
}

package uk.co.kyleharrison.test.grapejuice.model;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineIssue;

public class ComicVineIssueTest {

	@Test
	public void comicVineIssueConstructor() {
		ComicVineIssue cvi = new ComicVineIssue();
		assert(!cvi.equals(null));
	}

}

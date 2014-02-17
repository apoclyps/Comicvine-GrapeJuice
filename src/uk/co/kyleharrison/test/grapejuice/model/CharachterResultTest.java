package uk.co.kyleharrison.test.grapejuice.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.model.charachter.CharacterResult;

//http://www.vogella.com/tutorials/JUnit/article.html
public class CharachterResultTest {

	@Test
	public void testIssueResultConstructor(){
		CharacterResult cr = new CharacterResult();
		
		assertEquals(null,cr.getDeck());
		cr.setDeck("Test");
		assertEquals("Test",cr.getDeck());
	}
	
}

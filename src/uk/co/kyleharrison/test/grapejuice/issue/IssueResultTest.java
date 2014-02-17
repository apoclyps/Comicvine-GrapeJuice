package uk.co.kyleharrison.test.grapejuice.issue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.kyleharrison.grapejuice.model.issue.IssueResult;


//http://www.vogella.com/tutorials/JUnit/article.html

public class IssueResultTest {

	@Test
	public void testIssueResultConstructor(){
		IssueResult ir = new IssueResult();
		
		assertEquals(null,ir.getDeck());
		ir.setDeck("Test");
		assertEquals("Test",ir.getDeck());
	}
	
}

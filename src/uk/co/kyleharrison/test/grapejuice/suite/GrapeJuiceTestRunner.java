package uk.co.kyleharrison.test.grapejuice.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import uk.co.kyleharrison.test.grapejuice.issue.IssueResultTest;

public class GrapeJuiceTestRunner {
	
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(IssueResultTest.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  }
}

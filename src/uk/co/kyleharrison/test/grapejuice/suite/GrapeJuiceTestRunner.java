package uk.co.kyleharrison.test.grapejuice.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class GrapeJuiceTestRunner {
	
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(ModelTestSuite.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	  }
}

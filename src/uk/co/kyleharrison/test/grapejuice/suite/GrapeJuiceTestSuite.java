package uk.co.kyleharrison.test.grapejuice.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uk.co.kyleharrison.test.grapejuice.charachter.CharachterResultTest;
import uk.co.kyleharrison.test.grapejuice.issue.IssueResultTest;


@RunWith(Suite.class)
@SuiteClasses({IssueResultTest.class,CharachterResultTest.class})
public class GrapeJuiceTestSuite {

}

package uk.co.kyleharrison.test.grapejuice.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uk.co.kyleharrison.test.grapejuice.model.*;

@RunWith(Suite.class)
@SuiteClasses({IssueResultTest.class,CharachterResultTest.class,
	ComicVineVolumeTest.class,ComicVineIssueTest.class})
public class ModelTestSuite {

}

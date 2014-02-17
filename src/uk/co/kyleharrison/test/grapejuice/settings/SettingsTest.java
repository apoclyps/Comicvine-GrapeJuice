package uk.co.kyleharrison.test.grapejuice.settings;

import org.apache.log4j.Logger;
import org.junit.Assert;

import uk.co.kyleharrison.grapejuice.model.settings.Persistence;
import junit.framework.TestCase;

public class SettingsTest extends TestCase {
   private Persistence sone = null, stwo = null;
   private static Logger logger = Logger.getRootLogger();
   
   public SettingsTest(String name) {
      super(name);
   }
   
   public void setUp() {
      logger.info("getting singleton...");
      sone = Persistence.getInstance();
      logger.info("...got singleton: " + sone);
      logger.info("getting singleton...");
      stwo = Persistence.getInstance();
      logger.info("...got singleton: " + stwo);
   }
   public void testUnique() {
      logger.info("checking singletons for equality");
      Assert.assertEquals(true, sone == stwo);
   }
}
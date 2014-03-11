package uk.co.kyleharrison.test.grapejuice.settings;

import org.apache.log4j.Logger;
import org.junit.Test;

import uk.co.kyleharrison.grapejuice.model.settings.Persistence;

public class SettingsTest {
	private Persistence sone = null, stwo = null;
	private static Logger logger = Logger.getRootLogger();

	public void setUp() {
		logger.info("getting singleton...");
		sone = Persistence.getInstance();
		logger.info("...got singleton: " + sone);
		logger.info("getting singleton...");
		stwo = Persistence.getInstance();
		logger.info("...got singleton: " + stwo);
	}

	@Test
	public void persistenceSingltonEquality() {
		logger.info("checking singletons for equality");
		assert (sone == stwo);
	}
	
	@Test
	public void persistenceSingleton(){
		assert(Persistence.getInstance()!=null);
	}

	@Test
	public void loadProperties() {
		assert (Persistence.getInstance().loadProperties()==true);
	}
	
	@Test
	public void loadCassandraHost(){
		Persistence.getInstance().loadCassandraHost();
		assert(Persistence.getInstance().getCassandraHost()=="127.0.0.1:9160");
	}
	
	@Test
	public void getCassandraHost(){
		assert(Persistence.getInstance().getCassandraHost()==Persistence.getInstance().getCassandraHost());
	}

	@Test 
	public void loadComicVineAPI(){
		Persistence.getInstance().loadComicVineAPI();
		assert(Persistence.getInstance().getComicvine_api_key()=="2736f1620710c52159ba0d0aea337c59bd273816");
	}
	
	@Test 
	public void getComicVineAPI(){
		assert(Persistence.getInstance().getComicvine_api_key()==Persistence.getInstance().getComicvine_api_key());
	}
	
	
}
package uk.co.kyleharrison.test.grapejuice.cassandra;

import org.junit.Before;
import org.junit.Test;

import uk.co.kyleharrison.grapejuice.cassandra.CassandraConnector;

public class CassandraCQLTest {

	private CassandraConnector cassandraCon;
	
	@Before
	public void setUp() throws Exception {
		cassandraCon = new CassandraConnector();
	}

	@Test
	public void CassandraConnectorConstructor() {
		assert(!cassandraCon.equals(null));
	}
	
	@Test
	public void checkConnection(){
		assert(this.cassandraCon.checkConnection()==true);
	}
	
	@Test 
	public void createColumnFamily(){
		System.out.println("Create ComicVineVolume Column Family");
		boolean success = this.cassandraCon.createColumnFamily();
		assert(success);
	}
	
	@Test 
	public void dropColumnFamily(){
		System.out.println("Drop ComicVineVolume Column Family");
		boolean success = this.cassandraCon.dropColumnFamily("comicvinevolumes");
		assert(success);
	}

}

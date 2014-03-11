package uk.co.kyleharrison.grapejuice.model.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//A singleton class for persistent settings.
public class Persistence {
	
	private static Persistence instance = null;
	private String comicVineAPIKey;
	private String propsFilename = "config.properties";
	private String cassandraHost;
	private Properties props = new Properties();;

	protected Persistence() {
		super();
		loadProperties();
	}
	
	public static Persistence getInstance() {
	      if(instance == null) {
	         instance = new Persistence();
	      }
	      return instance;
	   }
	
	public boolean loadProperties() {
		System.out.println("Loading properties");
		FileInputStream in;
		try {
			in = new FileInputStream(propsFilename);
			this.props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		//Enumeration en = this.props.keys();
		//<Object> keys = this.props.values();

		this.comicVineAPIKey = this.props.getProperty("COMICVINEAPI");
		this.cassandraHost = this.props.getProperty("CASSANDRAHOST");

		System.out.println("Loading complete");
		return true;
	}
	
	public void loadComicVineAPI(){
		this.comicVineAPIKey = this.props.getProperty("COMICVINEAPI");
	}
	
	public String getComicvine_api_key() {
		return comicVineAPIKey;
	}

	public void setComicvine_api_key(String comicvine_api_key) {
		this.comicVineAPIKey = comicvine_api_key;
	}
	
	public void loadCassandraHost(){
		this.cassandraHost = this.props.getProperty("CASSANDRAHOST");
	}
	
	public String getCassandraHost(){
		return this.cassandraHost;
	}

	public void setCassandraHost(String cassandraHost) {
		this.cassandraHost = cassandraHost;
	}

}

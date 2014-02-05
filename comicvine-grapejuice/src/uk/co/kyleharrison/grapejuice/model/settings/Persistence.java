package uk.co.kyleharrison.grapejuice.model.settings;

//A singleton class for persistent settings.

public class Persistence {
	
	private static Persistence instance = null;
	private String comicvine_api_key = "2736f1620710c52159ba0d0aea337c59bd273816";

	protected Persistence() {
		super();
	}
	
	public static Persistence getInstance() {
	      if(instance == null) {
	         instance = new Persistence();
	      }
	      return instance;
	   }
	
	public String getComicvine_api_key() {
		return comicvine_api_key;
	}

	public void setComicvine_api_key(String comicvine_api_key) {
		this.comicvine_api_key = comicvine_api_key;
	}
	
	
}

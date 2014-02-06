package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVinePerson {
	public int id;
    public String name;
    public String api_detail_url;
    
	public ComicVinePerson(int id, String name, String api_detail_url) {
		super();
		this.id = id;
		this.name = name;
		this.api_detail_url = api_detail_url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApi_detail_url() {
		return api_detail_url;
	}

	public void setApi_detail_url(String api_detail_url) {
		this.api_detail_url = api_detail_url;
	}
}

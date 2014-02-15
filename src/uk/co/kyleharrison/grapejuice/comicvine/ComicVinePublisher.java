package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVinePublisher {
	public int id;
	public String name;
    public String publisher_url;
    
	public ComicVinePublisher() {
		super();
	}

	public ComicVinePublisher(int publisher_id, String publisher_name,
			String publisher_url) {
		super();
		this.id = publisher_id;
		this.name = publisher_name;
		this.publisher_url = publisher_url;
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
	
	public String getPublisher_url() {
		return publisher_url;
	}
	public void setPublisher_url(String publisher_url) {
		this.publisher_url = publisher_url;
	}
   
}

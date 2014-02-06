package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVinePublisher {
	
    public int publisher_id;
    public String publisher_name;
    public String publisher_url;
    
	public ComicVinePublisher(int publisher_id, String publisher_name,
			String publisher_url) {
		super();
		this.publisher_id = publisher_id;
		this.publisher_name = publisher_name;
		this.publisher_url = publisher_url;
	}
	
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public String getPublisher_url() {
		return publisher_url;
	}
	public void setPublisher_url(String publisher_url) {
		this.publisher_url = publisher_url;
	}
   
}

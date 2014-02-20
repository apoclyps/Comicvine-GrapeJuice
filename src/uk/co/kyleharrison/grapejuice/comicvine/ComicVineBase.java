package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineBase {

	protected String resource_type;
	protected int id;
	protected String name;
	
	public ComicVineBase() {
		super();
	}

	public ComicVineBase(String resource_type) {
		super();
		this.resource_type = resource_type;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
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
	
	
}

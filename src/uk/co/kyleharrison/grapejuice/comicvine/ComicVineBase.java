package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineBase {

	protected String resource_type;
	protected int id;
	protected String name;
	protected int status_code;
	protected int number_of_page_results;
	protected int number_of_total_results;
	protected int offset;
	protected int limit;
	protected String error;
	protected String version;
	
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

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public int getNumber_of_page_results() {
		return number_of_page_results;
	}

	public void setNumber_of_page_results(int number_of_page_results) {
		this.number_of_page_results = number_of_page_results;
	}

	public int getNumber_of_total_results() {
		return number_of_total_results;
	}

	public void setNumber_of_total_results(int number_of_total_results) {
		this.number_of_total_results = number_of_total_results;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}

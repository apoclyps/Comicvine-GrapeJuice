package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineResponseData {
    public int number_of_total_results;
    public int number_of_page_results;
    public int limit;
    
	public ComicVineResponseData(int number_of_total_results,
			int number_of_page_results, int limit) {
		super();
		this.number_of_total_results = number_of_total_results;
		this.number_of_page_results = number_of_page_results;
		this.limit = limit;
	}
	
	public int getNumber_of_total_results() {
		return number_of_total_results;
	}
	public void setNumber_of_total_results(int number_of_total_results) {
		this.number_of_total_results = number_of_total_results;
	}
	public int getNumber_of_page_results() {
		return number_of_page_results;
	}
	public void setNumber_of_page_results(int number_of_page_results) {
		this.number_of_page_results = number_of_page_results;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
    
}

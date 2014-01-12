package co.uk.kyleharrison.grapejuice.results;
/*
 * status_code	An integer indicating the result of the request. Acceptable values are:

    1:OK
    100:Invalid API Key
    101:Object Not Found
    102:Error in URL Format
    103:'jsonp' format requires a 'json_callback' argument
    104:Filter Error
    105:Subscriber only video is for subscribers only

	error	A text string representing the status_code
	number_of_total_results	The number of total results matching the filter conditions specified
	number_of_page_results	The number of results on this page
	limit	The value of the limit filter specified, or 100 if not specified
	offset	The value of the offset filter specified, or 0 if not specified
	results	Zero or more items that match the filters specified
 */

public class VineResult {
	
	private int count_of_issues=0;
	private int id=0;
	private String name;
	private String resource_type="volume";
	
	public VineResult(){
		
	}
	
	public int getCount_of_issues() {
		return count_of_issues;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getResource_type() {
		return resource_type;
	}
	public void setCount_of_issues(int count_of_issues) {
		this.count_of_issues = count_of_issues;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}
	
}

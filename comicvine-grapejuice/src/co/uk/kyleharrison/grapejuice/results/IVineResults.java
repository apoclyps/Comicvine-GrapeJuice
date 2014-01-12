package co.uk.kyleharrison.grapejuice.results;

public interface IVineResults {

	public void setupResults();
	public void addResult();
	public void generateIDs();
	public void storeMYSQLResults();
	public void retrieveMYSQLResults();
	public void clearResults();
	public void removeResults();
	public void destroyResults();
}

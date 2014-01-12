package co.uk.kyleharrison.grapejuice.results;

public class VineResultsInterface implements IVineResults {

	VineResponses vrl = new VineResponses();
	
	@Override
	public void setupResults() {
		this.vrl = new VineResponses();
		
	}

	@Override
	public void addResult() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateIDs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeMYSQLResults() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveMYSQLResults() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeResults() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyResults() {
		this.vrl = null;
	}

	@Override
	public void clearResults() {
		this.vrl.clearArrayList();
		
	}

}

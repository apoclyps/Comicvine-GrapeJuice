package uk.co.kyleharrison.grapejuice.model;

import uk.co.kyleharrison.grapejuice.model.results.VineResponses;

public class VineSearch {

	private VineResponses vrs = new VineResponses();

	public VineSearch(){
		
	}
	
	public VineResponses getVrs() {
		return vrs;
	}

	public void setVrs(VineResponses vrs) {
		this.vrs = vrs;
	}
	
}

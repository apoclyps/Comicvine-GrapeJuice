package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineCredit extends ComicVinePerson {

	public ArrayList<String> roles;
	 
	public ComicVineCredit(int id, String name, String api_detail_url,
			ArrayList<String> roles) {
		super(id, name, api_detail_url);
		this.roles = roles;
	}

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}
	 
}

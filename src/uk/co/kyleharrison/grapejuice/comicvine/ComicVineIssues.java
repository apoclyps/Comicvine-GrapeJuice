package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineIssues {

	protected ArrayList<ComicVineIssue> issues;
	protected String name;
	protected int id;
	
	
	
	public ComicVineIssues() {
		super();
	}

	public ComicVineIssues(ArrayList<ComicVineIssue> issues, String name, int id) {
		super();
		this.issues = issues;
		this.name = name;
		this.id = id;
	}

	public ArrayList<ComicVineIssue> getIssues() {
		return issues;
	}

	public void setIssues(ArrayList<ComicVineIssue> issues) {
		this.issues = issues;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineIssues {

	protected ArrayList<ComicVineIssue> issues;
	protected String name;
	protected int id;
	protected String cover_date;
	protected String description;
	protected ComicVineImages image;
	protected int issue_number;
	protected ComicVineVolume volume;
	
	
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

	public String getCover_date() {
		return cover_date;
	}

	public void setCover_date(String cover_date) {
		this.cover_date = cover_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ComicVineImages getImage() {
		return image;
	}

	public void setImage(ComicVineImages image) {
		this.image = image;
	}

	public int getIssue_number() {
		return issue_number;
	}

	public void setIssue_number(int issue_number) {
		this.issue_number = issue_number;
	}

	public ComicVineVolume getVolume() {
		return volume;
	}

	public void setVolume(ComicVineVolume volume) {
		this.volume = volume;
	}
	
	
	
}

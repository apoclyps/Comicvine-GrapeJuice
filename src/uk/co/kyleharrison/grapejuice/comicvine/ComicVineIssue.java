package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineIssue {

    public int id;
    
    public String api_detail_url;
    
    public String issue_number;
    
    public String name;
    
    public int issue_month;
    
    public int issue_year;

    public String issue_description;

    public String issue_title;
    
    public ComicVineImages images;

    public ArrayList<ComicVineCredit> credits;
    
    public ArrayList<ComicVineCharacter> characters;
    
    public ComicVineVolume volume;

	public ComicVineIssue(int id, String api_detail_url, String issue_number,
			String name, int issue_month, int issue_year,
			String issue_description, String issue_title,
			ComicVineImages images, ArrayList<ComicVineCredit> credits,
			ArrayList<ComicVineCharacter> characters, ComicVineVolume volume) {
		super();
		this.id = id;
		this.api_detail_url = api_detail_url;
		this.issue_number = issue_number;
		this.name = name;
		this.issue_month = issue_month;
		this.issue_year = issue_year;
		this.issue_description = issue_description;
		this.issue_title = issue_title;
		this.images = images;
		this.credits = credits;
		this.characters = characters;
		this.volume = volume;
	}

	public ComicVineIssue() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApi_detail_url() {
		return api_detail_url;
	}

	public void setApi_detail_url(String api_detail_url) {
		this.api_detail_url = api_detail_url;
	}

	public String getIssue_number() {
		return issue_number;
	}

	public void setIssue_number(String issue_number) {
		this.issue_number = issue_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIssue_month() {
		return issue_month;
	}

	public void setIssue_month(int issue_month) {
		this.issue_month = issue_month;
	}

	public int getIssue_year() {
		return issue_year;
	}

	public void setIssue_year(int issue_year) {
		this.issue_year = issue_year;
	}

	public String getIssue_description() {
		return issue_description;
	}

	public void setIssue_description(String issue_description) {
		this.issue_description = issue_description;
	}

	public String getIssue_title() {
		return issue_title;
	}

	public void setIssue_title(String issue_title) {
		this.issue_title = issue_title;
	}

	public ComicVineImages getImages() {
		return images;
	}

	public void setImages(ComicVineImages images) {
		this.images = images;
	}

	public ArrayList<ComicVineCredit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<ComicVineCredit> credits) {
		this.credits = credits;
	}

	public ArrayList<ComicVineCharacter> getCharacters() {
		return characters;
	}

	public void setCharacters(ArrayList<ComicVineCharacter> characters) {
		this.characters = characters;
	}

	public ComicVineVolume getVolume() {
		return volume;
	}

	public void setVolume(ComicVineVolume volume) {
		this.volume = volume;
	}
    
}

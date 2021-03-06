package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineVolume extends ComicVineBase {

	private String url;
	private String deck;
	private int count_of_issues;
	private String description;
	private int start_year;
	private ComicVinePublisher publisher;
	private ComicVineImages image;
	private ArrayList<ComicVineIssue> list_of_issue;
	private ArrayList<ComicVineIssue> issues;
	private ComicVineIssue first_issue;
	private ComicVineIssue last_issue;
	private ComicVineIssues results;

	public ComicVineVolume() {
		super();
	}

	public ComicVineVolume(int id, String name, String url,
			int count_of_issues, String description, int start_year,
			ComicVinePublisher publisher, ComicVineImages image,
			ArrayList<ComicVineIssue> list_of_issue) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.count_of_issues = count_of_issues;
		this.description = description;
		this.start_year = start_year;
		this.publisher = publisher;
		this.image = image;
		this.list_of_issue = list_of_issue;
	}
	
	public ComicVineVolume(String url, String deck, int count_of_issues,
			String description, int start_year, ComicVinePublisher publisher,
			ComicVineImages image, ArrayList<ComicVineIssue> list_of_issue,
			ComicVineIssue first_issue, ComicVineIssue last_issue) {
		super();
		this.url = url;
		this.deck = deck;
		this.count_of_issues = count_of_issues;
		this.description = description;
		this.start_year = start_year;
		this.publisher = publisher;
		this.image = image;
		this.list_of_issue = list_of_issue;
		this.first_issue = first_issue;
		this.last_issue = last_issue;
	}

	public String getUrl() {
		return url;
	}
	
	public ComicVineImages getImage() {
		return image;
	}

	public void setImage(ComicVineImages image) {
		this.image = image;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	public int getCount_of_issues() {
		return count_of_issues;
	}

	public void setCount_of_issues(int count_of_issues) {
		this.count_of_issues = count_of_issues;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public int getStart_year() {
		return start_year;
	}

	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}

	public ComicVinePublisher getPublisher() {
		return publisher;
	}

	public void setPublisher(ComicVinePublisher publisher) {
		this.publisher = publisher;
	}

	public ArrayList<ComicVineIssue> getList_of_issue() {
		return list_of_issue;
	}

	public void setList_of_issue(ArrayList<ComicVineIssue> list_of_issue) {
		this.list_of_issue = list_of_issue;
	}

	public ComicVineIssue getFirst_issue() {
		return first_issue;
	}

	public void setFirst_issue(ComicVineIssue first_issue) {
		this.first_issue = first_issue;
	}

	public ComicVineIssue getLast_issue() {
		return last_issue;
	}

	public void setLast_issue(ComicVineIssue last_issue) {
		this.last_issue = last_issue;
	}

	public String getDeck() {
		return deck;
	}

	public void setDeck(String deck) {
		this.deck = deck;
	}

	public ArrayList<ComicVineIssue> getIssues() {
		return issues;
	}

	public void setIssues(ArrayList<ComicVineIssue> issues) {
		this.issues = issues;
	}

	public ComicVineIssues getResults() {
		return results;
	}

	public void setResults(ComicVineIssues results) {
		this.results = results;
	}

}

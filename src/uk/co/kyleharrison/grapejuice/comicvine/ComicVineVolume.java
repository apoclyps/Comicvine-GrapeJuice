package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;

public class ComicVineVolume {

	public int id;;
	public String name;
	public String url;
	public int count_of_issues;
	public String volume_description;
	public int start_year;
	public ComicVinePublisher publisher;
	public ComicVineImages images;
	public ArrayList<ComicVineIssue> list_of_issue;

	public ComicVineVolume() {
		// TODO Auto-generated constructor stub
	}

	public ComicVineVolume(int id, String name, String url,
			int count_of_issues, String volume_description, int start_year,
			ComicVinePublisher publisher, ComicVineImages images,
			ArrayList<ComicVineIssue> list_of_issue) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.count_of_issues = count_of_issues;
		this.volume_description = volume_description;
		this.start_year = start_year;
		this.publisher = publisher;
		this.images = images;
		this.list_of_issue = list_of_issue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
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

	public String getVolume_description() {
		return volume_description;
	}

	public void setVolume_description(String volume_description) {
		this.volume_description = volume_description;
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

	public ComicVineImages getImages() {
		return images;
	}

	public void setImages(ComicVineImages images) {
		this.images = images;
	}

	public ArrayList<ComicVineIssue> getList_of_issue() {
		return list_of_issue;
	}

	public void setList_of_issue(ArrayList<ComicVineIssue> list_of_issue) {
		this.list_of_issue = list_of_issue;
	}

}

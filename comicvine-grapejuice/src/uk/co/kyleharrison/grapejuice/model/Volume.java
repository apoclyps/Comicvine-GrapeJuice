package uk.co.kyleharrison.grapejuice.model;

import java.util.ArrayList;

public class Volume {

	 public int id;;
     public String name;
     public String url;
     public int count_of_issues;
     public String volume_description;
     public int start_year;
     public ComicVinePublisher publisher;
     public ComicVineImages images;
     public ArrayList<ComicVineIssue> list_of_issue;
	
}

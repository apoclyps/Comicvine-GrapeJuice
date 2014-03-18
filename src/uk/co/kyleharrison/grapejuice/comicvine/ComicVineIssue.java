package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public HashMap<String, String> comicvineIssue;
    public String cassandraMap = null;
    
	public void setCassandraMap(String cassandraMap) {
		this.cassandraMap = cassandraMap;
	}
    
	public String getCassandraMap() {
		this.comicvineIssue = new HashMap<String,String>();
		setComicvineIssue();
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		//System.out.printf("Size : %s \n",this.comicvineIssue.size());
		int elements = 0;
		for(Map.Entry<String,String> entry : this.comicvineIssue.entrySet()){
			sb.append("'"+entry.getKey().toString()+"' : '" + entry.getValue().toString()+"'");
			if(elements < comicvineIssue.entrySet().size()-1){
				sb.append(", ");
			}
			elements++;
		}
		sb.append("}");
		//System.out.println(sb.toString());
		this.cassandraMap = sb.toString();
		return this.cassandraMap;
	}
    
	public void setComicvineIssue(){
		try{
			System.out.println("\tID : "+ this.id);
			System.out.println("\tURL : "+ this.api_detail_url);
			System.out.println("\tIssue : "+ this.issue_number);
			System.out.println("\tName : "+ this.name);

			this.comicvineIssue.put("id", Integer.toString(this.id));
			this.comicvineIssue.put("api_detail_url", this.api_detail_url);
			this.comicvineIssue.put("issue_number", this.issue_number.replaceAll("¼","0"));
			if(!(this.name==null)){
				this.comicvineIssue.put("name", this.name.replaceAll("[()?:!.,;{}']", " "));
			}else{
				this.comicvineIssue.put("name", "null");
			}
		}catch(Exception e){
			System.out.println("Exception in set comicvine issue");
		}
		
		//System.out.println("ComicVineIssue Set");
		
		/*try{
			this.comicvineIssue.put("issue_month", Integer.toString(this.issue_month));
			this.comicvineIssue.put("issue_year", Integer.toString(this.issue_year));
			this.comicvineIssue.put("issue_description", this.issue_description);
			this.comicvineIssue.put("issue_title", this.issue_title);
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("GrapeJuice : ComicVineIssue : Not yet implemented");
		}*/
		
		// Not implemented yet
//		this.comicvineIssue.put("images", this.images.toString());
//		this.comicvineIssue.put("credits", this.credits.toString());
//		this.comicvineIssue.put("characters", this.characters.toString());
//		this.comicvineIssue.put("volume", this.volume.toString());
//		this.comicvineIssue.put("comicvineIssue", this.comicvineIssue.toString());
	}
    
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
		this.comicvineIssue = new HashMap<String, String>();
	}

	public ComicVineIssue() {
		super();
		this.comicvineIssue = new HashMap<String, String>();
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

	public HashMap<String, String> getComicvineIssue() {
		return comicvineIssue;
	}

	public void setComicvineIssue(HashMap<String, String> comicvineIssue) {
		this.comicvineIssue = comicvineIssue;
	}
    
}

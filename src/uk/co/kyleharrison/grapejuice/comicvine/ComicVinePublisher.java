package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.HashMap;
import java.util.Map;

public class ComicVinePublisher {
	public int id;
	public String name;
    public String publisher_url;
    public HashMap<String, String> comicvinePublisher;
    
	public void setComicvinePublisher(){
		this.comicvinePublisher.put("id", Integer.toString(this.id));
		this.comicvinePublisher.put("name", this.name);
		this.comicvinePublisher.put("publisher_url", this.publisher_url);
	}
	
	//Untested
	public String generateCassandraMap() {
		this.comicvinePublisher = new HashMap<String,String>();
		setComicvinePublisher();
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		//System.out.printf("Size : %s \n",this.comicvineIssue.size());
		int elements = 0;
		for(Map.Entry<String,String> entry : this.comicvinePublisher.entrySet()){
			sb.append("'"+entry.getKey().toString()+"' : '" + entry.getValue().toString()+"'");
			if(elements < comicvinePublisher.entrySet().size()-1){
				sb.append(", ");
			}
			elements++;
		}
		sb.append("}");
		//System.out.println(sb.toString());
		return (this.cassandraMap = sb.toString());
	}
	
    
    public HashMap<String, String> getComicvinePublisher() {
		return comicvinePublisher;
	}

	public void setComicvinePublisher(HashMap<String, String> comicvinePublisher) {
		this.comicvinePublisher = comicvinePublisher;
	}
	public String cassandraMap = null;
    
	public String getCassandraMap() {
		return cassandraMap;
	}

	public void setCassandraMap(String cassandraMap) {
		this.cassandraMap = cassandraMap;
	}

	
	
	public ComicVinePublisher() {
		super();
	}

	public ComicVinePublisher(int publisher_id, String publisher_name,
			String publisher_url) {
		super();
		this.id = publisher_id;
		this.name = publisher_name;
		this.publisher_url = publisher_url;
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
	
	public String getPublisher_url() {
		return publisher_url;
	}
	public void setPublisher_url(String publisher_url) {
		this.publisher_url = publisher_url;
	}
   
}

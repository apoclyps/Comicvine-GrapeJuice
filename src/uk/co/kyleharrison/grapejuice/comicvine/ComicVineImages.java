package uk.co.kyleharrison.grapejuice.comicvine;

import java.util.HashMap;
import java.util.Map;

public class ComicVineImages {
    public String icon_url;
    public String medium_url;
    public String screen_url;
    public String small_url;
    public String super_url;
    public String thumb_url;
    public String tiny_url;
    public HashMap<String, String> comicVineImages;
    public String cassandraMap;
    
	public String getCassandraMap() {
		
		setComicVineImages();
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		//System.out.printf("Size : %s \n",this.comicVineImages.entrySet().size());
		int elements = 0;
		for(Map.Entry<?,?> entry : this.comicVineImages.entrySet()){
			sb.append("'"+entry.getKey().toString()+"' : '" + entry.getValue().toString()+"'");
			if(elements < comicVineImages.entrySet().size()-1){
				sb.append(", ");
			}
			elements++;
		}
		sb.append("}");
		this.cassandraMap = sb.toString();
		return cassandraMap;
	}
	
	

	public void setCassandraMap(String cassandraMap) {
		this.cassandraMap = cassandraMap;
	}

	public ComicVineImages() {
		super();
		this.comicVineImages = new HashMap<String, String>();
	}

	public HashMap<String, String> getComicVineImages() {
		
		return this.comicVineImages;
	}
	
	public void setComicVineImages(){
		this.comicVineImages.put("icon_url", this.icon_url);
		this.comicVineImages.put("medium_url", this.medium_url);
		this.comicVineImages.put("screen_url", this.screen_url);
		this.comicVineImages.put("small_url", this.small_url);
		this.comicVineImages.put("super_url", this.super_url);
		this.comicVineImages.put("thumb_url", this.thumb_url);
		this.comicVineImages.put("tiny_url", this.tiny_url);
	}
	
	public void setComicVineImages(HashMap<String, String> comicVineImages) {
		
		this.comicVineImages = comicVineImages;
	}

	public ComicVineImages(String icon_url, String medium_url,
			String screen_url, String small_url, String super_url,
			String thumb_url, String tiny_url) {
		super();
		this.icon_url = icon_url;
		this.medium_url = medium_url;
		this.screen_url = screen_url;
		this.small_url = small_url;
		this.super_url = super_url;
		this.thumb_url = thumb_url;
		this.tiny_url = tiny_url;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public String getMedium_url() {
		return medium_url;
	}

	public void setMedium_url(String medium_url) {
		this.medium_url = medium_url;
	}

	public String getScreen_url() {
		return screen_url;
	}

	public void setScreen_url(String screen_url) {
		this.screen_url = screen_url;
	}

	public String getSmall_url() {
		return small_url;
	}

	public void setSmall_url(String small_url) {
		this.small_url = small_url;
	}

	public String getSuper_url() {
		return super_url;
	}

	public void setSuper_url(String super_url) {
		this.super_url = super_url;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public String getTiny_url() {
		return tiny_url;
	}

	public void setTiny_url(String tiny_url) {
		this.tiny_url = tiny_url;
	}
	
    
}

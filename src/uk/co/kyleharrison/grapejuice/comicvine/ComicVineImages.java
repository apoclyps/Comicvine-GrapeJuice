package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineImages {
    public String icon_url;
    public String medium_url;
    public String screen_url;
    public String small_url;
    public String super_url;
    public String thumb_url;
    public String tiny_url;
    
	public ComicVineImages() {
		super();
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

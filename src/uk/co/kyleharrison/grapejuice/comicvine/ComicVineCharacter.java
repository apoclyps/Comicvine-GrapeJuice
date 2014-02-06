package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineCharacter extends ComicVinePerson{
	public String site_detail_url;

	public ComicVineCharacter(int id, String name, String api_detail_url,
			String site_detail_url) {
		super(id, name, api_detail_url);
		this.site_detail_url = site_detail_url;
	}

	public String getSite_detail_url() {
		return site_detail_url;
	}

	public void setSite_detail_url(String site_detail_url) {
		this.site_detail_url = site_detail_url;
	}
	
}
